// COMS22201: Code generation

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Cg
{
  public static void program(IRTree irt, PrintStream o)
  {
    emit(o, "XOR R0,R0,R0");   // Initialize R0 to 0
    statement(irt, o);
    emit(o, "HALT");           // Program must end with HALT
    Memory.dumpData(o);        // Dump DATA lines: initial memory contents
  }

  private static void statement(IRTree irt, PrintStream o)
  {
    if (irt.getOp().equals("SEQ")) {
      statement(irt.getSub(0), o);
      statement(irt.getSub(1), o);
    }
    else if (irt.getOp().equals("WRS") && irt.getSub(0).getOp().equals("MEM") && irt.getSub(0).getSub(0).getOp().equals("CONST")) {
      String a = irt.getSub(0).getSub(0).getSub(0).getOp();
      emit(o, "WRS "+a);
    }
    else if (irt.getOp().equals("WR")) {
      String e = expression(irt.getSub(0), o);
      emit(o, "WR "+e);
    }
    else if (irt.getOp().equals("MOVE")) {
    	String loc = irt.getSub(0).getSub(0).getSub(0).getOp();
    	String reg = expression(irt.getSub(1), o);
    	emit(o, "STORE "+reg+",R0,"+loc);
    }
    else if (irt.getOp().equals("READ")) {
    	String loc = irt.getSub(0).getSub(0).getSub(0).getOp();
    	String reg = Memory.getRegister();
    	emit(o, "RD "+reg);
    	emit(o, "STORE "+reg+",R0,"+loc);
    }
    else {
      error(irt.getOp());
    }
  }

  private static String expression(IRTree irt, PrintStream o)
  {
    String result = "";
    System.out.println(irt.getOp());
    if (irt.getOp().equals("CONST")) {
	    String t = irt.getSub(0).getOp();
	    result = Memory.getRegister();
	    emit(o, "ADDI "+result+",R0,"+t);
    }
    else if (irt.getOp().equals("MEM")) {
    	String t = irt.getSub(0).getSub(0).getOp();
        result = Memory.getRegister();
        emit(o, "LOAD "+result+",R0,"+t);
    }
    else if (irt.getOp().equals("BINOP")) {
    	String t = irt.getSub(0).getOp();
    	String Ra, Rb;
    	Ra = expression(irt.getSub(1), o);
    	Rb = expression(irt.getSub(2), o);
    	String op;
    	if (t.equals("+")) {
    		op = "ADD ";
    	} 
    	else if (t.equals("-")) {
    		op = "SUB ";
    	}
    	else {
    		op = "MUL ";
    	}
        result = Memory.getRegister();
        emit(o, op+result+","+Ra+","+Rb);
    }
    else {
        error(irt.getOp());
    }
    return result;
  }

  private static void emit(PrintStream o, String s)
  {
    o.println(s);
  }

  private static void error(String op)
  {
    System.out.println("CG error: "+op);
    System.exit(1);
  }
}
