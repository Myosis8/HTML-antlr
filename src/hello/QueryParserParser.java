// $ANTLR 3.5 /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g 2013-06-27 16:12:06
 
  package hello;
  import search.Query;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class QueryParserParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIGITS", "LETTER", "STR", "STRING", 
		"WS", "'*find every key node*'", "'*find every relation*'", "'*find subclass of*'", 
		"'*mass of*'", "'*type of*'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public QueryParserParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public QueryParserParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return QueryParserParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g"; }





	// $ANTLR start "page"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:15:1: page returns [Query result] : ( '*find every key node*' | '*find every relation*' | '*mass of*' STRING | '*find subclass of*' STRING | '*type of*' STRING | STR );
	public final Query page() throws RecognitionException {
		Query result = null;


		Token STRING1=null;
		Token STRING2=null;
		Token STRING3=null;

		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:16:2: ( '*find every key node*' | '*find every relation*' | '*mass of*' STRING | '*find subclass of*' STRING | '*type of*' STRING | STR )
			int alt1=6;
			switch ( input.LA(1) ) {
			case 9:
				{
				alt1=1;
				}
				break;
			case 10:
				{
				alt1=2;
				}
				break;
			case 12:
				{
				alt1=3;
				}
				break;
			case 11:
				{
				alt1=4;
				}
				break;
			case 13:
				{
				alt1=5;
				}
				break;
			case STR:
				{
				alt1=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:16:4: '*find every key node*'
					{
					match(input,9,FOLLOW_9_in_page46); 

								Query query = new Query("***","***",1);
								result = query;
							
					}
					break;
				case 2 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:21:4: '*find every relation*'
					{
					match(input,10,FOLLOW_10_in_page55); 

								Query query = new Query("***","***",2);
								result = query;
							
					}
					break;
				case 3 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:26:4: '*mass of*' STRING
					{
					match(input,12,FOLLOW_12_in_page64); 
					STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_page66); 

								Query query = new Query((STRING1!=null?STRING1.getText():null),"***",3);
								result = query;
							
					}
					break;
				case 4 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:31:4: '*find subclass of*' STRING
					{
					match(input,11,FOLLOW_11_in_page76); 
					STRING2=(Token)match(input,STRING,FOLLOW_STRING_in_page78); 

								Query query = new Query((STRING2!=null?STRING2.getText():null),"***",4);
								result = query;
							
					}
					break;
				case 5 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:36:4: '*type of*' STRING
					{
					match(input,13,FOLLOW_13_in_page87); 
					STRING3=(Token)match(input,STRING,FOLLOW_STRING_in_page89); 

								Query query = new Query("*", (STRING3!=null?STRING3.getText():null),5);
								result = query;
							
					}
					break;
				case 6 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/QueryParser.g:41:4: STR
					{
					match(input,STR,FOLLOW_STR_in_page98); 

								Query query = new Query("*", "*",6);
								result = query;
							
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "page"

	// Delegated rules



	public static final BitSet FOLLOW_9_in_page46 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_page55 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_page64 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_STRING_in_page66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_page76 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_STRING_in_page78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_page87 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_STRING_in_page89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STR_in_page98 = new BitSet(new long[]{0x0000000000000002L});
}
