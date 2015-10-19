// COMS22201: Syntax analyser

parser grammar Syn;

options {
  tokenVocab = Lex;
  output = AST;
}

@members
{
	private String cleanString(String s){
		String tmp;
		tmp = s.replaceAll("^'", "");
		s = tmp.replaceAll("'$", "");
		tmp = s.replaceAll("''", "'");
		return tmp;
	}
}

program :
      statements
    ;

statements :
      statement ( SEMICOLON^ statement )*
    ;

statement :
      ID ASSIGN^ exp
    | SKIP
    | READ^ OPENPAREN! ID CLOSEPAREN!
    | IF boolexp THEN statement ELSE statement
    | WHILE boolexp DO statement
    | WRITE^ OPENPAREN! ( exp | string ) CLOSEPAREN!
    | WRITELN
    | OPENPAREN! statements CLOSEPAREN!
    ;

string
    scope { String tmp; }
    :
    s=STRING { $string::tmp = cleanString($s.text); }-> STRING[$string::tmp]
;

exp :
    term ( ( PLUS | MINUS ) term )*
    ;

term :
    factor ( MULT factor )* 
    ;

factor :
      ID
    | INTNUM
    | OPENPAREN! exp CLOSEPAREN!
    ; 

boolexp :
      boolterm ( AND boolterm )*
    ;

boolterm :
      NOT boolean
    | boolean
    ;    
    
boolean :
      TRUE
    | FALSE
    | exp ( EQ | LEQ ) exp
    | OPENPAREN! boolexp CLOSEPAREN!
    ;
    