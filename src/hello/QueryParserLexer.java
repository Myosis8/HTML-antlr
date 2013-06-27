// $ANTLR 3.5 /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g 2013-06-27 03:26:47

  package hello;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class QueryParserLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int DIGITS=4;
	public static final int LETTER=5;
	public static final int STR=6;
	public static final int STRING=7;
	public static final int WS=8;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public QueryParserLexer() {} 
	public QueryParserLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public QueryParserLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g"; }

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:11:6: ( '*find every key node*' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:11:8: '*find every key node*'
			{
			match("*find every key node*"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:12:7: ( '*find every relation*' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:12:9: '*find every relation*'
			{
			match("*find every relation*"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:13:7: ( '*find subclass of*' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:13:9: '*find subclass of*'
			{
			match("*find subclass of*"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:14:7: ( '*mass of*' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:14:9: '*mass of*'
			{
			match("*mass of*"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:15:7: ( '*type of*' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:15:9: '*type of*'
			{
			match("*type of*"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "DIGITS"
	public final void mDIGITS() throws RecognitionException {
		try {
			int _type = DIGITS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:48:8: ( ( '0' .. '9' )+ )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:48:10: ( '0' .. '9' )+
			{
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:48:10: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGITS"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			int _type = LETTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:49:8: ( 'a' .. 'z' | 'A' .. 'Z' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:50:8: ( ( LETTER )+ )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:50:10: ( LETTER )+
			{
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:50:10: ( LETTER )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "STR"
	public final void mSTR() throws RecognitionException {
		try {
			int _type = STR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			int c;

			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:52:2: ( '*' ( '/' '*' |c=~ ( '*' ) )* '*' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:52:5: '*' ( '/' '*' |c=~ ( '*' ) )* '*'
			{
			match('*'); 
			 	StringBuilder temp = new StringBuilder();
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:54:3: ( '/' '*' |c=~ ( '*' ) )*
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0=='/') ) {
					int LA3_2 = input.LA(2);
					if ( (LA3_2=='*') ) {
						int LA3_4 = input.LA(3);
						if ( ((LA3_4 >= '\u0000' && LA3_4 <= '\uFFFF')) ) {
							alt3=1;
						}
						else {
							alt3=2;
						}

					}
					else if ( ((LA3_2 >= '\u0000' && LA3_2 <= ')')||(LA3_2 >= '+' && LA3_2 <= '\uFFFF')) ) {
						alt3=2;
					}

				}
				else if ( ((LA3_0 >= '\u0000' && LA3_0 <= ')')||(LA3_0 >= '+' && LA3_0 <= '.')||(LA3_0 >= '0' && LA3_0 <= '\uFFFF')) ) {
					alt3=2;
				}

				switch (alt3) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:54:4: '/' '*'
					{
					match('/'); 
					match('*'); 
					 	temp.appendCodePoint('*');
					}
					break;
				case 2 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:55:5: c=~ ( '*' )
					{
					c= input.LA(1);
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= ')')||(input.LA(1) >= '+' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					 	temp.appendCodePoint(c);
					}
					break;

				default :
					break loop3;
				}
			}

			match('*'); 
			 	setText(temp.toString());
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STR"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:60:4: ( ( ' ' | '\\t' | '\\n' | '\\f' | '\\r' )+ )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:60:6: ( ' ' | '\\t' | '\\n' | '\\f' | '\\r' )+
			{
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:60:6: ( ' ' | '\\t' | '\\n' | '\\f' | '\\r' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||(LA4_0 >= '\f' && LA4_0 <= '\r')||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | DIGITS | LETTER | STRING | STR | WS )
		int alt5=10;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:1:10: T__9
				{
				mT__9(); 

				}
				break;
			case 2 :
				// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:1:15: T__10
				{
				mT__10(); 

				}
				break;
			case 3 :
				// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:1:21: T__11
				{
				mT__11(); 

				}
				break;
			case 4 :
				// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:1:27: T__12
				{
				mT__12(); 

				}
				break;
			case 5 :
				// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:1:33: T__13
				{
				mT__13(); 

				}
				break;
			case 6 :
				// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:1:39: DIGITS
				{
				mDIGITS(); 

				}
				break;
			case 7 :
				// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:1:46: LETTER
				{
				mLETTER(); 

				}
				break;
			case 8 :
				// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:1:53: STRING
				{
				mSTRING(); 

				}
				break;
			case 9 :
				// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:1:60: STR
				{
				mSTR(); 

				}
				break;
			case 10 :
				// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:1:64: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\3\uffff\1\11\102\uffff";
	static final String DFA5_eofS =
		"\106\uffff";
	static final String DFA5_minS =
		"\1\11\1\0\1\uffff\1\101\1\uffff\3\0\3\uffff\26\0\2\uffff\2\0\2\uffff\25"+
		"\0\1\uffff\2\0\1\uffff\2\0\4\uffff";
	static final String DFA5_maxS =
		"\1\172\1\uffff\1\uffff\1\172\1\uffff\3\uffff\3\uffff\26\uffff\2\uffff"+
		"\2\uffff\2\uffff\25\uffff\1\uffff\2\uffff\1\uffff\2\uffff\4\uffff";
	static final String DFA5_acceptS =
		"\2\uffff\1\6\1\uffff\1\12\3\uffff\1\11\1\7\1\10\26\uffff\1\4\1\5\2\uffff"+
		"\1\4\1\5\25\uffff\1\3\2\uffff\1\3\2\uffff\1\1\1\2\1\1\1\2";
	static final String DFA5_specialS =
		"\1\uffff\1\10\3\uffff\1\64\1\52\1\50\3\uffff\1\62\1\54\1\51\1\63\1\60"+
		"\1\45\1\12\1\61\1\44\1\11\1\56\1\43\1\37\1\27\1\57\1\42\1\35\1\30\1\47"+
		"\1\46\1\33\1\25\2\uffff\1\31\1\26\2\uffff\1\55\1\23\1\53\1\24\1\5\1\22"+
		"\1\40\1\4\1\21\1\41\1\7\1\20\1\34\1\6\1\17\1\36\1\1\1\16\1\32\1\0\1\15"+
		"\1\uffff\1\3\1\14\1\uffff\1\2\1\13\4\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\4\1\uffff\2\4\22\uffff\1\4\11\uffff\1\1\5\uffff\12\2\7\uffff\32\3"+
			"\6\uffff\32\3",
			"\146\10\1\5\6\10\1\6\6\10\1\7\uff8b\10",
			"",
			"\32\12\6\uffff\32\12",
			"",
			"\151\10\1\13\uff96\10",
			"\141\10\1\14\uff9e\10",
			"\171\10\1\15\uff86\10",
			"",
			"",
			"",
			"\156\10\1\16\uff91\10",
			"\163\10\1\17\uff8c\10",
			"\160\10\1\20\uff8f\10",
			"\144\10\1\21\uff9b\10",
			"\163\10\1\22\uff8c\10",
			"\145\10\1\23\uff9a\10",
			"\40\10\1\24\uffdf\10",
			"\40\10\1\25\uffdf\10",
			"\40\10\1\26\uffdf\10",
			"\145\10\1\27\15\10\1\30\uff8c\10",
			"\157\10\1\31\uff90\10",
			"\157\10\1\32\uff90\10",
			"\166\10\1\33\uff89\10",
			"\165\10\1\34\uff8a\10",
			"\146\10\1\35\uff99\10",
			"\146\10\1\36\uff99\10",
			"\145\10\1\37\uff9a\10",
			"\142\10\1\40\uff9d\10",
			"\52\10\1\41\uffd5\10",
			"\52\10\1\42\uffd5\10",
			"\162\10\1\43\uff8d\10",
			"\143\10\1\44\uff9c\10",
			"",
			"",
			"\171\10\1\47\uff86\10",
			"\154\10\1\50\uff93\10",
			"",
			"",
			"\40\10\1\51\uffdf\10",
			"\141\10\1\52\uff9e\10",
			"\153\10\1\53\6\10\1\54\uff8d\10",
			"\163\10\1\55\uff8c\10",
			"\145\10\1\56\uff9a\10",
			"\145\10\1\57\uff9a\10",
			"\163\10\1\60\uff8c\10",
			"\171\10\1\61\uff86\10",
			"\154\10\1\62\uff93\10",
			"\40\10\1\63\uffdf\10",
			"\40\10\1\64\uffdf\10",
			"\141\10\1\65\uff9e\10",
			"\157\10\1\66\uff90\10",
			"\156\10\1\67\uff91\10",
			"\164\10\1\70\uff8b\10",
			"\146\10\1\71\uff99\10",
			"\157\10\1\72\uff90\10",
			"\151\10\1\73\uff96\10",
			"\52\10\1\74\uffd5\10",
			"\144\10\1\75\uff9b\10",
			"\157\10\1\76\uff90\10",
			"",
			"\145\10\1\100\uff9a\10",
			"\156\10\1\101\uff91\10",
			"",
			"\52\10\1\102\uffd5\10",
			"\52\10\1\103\uffd5\10",
			"",
			"",
			"",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | DIGITS | LETTER | STRING | STR | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA5_58 = input.LA(1);
						s = -1;
						if ( (LA5_58=='d') ) {s = 61;}
						else if ( ((LA5_58 >= '\u0000' && LA5_58 <= 'c')||(LA5_58 >= 'e' && LA5_58 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA5_55 = input.LA(1);
						s = -1;
						if ( (LA5_55=='o') ) {s = 58;}
						else if ( ((LA5_55 >= '\u0000' && LA5_55 <= 'n')||(LA5_55 >= 'p' && LA5_55 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA5_64 = input.LA(1);
						s = -1;
						if ( (LA5_64=='*') ) {s = 66;}
						else if ( ((LA5_64 >= '\u0000' && LA5_64 <= ')')||(LA5_64 >= '+' && LA5_64 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA5_61 = input.LA(1);
						s = -1;
						if ( (LA5_61=='e') ) {s = 64;}
						else if ( ((LA5_61 >= '\u0000' && LA5_61 <= 'd')||(LA5_61 >= 'f' && LA5_61 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA5_46 = input.LA(1);
						s = -1;
						if ( (LA5_46=='y') ) {s = 49;}
						else if ( ((LA5_46 >= '\u0000' && LA5_46 <= 'x')||(LA5_46 >= 'z' && LA5_46 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA5_43 = input.LA(1);
						s = -1;
						if ( (LA5_43=='e') ) {s = 46;}
						else if ( ((LA5_43 >= '\u0000' && LA5_43 <= 'd')||(LA5_43 >= 'f' && LA5_43 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA5_52 = input.LA(1);
						s = -1;
						if ( (LA5_52=='n') ) {s = 55;}
						else if ( ((LA5_52 >= '\u0000' && LA5_52 <= 'm')||(LA5_52 >= 'o' && LA5_52 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA5_49 = input.LA(1);
						s = -1;
						if ( (LA5_49==' ') ) {s = 52;}
						else if ( ((LA5_49 >= '\u0000' && LA5_49 <= '\u001F')||(LA5_49 >= '!' && LA5_49 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA5_1 = input.LA(1);
						s = -1;
						if ( (LA5_1=='f') ) {s = 5;}
						else if ( (LA5_1=='m') ) {s = 6;}
						else if ( (LA5_1=='t') ) {s = 7;}
						else if ( ((LA5_1 >= '\u0000' && LA5_1 <= 'e')||(LA5_1 >= 'g' && LA5_1 <= 'l')||(LA5_1 >= 'n' && LA5_1 <= 's')||(LA5_1 >= 'u' && LA5_1 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA5_20 = input.LA(1);
						s = -1;
						if ( (LA5_20=='e') ) {s = 23;}
						else if ( (LA5_20=='s') ) {s = 24;}
						else if ( ((LA5_20 >= '\u0000' && LA5_20 <= 'd')||(LA5_20 >= 'f' && LA5_20 <= 'r')||(LA5_20 >= 't' && LA5_20 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA5_17 = input.LA(1);
						s = -1;
						if ( (LA5_17==' ') ) {s = 20;}
						else if ( ((LA5_17 >= '\u0000' && LA5_17 <= '\u001F')||(LA5_17 >= '!' && LA5_17 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA5_65 = input.LA(1);
						s = -1;
						if ( (LA5_65=='*') ) {s = 67;}
						else if ( ((LA5_65 >= '\u0000' && LA5_65 <= ')')||(LA5_65 >= '+' && LA5_65 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA5_62 = input.LA(1);
						s = -1;
						if ( (LA5_62=='n') ) {s = 65;}
						else if ( ((LA5_62 >= '\u0000' && LA5_62 <= 'm')||(LA5_62 >= 'o' && LA5_62 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA5_59 = input.LA(1);
						s = -1;
						if ( (LA5_59=='o') ) {s = 62;}
						else if ( ((LA5_59 >= '\u0000' && LA5_59 <= 'n')||(LA5_59 >= 'p' && LA5_59 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA5_56 = input.LA(1);
						s = -1;
						if ( (LA5_56=='i') ) {s = 59;}
						else if ( ((LA5_56 >= '\u0000' && LA5_56 <= 'h')||(LA5_56 >= 'j' && LA5_56 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA5_53 = input.LA(1);
						s = -1;
						if ( (LA5_53=='t') ) {s = 56;}
						else if ( ((LA5_53 >= '\u0000' && LA5_53 <= 's')||(LA5_53 >= 'u' && LA5_53 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA5_50 = input.LA(1);
						s = -1;
						if ( (LA5_50=='a') ) {s = 53;}
						else if ( ((LA5_50 >= '\u0000' && LA5_50 <= '`')||(LA5_50 >= 'b' && LA5_50 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA5_47 = input.LA(1);
						s = -1;
						if ( (LA5_47=='l') ) {s = 50;}
						else if ( ((LA5_47 >= '\u0000' && LA5_47 <= 'k')||(LA5_47 >= 'm' && LA5_47 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA5_44 = input.LA(1);
						s = -1;
						if ( (LA5_44=='e') ) {s = 47;}
						else if ( ((LA5_44 >= '\u0000' && LA5_44 <= 'd')||(LA5_44 >= 'f' && LA5_44 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA5_40 = input.LA(1);
						s = -1;
						if ( (LA5_40=='a') ) {s = 42;}
						else if ( ((LA5_40 >= '\u0000' && LA5_40 <= '`')||(LA5_40 >= 'b' && LA5_40 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA5_42 = input.LA(1);
						s = -1;
						if ( (LA5_42=='s') ) {s = 45;}
						else if ( ((LA5_42 >= '\u0000' && LA5_42 <= 'r')||(LA5_42 >= 't' && LA5_42 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA5_32 = input.LA(1);
						s = -1;
						if ( (LA5_32=='c') ) {s = 36;}
						else if ( ((LA5_32 >= '\u0000' && LA5_32 <= 'b')||(LA5_32 >= 'd' && LA5_32 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA5_36 = input.LA(1);
						s = -1;
						if ( (LA5_36=='l') ) {s = 40;}
						else if ( ((LA5_36 >= '\u0000' && LA5_36 <= 'k')||(LA5_36 >= 'm' && LA5_36 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA5_24 = input.LA(1);
						s = -1;
						if ( (LA5_24=='u') ) {s = 28;}
						else if ( ((LA5_24 >= '\u0000' && LA5_24 <= 't')||(LA5_24 >= 'v' && LA5_24 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA5_28 = input.LA(1);
						s = -1;
						if ( (LA5_28=='b') ) {s = 32;}
						else if ( ((LA5_28 >= '\u0000' && LA5_28 <= 'a')||(LA5_28 >= 'c' && LA5_28 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA5_35 = input.LA(1);
						s = -1;
						if ( (LA5_35=='y') ) {s = 39;}
						else if ( ((LA5_35 >= '\u0000' && LA5_35 <= 'x')||(LA5_35 >= 'z' && LA5_35 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA5_57 = input.LA(1);
						s = -1;
						if ( (LA5_57=='*') ) {s = 60;}
						else if ( ((LA5_57 >= '\u0000' && LA5_57 <= ')')||(LA5_57 >= '+' && LA5_57 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA5_31 = input.LA(1);
						s = -1;
						if ( (LA5_31=='r') ) {s = 35;}
						else if ( ((LA5_31 >= '\u0000' && LA5_31 <= 'q')||(LA5_31 >= 's' && LA5_31 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA5_51 = input.LA(1);
						s = -1;
						if ( (LA5_51=='o') ) {s = 54;}
						else if ( ((LA5_51 >= '\u0000' && LA5_51 <= 'n')||(LA5_51 >= 'p' && LA5_51 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA5_27 = input.LA(1);
						s = -1;
						if ( (LA5_27=='e') ) {s = 31;}
						else if ( ((LA5_27 >= '\u0000' && LA5_27 <= 'd')||(LA5_27 >= 'f' && LA5_27 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA5_54 = input.LA(1);
						s = -1;
						if ( (LA5_54=='f') ) {s = 57;}
						else if ( ((LA5_54 >= '\u0000' && LA5_54 <= 'e')||(LA5_54 >= 'g' && LA5_54 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA5_23 = input.LA(1);
						s = -1;
						if ( (LA5_23=='v') ) {s = 27;}
						else if ( ((LA5_23 >= '\u0000' && LA5_23 <= 'u')||(LA5_23 >= 'w' && LA5_23 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA5_45 = input.LA(1);
						s = -1;
						if ( (LA5_45=='s') ) {s = 48;}
						else if ( ((LA5_45 >= '\u0000' && LA5_45 <= 'r')||(LA5_45 >= 't' && LA5_45 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA5_48 = input.LA(1);
						s = -1;
						if ( (LA5_48==' ') ) {s = 51;}
						else if ( ((LA5_48 >= '\u0000' && LA5_48 <= '\u001F')||(LA5_48 >= '!' && LA5_48 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA5_26 = input.LA(1);
						s = -1;
						if ( (LA5_26=='f') ) {s = 30;}
						else if ( ((LA5_26 >= '\u0000' && LA5_26 <= 'e')||(LA5_26 >= 'g' && LA5_26 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA5_22 = input.LA(1);
						s = -1;
						if ( (LA5_22=='o') ) {s = 26;}
						else if ( ((LA5_22 >= '\u0000' && LA5_22 <= 'n')||(LA5_22 >= 'p' && LA5_22 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA5_19 = input.LA(1);
						s = -1;
						if ( (LA5_19==' ') ) {s = 22;}
						else if ( ((LA5_19 >= '\u0000' && LA5_19 <= '\u001F')||(LA5_19 >= '!' && LA5_19 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA5_16 = input.LA(1);
						s = -1;
						if ( (LA5_16=='e') ) {s = 19;}
						else if ( ((LA5_16 >= '\u0000' && LA5_16 <= 'd')||(LA5_16 >= 'f' && LA5_16 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA5_30 = input.LA(1);
						s = -1;
						if ( (LA5_30=='*') ) {s = 34;}
						else if ( ((LA5_30 >= '\u0000' && LA5_30 <= ')')||(LA5_30 >= '+' && LA5_30 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA5_29 = input.LA(1);
						s = -1;
						if ( (LA5_29=='*') ) {s = 33;}
						else if ( ((LA5_29 >= '\u0000' && LA5_29 <= ')')||(LA5_29 >= '+' && LA5_29 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA5_7 = input.LA(1);
						s = -1;
						if ( (LA5_7=='y') ) {s = 13;}
						else if ( ((LA5_7 >= '\u0000' && LA5_7 <= 'x')||(LA5_7 >= 'z' && LA5_7 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA5_13 = input.LA(1);
						s = -1;
						if ( (LA5_13=='p') ) {s = 16;}
						else if ( ((LA5_13 >= '\u0000' && LA5_13 <= 'o')||(LA5_13 >= 'q' && LA5_13 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA5_6 = input.LA(1);
						s = -1;
						if ( (LA5_6=='a') ) {s = 12;}
						else if ( ((LA5_6 >= '\u0000' && LA5_6 <= '`')||(LA5_6 >= 'b' && LA5_6 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA5_41 = input.LA(1);
						s = -1;
						if ( (LA5_41=='k') ) {s = 43;}
						else if ( (LA5_41=='r') ) {s = 44;}
						else if ( ((LA5_41 >= '\u0000' && LA5_41 <= 'j')||(LA5_41 >= 'l' && LA5_41 <= 'q')||(LA5_41 >= 's' && LA5_41 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA5_12 = input.LA(1);
						s = -1;
						if ( (LA5_12=='s') ) {s = 15;}
						else if ( ((LA5_12 >= '\u0000' && LA5_12 <= 'r')||(LA5_12 >= 't' && LA5_12 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA5_39 = input.LA(1);
						s = -1;
						if ( (LA5_39==' ') ) {s = 41;}
						else if ( ((LA5_39 >= '\u0000' && LA5_39 <= '\u001F')||(LA5_39 >= '!' && LA5_39 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA5_21 = input.LA(1);
						s = -1;
						if ( (LA5_21=='o') ) {s = 25;}
						else if ( ((LA5_21 >= '\u0000' && LA5_21 <= 'n')||(LA5_21 >= 'p' && LA5_21 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA5_25 = input.LA(1);
						s = -1;
						if ( (LA5_25=='f') ) {s = 29;}
						else if ( ((LA5_25 >= '\u0000' && LA5_25 <= 'e')||(LA5_25 >= 'g' && LA5_25 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA5_15 = input.LA(1);
						s = -1;
						if ( (LA5_15=='s') ) {s = 18;}
						else if ( ((LA5_15 >= '\u0000' && LA5_15 <= 'r')||(LA5_15 >= 't' && LA5_15 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA5_18 = input.LA(1);
						s = -1;
						if ( (LA5_18==' ') ) {s = 21;}
						else if ( ((LA5_18 >= '\u0000' && LA5_18 <= '\u001F')||(LA5_18 >= '!' && LA5_18 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA5_11 = input.LA(1);
						s = -1;
						if ( (LA5_11=='n') ) {s = 14;}
						else if ( ((LA5_11 >= '\u0000' && LA5_11 <= 'm')||(LA5_11 >= 'o' && LA5_11 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA5_14 = input.LA(1);
						s = -1;
						if ( (LA5_14=='d') ) {s = 17;}
						else if ( ((LA5_14 >= '\u0000' && LA5_14 <= 'c')||(LA5_14 >= 'e' && LA5_14 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA5_5 = input.LA(1);
						s = -1;
						if ( (LA5_5=='i') ) {s = 11;}
						else if ( ((LA5_5 >= '\u0000' && LA5_5 <= 'h')||(LA5_5 >= 'j' && LA5_5 <= '\uFFFF')) ) {s = 8;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 5, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
