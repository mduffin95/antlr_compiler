// $ANTLR 3.2 debian-10 /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g 2015-12-13 17:29:47

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class Syn extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DO", "ELSE", "FALSE", "IF", "READ", "SKIP", "THEN", "TRUE", "WHILE", "WRITE", "WRITELN", "SEMICOLON", "OPENPAREN", "CLOSEPAREN", "INTNUM", "STRING", "COMMENT", "WS", "LETTER", "DIGIT", "ID", "MULT", "MINUS", "PLUS", "ASSIGN", "EQ", "LEQ", "AND", "NOT"
    };
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
    public static final int EOF=-1;
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

    // delegates
    // delegators


        public Syn(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Syn(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return Syn.tokenNames; }
    public String getGrammarFileName() { return "/home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g"; }


    	private String cleanString(String s){
    		String tmp;
    		tmp = s.replaceAll("^'", "");
    		s = tmp.replaceAll("'$", "");
    		tmp = s.replaceAll("''", "'");
    		return tmp;
    	}


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:21:1: program : statements ;
    public final Syn.program_return program() throws RecognitionException {
        Syn.program_return retval = new Syn.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Syn.statements_return statements1 = null;



        try {
            // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:21:9: ( statements )
            // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:22:7: statements
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statements_in_program49);
            statements1=statements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statements1.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class statements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statements"
    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:25:1: statements : statement ( SEMICOLON statement )* ;
    public final Syn.statements_return statements() throws RecognitionException {
        Syn.statements_return retval = new Syn.statements_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON3=null;
        Syn.statement_return statement2 = null;

        Syn.statement_return statement4 = null;


        Object SEMICOLON3_tree=null;

        try {
            // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:25:12: ( statement ( SEMICOLON statement )* )
            // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:26:7: statement ( SEMICOLON statement )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statement_in_statements68);
            statement2=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement2.getTree());
            // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:26:17: ( SEMICOLON statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SEMICOLON) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:26:19: SEMICOLON statement
            	    {
            	    SEMICOLON3=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements72); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SEMICOLON3_tree = (Object)adaptor.create(SEMICOLON3);
            	    root_0 = (Object)adaptor.becomeRoot(SEMICOLON3_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_statement_in_statements75);
            	    statement4=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statements"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:29:1: statement : ( ID ASSIGN exp | SKIP | IF boolexp THEN statement ELSE statement | WHILE boolexp DO statement | READ OPENPAREN ID CLOSEPAREN | ( WRITE OPENPAREN exp )=> WRITE OPENPAREN exp CLOSEPAREN | WRITE OPENPAREN ( boolexp | string ) CLOSEPAREN | WRITELN | OPENPAREN statements CLOSEPAREN );
    public final Syn.statement_return statement() throws RecognitionException {
        Syn.statement_return retval = new Syn.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID5=null;
        Token ASSIGN6=null;
        Token SKIP8=null;
        Token IF9=null;
        Token THEN11=null;
        Token ELSE13=null;
        Token WHILE15=null;
        Token DO17=null;
        Token READ19=null;
        Token OPENPAREN20=null;
        Token ID21=null;
        Token CLOSEPAREN22=null;
        Token WRITE23=null;
        Token OPENPAREN24=null;
        Token CLOSEPAREN26=null;
        Token WRITE27=null;
        Token OPENPAREN28=null;
        Token CLOSEPAREN31=null;
        Token WRITELN32=null;
        Token OPENPAREN33=null;
        Token CLOSEPAREN35=null;
        Syn.exp_return exp7 = null;

        Syn.boolexp_return boolexp10 = null;

        Syn.statement_return statement12 = null;

        Syn.statement_return statement14 = null;

        Syn.boolexp_return boolexp16 = null;

        Syn.statement_return statement18 = null;

        Syn.exp_return exp25 = null;

        Syn.boolexp_return boolexp29 = null;

        Syn.string_return string30 = null;

        Syn.statements_return statements34 = null;


        Object ID5_tree=null;
        Object ASSIGN6_tree=null;
        Object SKIP8_tree=null;
        Object IF9_tree=null;
        Object THEN11_tree=null;
        Object ELSE13_tree=null;
        Object WHILE15_tree=null;
        Object DO17_tree=null;
        Object READ19_tree=null;
        Object OPENPAREN20_tree=null;
        Object ID21_tree=null;
        Object CLOSEPAREN22_tree=null;
        Object WRITE23_tree=null;
        Object OPENPAREN24_tree=null;
        Object CLOSEPAREN26_tree=null;
        Object WRITE27_tree=null;
        Object OPENPAREN28_tree=null;
        Object CLOSEPAREN31_tree=null;
        Object WRITELN32_tree=null;
        Object OPENPAREN33_tree=null;
        Object CLOSEPAREN35_tree=null;

        try {
            // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:29:11: ( ID ASSIGN exp | SKIP | IF boolexp THEN statement ELSE statement | WHILE boolexp DO statement | READ OPENPAREN ID CLOSEPAREN | ( WRITE OPENPAREN exp )=> WRITE OPENPAREN exp CLOSEPAREN | WRITE OPENPAREN ( boolexp | string ) CLOSEPAREN | WRITELN | OPENPAREN statements CLOSEPAREN )
            int alt3=9;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:30:7: ID ASSIGN exp
                    {
                    root_0 = (Object)adaptor.nil();

                    ID5=(Token)match(input,ID,FOLLOW_ID_in_statement97); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID5_tree = (Object)adaptor.create(ID5);
                    adaptor.addChild(root_0, ID5_tree);
                    }
                    ASSIGN6=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_statement99); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN6_tree = (Object)adaptor.create(ASSIGN6);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN6_tree, root_0);
                    }
                    pushFollow(FOLLOW_exp_in_statement102);
                    exp7=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exp7.getTree());

                    }
                    break;
                case 2 :
                    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:31:7: SKIP
                    {
                    root_0 = (Object)adaptor.nil();

                    SKIP8=(Token)match(input,SKIP,FOLLOW_SKIP_in_statement110); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SKIP8_tree = (Object)adaptor.create(SKIP8);
                    adaptor.addChild(root_0, SKIP8_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:32:7: IF boolexp THEN statement ELSE statement
                    {
                    root_0 = (Object)adaptor.nil();

                    IF9=(Token)match(input,IF,FOLLOW_IF_in_statement118); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF9_tree = (Object)adaptor.create(IF9);
                    root_0 = (Object)adaptor.becomeRoot(IF9_tree, root_0);
                    }
                    pushFollow(FOLLOW_boolexp_in_statement121);
                    boolexp10=boolexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolexp10.getTree());
                    THEN11=(Token)match(input,THEN,FOLLOW_THEN_in_statement123); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement126);
                    statement12=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement12.getTree());
                    ELSE13=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement128); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement131);
                    statement14=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement14.getTree());

                    }
                    break;
                case 4 :
                    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:33:7: WHILE boolexp DO statement
                    {
                    root_0 = (Object)adaptor.nil();

                    WHILE15=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement139); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE15_tree = (Object)adaptor.create(WHILE15);
                    root_0 = (Object)adaptor.becomeRoot(WHILE15_tree, root_0);
                    }
                    pushFollow(FOLLOW_boolexp_in_statement142);
                    boolexp16=boolexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolexp16.getTree());
                    DO17=(Token)match(input,DO,FOLLOW_DO_in_statement144); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement147);
                    statement18=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement18.getTree());

                    }
                    break;
                case 5 :
                    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:34:7: READ OPENPAREN ID CLOSEPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    READ19=(Token)match(input,READ,FOLLOW_READ_in_statement155); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    READ19_tree = (Object)adaptor.create(READ19);
                    root_0 = (Object)adaptor.becomeRoot(READ19_tree, root_0);
                    }
                    OPENPAREN20=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_statement158); if (state.failed) return retval;
                    ID21=(Token)match(input,ID,FOLLOW_ID_in_statement161); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID21_tree = (Object)adaptor.create(ID21);
                    adaptor.addChild(root_0, ID21_tree);
                    }
                    CLOSEPAREN22=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_statement163); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:35:7: ( WRITE OPENPAREN exp )=> WRITE OPENPAREN exp CLOSEPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    WRITE23=(Token)match(input,WRITE,FOLLOW_WRITE_in_statement184); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WRITE23_tree = (Object)adaptor.create(WRITE23);
                    root_0 = (Object)adaptor.becomeRoot(WRITE23_tree, root_0);
                    }
                    OPENPAREN24=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_statement187); if (state.failed) return retval;
                    pushFollow(FOLLOW_exp_in_statement190);
                    exp25=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exp25.getTree());
                    CLOSEPAREN26=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_statement192); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:36:7: WRITE OPENPAREN ( boolexp | string ) CLOSEPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    WRITE27=(Token)match(input,WRITE,FOLLOW_WRITE_in_statement201); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WRITE27_tree = (Object)adaptor.create(WRITE27);
                    root_0 = (Object)adaptor.becomeRoot(WRITE27_tree, root_0);
                    }
                    OPENPAREN28=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_statement204); if (state.failed) return retval;
                    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:36:25: ( boolexp | string )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==FALSE||LA2_0==TRUE||LA2_0==OPENPAREN||LA2_0==INTNUM||LA2_0==ID||LA2_0==NOT) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==STRING) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:36:27: boolexp
                            {
                            pushFollow(FOLLOW_boolexp_in_statement209);
                            boolexp29=boolexp();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, boolexp29.getTree());

                            }
                            break;
                        case 2 :
                            // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:36:37: string
                            {
                            pushFollow(FOLLOW_string_in_statement213);
                            string30=string();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, string30.getTree());

                            }
                            break;

                    }

                    CLOSEPAREN31=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_statement217); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:37:7: WRITELN
                    {
                    root_0 = (Object)adaptor.nil();

                    WRITELN32=(Token)match(input,WRITELN,FOLLOW_WRITELN_in_statement226); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WRITELN32_tree = (Object)adaptor.create(WRITELN32);
                    adaptor.addChild(root_0, WRITELN32_tree);
                    }

                    }
                    break;
                case 9 :
                    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:38:7: OPENPAREN statements CLOSEPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    OPENPAREN33=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_statement234); if (state.failed) return retval;
                    pushFollow(FOLLOW_statements_in_statement237);
                    statements34=statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statements34.getTree());
                    CLOSEPAREN35=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_statement239); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    protected static class string_scope {
        String tmp;
    }
    protected Stack string_stack = new Stack();

    public static class string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string"
    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:41:1: string : s= STRING -> STRING[$string::tmp] ;
    public final Syn.string_return string() throws RecognitionException {
        string_stack.push(new string_scope());
        Syn.string_return retval = new Syn.string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token s=null;

        Object s_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:43:5: (s= STRING -> STRING[$string::tmp] )
            // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:44:5: s= STRING
            {
            s=(Token)match(input,STRING,FOLLOW_STRING_in_string271); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING.add(s);

            if ( state.backtracking==0 ) {
               ((string_scope)string_stack.peek()).tmp = cleanString((s!=null?s.getText():null)); 
            }


            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 44:54: -> STRING[$string::tmp]
            {
                adaptor.addChild(root_0, (Object)adaptor.create(STRING, ((string_scope)string_stack.peek()).tmp));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            string_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "string"

    public static class boolexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolexp"
    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:47:1: boolexp : boolterm ( AND boolterm )* ;
    public final Syn.boolexp_return boolexp() throws RecognitionException {
        Syn.boolexp_return retval = new Syn.boolexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND37=null;
        Syn.boolterm_return boolterm36 = null;

        Syn.boolterm_return boolterm38 = null;


        Object AND37_tree=null;

        try {
            // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:47:9: ( boolterm ( AND boolterm )* )
            // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:48:7: boolterm ( AND boolterm )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolterm_in_boolexp296);
            boolterm36=boolterm();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, boolterm36.getTree());
            // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:48:16: ( AND boolterm )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==AND) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:48:18: AND boolterm
            	    {
            	    AND37=(Token)match(input,AND,FOLLOW_AND_in_boolexp300); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND37_tree = (Object)adaptor.create(AND37);
            	    root_0 = (Object)adaptor.becomeRoot(AND37_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_boolterm_in_boolexp303);
            	    boolterm38=boolterm();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolterm38.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "boolexp"

    public static class boolterm_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolterm"
    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:51:1: boolterm : ( NOT bool | bool );
    public final Syn.boolterm_return boolterm() throws RecognitionException {
        Syn.boolterm_return retval = new Syn.boolterm_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT39=null;
        Syn.bool_return bool40 = null;

        Syn.bool_return bool41 = null;


        Object NOT39_tree=null;

        try {
            // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:51:10: ( NOT bool | bool )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==NOT) ) {
                alt5=1;
            }
            else if ( (LA5_0==FALSE||LA5_0==TRUE||LA5_0==OPENPAREN||LA5_0==INTNUM||LA5_0==ID) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:52:7: NOT bool
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT39=(Token)match(input,NOT,FOLLOW_NOT_in_boolterm325); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT39_tree = (Object)adaptor.create(NOT39);
                    root_0 = (Object)adaptor.becomeRoot(NOT39_tree, root_0);
                    }
                    pushFollow(FOLLOW_bool_in_boolterm328);
                    bool40=bool();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool40.getTree());

                    }
                    break;
                case 2 :
                    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:53:7: bool
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_bool_in_boolterm336);
                    bool41=bool();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool41.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "boolterm"

    public static class bool_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool"
    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:56:1: bool : ( TRUE | FALSE | ( exp ( EQ | LEQ ) )=> exp ( EQ | LEQ ) exp | OPENPAREN boolexp CLOSEPAREN );
    public final Syn.bool_return bool() throws RecognitionException {
        Syn.bool_return retval = new Syn.bool_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TRUE42=null;
        Token FALSE43=null;
        Token set45=null;
        Token OPENPAREN47=null;
        Token CLOSEPAREN49=null;
        Syn.exp_return exp44 = null;

        Syn.exp_return exp46 = null;

        Syn.boolexp_return boolexp48 = null;


        Object TRUE42_tree=null;
        Object FALSE43_tree=null;
        Object set45_tree=null;
        Object OPENPAREN47_tree=null;
        Object CLOSEPAREN49_tree=null;

        try {
            // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:56:6: ( TRUE | FALSE | ( exp ( EQ | LEQ ) )=> exp ( EQ | LEQ ) exp | OPENPAREN boolexp CLOSEPAREN )
            int alt6=4;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==TRUE) ) {
                alt6=1;
            }
            else if ( (LA6_0==FALSE) ) {
                alt6=2;
            }
            else if ( (LA6_0==ID) && (synpred2_Syn())) {
                alt6=3;
            }
            else if ( (LA6_0==INTNUM) && (synpred2_Syn())) {
                alt6=3;
            }
            else if ( (LA6_0==OPENPAREN) ) {
                int LA6_5 = input.LA(2);

                if ( (synpred2_Syn()) ) {
                    alt6=3;
                }
                else if ( (true) ) {
                    alt6=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 5, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:57:7: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    TRUE42=(Token)match(input,TRUE,FOLLOW_TRUE_in_bool359); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE42_tree = (Object)adaptor.create(TRUE42);
                    adaptor.addChild(root_0, TRUE42_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:58:7: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    FALSE43=(Token)match(input,FALSE,FOLLOW_FALSE_in_bool367); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE43_tree = (Object)adaptor.create(FALSE43);
                    adaptor.addChild(root_0, FALSE43_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:59:7: ( exp ( EQ | LEQ ) )=> exp ( EQ | LEQ ) exp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exp_in_bool393);
                    exp44=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exp44.getTree());
                    set45=(Token)input.LT(1);
                    set45=(Token)input.LT(1);
                    if ( (input.LA(1)>=EQ && input.LA(1)<=LEQ) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set45), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_exp_in_bool406);
                    exp46=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exp46.getTree());

                    }
                    break;
                case 4 :
                    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:60:7: OPENPAREN boolexp CLOSEPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    OPENPAREN47=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_bool414); if (state.failed) return retval;
                    pushFollow(FOLLOW_boolexp_in_bool417);
                    boolexp48=boolexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolexp48.getTree());
                    CLOSEPAREN49=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_bool419); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bool"

    public static class exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exp"
    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:63:1: exp : term ( ( PLUS | MINUS ) term )* ;
    public final Syn.exp_return exp() throws RecognitionException {
        Syn.exp_return retval = new Syn.exp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set51=null;
        Syn.term_return term50 = null;

        Syn.term_return term52 = null;


        Object set51_tree=null;

        try {
            // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:63:5: ( term ( ( PLUS | MINUS ) term )* )
            // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:64:5: term ( ( PLUS | MINUS ) term )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_term_in_exp437);
            term50=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term50.getTree());
            // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:64:10: ( ( PLUS | MINUS ) term )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=MINUS && LA7_0<=PLUS)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:64:12: ( PLUS | MINUS ) term
            	    {
            	    set51=(Token)input.LT(1);
            	    set51=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MINUS && input.LA(1)<=PLUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set51), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_exp452);
            	    term52=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term52.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exp"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:67:1: term : factor ( MULT factor )* ;
    public final Syn.term_return term() throws RecognitionException {
        Syn.term_return retval = new Syn.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MULT54=null;
        Syn.factor_return factor53 = null;

        Syn.factor_return factor55 = null;


        Object MULT54_tree=null;

        try {
            // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:67:6: ( factor ( MULT factor )* )
            // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:68:5: factor ( MULT factor )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term472);
            factor53=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor53.getTree());
            // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:68:12: ( MULT factor )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==MULT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:68:14: MULT factor
            	    {
            	    MULT54=(Token)match(input,MULT,FOLLOW_MULT_in_term476); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    MULT54_tree = (Object)adaptor.create(MULT54);
            	    root_0 = (Object)adaptor.becomeRoot(MULT54_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_factor_in_term479);
            	    factor55=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor55.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:71:1: factor : ( ID | INTNUM | OPENPAREN exp CLOSEPAREN );
    public final Syn.factor_return factor() throws RecognitionException {
        Syn.factor_return retval = new Syn.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID56=null;
        Token INTNUM57=null;
        Token OPENPAREN58=null;
        Token CLOSEPAREN60=null;
        Syn.exp_return exp59 = null;


        Object ID56_tree=null;
        Object INTNUM57_tree=null;
        Object OPENPAREN58_tree=null;
        Object CLOSEPAREN60_tree=null;

        try {
            // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:71:8: ( ID | INTNUM | OPENPAREN exp CLOSEPAREN )
            int alt9=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt9=1;
                }
                break;
            case INTNUM:
                {
                alt9=2;
                }
                break;
            case OPENPAREN:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:72:7: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID56=(Token)match(input,ID,FOLLOW_ID_in_factor502); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID56_tree = (Object)adaptor.create(ID56);
                    adaptor.addChild(root_0, ID56_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:73:7: INTNUM
                    {
                    root_0 = (Object)adaptor.nil();

                    INTNUM57=(Token)match(input,INTNUM,FOLLOW_INTNUM_in_factor510); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTNUM57_tree = (Object)adaptor.create(INTNUM57);
                    adaptor.addChild(root_0, INTNUM57_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:74:7: OPENPAREN exp CLOSEPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    OPENPAREN58=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_factor518); if (state.failed) return retval;
                    pushFollow(FOLLOW_exp_in_factor521);
                    exp59=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exp59.getTree());
                    CLOSEPAREN60=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_factor523); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "factor"

    // $ANTLR start synpred1_Syn
    public final void synpred1_Syn_fragment() throws RecognitionException {   
        // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:35:7: ( WRITE OPENPAREN exp )
        // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:35:9: WRITE OPENPAREN exp
        {
        match(input,WRITE,FOLLOW_WRITE_in_synpred1_Syn174); if (state.failed) return ;
        match(input,OPENPAREN,FOLLOW_OPENPAREN_in_synpred1_Syn176); if (state.failed) return ;
        pushFollow(FOLLOW_exp_in_synpred1_Syn178);
        exp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Syn

    // $ANTLR start synpred2_Syn
    public final void synpred2_Syn_fragment() throws RecognitionException {   
        // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:59:7: ( exp ( EQ | LEQ ) )
        // /home/matt/Documents/uni/langeng/workspace/antlr_compiler/src/Syn.g:59:9: exp ( EQ | LEQ )
        {
        pushFollow(FOLLOW_exp_in_synpred2_Syn377);
        exp();

        state._fsp--;
        if (state.failed) return ;
        if ( (input.LA(1)>=EQ && input.LA(1)<=LEQ) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred2_Syn

    // Delegated rules

    public final boolean synpred2_Syn() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Syn_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Syn() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Syn_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\13\uffff";
    static final String DFA3_eofS =
        "\13\uffff";
    static final String DFA3_minS =
        "\1\7\5\uffff\1\0\4\uffff";
    static final String DFA3_maxS =
        "\1\30\5\uffff\1\0\4\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\10\1\11\1\6\1\7";
    static final String DFA3_specialS =
        "\6\uffff\1\0\4\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\3\1\5\1\2\2\uffff\1\4\1\6\1\7\1\uffff\1\10\7\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "29:1: statement : ( ID ASSIGN exp | SKIP | IF boolexp THEN statement ELSE statement | WHILE boolexp DO statement | READ OPENPAREN ID CLOSEPAREN | ( WRITE OPENPAREN exp )=> WRITE OPENPAREN exp CLOSEPAREN | WRITE OPENPAREN ( boolexp | string ) CLOSEPAREN | WRITELN | OPENPAREN statements CLOSEPAREN );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_6 = input.LA(1);

                         
                        int index3_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Syn()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index3_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_statements_in_program49 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements68 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_SEMICOLON_in_statements72 = new BitSet(new long[]{0x0000000001017380L});
    public static final BitSet FOLLOW_statement_in_statements75 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ID_in_statement97 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ASSIGN_in_statement99 = new BitSet(new long[]{0x0000000001050000L});
    public static final BitSet FOLLOW_exp_in_statement102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SKIP_in_statement110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement118 = new BitSet(new long[]{0x0000000101050840L});
    public static final BitSet FOLLOW_boolexp_in_statement121 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_THEN_in_statement123 = new BitSet(new long[]{0x0000000001017380L});
    public static final BitSet FOLLOW_statement_in_statement126 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ELSE_in_statement128 = new BitSet(new long[]{0x0000000001017380L});
    public static final BitSet FOLLOW_statement_in_statement131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement139 = new BitSet(new long[]{0x0000000101050840L});
    public static final BitSet FOLLOW_boolexp_in_statement142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DO_in_statement144 = new BitSet(new long[]{0x0000000001017380L});
    public static final BitSet FOLLOW_statement_in_statement147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_statement155 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_OPENPAREN_in_statement158 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_statement161 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSEPAREN_in_statement163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_statement184 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_OPENPAREN_in_statement187 = new BitSet(new long[]{0x0000000001050000L});
    public static final BitSet FOLLOW_exp_in_statement190 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSEPAREN_in_statement192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_statement201 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_OPENPAREN_in_statement204 = new BitSet(new long[]{0x00000001010D0840L});
    public static final BitSet FOLLOW_boolexp_in_statement209 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_string_in_statement213 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSEPAREN_in_statement217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITELN_in_statement226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENPAREN_in_statement234 = new BitSet(new long[]{0x0000000001017380L});
    public static final BitSet FOLLOW_statements_in_statement237 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSEPAREN_in_statement239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_string271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_boolexp296 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_AND_in_boolexp300 = new BitSet(new long[]{0x0000000101050840L});
    public static final BitSet FOLLOW_boolterm_in_boolexp303 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_NOT_in_boolterm325 = new BitSet(new long[]{0x0000000101050840L});
    public static final BitSet FOLLOW_bool_in_boolterm328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_in_boolterm336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_bool359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_bool367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_bool393 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_bool395 = new BitSet(new long[]{0x0000000001050000L});
    public static final BitSet FOLLOW_exp_in_bool406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENPAREN_in_bool414 = new BitSet(new long[]{0x0000000101050840L});
    public static final BitSet FOLLOW_boolexp_in_bool417 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSEPAREN_in_bool419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_exp437 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_set_in_exp441 = new BitSet(new long[]{0x0000000001050000L});
    public static final BitSet FOLLOW_term_in_exp452 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_factor_in_term472 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_MULT_in_term476 = new BitSet(new long[]{0x0000000001050000L});
    public static final BitSet FOLLOW_factor_in_term479 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ID_in_factor502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTNUM_in_factor510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENPAREN_in_factor518 = new BitSet(new long[]{0x0000000001050000L});
    public static final BitSet FOLLOW_exp_in_factor521 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSEPAREN_in_factor523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_synpred1_Syn174 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_OPENPAREN_in_synpred1_Syn176 = new BitSet(new long[]{0x0000000001050000L});
    public static final BitSet FOLLOW_exp_in_synpred1_Syn178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_synpred2_Syn377 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_synpred2_Syn379 = new BitSet(new long[]{0x0000000000000002L});

}