// COMS22201: Lexical analyser

lexer grammar Lex;

//---------------------------------------------------------------------------
// KEYWORDS
//---------------------------------------------------------------------------
DO         : 'do' ;
ELSE       : 'else' ;
FALSE      : 'false' ;
IF         : 'if' ;
READ       : 'read' ;
SKIP       : 'skip' ;
THEN       : 'then' ;
TRUE       : 'true' ;
WHILE      : 'while' ;
WRITE      : 'write' ;
WRITELN    : 'writeln' ;

//---------------------------------------------------------------------------
// OPERATORS
//---------------------------------------------------------------------------
SEMICOLON    : ';' ;
OPENPAREN    : '(' ;
CLOSEPAREN   : ')' ;

STRING       : '\'' ('\'' '\'' | ~'\'')* '\'';

COMMENT      : '{' (~'}')* '}' {skip();} ;

WS           : (' ' | '\t' | '\r' | '\n' )+ {skip();} ;

fragment
DIGIT        : '0'..'9' ;

INTNUM       : DIGIT+ ;

fragment
LETTER       : 'a'..'z'
             | 'A'..'Z' ;

ID           : LETTER (LETTER | DIGIT)* ;

TIMES        : '*' ;
MINUS        : '-' ;
PLUS         : '+' ;
