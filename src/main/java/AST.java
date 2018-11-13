import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.List;
import java.util.ArrayList;

class faux{ // collection of non-OO auxiliary functions (currently just error)
    public static void error(String msg){
	System.err.println("Interpreter error: "+msg);
	System.exit(-1);
    }
}

abstract class AST {
    public static ArrayList<String> tokentable = new ArrayList<String>();
    public static HashMap<String, Boolean> datatypetable = new HashMap<String, Boolean>();
    public static HashSet<String> construcnames = new HashSet<String>();
}

class Start extends AST{
    public List<TokenDef> tokendefs;
    public List<DataTypeDef> datatypedefs;
    Start(List<TokenDef> tokendefs, List<DataTypeDef> datatypedefs){
	this.tokendefs=tokendefs;
	this.datatypedefs=datatypedefs;
    }
    public String compile() {
        for (TokenDef curr : tokendefs) {
            curr.compile();
        }
        String result = "";
        for (DataTypeDef dataTypeDef : datatypedefs) {
            result += dataTypeDef.compile();
        }
        check();
        return result;
    }
    public void check() {
        for(DataTypeDef curr : datatypedefs) {
            curr.check();
        }
    }
}

class TokenDef extends AST{
    public String tokenname;
    public String ANTLRCODE;
    TokenDef(String tokenname, String ANTLRCODE){
	this.tokenname=tokenname;
	this.ANTLRCODE=ANTLRCODE;
    }
    public void compile() {
        tokentable.add(tokenname);
    }
    
}

class DataTypeDef extends AST{
    public String dataTypeName;
    public List<Alternative> alternatives;
    DataTypeDef(String dataTypeName, List<Alternative> alternatives){
	this.dataTypeName=dataTypeName;
	this.alternatives=alternatives;
    }
    public String compile() {
        if(datatypetable.containsKey(dataTypeName)) {
            datatypetable.put(dataTypeName, true);
        } else {
            datatypetable.put(dataTypeName, false);
        }
        String result;
        result = "abstract class "+dataTypeName+"{};\n";
        for (Alternative alternative: alternatives) {
            result += alternative.compile(dataTypeName);
        }
        return result;
    }
    public void check() {
        //Checks if constructor name is used before, as class names has to be unique.
        for(Alternative curr : alternatives) {
            if(tokentable.contains(curr.constructor) || datatypetable.containsKey(curr.constructor)) {
                faux.error("Illegal construc name: "+curr.constructor+" name is reserved for types.");
            }
            if(construcnames.contains(curr.constructor)) {
                faux.error("Construc name: "+curr.constructor+" already exists.");
            } else {
                construcnames.add(curr.constructor);
            }
        }
        //Checking if an abstract datatype name is used more than once.
        for(String curr : datatypetable.keySet()) {
            if(datatypetable.get(curr)) {
                faux.error("Datatype name: "+curr+" is used more than once.");
            }
        }
        for(Alternative curr : alternatives) {
            curr.check();
        }
    }
}

class Alternative extends AST{
    public String constructor;
    public List<Argument> arguments;
    public List<Token> tokens;
    Alternative(String constructor, List<Argument> arguments,  List<Token> tokens){
	this.constructor=constructor;
	this.arguments=arguments;
	this.tokens=tokens;
    }
    public String compile(String parent) {
        String result = "";
        String arg = "";

        //Create class.
        result += "class " + constructor + " extends " + parent + "{\n";
        for (Argument argument : arguments) {
            result += "\t" + argument.compile(false);
        }

        //Create constructor for the class.
        int size = arguments.size();
        for(int i = 0 ; i < size ; i++) {
            arg += arguments.get(i).compile(true);
            if(i < size-1) {
                arg += ", ";
            }
        }

        //Create variables for the class.
        result += "\t"+constructor+"("+arg+"){\n\t";
        for (Argument curr : arguments) {
            result += "\tthis."+curr.name+"="+curr.name+";\n\t";
        }
        result += "}\n";

        //Create toString method.
        result += "\t"+"public String toString(){\n" + "\t\treturn \"\"";
        for(int i = 0, j = 0 ; i < tokens.size() ; i++) {
            String token = tokens.get(i).compile();
            result += "+"+token;
            result = result.replace("'","\"");
        }

        result += ";\n\t";

        result += "}\n}\n";
        return result;
    }
    public void check() {
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        for(Argument curr : arguments) {
            curr.check(map, constructor);
        }
        for(Token curr : tokens) {
            curr.check(map, constructor);
        }
        for(String curr : map.keySet()) {
            if(!map.get(curr)) {
                faux.error("Parameter: "+curr+" was not used in "+constructor);
            }
        }
    }
}

class Argument extends AST{
    public String type;
    public String name;
    Argument(String type, String name){this.type=type; this.name=name;}
    public String compile(boolean parameter) {
        String result = "";
        if(!parameter) {
            result += "public ";
        }
        for (String curr : tokentable) {
            if(type.equals(curr)) {
                result += "String ";
            }
        }
        if(datatypetable.containsKey(type)) {
            result += type+" ";
        }
        result += name;
        if(!parameter) {
            result += ";\n";
        }
        return result;
    }

    public void check(HashMap<String, Boolean> map, String constructor) {
        if(!datatypetable.containsKey(type) && !tokentable.contains(type)) {
            faux.error("Variable type: "+type+" is not a valid type in: "+constructor);
        }
        if(datatypetable.containsKey(name) || tokentable.contains(name)) {
            faux.error("Variable name: "+name+" is not permitted in "+constructor);
        }
        if(map.containsKey(name)) {
            faux.error("Variable: "+name+" was defined more than once in "+constructor);
        } else {
            map.put(name, false);
        }
    }
}

abstract class Token extends AST{

    public abstract String compile();
    public abstract void check(HashMap<String, Boolean> map, String constructor);
}

class Nonterminal extends Token{
    public String name;
    Nonterminal(String name){this.name=name;}

    public String compile() {
        return name;
    }

    public void check(HashMap<String, Boolean> map, String constructor) {
        if(!map.containsKey(name)) {
            faux.error("Variable: "+name+" is undefined in "+constructor);
        } else if(map.get(name)) {
            faux.error("Variable: "+name+" is used more than once in "+constructor);
        } else {
            map.put(name, true);
        }
    }
}

class Terminal extends Token{
    public String token;
    Terminal(String token){this.token=token;}

    public String compile() {
        return token;
    }

    public void check(HashMap<String, Boolean> map, String constructor) {}
}

