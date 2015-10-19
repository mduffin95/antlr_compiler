// COMS22201: IR tree construction

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Irt
{
// The code below is generated automatically from the ".tokens" file of the 
// ANTLR syntax analysis, using the TokenConv program.
//
// CAMLE TOKENS BEGIN
  public static final String[] tokenNames = new String[] {
"NONE", "NONE", "NONE", "NONE", "DO", "ELSE", "FALSE", "IF", "READ", "SKIP", "THEN", "TRUE", "WHILE", "WRITE", "WRITELN", "SEMICOLON", "OPENPAREN", "CLOSEPAREN", "INTNUM", "STRING", "COMMENT", "WS", "LETTER", "DIGIT", "ID", "MULT", "MINUS", "PLUS", "ASSIGN", "EQ", "LEQ", "AND", "NOT"};
  public static final int CLOSEPAREN=17;
  public static final int WHILE=12;
  public static final int LETTER=22;
  public static final int ELSE=5;
  public static final int DO=4;
  public static final int SEMICOLON=15;
  public static final int NOT=32;
  public static final int MINUS=26;
  public static final int MULT=25;
  public static final int AND=31;
  public static final int ID=24;
  public static final int TRUE=11;
  public static final int WRITE=13;
  public static final int IF=7;
  public static final int INTNUM=18;
  public static final int SKIP=9;
  public static final int WS=21;
  public static final int THEN=10;
  public static final int WRITELN=14;
  public static final int READ=8;
  public static final int ASSIGN=28;
  public static final int PLUS=27;
  public static final int DIGIT=23;
  public static final int OPENPAREN=16;
  public static final int EQ=29;
  public static final int COMMENT=20;
  public static final int FALSE=6;
  public static final int STRING=19;
  public static final int LEQ=30;
// CAMLE TOKENS END

  public static IRTree convert(CommonTree ast)
  {
    IRTree irt = new IRTree();
    program(ast, irt);
    return irt;
  }

  public static void program(CommonTree ast, IRTree irt)
  {
    statements(ast, irt);
  }

  public static void statements(CommonTree ast, IRTree irt)
  {
    int i;
    Token t = ast.getToken();
    int tt = t.getType();
    if (tt == SEMICOLON) {
      IRTree irt1 = new IRTree();
      IRTree irt2 = new IRTree();
      CommonTree ast1 = (CommonTree)ast.getChild(0);
      CommonTree ast2 = (CommonTree)ast.getChild(1);
      statements(ast1, irt1);
      statements(ast2, irt2);
      irt.setOp("SEQ");
      irt.addSub(irt1);
      irt.addSub(irt2);
    }
    else {
      statement(ast, irt);
    }
  }

  public static void statement(CommonTree ast, IRTree irt)
  {
    CommonTree ast1, ast2, ast3;
    IRTree irt1 = new IRTree(), irt2 = new IRTree(), irt3 = new IRTree();
    Token t = ast.getToken();
    int tt = t.getType();
    if (tt == WRITE) {
      ast1 = (CommonTree)ast.getChild(0);
      String type = arg(ast1, irt1);
      if (type.equals("int")) {
        irt.setOp("WR");
        irt.addSub(irt1);
      }
      else {
        irt.setOp("WRS");
        irt.addSub(irt1);
      }
    }
    else if (tt == WRITELN) {
      String a = String.valueOf(Memory.allocateString("\n"));
      irt.setOp("WRS");
      irt.addSub(new IRTree("MEM", new IRTree("CONST", new IRTree(a))));
    }
    else {
      error(tt);
    }
  }

  public static String arg(CommonTree ast, IRTree irt)
  {
    Token t = ast.getToken();
    int tt = t.getType();
    if (tt == STRING) {
      String tx = t.getText();
      int a = Memory.allocateString(tx); 
      String st = String.valueOf(a);
      irt.setOp("MEM");
      irt.addSub(new IRTree("CONST", new IRTree(st)));
      return "string";
    }
    else {
      expression(ast, irt);
      return "int";
    }
  }

  public static void expression(CommonTree ast, IRTree irt)
  {
    CommonTree ast1;
    IRTree irt1 = new IRTree();
    Token t = ast.getToken();
    int tt = t.getType();
    if (tt == INTNUM) {
      constant(ast, irt1);
      irt.setOp("CONST");
      irt.addSub(irt1);
    }
  }

  public static void constant(CommonTree ast, IRTree irt)
  {
    Token t = ast.getToken();
    int tt = t.getType();
    if (tt == INTNUM) {
      String tx = t.getText();
      irt.setOp(tx);
    }
    else {
      error(tt);
    }
  }

  private static void error(int tt)
  {
    System.out.println("IRT error: "+tokenNames[tt]);
    System.exit(1);
  }
}
