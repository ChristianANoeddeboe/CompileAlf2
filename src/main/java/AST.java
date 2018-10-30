import java.util.HashMap;
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
            tokentable.add(curr.tokenname);
        }
        String result = "";
        for (DataTypeDef dataTypeDef : datatypedefs) {
            result += dataTypeDef.compile();
        }
        return result;
    }

}

class TokenDef extends AST{
    public String tokenname;
    public String ANTLRCODE;
    TokenDef(String tokenname, String ANTLRCODE){
	this.tokenname=tokenname;
	this.ANTLRCODE=ANTLRCODE;
    }
    public String compile() {
        String result = "";

        return result;
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
        String result;
        result = "abstract class "+dataTypeName+"{};\n";
        for (Alternative alternative: alternatives) {
            result += alternative.compile(dataTypeName);
        }
        return result;
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
        result += "class " + constructor + " extends " + parent + "{\n";
        for (Argument argument : arguments) {
            result += "\t" + argument.compile(false);
        }
        int size = arguments.size();
        for(int i = 0 ; i < size ; i++) {
            arg += arguments.get(i).compile(true);
            if(i < size-1) {
                arg += ", ";
            }
        }

        result += "\t"+constructor+"("+arg+"){\n\t";
        for (Argument curr : arguments) {
            result += "\tthis."+curr.compile(true)+"="+curr.compile(true)+";\n\t";
        }
        result += "}\n}\n";
        return result;
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
        if(type.equals("expr")) {
            result += "expr ";
        }
        result += name;
        if(!parameter) {
            result += "\n";
        }
        return result;
    }
}

abstract class Token extends AST{}

class Nonterminal extends Token{
    public String name;
    Nonterminal(String name){this.name=name;}
}

class Terminal extends Token{
    public String token;
    Terminal(String token){this.token=token;}
}

