// $ANTLR 3.2 debian-10 Syn.g 2015-10-18 23:11:07

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class Syn extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DO", "ELSE", "FALSE", "IF", "READ", "SKIP", "THEN", "TRUE", "WHILE", "WRITE", "WRITELN", "SEMICOLON", "OPENPAREN", "CLOSEPAREN", "STRING", "COMMENT", "WS", "DIGIT", "INTNUM", "LETTER", "ID", "TIMES", "MINUS", "PLUS"
    };
    public static final int CLOSEPAREN=17;
    public static final int WHILE=12;
    public static final int LETTER=23;
    public static final int ELSE=5;
    public static final int DO=4;
    public static final int SEMICOLON=15;
    public static final int MINUS=26;
    public static final int ID=24;
    public static final int EOF=-1;
    public static final int TRUE=11;
    public static final int WRITE=13;
    public static final int IF=7;
    public static final int INTNUM=22;
    public static final int SKIP=9;
    public static final int WS=20;
    public static final int THEN=10;
    public static final int WRITELN=14;
    public static final int READ=8;
    public static final int PLUS=27;
    public static final int DIGIT=21;
    public static final int OPENPAREN=16;
    public static final int COMMENT=19;
    public static final int TIMES=25;
    public static final int FALSE=6;
    public static final int STRING=18;

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
            // Syn.g:22:5: statements
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statements_in_program47);
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
            // Syn.g:26:5: statement ( SEMICOLON statement )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statement_in_statements62);
            statement2=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement2.getTree());
            // Syn.g:26:15: ( SEMICOLON statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SEMICOLON) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Syn.g:26:17: SEMICOLON statement
            	    {
            	    SEMICOLON3=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements66); 
            	    SEMICOLON3_tree = (Object)adaptor.create(SEMICOLON3);
            	    root_0 = (Object)adaptor.becomeRoot(SEMICOLON3_tree, root_0);

            	    pushFollow(FOLLOW_statement_in_statements69);
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
    // Syn.g:29:1: statement : ( WRITE OPENPAREN ( INTNUM | string ) CLOSEPAREN | WRITELN );
    public final Syn.statement_return statement() throws RecognitionException {
        Syn.statement_return retval = new Syn.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WRITE5=null;
        Token OPENPAREN6=null;
        Token INTNUM7=null;
        Token CLOSEPAREN9=null;
        Token WRITELN10=null;
        Syn.string_return string8 = null;


        Object WRITE5_tree=null;
        Object OPENPAREN6_tree=null;
        Object INTNUM7_tree=null;
        Object CLOSEPAREN9_tree=null;
        Object WRITELN10_tree=null;

        try {
            // Syn.g:29:11: ( WRITE OPENPAREN ( INTNUM | string ) CLOSEPAREN | WRITELN )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==WRITE) ) {
                alt3=1;
            }
            else if ( (LA3_0==WRITELN) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // Syn.g:30:5: WRITE OPENPAREN ( INTNUM | string ) CLOSEPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    WRITE5=(Token)match(input,WRITE,FOLLOW_WRITE_in_statement87); 
                    WRITE5_tree = (Object)adaptor.create(WRITE5);
                    root_0 = (Object)adaptor.becomeRoot(WRITE5_tree, root_0);

                    OPENPAREN6=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_statement90); 
                    // Syn.g:30:23: ( INTNUM | string )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==INTNUM) ) {
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
                            // Syn.g:30:25: INTNUM
                            {
                            INTNUM7=(Token)match(input,INTNUM,FOLLOW_INTNUM_in_statement95); 
                            INTNUM7_tree = (Object)adaptor.create(INTNUM7);
                            adaptor.addChild(root_0, INTNUM7_tree);


                            }
                            break;
                        case 2 :
                            // Syn.g:30:34: string
                            {
                            pushFollow(FOLLOW_string_in_statement99);
                            string8=string();

                            state._fsp--;

                            adaptor.addChild(root_0, string8.getTree());

                            }
                            break;

                    }

                    CLOSEPAREN9=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_statement103); 

                    }
                    break;
                case 2 :
                    // Syn.g:31:5: WRITELN
                    {
                    root_0 = (Object)adaptor.nil();

                    WRITELN10=(Token)match(input,WRITELN,FOLLOW_WRITELN_in_statement110); 
                    WRITELN10_tree = (Object)adaptor.create(WRITELN10);
                    adaptor.addChild(root_0, WRITELN10_tree);


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
    // Syn.g:34:1: string : s= STRING -> STRING[$string::tmp] ;
    public final Syn.string_return string() throws RecognitionException {
        string_stack.push(new string_scope());
        Syn.string_return retval = new Syn.string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token s=null;

        Object s_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // Syn.g:36:5: (s= STRING -> STRING[$string::tmp] )
            // Syn.g:37:5: s= STRING
            {
            s=(Token)match(input,STRING,FOLLOW_STRING_in_string139);  
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
            // 37:54: -> STRING[$string::tmp]
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

    // Delegated rules


 

    public static final BitSet FOLLOW_statements_in_program47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements62 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_SEMICOLON_in_statements66 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_statement_in_statements69 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_WRITE_in_statement87 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_OPENPAREN_in_statement90 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_INTNUM_in_statement95 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_string_in_statement99 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLOSEPAREN_in_statement103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITELN_in_statement110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_string139 = new BitSet(new long[]{0x0000000000000002L});

}