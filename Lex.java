// $ANTLR 3.2 debian-10 Lex.g 2015-10-18 23:11:06

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Lex extends Lexer {
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
    public static final int TIMES=25;
    public static final int COMMENT=19;
    public static final int FALSE=6;
    public static final int STRING=18;

    // delegates
    // delegators

    public Lex() {;} 
    public Lex(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Lex(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Lex.g"; }

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:8:12: ( 'do' )
            // Lex.g:8:14: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:9:12: ( 'else' )
            // Lex.g:9:14: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:10:12: ( 'false' )
            // Lex.g:10:14: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:11:12: ( 'if' )
            // Lex.g:11:14: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:12:12: ( 'read' )
            // Lex.g:12:14: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "SKIP"
    public final void mSKIP() throws RecognitionException {
        try {
            int _type = SKIP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:13:12: ( 'skip' )
            // Lex.g:13:14: 'skip'
            {
            match("skip"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SKIP"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:14:12: ( 'then' )
            // Lex.g:14:14: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:15:12: ( 'true' )
            // Lex.g:15:14: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:16:12: ( 'while' )
            // Lex.g:16:14: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:17:12: ( 'write' )
            // Lex.g:17:14: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "WRITELN"
    public final void mWRITELN() throws RecognitionException {
        try {
            int _type = WRITELN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:18:12: ( 'writeln' )
            // Lex.g:18:14: 'writeln'
            {
            match("writeln"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WRITELN"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:23:14: ( ';' )
            // Lex.g:23:16: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "OPENPAREN"
    public final void mOPENPAREN() throws RecognitionException {
        try {
            int _type = OPENPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:24:14: ( '(' )
            // Lex.g:24:16: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPENPAREN"

    // $ANTLR start "CLOSEPAREN"
    public final void mCLOSEPAREN() throws RecognitionException {
        try {
            int _type = CLOSEPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:25:14: ( ')' )
            // Lex.g:25:16: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSEPAREN"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:27:14: ( '\\'' ( '\\'' '\\'' | ~ '\\'' )* '\\'' )
            // Lex.g:27:16: '\\'' ( '\\'' '\\'' | ~ '\\'' )* '\\''
            {
            match('\''); 
            // Lex.g:27:21: ( '\\'' '\\'' | ~ '\\'' )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\'') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='\'') ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // Lex.g:27:22: '\\'' '\\''
            	    {
            	    match('\''); 
            	    match('\''); 

            	    }
            	    break;
            	case 2 :
            	    // Lex.g:27:34: ~ '\\''
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:29:14: ( '{' (~ '}' )* '}' )
            // Lex.g:29:16: '{' (~ '}' )* '}'
            {
            match('{'); 
            // Lex.g:29:20: (~ '}' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='|')||(LA2_0>='~' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Lex.g:29:21: ~ '}'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='|')||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('}'); 
            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:31:14: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // Lex.g:31:16: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // Lex.g:31:16: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\t' && LA3_0<='\n')||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Lex.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // Lex.g:34:14: ( '0' .. '9' )
            // Lex.g:34:16: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "INTNUM"
    public final void mINTNUM() throws RecognitionException {
        try {
            int _type = INTNUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:36:14: ( ( DIGIT )+ )
            // Lex.g:36:16: ( DIGIT )+
            {
            // Lex.g:36:16: ( DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Lex.g:36:16: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTNUM"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:38:14: ( 'a' .. 'z' | 'A' .. 'Z' )
            // Lex.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:41:14: ( LETTER ( LETTER | DIGIT )* )
            // Lex.g:41:16: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 
            // Lex.g:41:23: ( LETTER | DIGIT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Lex.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "TIMES"
    public final void mTIMES() throws RecognitionException {
        try {
            int _type = TIMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:43:14: ( '*' )
            // Lex.g:43:16: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMES"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:44:14: ( '-' )
            // Lex.g:44:16: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:45:14: ( '+' )
            // Lex.g:45:16: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    public void mTokens() throws RecognitionException {
        // Lex.g:1:8: ( DO | ELSE | FALSE | IF | READ | SKIP | THEN | TRUE | WHILE | WRITE | WRITELN | SEMICOLON | OPENPAREN | CLOSEPAREN | STRING | COMMENT | WS | INTNUM | LETTER | ID | TIMES | MINUS | PLUS )
        int alt6=23;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // Lex.g:1:10: DO
                {
                mDO(); 

                }
                break;
            case 2 :
                // Lex.g:1:13: ELSE
                {
                mELSE(); 

                }
                break;
            case 3 :
                // Lex.g:1:18: FALSE
                {
                mFALSE(); 

                }
                break;
            case 4 :
                // Lex.g:1:24: IF
                {
                mIF(); 

                }
                break;
            case 5 :
                // Lex.g:1:27: READ
                {
                mREAD(); 

                }
                break;
            case 6 :
                // Lex.g:1:32: SKIP
                {
                mSKIP(); 

                }
                break;
            case 7 :
                // Lex.g:1:37: THEN
                {
                mTHEN(); 

                }
                break;
            case 8 :
                // Lex.g:1:42: TRUE
                {
                mTRUE(); 

                }
                break;
            case 9 :
                // Lex.g:1:47: WHILE
                {
                mWHILE(); 

                }
                break;
            case 10 :
                // Lex.g:1:53: WRITE
                {
                mWRITE(); 

                }
                break;
            case 11 :
                // Lex.g:1:59: WRITELN
                {
                mWRITELN(); 

                }
                break;
            case 12 :
                // Lex.g:1:67: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 13 :
                // Lex.g:1:77: OPENPAREN
                {
                mOPENPAREN(); 

                }
                break;
            case 14 :
                // Lex.g:1:87: CLOSEPAREN
                {
                mCLOSEPAREN(); 

                }
                break;
            case 15 :
                // Lex.g:1:98: STRING
                {
                mSTRING(); 

                }
                break;
            case 16 :
                // Lex.g:1:105: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 17 :
                // Lex.g:1:113: WS
                {
                mWS(); 

                }
                break;
            case 18 :
                // Lex.g:1:116: INTNUM
                {
                mINTNUM(); 

                }
                break;
            case 19 :
                // Lex.g:1:123: LETTER
                {
                mLETTER(); 

                }
                break;
            case 20 :
                // Lex.g:1:130: ID
                {
                mID(); 

                }
                break;
            case 21 :
                // Lex.g:1:133: TIMES
                {
                mTIMES(); 

                }
                break;
            case 22 :
                // Lex.g:1:139: MINUS
                {
                mMINUS(); 

                }
                break;
            case 23 :
                // Lex.g:1:145: PLUS
                {
                mPLUS(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\10\25\7\uffff\1\25\3\uffff\1\40\2\uffff\2\26\1\43\6\26"+
        "\1\uffff\2\26\1\uffff\6\26\1\62\1\26\1\64\1\65\1\66\1\67\2\26\1"+
        "\uffff\1\72\4\uffff\1\73\1\75\2\uffff\1\26\1\uffff\1\77\1\uffff";
    static final String DFA6_eofS =
        "\100\uffff";
    static final String DFA6_minS =
        "\1\11\10\60\7\uffff\1\60\3\uffff\1\60\2\uffff\1\163\1\154\1\60\1"+
        "\141\1\151\1\145\1\165\2\151\1\uffff\1\145\1\163\1\uffff\1\144\1"+
        "\160\1\156\1\145\1\154\1\164\1\60\1\145\4\60\2\145\1\uffff\1\60"+
        "\4\uffff\2\60\2\uffff\1\156\1\uffff\1\60\1\uffff";
    static final String DFA6_maxS =
        "\1\173\10\172\7\uffff\1\172\3\uffff\1\172\2\uffff\1\163\1\154\1"+
        "\172\1\141\1\151\1\145\1\165\2\151\1\uffff\1\145\1\163\1\uffff\1"+
        "\144\1\160\1\156\1\145\1\154\1\164\1\172\1\145\4\172\2\145\1\uffff"+
        "\1\172\4\uffff\2\172\2\uffff\1\156\1\uffff\1\172\1\uffff";
    static final String DFA6_acceptS =
        "\11\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\uffff\1\25\1\26\1"+
        "\27\1\uffff\1\23\1\24\11\uffff\1\1\2\uffff\1\4\16\uffff\1\2\1\uffff"+
        "\1\5\1\6\1\7\1\10\2\uffff\1\3\1\11\1\uffff\1\12\1\uffff\1\13";
    static final String DFA6_specialS =
        "\100\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\16\2\uffff\1\16\22\uffff\1\16\6\uffff\1\14\1\12\1\13\1\21"+
            "\1\23\1\uffff\1\22\2\uffff\12\17\1\uffff\1\11\5\uffff\32\20"+
            "\6\uffff\3\20\1\1\1\2\1\3\2\20\1\4\10\20\1\5\1\6\1\7\2\20\1"+
            "\10\3\20\1\15",
            "\12\26\7\uffff\32\26\6\uffff\16\26\1\24\13\26",
            "\12\26\7\uffff\32\26\6\uffff\13\26\1\27\16\26",
            "\12\26\7\uffff\32\26\6\uffff\1\30\31\26",
            "\12\26\7\uffff\32\26\6\uffff\5\26\1\31\24\26",
            "\12\26\7\uffff\32\26\6\uffff\4\26\1\32\25\26",
            "\12\26\7\uffff\32\26\6\uffff\12\26\1\33\17\26",
            "\12\26\7\uffff\32\26\6\uffff\7\26\1\34\11\26\1\35\10\26",
            "\12\26\7\uffff\32\26\6\uffff\7\26\1\36\11\26\1\37\10\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "",
            "",
            "",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "",
            "",
            "\1\41",
            "\1\42",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "",
            "\1\52",
            "\1\53",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\63",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\70",
            "\1\71",
            "",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "",
            "",
            "",
            "",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "\12\26\7\uffff\32\26\6\uffff\13\26\1\74\16\26",
            "",
            "",
            "\1\76",
            "",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( DO | ELSE | FALSE | IF | READ | SKIP | THEN | TRUE | WHILE | WRITE | WRITELN | SEMICOLON | OPENPAREN | CLOSEPAREN | STRING | COMMENT | WS | INTNUM | LETTER | ID | TIMES | MINUS | PLUS );";
        }
    }
 

}