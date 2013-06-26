// $ANTLR 3.5 D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g 2013-06-03 22:23:11

  package hello;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GrammarLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
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

	public GrammarLexer() {} 
	public GrammarLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public GrammarLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g"; }

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:11:6: ( '(' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:11:8: '('
			{
			match('('); 
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
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:12:7: ( '()' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:12:9: '()'
			{
			match("()"); 

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
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:13:7: ( ')' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:13:9: ')'
			{
			match(')'); 
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
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:14:7: ( 'align' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:14:9: 'align'
			{
			match("align"); 

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
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:15:7: ( 'body' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:15:9: 'body'
			{
			match("body"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:16:7: ( 'bold' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:16:9: 'bold'
			{
			match("bold"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:17:7: ( 'bottom' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:17:9: 'bottom'
			{
			match("bottom"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:18:7: ( 'center' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:18:9: 'center'
			{
			match("center"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:19:7: ( 'color' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:19:9: 'color'
			{
			match("color"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:20:7: ( 'end_body' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:20:9: 'end_body'
			{
			match("end_body"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:21:7: ( 'end_bold' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:21:9: 'end_bold'
			{
			match("end_bold"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:22:7: ( 'end_font' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:22:9: 'end_font'
			{
			match("end_font"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:23:7: ( 'end_head' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:23:9: 'end_head'
			{
			match("end_head"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:24:7: ( 'end_italic' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:24:9: 'end_italic'
			{
			match("end_italic"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:25:7: ( 'end_key_subject' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:25:9: 'end_key_subject'
			{
			match("end_key_subject"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:26:7: ( 'end_key_text' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:26:9: 'end_key_text'
			{
			match("end_key_text"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:27:7: ( 'end_link' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:27:9: 'end_link'
			{
			match("end_link"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:28:7: ( 'end_main' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:28:9: 'end_main'
			{
			match("end_main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:29:7: ( 'end_paragraph' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:29:9: 'end_paragraph'
			{
			match("end_paragraph"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:30:7: ( 'end_title' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:30:9: 'end_title'
			{
			match("end_title"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:31:7: ( 'end_u_line' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:31:9: 'end_u_line'
			{
			match("end_u_line"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:32:7: ( 'face' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:32:9: 'face'
			{
			match("face"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:33:7: ( 'font' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:33:9: 'font'
			{
			match("font"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:34:7: ( 'head' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:34:9: 'head'
			{
			match("head"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:35:7: ( 'height' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:35:9: 'height'
			{
			match("height"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:36:7: ( 'href' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:36:9: 'href'
			{
			match("href"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:37:7: ( 'id' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:37:9: 'id'
			{
			match("id"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:38:7: ( 'image' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:38:9: 'image'
			{
			match("image"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:39:7: ( 'italic' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:39:9: 'italic'
			{
			match("italic"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:40:7: ( 'justify' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:40:9: 'justify'
			{
			match("justify"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:41:7: ( 'key_image' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:41:9: 'key_image'
			{
			match("key_image"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:42:7: ( 'key_subject' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:42:9: 'key_subject'
			{
			match("key_subject"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:43:7: ( 'key_text' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:43:9: 'key_text'
			{
			match("key_text"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:44:7: ( 'left' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:44:9: 'left'
			{
			match("left"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:45:7: ( 'link' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:45:9: 'link'
			{
			match("link"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:46:7: ( 'main' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:46:9: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:47:7: ( 'middle' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:47:9: 'middle'
			{
			match("middle"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:48:7: ( 'name' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:48:9: 'name'
			{
			match("name"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:49:7: ( 'new_line' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:49:9: 'new_line'
			{
			match("new_line"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:50:7: ( 'paragraph' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:50:9: 'paragraph'
			{
			match("paragraph"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:51:7: ( 'relation' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:51:9: 'relation'
			{
			match("relation"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:52:7: ( 'right' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:52:9: 'right'
			{
			match("right"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:53:7: ( 'size' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:53:9: 'size'
			{
			match("size"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:54:7: ( 'source' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:54:9: 'source'
			{
			match("source"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:55:7: ( 'target' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:55:9: 'target'
			{
			match("target"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:56:7: ( 'title' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:56:9: 'title'
			{
			match("title"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:57:7: ( 'top' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:57:9: 'top'
			{
			match("top"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:58:7: ( 'u_line' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:58:9: 'u_line'
			{
			match("u_line"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:59:7: ( 'width' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:59:9: 'width'
			{
			match("width"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "DIGITS"
	public final void mDIGITS() throws RecognitionException {
		try {
			int _type = DIGITS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:389:8: ( ( '0' .. '9' )+ )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:389:10: ( '0' .. '9' )+
			{
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:389:10: ( '0' .. '9' )+
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
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:
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
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:390:8: ( 'a' .. 'z' | 'A' .. 'Z' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:
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
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:391:8: ( ( LETTER )+ )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:391:10: ( LETTER )+
			{
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:391:10: ( LETTER )+
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
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:
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

			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:393:2: ( '*' ( '/' '*' |c=~ ( '*' ) )* '*' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:393:5: '*' ( '/' '*' |c=~ ( '*' ) )* '*'
			{
			match('*'); 
			 	StringBuilder temp = new StringBuilder();
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:395:3: ( '/' '*' |c=~ ( '*' ) )*
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
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:395:4: '/' '*'
					{
					match('/'); 
					match('*'); 
					 	temp.appendCodePoint('*');
					}
					break;
				case 2 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:396:5: c=~ ( '*' )
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
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:401:4: ( ( ' ' | '\\t' | '\\n' | '\\f' | '\\r' )+ )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:401:6: ( ' ' | '\\t' | '\\n' | '\\f' | '\\r' )+
			{
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:401:6: ( ' ' | '\\t' | '\\n' | '\\f' | '\\r' )+
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
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:
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
		// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | DIGITS | LETTER | STRING | STR | WS )
		int alt5=54;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:10: T__9
				{
				mT__9(); 

				}
				break;
			case 2 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:15: T__10
				{
				mT__10(); 

				}
				break;
			case 3 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:21: T__11
				{
				mT__11(); 

				}
				break;
			case 4 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:27: T__12
				{
				mT__12(); 

				}
				break;
			case 5 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:33: T__13
				{
				mT__13(); 

				}
				break;
			case 6 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:39: T__14
				{
				mT__14(); 

				}
				break;
			case 7 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:45: T__15
				{
				mT__15(); 

				}
				break;
			case 8 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:51: T__16
				{
				mT__16(); 

				}
				break;
			case 9 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:57: T__17
				{
				mT__17(); 

				}
				break;
			case 10 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:63: T__18
				{
				mT__18(); 

				}
				break;
			case 11 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:69: T__19
				{
				mT__19(); 

				}
				break;
			case 12 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:75: T__20
				{
				mT__20(); 

				}
				break;
			case 13 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:81: T__21
				{
				mT__21(); 

				}
				break;
			case 14 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:87: T__22
				{
				mT__22(); 

				}
				break;
			case 15 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:93: T__23
				{
				mT__23(); 

				}
				break;
			case 16 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:99: T__24
				{
				mT__24(); 

				}
				break;
			case 17 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:105: T__25
				{
				mT__25(); 

				}
				break;
			case 18 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:111: T__26
				{
				mT__26(); 

				}
				break;
			case 19 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:117: T__27
				{
				mT__27(); 

				}
				break;
			case 20 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:123: T__28
				{
				mT__28(); 

				}
				break;
			case 21 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:129: T__29
				{
				mT__29(); 

				}
				break;
			case 22 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:135: T__30
				{
				mT__30(); 

				}
				break;
			case 23 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:141: T__31
				{
				mT__31(); 

				}
				break;
			case 24 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:147: T__32
				{
				mT__32(); 

				}
				break;
			case 25 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:153: T__33
				{
				mT__33(); 

				}
				break;
			case 26 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:159: T__34
				{
				mT__34(); 

				}
				break;
			case 27 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:165: T__35
				{
				mT__35(); 

				}
				break;
			case 28 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:171: T__36
				{
				mT__36(); 

				}
				break;
			case 29 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:177: T__37
				{
				mT__37(); 

				}
				break;
			case 30 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:183: T__38
				{
				mT__38(); 

				}
				break;
			case 31 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:189: T__39
				{
				mT__39(); 

				}
				break;
			case 32 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:195: T__40
				{
				mT__40(); 

				}
				break;
			case 33 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:201: T__41
				{
				mT__41(); 

				}
				break;
			case 34 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:207: T__42
				{
				mT__42(); 

				}
				break;
			case 35 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:213: T__43
				{
				mT__43(); 

				}
				break;
			case 36 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:219: T__44
				{
				mT__44(); 

				}
				break;
			case 37 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:225: T__45
				{
				mT__45(); 

				}
				break;
			case 38 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:231: T__46
				{
				mT__46(); 

				}
				break;
			case 39 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:237: T__47
				{
				mT__47(); 

				}
				break;
			case 40 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:243: T__48
				{
				mT__48(); 

				}
				break;
			case 41 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:249: T__49
				{
				mT__49(); 

				}
				break;
			case 42 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:255: T__50
				{
				mT__50(); 

				}
				break;
			case 43 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:261: T__51
				{
				mT__51(); 

				}
				break;
			case 44 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:267: T__52
				{
				mT__52(); 

				}
				break;
			case 45 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:273: T__53
				{
				mT__53(); 

				}
				break;
			case 46 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:279: T__54
				{
				mT__54(); 

				}
				break;
			case 47 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:285: T__55
				{
				mT__55(); 

				}
				break;
			case 48 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:291: T__56
				{
				mT__56(); 

				}
				break;
			case 49 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:297: T__57
				{
				mT__57(); 

				}
				break;
			case 50 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:303: DIGITS
				{
				mDIGITS(); 

				}
				break;
			case 51 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:310: LETTER
				{
				mLETTER(); 

				}
				break;
			case 52 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:317: STRING
				{
				mSTRING(); 

				}
				break;
			case 53 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:324: STR
				{
				mSTR(); 

				}
				break;
			case 54 :
				// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:1:328: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\1\uffff\1\32\1\uffff\22\34\1\uffff\1\34\4\uffff\1\35\2\uffff\10\35\1"+
		"\107\22\35\1\uffff\15\35\1\uffff\21\35\1\170\2\35\1\173\1\174\3\35\1\uffff"+
		"\1\u008a\1\u008b\1\u008c\1\35\1\u008e\3\35\1\uffff\1\u0095\1\u0096\1\u0097"+
		"\1\35\1\u0099\1\uffff\3\35\1\u009d\3\35\1\uffff\1\35\1\u00a2\2\uffff\2"+
		"\35\1\u00a5\15\uffff\1\35\1\uffff\1\u00a9\2\35\6\uffff\1\35\1\uffff\2"+
		"\35\1\u00af\1\uffff\2\35\1\u00b2\1\u00b3\1\uffff\1\u00b4\1\u00b5\3\uffff"+
		"\1\u00b9\1\uffff\1\u00ba\1\35\1\u00bc\2\35\1\uffff\1\u00bf\1\u00c0\11"+
		"\uffff\1\u00c2\1\uffff\2\35\4\uffff\1\35\1\u00c8\2\uffff\1\u00c9\2\uffff";
	static final String DFA5_eofS =
		"\u00ca\uffff";
	static final String DFA5_minS =
		"\1\11\1\51\1\uffff\22\101\1\uffff\1\101\4\uffff\1\151\2\uffff\1\144\1"+
		"\156\1\154\1\144\1\143\1\156\1\141\1\145\1\101\2\141\1\163\1\171\1\146"+
		"\1\156\1\151\1\144\1\155\1\167\1\162\1\154\1\147\1\172\1\165\1\162\1\164"+
		"\1\160\1\uffff\1\144\1\147\1\171\1\144\2\164\1\157\1\137\1\145\1\164\1"+
		"\144\1\147\1\146\1\uffff\1\147\1\154\1\164\1\137\1\164\1\153\1\156\1\144"+
		"\1\145\1\137\2\141\1\150\1\145\1\162\1\147\1\154\1\101\1\164\1\156\2\101"+
		"\1\157\1\145\1\162\1\142\3\101\1\150\1\101\1\145\3\151\3\101\1\154\1\101"+
		"\1\uffff\1\147\2\164\1\101\1\143\2\145\1\uffff\1\150\1\101\2\uffff\1\155"+
		"\1\162\1\101\1\157\3\uffff\1\145\10\uffff\1\164\1\uffff\1\101\1\143\1"+
		"\146\6\uffff\1\145\1\uffff\1\162\1\151\1\101\1\uffff\1\145\1\164\2\101"+
		"\1\uffff\2\101\1\uffff\1\144\1\171\1\101\1\uffff\1\101\1\171\1\101\1\141"+
		"\1\157\1\uffff\2\101\6\uffff\1\137\2\uffff\1\101\1\uffff\1\160\1\156\2"+
		"\uffff\1\163\1\uffff\1\150\1\101\2\uffff\1\101\2\uffff";
	static final String DFA5_maxS =
		"\1\172\1\51\1\uffff\22\172\1\uffff\1\172\4\uffff\1\151\2\uffff\1\164\1"+
		"\156\1\154\1\144\1\143\1\156\1\151\1\145\1\172\2\141\1\163\1\171\1\146"+
		"\1\156\1\151\1\144\1\155\1\167\1\162\1\154\1\147\1\172\1\165\1\162\1\164"+
		"\1\160\1\uffff\1\144\1\147\1\171\1\144\2\164\1\157\1\137\1\145\1\164\1"+
		"\144\1\147\1\146\1\uffff\1\147\1\154\1\164\1\137\1\164\1\153\1\156\1\144"+
		"\1\145\1\137\2\141\1\150\1\145\1\162\1\147\1\154\1\172\1\164\1\156\2\172"+
		"\1\157\1\145\1\162\1\165\3\172\1\150\1\172\1\145\2\151\1\164\3\172\1\154"+
		"\1\172\1\uffff\1\147\2\164\1\172\1\143\2\145\1\uffff\1\150\1\172\2\uffff"+
		"\1\155\1\162\1\172\1\157\3\uffff\1\145\10\uffff\1\164\1\uffff\1\172\1"+
		"\143\1\146\6\uffff\1\145\1\uffff\1\162\1\151\1\172\1\uffff\1\145\1\164"+
		"\2\172\1\uffff\2\172\1\uffff\1\154\1\171\1\172\1\uffff\1\172\1\171\1\172"+
		"\1\141\1\157\1\uffff\2\172\6\uffff\1\137\2\uffff\1\172\1\uffff\1\160\1"+
		"\156\2\uffff\1\164\1\uffff\1\150\1\172\2\uffff\1\172\2\uffff";
	static final String DFA5_acceptS =
		"\2\uffff\1\3\22\uffff\1\62\1\uffff\1\65\1\66\1\2\1\1\1\uffff\1\63\1\64"+
		"\33\uffff\1\60\15\uffff\1\33\50\uffff\1\47\7\uffff\1\57\2\uffff\1\5\1"+
		"\6\4\uffff\1\14\1\15\1\16\1\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1"+
		"\30\1\uffff\1\32\3\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\uffff\1\46\3"+
		"\uffff\1\53\4\uffff\1\4\2\uffff\1\11\3\uffff\1\34\5\uffff\1\52\2\uffff"+
		"\1\56\1\61\1\7\1\10\1\12\1\13\1\uffff\1\31\1\35\1\uffff\1\45\2\uffff\1"+
		"\54\1\55\1\uffff\1\36\2\uffff\1\17\1\20\1\uffff\1\51\1\50";
	static final String DFA5_specialS =
		"\u00ca\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\30\1\uffff\2\30\22\uffff\1\30\7\uffff\1\1\1\2\1\27\5\uffff\12\25\7"+
			"\uffff\32\26\6\uffff\1\3\1\4\1\5\1\26\1\6\1\7\1\26\1\10\1\11\1\12\1\13"+
			"\1\14\1\15\1\16\1\26\1\17\1\26\1\20\1\21\1\22\1\23\1\26\1\24\3\26",
			"\1\31",
			"",
			"\32\35\6\uffff\13\35\1\33\16\35",
			"\32\35\6\uffff\16\35\1\36\13\35",
			"\32\35\6\uffff\4\35\1\37\11\35\1\40\13\35",
			"\32\35\6\uffff\15\35\1\41\14\35",
			"\32\35\6\uffff\1\42\15\35\1\43\13\35",
			"\32\35\6\uffff\4\35\1\44\14\35\1\45\10\35",
			"\32\35\6\uffff\3\35\1\46\10\35\1\47\6\35\1\50\6\35",
			"\32\35\6\uffff\24\35\1\51\5\35",
			"\32\35\6\uffff\4\35\1\52\25\35",
			"\32\35\6\uffff\4\35\1\53\3\35\1\54\21\35",
			"\32\35\6\uffff\1\55\7\35\1\56\21\35",
			"\32\35\6\uffff\1\57\3\35\1\60\25\35",
			"\32\35\6\uffff\1\61\31\35",
			"\32\35\6\uffff\4\35\1\62\3\35\1\63\21\35",
			"\32\35\6\uffff\10\35\1\64\5\35\1\65\13\35",
			"\32\35\6\uffff\1\66\7\35\1\67\5\35\1\70\13\35",
			"\32\35\4\uffff\1\71\1\uffff\32\35",
			"\32\35\6\uffff\10\35\1\72\21\35",
			"",
			"\32\35\6\uffff\32\35",
			"",
			"",
			"",
			"",
			"\1\73",
			"",
			"",
			"\1\74\7\uffff\1\75\7\uffff\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104\7\uffff\1\105",
			"\1\106",
			"\32\35\6\uffff\32\35",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\32\35\6\uffff\32\35",
			"\1\171",
			"\1\172",
			"\32\35\6\uffff\32\35",
			"\32\35\6\uffff\32\35",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080\3\uffff\1\u0081\1\uffff\1\u0082\1\u0083\1\uffff\1\u0084\1\u0085"+
			"\1\u0086\2\uffff\1\u0087\3\uffff\1\u0088\1\u0089",
			"\32\35\6\uffff\32\35",
			"\32\35\6\uffff\32\35",
			"\32\35\6\uffff\32\35",
			"\1\u008d",
			"\32\35\6\uffff\32\35",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092\11\uffff\1\u0093\1\u0094",
			"\32\35\6\uffff\32\35",
			"\32\35\6\uffff\32\35",
			"\32\35\6\uffff\32\35",
			"\1\u0098",
			"\32\35\6\uffff\32\35",
			"",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\32\35\6\uffff\32\35",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"",
			"\1\u00a1",
			"\32\35\6\uffff\32\35",
			"",
			"",
			"\1\u00a3",
			"\1\u00a4",
			"\32\35\6\uffff\32\35",
			"\1\u00a6",
			"",
			"",
			"",
			"\1\u00a7",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00a8",
			"",
			"\32\35\6\uffff\32\35",
			"\1\u00aa",
			"\1\u00ab",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00ac",
			"",
			"\1\u00ad",
			"\1\u00ae",
			"\32\35\6\uffff\32\35",
			"",
			"\1\u00b0",
			"\1\u00b1",
			"\32\35\6\uffff\32\35",
			"\32\35\6\uffff\32\35",
			"",
			"\32\35\6\uffff\32\35",
			"\32\35\6\uffff\32\35",
			"",
			"\1\u00b6\7\uffff\1\u00b7",
			"\1\u00b8",
			"\32\35\6\uffff\32\35",
			"",
			"\32\35\6\uffff\32\35",
			"\1\u00bb",
			"\32\35\6\uffff\32\35",
			"\1\u00bd",
			"\1\u00be",
			"",
			"\32\35\6\uffff\32\35",
			"\32\35\6\uffff\32\35",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00c1",
			"",
			"",
			"\32\35\6\uffff\32\35",
			"",
			"\1\u00c3",
			"\1\u00c4",
			"",
			"",
			"\1\u00c5\1\u00c6",
			"",
			"\1\u00c7",
			"\32\35\6\uffff\32\35",
			"",
			"",
			"\32\35\6\uffff\32\35",
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
			return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | DIGITS | LETTER | STRING | STR | WS );";
		}
	}

}
