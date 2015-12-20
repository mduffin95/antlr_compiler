// $ANTLR 3.2 debian-10 Lex.g 2015-12-20 22:40:33

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Lex extends Lexer {
    public static final int CLOSEPAREN=17;
    public static final int WHILE=12;
    public static final int LETTER=22;
    public static final int ELSE=5;
    public static final int DO=4;
    public static final int SEMICOLON=15;
    public static final int NOT=33;
    public static final int MINUS=27;
    public static final int MULT=26;
    public static final int AND=32;
    public static final int ID=25;
    public static final int EOF=-1;
    public static final int TRUE=11;
    public static final int WRITE=13;
    public static final int ALPHANUM=24;
    public static final int IF=7;
    public static final int SKIP=9;
    public static final int INTNUM=18;
    public static final int WS=21;
    public static final int THEN=10;
    public static final int WRITELN=14;
    public static final int READ=8;
    public static final int ASSIGN=29;
    public static final int PLUS=28;
    public static final int DIGIT=23;
    public static final int EQ=30;
    public static final int OPENPAREN=16;
    public static final int COMMENT=20;
    public static final int FALSE=6;
    public static final int STRING=19;
    public static final int LEQ=31;

        int charCount = 0;


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
            // Lex.g:17:12: ( 'do' )
            // Lex.g:17:14: 'do'
            {
            match("do"); if (state.failed) return ;


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
            // Lex.g:18:12: ( 'else' )
            // Lex.g:18:14: 'else'
            {
            match("else"); if (state.failed) return ;


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
            // Lex.g:19:12: ( 'false' )
            // Lex.g:19:14: 'false'
            {
            match("false"); if (state.failed) return ;


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
            // Lex.g:20:12: ( 'if' )
            // Lex.g:20:14: 'if'
            {
            match("if"); if (state.failed) return ;


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
            // Lex.g:21:12: ( 'read' )
            // Lex.g:21:14: 'read'
            {
            match("read"); if (state.failed) return ;


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
            // Lex.g:22:12: ( 'skip' )
            // Lex.g:22:14: 'skip'
            {
            match("skip"); if (state.failed) return ;


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
            // Lex.g:23:12: ( 'then' )
            // Lex.g:23:14: 'then'
            {
            match("then"); if (state.failed) return ;


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
            // Lex.g:24:12: ( 'true' )
            // Lex.g:24:14: 'true'
            {
            match("true"); if (state.failed) return ;


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
            // Lex.g:25:12: ( 'while' )
            // Lex.g:25:14: 'while'
            {
            match("while"); if (state.failed) return ;


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
            // Lex.g:26:12: ( 'write' )
            // Lex.g:26:14: 'write'
            {
            match("write"); if (state.failed) return ;


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
            // Lex.g:27:12: ( 'writeln' )
            // Lex.g:27:14: 'writeln'
            {
            match("writeln"); if (state.failed) return ;


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
            // Lex.g:32:14: ( ';' )
            // Lex.g:32:16: ';'
            {
            match(';'); if (state.failed) return ;

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
            // Lex.g:33:14: ( '(' )
            // Lex.g:33:16: '('
            {
            match('('); if (state.failed) return ;

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
            // Lex.g:34:14: ( ')' )
            // Lex.g:34:16: ')'
            {
            match(')'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSEPAREN"

    // $ANTLR start "INTNUM"
    public final void mINTNUM() throws RecognitionException {
        try {
            int _type = INTNUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:36:14: ( ( '0' .. '9' )+ )
            // Lex.g:36:16: ( '0' .. '9' )+
            {
            // Lex.g:36:16: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Lex.g:36:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTNUM"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:38:14: ( '\\'' ( '\\'' '\\'' | ~ '\\'' )* '\\'' )
            // Lex.g:38:16: '\\'' ( '\\'' '\\'' | ~ '\\'' )* '\\''
            {
            match('\''); if (state.failed) return ;
            // Lex.g:38:21: ( '\\'' '\\'' | ~ '\\'' )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\'') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='\'') ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // Lex.g:38:22: '\\'' '\\''
            	    {
            	    match('\''); if (state.failed) return ;
            	    match('\''); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // Lex.g:38:34: ~ '\\''
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\''); if (state.failed) return ;

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
            // Lex.g:40:14: ( '{' (~ '}' )* '}' )
            // Lex.g:40:16: '{' (~ '}' )* '}'
            {
            match('{'); if (state.failed) return ;
            // Lex.g:40:20: (~ '}' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='|')||(LA3_0>='~' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Lex.g:40:21: ~ '}'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='|')||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('}'); if (state.failed) return ;
            if ( state.backtracking==0 ) {
              skip();
            }

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
            // Lex.g:42:14: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // Lex.g:42:16: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // Lex.g:42:16: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Lex.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            if ( state.backtracking==0 ) {
              skip();
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // Lex.g:45:14: ( 'a' .. 'z' | 'A' .. 'Z' )
            // Lex.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // Lex.g:49:14: ( '0' .. '9' )
            // Lex.g:49:16: '0' .. '9'
            {
            matchRange('0','9'); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:51:14: ( LETTER ( ALPHANUM )? )
            // Lex.g:51:16: LETTER ( ALPHANUM )?
            {
            mLETTER(); if (state.failed) return ;
            // Lex.g:51:23: ( ALPHANUM )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||(LA5_0>='a' && LA5_0<='z')) && ((N <= 8))) {
                alt5=1;
            }
            else if ( (synpred10_Lex()) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Lex.g:0:0: ALPHANUM
                    {
                    mALPHANUM(); if (state.failed) return ;

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "ALPHANUM"
    public final void mALPHANUM() throws RecognitionException {
        try {
            int N = 1;
            // Lex.g:56:14: ( ({...}? => ( LETTER | DIGIT ) )* )
            // Lex.g:56:16: ({...}? => ( LETTER | DIGIT ) )*
            {
            // Lex.g:56:16: ({...}? => ( LETTER | DIGIT ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')) && ((N <= 8))) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Lex.g:56:17: {...}? => ( LETTER | DIGIT )
            	    {
            	    if ( !((N <= 8)) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "ALPHANUM", "N <= 8");
            	    }
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	    if ( state.backtracking==0 ) {
            	      N++;
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "ALPHANUM"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:59:14: ( '*' )
            // Lex.g:59:16: '*'
            {
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:60:14: ( '-' )
            // Lex.g:60:16: '-'
            {
            match('-'); if (state.failed) return ;

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
            // Lex.g:61:14: ( '+' )
            // Lex.g:61:16: '+'
            {
            match('+'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:62:14: ( ':=' )
            // Lex.g:62:16: ':='
            {
            match(":="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:63:14: ( '=' )
            // Lex.g:63:16: '='
            {
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "LEQ"
    public final void mLEQ() throws RecognitionException {
        try {
            int _type = LEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:64:14: ( '<=' )
            // Lex.g:64:16: '<='
            {
            match("<="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEQ"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:65:14: ( '&' )
            // Lex.g:65:16: '&'
            {
            match('&'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:66:14: ( '!' )
            // Lex.g:66:16: '!'
            {
            match('!'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    public void mTokens() throws RecognitionException {
        // Lex.g:1:8: ( DO | ELSE | FALSE | IF | READ | SKIP | THEN | TRUE | WHILE | WRITE | WRITELN | SEMICOLON | OPENPAREN | CLOSEPAREN | INTNUM | STRING | COMMENT | WS | ID | MULT | MINUS | PLUS | ASSIGN | EQ | LEQ | AND | NOT )
        int alt7=27;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // Lex.g:1:10: DO
                {
                mDO(); if (state.failed) return ;

                }
                break;
            case 2 :
                // Lex.g:1:13: ELSE
                {
                mELSE(); if (state.failed) return ;

                }
                break;
            case 3 :
                // Lex.g:1:18: FALSE
                {
                mFALSE(); if (state.failed) return ;

                }
                break;
            case 4 :
                // Lex.g:1:24: IF
                {
                mIF(); if (state.failed) return ;

                }
                break;
            case 5 :
                // Lex.g:1:27: READ
                {
                mREAD(); if (state.failed) return ;

                }
                break;
            case 6 :
                // Lex.g:1:32: SKIP
                {
                mSKIP(); if (state.failed) return ;

                }
                break;
            case 7 :
                // Lex.g:1:37: THEN
                {
                mTHEN(); if (state.failed) return ;

                }
                break;
            case 8 :
                // Lex.g:1:42: TRUE
                {
                mTRUE(); if (state.failed) return ;

                }
                break;
            case 9 :
                // Lex.g:1:47: WHILE
                {
                mWHILE(); if (state.failed) return ;

                }
                break;
            case 10 :
                // Lex.g:1:53: WRITE
                {
                mWRITE(); if (state.failed) return ;

                }
                break;
            case 11 :
                // Lex.g:1:59: WRITELN
                {
                mWRITELN(); if (state.failed) return ;

                }
                break;
            case 12 :
                // Lex.g:1:67: SEMICOLON
                {
                mSEMICOLON(); if (state.failed) return ;

                }
                break;
            case 13 :
                // Lex.g:1:77: OPENPAREN
                {
                mOPENPAREN(); if (state.failed) return ;

                }
                break;
            case 14 :
                // Lex.g:1:87: CLOSEPAREN
                {
                mCLOSEPAREN(); if (state.failed) return ;

                }
                break;
            case 15 :
                // Lex.g:1:98: INTNUM
                {
                mINTNUM(); if (state.failed) return ;

                }
                break;
            case 16 :
                // Lex.g:1:105: STRING
                {
                mSTRING(); if (state.failed) return ;

                }
                break;
            case 17 :
                // Lex.g:1:112: COMMENT
                {
                mCOMMENT(); if (state.failed) return ;

                }
                break;
            case 18 :
                // Lex.g:1:120: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;
            case 19 :
                // Lex.g:1:123: ID
                {
                mID(); if (state.failed) return ;

                }
                break;
            case 20 :
                // Lex.g:1:126: MULT
                {
                mMULT(); if (state.failed) return ;

                }
                break;
            case 21 :
                // Lex.g:1:131: MINUS
                {
                mMINUS(); if (state.failed) return ;

                }
                break;
            case 22 :
                // Lex.g:1:137: PLUS
                {
                mPLUS(); if (state.failed) return ;

                }
                break;
            case 23 :
                // Lex.g:1:142: ASSIGN
                {
                mASSIGN(); if (state.failed) return ;

                }
                break;
            case 24 :
                // Lex.g:1:149: EQ
                {
                mEQ(); if (state.failed) return ;

                }
                break;
            case 25 :
                // Lex.g:1:152: LEQ
                {
                mLEQ(); if (state.failed) return ;

                }
                break;
            case 26 :
                // Lex.g:1:156: AND
                {
                mAND(); if (state.failed) return ;

                }
                break;
            case 27 :
                // Lex.g:1:160: NOT
                {
                mNOT(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred10_Lex
    public final void synpred10_Lex_fragment() throws RecognitionException {   
        // Lex.g:51:23: ( ALPHANUM )
        // Lex.g:51:23: ALPHANUM
        {
        mALPHANUM(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_Lex

    // $ANTLR start synpred12_Lex
    public final void synpred12_Lex_fragment() throws RecognitionException {   
        // Lex.g:56:17: ({...}? => ( LETTER | DIGIT ) )
        // Lex.g:56:17: {...}? => ( LETTER | DIGIT )
        {
        if ( !((N <= 8)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_Lex", "N <= 8");
        }
        if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            input.consume();
        state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            recover(mse);
            throw mse;}


        }
    }
    // $ANTLR end synpred12_Lex

    // $ANTLR start synpred13_Lex
    public final void synpred13_Lex_fragment() throws RecognitionException {   
        // Lex.g:1:10: ( DO )
        // Lex.g:1:10: DO
        {
        mDO(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_Lex

    // $ANTLR start synpred14_Lex
    public final void synpred14_Lex_fragment() throws RecognitionException {   
        // Lex.g:1:13: ( ELSE )
        // Lex.g:1:13: ELSE
        {
        mELSE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_Lex

    // $ANTLR start synpred15_Lex
    public final void synpred15_Lex_fragment() throws RecognitionException {   
        // Lex.g:1:18: ( FALSE )
        // Lex.g:1:18: FALSE
        {
        mFALSE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_Lex

    // $ANTLR start synpred16_Lex
    public final void synpred16_Lex_fragment() throws RecognitionException {   
        // Lex.g:1:24: ( IF )
        // Lex.g:1:24: IF
        {
        mIF(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_Lex

    // $ANTLR start synpred17_Lex
    public final void synpred17_Lex_fragment() throws RecognitionException {   
        // Lex.g:1:27: ( READ )
        // Lex.g:1:27: READ
        {
        mREAD(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_Lex

    // $ANTLR start synpred18_Lex
    public final void synpred18_Lex_fragment() throws RecognitionException {   
        // Lex.g:1:32: ( SKIP )
        // Lex.g:1:32: SKIP
        {
        mSKIP(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_Lex

    // $ANTLR start synpred19_Lex
    public final void synpred19_Lex_fragment() throws RecognitionException {   
        // Lex.g:1:37: ( THEN )
        // Lex.g:1:37: THEN
        {
        mTHEN(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_Lex

    // $ANTLR start synpred20_Lex
    public final void synpred20_Lex_fragment() throws RecognitionException {   
        // Lex.g:1:42: ( TRUE )
        // Lex.g:1:42: TRUE
        {
        mTRUE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_Lex

    // $ANTLR start synpred21_Lex
    public final void synpred21_Lex_fragment() throws RecognitionException {   
        // Lex.g:1:47: ( WHILE )
        // Lex.g:1:47: WHILE
        {
        mWHILE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_Lex

    // $ANTLR start synpred22_Lex
    public final void synpred22_Lex_fragment() throws RecognitionException {   
        // Lex.g:1:53: ( WRITE )
        // Lex.g:1:53: WRITE
        {
        mWRITE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_Lex

    // $ANTLR start synpred23_Lex
    public final void synpred23_Lex_fragment() throws RecognitionException {   
        // Lex.g:1:59: ( WRITELN )
        // Lex.g:1:59: WRITELN
        {
        mWRITELN(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_Lex

    // $ANTLR start synpred31_Lex
    public final void synpred31_Lex_fragment() throws RecognitionException {   
        // Lex.g:1:123: ( ID )
        // Lex.g:1:123: ID
        {
        mID(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_Lex

    public final boolean synpred14_Lex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_Lex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_Lex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_Lex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_Lex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_Lex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_Lex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_Lex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_Lex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_Lex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_Lex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_Lex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_Lex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_Lex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_Lex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_Lex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_Lex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_Lex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_Lex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_Lex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_Lex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_Lex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_Lex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_Lex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_Lex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_Lex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_Lex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_Lex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\1\uffff\10\20\20\uffff\1\43\2\20\1\46\6\20\1\uffff\2\20\1\uffff"+
        "\6\20\1\uffff\1\67\1\20\1\uffff\1\71\1\72\1\73\1\74\2\20\1\uffff"+
        "\1\100\4\uffff\1\105\1\107\7\uffff\1\20\3\uffff\1\114\3\uffff";
    static final String DFA7_eofS =
        "\116\uffff";
    static final String DFA7_minS =
        "\1\11\1\157\1\154\1\141\1\146\1\145\1\153\2\150\20\uffff\1\60\1"+
        "\163\1\154\1\60\1\141\1\151\1\145\1\165\2\151\1\0\1\145\1\163\1"+
        "\0\1\144\1\160\1\156\1\145\1\154\1\164\1\uffff\1\60\1\145\1\uffff"+
        "\4\60\2\145\1\0\1\60\4\0\2\60\1\uffff\1\0\4\uffff\1\0\1\156\1\0"+
        "\2\uffff\1\60\1\uffff\1\0\1\uffff";
    static final String DFA7_maxS =
        "\1\173\1\157\1\154\1\141\1\146\1\145\1\153\2\162\20\uffff\1\172"+
        "\1\163\1\154\1\172\1\141\1\151\1\145\1\165\2\151\1\0\1\145\1\163"+
        "\1\0\1\144\1\160\1\156\1\145\1\154\1\164\1\uffff\1\172\1\145\1\uffff"+
        "\4\172\2\145\1\0\1\172\4\0\2\172\1\uffff\1\0\4\uffff\1\0\1\156\1"+
        "\0\2\uffff\1\172\1\uffff\1\0\1\uffff";
    static final String DFA7_acceptS =
        "\11\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
        "\1\27\1\30\1\31\1\32\1\33\24\uffff\1\1\2\uffff\1\4\16\uffff\1\2"+
        "\1\uffff\1\5\1\6\1\7\1\10\3\uffff\1\3\1\11\1\uffff\1\12\1\uffff"+
        "\1\13";
    static final String DFA7_specialS =
        "\43\uffff\1\1\2\uffff\1\2\20\uffff\1\0\1\uffff\1\7\1\10\1\11\1\12"+
        "\3\uffff\1\3\4\uffff\1\4\1\uffff\1\5\4\uffff\1\6\1\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\17\2\uffff\1\17\22\uffff\1\17\1\30\4\uffff\1\27\1\15\1\12"+
            "\1\13\1\21\1\23\1\uffff\1\22\2\uffff\12\14\1\24\1\11\1\26\1"+
            "\25\3\uffff\32\20\6\uffff\3\20\1\1\1\2\1\3\2\20\1\4\10\20\1"+
            "\5\1\6\1\7\2\20\1\10\3\20\1\16",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37\11\uffff\1\40",
            "\1\41\11\uffff\1\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\44",
            "\1\45",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\uffff",
            "\1\56",
            "\1\57",
            "\1\uffff",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\70",
            "",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\75",
            "\1\76",
            "\1\uffff",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\12\20\7\uffff\32\20\6\uffff\13\20\1\106\16\20",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\112",
            "\1\uffff",
            "",
            "",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "",
            "\1\uffff",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( DO | ELSE | FALSE | IF | READ | SKIP | THEN | TRUE | WHILE | WRITE | WRITELN | SEMICOLON | OPENPAREN | CLOSEPAREN | INTNUM | STRING | COMMENT | WS | ID | MULT | MINUS | PLUS | ASSIGN | EQ | LEQ | AND | NOT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_55 = input.LA(1);

                         
                        int index7_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_Lex()) ) {s = 63;}

                        else if ( (synpred31_Lex()) ) {s = 16;}

                         
                        input.seek(index7_55);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_35 = input.LA(1);

                         
                        int index7_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_Lex()) ) {s = 45;}

                        else if ( (synpred31_Lex()) ) {s = 16;}

                         
                        input.seek(index7_35);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_38 = input.LA(1);

                         
                        int index7_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_Lex()) ) {s = 48;}

                        else if ( (synpred31_Lex()) ) {s = 16;}

                         
                        input.seek(index7_38);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_64 = input.LA(1);

                         
                        int index7_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Lex()) ) {s = 72;}

                        else if ( (synpred31_Lex()) ) {s = 16;}

                         
                        input.seek(index7_64);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_69 = input.LA(1);

                         
                        int index7_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_Lex()) ) {s = 73;}

                        else if ( (synpred31_Lex()) ) {s = 16;}

                         
                        input.seek(index7_69);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA7_71 = input.LA(1);

                         
                        int index7_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_Lex()) ) {s = 75;}

                        else if ( (synpred31_Lex()) ) {s = 16;}

                         
                        input.seek(index7_71);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA7_76 = input.LA(1);

                         
                        int index7_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_Lex()) ) {s = 77;}

                        else if ( (synpred31_Lex()) ) {s = 16;}

                         
                        input.seek(index7_76);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA7_57 = input.LA(1);

                         
                        int index7_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_Lex()) ) {s = 65;}

                        else if ( (synpred31_Lex()) ) {s = 16;}

                         
                        input.seek(index7_57);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA7_58 = input.LA(1);

                         
                        int index7_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Lex()) ) {s = 66;}

                        else if ( (synpred31_Lex()) ) {s = 16;}

                         
                        input.seek(index7_58);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA7_59 = input.LA(1);

                         
                        int index7_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Lex()) ) {s = 67;}

                        else if ( (synpred31_Lex()) ) {s = 16;}

                         
                        input.seek(index7_59);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA7_60 = input.LA(1);

                         
                        int index7_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Lex()) ) {s = 68;}

                        else if ( (synpred31_Lex()) ) {s = 16;}

                         
                        input.seek(index7_60);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}