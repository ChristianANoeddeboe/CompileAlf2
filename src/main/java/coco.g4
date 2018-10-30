grammar coco;

/* Compiler-compiler */

start   : tokenDef* dataTypeDef* EOF ;

// ANTLR Token Definition
tokenDef : ID ANTLRCODE ; 

// definition of an algebraic data type
dataTypeDef : 'data' ID '=' alternatives ';' ; 

// alternatives of an algebraic data type and concrete syntax for it. 
alternatives : alternative ('|' alternative)* ;
alternative  : ID '(' arguments ')' ':' token* ;

// an argument consists of a type and a name (both are IDs for the lexer)
arguments : argument (',' argument)* ;
argument  : ID ID ;

token : ID    		# Nonterminal
      | STRINGTOKEN 	# Terminal
      ;
      
STRINGTOKEN: '\''~[']+'\'';
ID	   : ('A'..'Z'|'a'..'z'|'_')('A'..'Z'|'a'..'z'|'_'|'0'..'9')* ;
WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'(~[\n])* -> skip;
ANTLRCODE  : '#'(~[#])+'#' ;
