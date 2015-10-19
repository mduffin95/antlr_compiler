// $ANTLR 3.2 debian-10 Syn.g 2015-10-19 20:30:11

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


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
    public String getGrammarFileName() { return "Syn.g"; }


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
    // Syn.g:21:1: program : statements ;
    public final Syn.program_return program() throws RecognitionException {
        Syn.program_return retval = new Syn.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Syn.statements_return statements1 = null;



        try {
            // Syn.g:21:9: ( statements )
            // Syn.g:22:7: statements
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statements_in_program49);
            statements1=statements();

            state._fsp--;

            adaptor.addChild(root_0, statements1.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // Syn.g:25:1: statements : statement ( SEMICOLON statement )* ;
    public final Syn.statements_return statements() throws RecognitionException {
        Syn.statements_return retval = new Syn.statements_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON3=null;
        Syn.statement_return statement2 = null;

        Syn.statement_return statement4 = null;


        Object SEMICOLON3_tree=null;

        try {
            // Syn.g:25:12: ( statement ( SEMICOLON statement )* )
            // Syn.g:26:7: statement ( SEMICOLON statement )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statement_in_statements68);
            statement2=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement2.getTree());
            // Syn.g:26:17: ( SEMICOLON statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SEMICOLON) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Syn.g:26:19: SEMICOLON statement
            	    {
            	    SEMICOLON3=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements72); 
            	    SEMICOLON3_tree = (Object)adaptor.create(SEMICOLON3);
            	    root_0 = (Object)adaptor.becomeRoot(SEMICOLON3_tree, root_0);

            	    pushFollow(FOLLOW_statement_in_statements75);
            	    statement4=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // Syn.g:29:1: statement : ( ID ASSIGN exp | SKIP | READ OPENPAREN ID CLOSEPAREN | IF boolexp THEN statement ELSE statement | WHILE boolexp DO statement | WRITE OPENPAREN ( exp | string ) CLOSEPAREN | WRITELN | OPENPAREN statements CLOSEPAREN );
    public final Syn.statement_return statement() throws RecognitionException {
        Syn.statement_return retval = new Syn.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID5=null;
        Token ASSIGN6=null;
        Token SKIP8=null;
        Token READ9=null;
        Token OPENPAREN10=null;
        Token ID11=null;
        Token CLOSEPAREN12=null;
        Token IF13=null;
        Token THEN15=null;
        Token ELSE17=null;
        Token WHILE19=null;
        Token DO21=null;
        Token WRITE23=null;
        Token OPENPAREN24=null;
        Token CLOSEPAREN27=null;
        Token WRITELN28=null;
        Token OPENPAREN29=null;
        Token CLOSEPAREN31=null;
        Syn.exp_return exp7 = null;

        Syn.boolexp_return boolexp14 = null;

        Syn.statement_return statement16 = null;

        Syn.statement_return statement18 = null;

        Syn.boolexp_return boolexp20 = null;

        Syn.statement_return statement22 = null;

        Syn.exp_return exp25 = null;

        Syn.string_return string26 = null;

        Syn.statements_return statements30 = null;


        Object ID5_tree=null;
        Object ASSIGN6_tree=null;
        Object SKIP8_tree=null;
        Object READ9_tree=null;
        Object OPENPAREN10_tree=null;
        Object ID11_tree=null;
        Object CLOSEPAREN12_tree=null;
        Object IF13_tree=null;
        Object THEN15_tree=null;
        Object ELSE17_tree=null;
        Object WHILE19_tree=null;
        Object DO21_tree=null;
        Object WRITE23_tree=null;
        Object OPENPAREN24_tree=null;
        Object CLOSEPAREN27_tree=null;
        Object WRITELN28_tree=null;
        Object OPENPAREN29_tree=null;
        Object CLOSEPAREN31_tree=null;

        try {
            // Syn.g:29:11: ( ID ASSIGN exp | SKIP | READ OPENPAREN ID CLOSEPAREN | IF boolexp THEN statement ELSE statement | WHILE boolexp DO statement | WRITE OPENPAREN ( exp | string ) CLOSEPAREN | WRITELN | OPENPAREN statements CLOSEPAREN )
            int alt3=8;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt3=1;
                }
                break;
            case SKIP:
                {
                alt3=2;
                }
                break;
            case READ:
                {
                alt3=3;
                }
                break;
            case IF:
                {
                alt3=4;
                }
                break;
            case WHILE:
                {
                alt3=5;
                }
                break;
            case WRITE:
                {
                alt3=6;
                }
                break;
            case WRITELN:
                {
                alt3=7;
                }
                break;
            case OPENPAREN:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // Syn.g:30:7: ID ASSIGN exp
                    {
                    root_0 = (Object)adaptor.nil();

                    ID5=(Token)match(input,ID,FOLLOW_ID_in_statement97); 
                    ID5_tree = (Object)adaptor.create(ID5);
                    adaptor.addChild(root_0, ID5_tree);

                    ASSIGN6=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_statement99); 
                    ASSIGN6_tree = (Object)adaptor.create(ASSIGN6);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN6_tree, root_0);

                    pushFollow(FOLLOW_exp_in_statement102);
                    exp7=exp();

                    state._fsp--;

                    adaptor.addChild(root_0, exp7.getTree());

                    }
                    break;
                case 2 :
                    // Syn.g:31:7: SKIP
                    {
                    root_0 = (Object)adaptor.nil();

                    SKIP8=(Token)match(input,SKIP,FOLLOW_SKIP_in_statement110); 
                    SKIP8_tree = (Object)adaptor.create(SKIP8);
                    adaptor.addChild(root_0, SKIP8_tree);


                    }
                    break;
                case 3 :
                    // Syn.g:32:7: READ OPENPAREN ID CLOSEPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    READ9=(Token)match(input,READ,FOLLOW_READ_in_statement118); 
                    READ9_tree = (Object)adaptor.create(READ9);
                    root_0 = (Object)adaptor.becomeRoot(READ9_tree, root_0);

                    OPENPAREN10=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_statement121); 
                    ID11=(Token)match(input,ID,FOLLOW_ID_in_statement124); 
                    ID11_tree = (Object)adaptor.create(ID11);
                    adaptor.addChild(root_0, ID11_tree);

                    CLOSEPAREN12=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_statement126); 

                    }
                    break;
                case 4 :
                    // Syn.g:33:7: IF boolexp THEN statement ELSE statement
                    {
                    root_0 = (Object)adaptor.nil();

                    IF13=(Token)match(input,IF,FOLLOW_IF_in_statement135); 
                    IF13_tree = (Object)adaptor.create(IF13);
                    adaptor.addChild(root_0, IF13_tree);

                    pushFollow(FOLLOW_boolexp_in_statement137);
                    boolexp14=boolexp();

                    state._fsp--;

                    adaptor.addChild(root_0, boolexp14.getTree());
                    THEN15=(Token)match(input,THEN,FOLLOW_THEN_in_statement139); 
                    THEN15_tree = (Object)adaptor.create(THEN15);
                    adaptor.addChild(root_0, THEN15_tree);

                    pushFollow(FOLLOW_statement_in_statement141);
                    statement16=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement16.getTree());
                    ELSE17=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement143); 
                    ELSE17_tree = (Object)adaptor.create(ELSE17);
                    adaptor.addChild(root_0, ELSE17_tree);

                    pushFollow(FOLLOW_statement_in_statement145);
                    statement18=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement18.getTree());

                    }
                    break;
                case 5 :
                    // Syn.g:34:7: WHILE boolexp DO statement
                    {
                    root_0 = (Object)adaptor.nil();

                    WHILE19=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement153); 
                    WHILE19_tree = (Object)adaptor.create(WHILE19);
                    adaptor.addChild(root_0, WHILE19_tree);

                    pushFollow(FOLLOW_boolexp_in_statement155);
                    boolexp20=boolexp();

                    state._fsp--;

                    adaptor.addChild(root_0, boolexp20.getTree());
                    DO21=(Token)match(input,DO,FOLLOW_DO_in_statement157); 
                    DO21_tree = (Object)adaptor.create(DO21);
                    adaptor.addChild(root_0, DO21_tree);

                    pushFollow(FOLLOW_statement_in_statement159);
                    statement22=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement22.getTree());

                    }
                    break;
                case 6 :
                    // Syn.g:35:7: WRITE OPENPAREN ( exp | string ) CLOSEPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    WRITE23=(Token)match(input,WRITE,FOLLOW_WRITE_in_statement167); 
                    WRITE23_tree = (Object)adaptor.create(WRITE23);
                    root_0 = (Object)adaptor.becomeRoot(WRITE23_tree, root_0);

                    OPENPAREN24=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_statement170); 
                    // Syn.g:35:25: ( exp | string )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==OPENPAREN||LA2_0==INTNUM||LA2_0==ID) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==STRING) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // Syn.g:35:27: exp
                            {
                            pushFollow(FOLLOW_exp_in_statement175);
                            exp25=exp();

                            state._fsp--;

                            adaptor.addChild(root_0, exp25.getTree());

                            }
                            break;
                        case 2 :
                            // Syn.g:35:33: string
                            {
                            pushFollow(FOLLOW_string_in_statement179);
                            string26=string();

                            state._fsp--;

                            adaptor.addChild(root_0, string26.getTree());

                            }
                            break;

                    }

                    CLOSEPAREN27=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_statement183); 

                    }
                    break;
                case 7 :
                    // Syn.g:36:7: WRITELN
                    {
                    root_0 = (Object)adaptor.nil();

                    WRITELN28=(Token)match(input,WRITELN,FOLLOW_WRITELN_in_statement192); 
                    WRITELN28_tree = (Object)adaptor.create(WRITELN28);
                    adaptor.addChild(root_0, WRITELN28_tree);


                    }
                    break;
                case 8 :
                    // Syn.g:37:7: OPENPAREN statements CLOSEPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    OPENPAREN29=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_statement200); 
                    pushFollow(FOLLOW_statements_in_statement203);
                    statements30=statements();

                    state._fsp--;

                    adaptor.addChild(root_0, statements30.getTree());
                    CLOSEPAREN31=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_statement205); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // Syn.g:40:1: string : s= STRING -> STRING[$string::tmp] ;
    public final Syn.string_return string() throws RecognitionException {
        string_stack.push(new string_scope());
        Syn.string_return retval = new Syn.string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token s=null;

        Object s_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // Syn.g:42:5: (s= STRING -> STRING[$string::tmp] )
            // Syn.g:43:5: s= STRING
            {
            s=(Token)match(input,STRING,FOLLOW_STRING_in_string237);  
            stream_STRING.add(s);

             ((string_scope)string_stack.peek()).tmp = cleanString((s!=null?s.getText():null)); 


            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 43:54: -> STRING[$string::tmp]
            {
                adaptor.addChild(root_0, (Object)adaptor.create(STRING, ((string_scope)string_stack.peek()).tmp));

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exp"
    // Syn.g:46:1: exp : term ( ( PLUS | MINUS ) term )* ;
    public final Syn.exp_return exp() throws RecognitionException {
        Syn.exp_return retval = new Syn.exp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set33=null;
        Syn.term_return term32 = null;

        Syn.term_return term34 = null;


        Object set33_tree=null;

        try {
            // Syn.g:46:5: ( term ( ( PLUS | MINUS ) term )* )
            // Syn.g:47:5: term ( ( PLUS | MINUS ) term )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_term_in_exp256);
            term32=term();

            state._fsp--;

            adaptor.addChild(root_0, term32.getTree());
            // Syn.g:47:10: ( ( PLUS | MINUS ) term )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=MINUS && LA4_0<=PLUS)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Syn.g:47:12: ( PLUS | MINUS ) term
            	    {
            	    set33=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MINUS && input.LA(1)<=PLUS) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set33));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_exp270);
            	    term34=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term34.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // Syn.g:50:1: term : factor ( MULT factor )* ;
    public final Syn.term_return term() throws RecognitionException {
        Syn.term_return retval = new Syn.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MULT36=null;
        Syn.factor_return factor35 = null;

        Syn.factor_return factor37 = null;


        Object MULT36_tree=null;

        try {
            // Syn.g:50:6: ( factor ( MULT factor )* )
            // Syn.g:51:5: factor ( MULT factor )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term290);
            factor35=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor35.getTree());
            // Syn.g:51:12: ( MULT factor )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==MULT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Syn.g:51:14: MULT factor
            	    {
            	    MULT36=(Token)match(input,MULT,FOLLOW_MULT_in_term294); 
            	    MULT36_tree = (Object)adaptor.create(MULT36);
            	    adaptor.addChild(root_0, MULT36_tree);

            	    pushFollow(FOLLOW_factor_in_term296);
            	    factor37=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor37.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // Syn.g:54:1: factor : ( ID | INTNUM | OPENPAREN exp CLOSEPAREN );
    public final Syn.factor_return factor() throws RecognitionException {
        Syn.factor_return retval = new Syn.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID38=null;
        Token INTNUM39=null;
        Token OPENPAREN40=null;
        Token CLOSEPAREN42=null;
        Syn.exp_return exp41 = null;


        Object ID38_tree=null;
        Object INTNUM39_tree=null;
        Object OPENPAREN40_tree=null;
        Object CLOSEPAREN42_tree=null;

        try {
            // Syn.g:54:8: ( ID | INTNUM | OPENPAREN exp CLOSEPAREN )
            int alt6=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt6=1;
                }
                break;
            case INTNUM:
                {
                alt6=2;
                }
                break;
            case OPENPAREN:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // Syn.g:55:7: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID38=(Token)match(input,ID,FOLLOW_ID_in_factor319); 
                    ID38_tree = (Object)adaptor.create(ID38);
                    adaptor.addChild(root_0, ID38_tree);


                    }
                    break;
                case 2 :
                    // Syn.g:56:7: INTNUM
                    {
                    root_0 = (Object)adaptor.nil();

                    INTNUM39=(Token)match(input,INTNUM,FOLLOW_INTNUM_in_factor327); 
                    INTNUM39_tree = (Object)adaptor.create(INTNUM39);
                    adaptor.addChild(root_0, INTNUM39_tree);


                    }
                    break;
                case 3 :
                    // Syn.g:57:7: OPENPAREN exp CLOSEPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    OPENPAREN40=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_factor335); 
                    pushFollow(FOLLOW_exp_in_factor338);
                    exp41=exp();

                    state._fsp--;

                    adaptor.addChild(root_0, exp41.getTree());
                    CLOSEPAREN42=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_factor340); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class boolexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolexp"
    // Syn.g:60:1: boolexp : boolterm ( AND boolterm )* ;
    public final Syn.boolexp_return boolexp() throws RecognitionException {
        Syn.boolexp_return retval = new Syn.boolexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND44=null;
        Syn.boolterm_return boolterm43 = null;

        Syn.boolterm_return boolterm45 = null;


        Object AND44_tree=null;

        try {
            // Syn.g:60:9: ( boolterm ( AND boolterm )* )
            // Syn.g:61:7: boolterm ( AND boolterm )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_boolterm_in_boolexp361);
            boolterm43=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm43.getTree());
            // Syn.g:61:16: ( AND boolterm )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==AND) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Syn.g:61:18: AND boolterm
            	    {
            	    AND44=(Token)match(input,AND,FOLLOW_AND_in_boolexp365); 
            	    AND44_tree = (Object)adaptor.create(AND44);
            	    adaptor.addChild(root_0, AND44_tree);

            	    pushFollow(FOLLOW_boolterm_in_boolexp367);
            	    boolterm45=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm45.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // Syn.g:64:1: boolterm : ( NOT boolean | boolean );
    public final Syn.boolterm_return boolterm() throws RecognitionException {
        Syn.boolterm_return retval = new Syn.boolterm_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT46=null;
        Syn.boolean_return boolean47 = null;

        Syn.boolean_return boolean48 = null;


        Object NOT46_tree=null;

        try {
            // Syn.g:64:10: ( NOT boolean | boolean )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==NOT) ) {
                alt8=1;
            }
            else if ( (LA8_0==FALSE||LA8_0==TRUE||LA8_0==OPENPAREN||LA8_0==INTNUM||LA8_0==ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // Syn.g:65:7: NOT boolean
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT46=(Token)match(input,NOT,FOLLOW_NOT_in_boolterm389); 
                    NOT46_tree = (Object)adaptor.create(NOT46);
                    adaptor.addChild(root_0, NOT46_tree);

                    pushFollow(FOLLOW_boolean_in_boolterm391);
                    boolean47=boolean();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean47.getTree());

                    }
                    break;
                case 2 :
                    // Syn.g:66:7: boolean
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolean_in_boolterm399);
                    boolean48=boolean();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean48.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class boolean_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean"
    // Syn.g:69:1: boolean : ( TRUE | FALSE | exp ( EQ | LEQ ) exp );
    public final Syn.boolean_return boolean() throws RecognitionException {
        Syn.boolean_return retval = new Syn.boolean_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TRUE49=null;
        Token FALSE50=null;
        Token set52=null;
        Syn.exp_return exp51 = null;

        Syn.exp_return exp53 = null;


        Object TRUE49_tree=null;
        Object FALSE50_tree=null;
        Object set52_tree=null;

        try {
            // Syn.g:69:9: ( TRUE | FALSE | exp ( EQ | LEQ ) exp )
            int alt9=3;
            switch ( input.LA(1) ) {
            case TRUE:
                {
                alt9=1;
                }
                break;
            case FALSE:
                {
                alt9=2;
                }
                break;
            case OPENPAREN:
            case INTNUM:
            case ID:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // Syn.g:70:7: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    TRUE49=(Token)match(input,TRUE,FOLLOW_TRUE_in_boolean426); 
                    TRUE49_tree = (Object)adaptor.create(TRUE49);
                    adaptor.addChild(root_0, TRUE49_tree);


                    }
                    break;
                case 2 :
                    // Syn.g:71:7: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    FALSE50=(Token)match(input,FALSE,FOLLOW_FALSE_in_boolean434); 
                    FALSE50_tree = (Object)adaptor.create(FALSE50);
                    adaptor.addChild(root_0, FALSE50_tree);


                    }
                    break;
                case 3 :
                    // Syn.g:72:7: exp ( EQ | LEQ ) exp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exp_in_boolean442);
                    exp51=exp();

                    state._fsp--;

                    adaptor.addChild(root_0, exp51.getTree());
                    set52=(Token)input.LT(1);
                    if ( (input.LA(1)>=EQ && input.LA(1)<=LEQ) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set52));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_exp_in_boolean454);
                    exp53=exp();

                    state._fsp--;

                    adaptor.addChild(root_0, exp53.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "boolean"

    // Delegated rules


 

    public static final BitSet FOLLOW_statements_in_program49 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements68 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_SEMICOLON_in_statements72 = new BitSet(new long[]{0x0000000001017380L});
    public static final BitSet FOLLOW_statement_in_statements75 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ID_in_statement97 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ASSIGN_in_statement99 = new BitSet(new long[]{0x0000000001050000L});
    public static final BitSet FOLLOW_exp_in_statement102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SKIP_in_statement110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_statement118 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_OPENPAREN_in_statement121 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_statement124 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSEPAREN_in_statement126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement135 = new BitSet(new long[]{0x0000000101050840L});
    public static final BitSet FOLLOW_boolexp_in_statement137 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_THEN_in_statement139 = new BitSet(new long[]{0x0000000001017380L});
    public static final BitSet FOLLOW_statement_in_statement141 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ELSE_in_statement143 = new BitSet(new long[]{0x0000000001017380L});
    public static final BitSet FOLLOW_statement_in_statement145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement153 = new BitSet(new long[]{0x0000000101050840L});
    public static final BitSet FOLLOW_boolexp_in_statement155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DO_in_statement157 = new BitSet(new long[]{0x0000000001017380L});
    public static final BitSet FOLLOW_statement_in_statement159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_statement167 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_OPENPAREN_in_statement170 = new BitSet(new long[]{0x00000000010D0000L});
    public static final BitSet FOLLOW_exp_in_statement175 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_string_in_statement179 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSEPAREN_in_statement183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITELN_in_statement192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENPAREN_in_statement200 = new BitSet(new long[]{0x0000000001017380L});
    public static final BitSet FOLLOW_statements_in_statement203 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSEPAREN_in_statement205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_string237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_exp256 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_set_in_exp260 = new BitSet(new long[]{0x0000000001050000L});
    public static final BitSet FOLLOW_term_in_exp270 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_factor_in_term290 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_MULT_in_term294 = new BitSet(new long[]{0x0000000001050000L});
    public static final BitSet FOLLOW_factor_in_term296 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ID_in_factor319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTNUM_in_factor327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENPAREN_in_factor335 = new BitSet(new long[]{0x0000000001050000L});
    public static final BitSet FOLLOW_exp_in_factor338 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSEPAREN_in_factor340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_boolexp361 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_AND_in_boolexp365 = new BitSet(new long[]{0x0000000101050840L});
    public static final BitSet FOLLOW_boolterm_in_boolexp367 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_NOT_in_boolterm389 = new BitSet(new long[]{0x0000000101050840L});
    public static final BitSet FOLLOW_boolean_in_boolterm391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_in_boolterm399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_boolean426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_boolean434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_boolean442 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_boolean444 = new BitSet(new long[]{0x0000000001050000L});
    public static final BitSet FOLLOW_exp_in_boolean454 = new BitSet(new long[]{0x0000000000000002L});

}