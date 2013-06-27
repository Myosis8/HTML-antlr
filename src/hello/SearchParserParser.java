// $ANTLR 3.5 /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g 2013-06-27 16:12:11
 
  package hello;
  import java.lang.StringBuilder;
  import search.SearchGraph;
  import search.KeyNode;
  import search.KeySubject;
  import search.KeyImage;
  import search.KeyText;
  import search.RelationEdge;
  import java.util.Set;
  import search.TempEdge;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SearchParserParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIGITS", "LETTER", "STR", "STRING", 
		"WS", "'('", "')'", "'['", "'align'", "'body'", "'bold'", "'bottom'", 
		"'center'", "'color'", "'end_body'", "'end_bold'", "'end_font'", "'end_head'", 
		"'end_italic'", "'end_key_subject'", "'end_key_text'", "'end_link'", "'end_main'", 
		"'end_paragraph'", "'end_title'", "'end_u_line'", "'face'", "'font'", 
		"'head'", "'height'", "'href'", "'id'", "'image'", "'italic'", "'justify'", 
		"'key_image'", "'key_subject'", "'key_text'", "'left'", "'link'", "'main'", 
		"'middle'", "'name'", "'new_line'", "'paragraph'", "'relation'", "'right'", 
		"'size'", "'source'", "'target'", "'title'", "'top'", "'u_line'", "'width'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public SearchParserParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public SearchParserParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return SearchParserParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g"; }


		ArrayList< TempEdge > edges = new ArrayList< TempEdge >();



	// $ANTLR start "page"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:29:1: page returns [ArrayList< TempEdge > result] : main_tag ;
	public final ArrayList< TempEdge > page() throws RecognitionException {
		ArrayList< TempEdge > result = null;


		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:30:2: ( main_tag )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:30:4: main_tag
			{
			pushFollow(FOLLOW_main_tag_in_page50);
			main_tag();
			state._fsp--;

			result = edges;
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



	// $ANTLR start "main_tag"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:35:1: main_tag : 'main' ( '[' )? head_tag body_tag 'end_main' ;
	public final void main_tag() throws RecognitionException {
		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:36:2: ( 'main' ( '[' )? head_tag body_tag 'end_main' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:36:4: 'main' ( '[' )? head_tag body_tag 'end_main'
			{
			match(input,44,FOLLOW_44_in_main_tag70); 
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:36:11: ( '[' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==11) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:36:12: '['
					{
					match(input,11,FOLLOW_11_in_main_tag73); 
					}
					break;

			}

			pushFollow(FOLLOW_head_tag_in_main_tag83);
			head_tag();
			state._fsp--;

			pushFollow(FOLLOW_body_tag_in_main_tag93);
			body_tag();
			state._fsp--;

			match(input,26,FOLLOW_26_in_main_tag100); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "main_tag"



	// $ANTLR start "head_tag"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:41:1: head_tag : 'head' ( '[' )? ( title_tag | tag )* 'end_head' ;
	public final void head_tag() throws RecognitionException {
		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:42:2: ( 'head' ( '[' )? ( title_tag | tag )* 'end_head' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:42:4: 'head' ( '[' )? ( title_tag | tag )* 'end_head'
			{
			match(input,32,FOLLOW_32_in_head_tag113); 
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:42:11: ( '[' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==11) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:42:12: '['
					{
					match(input,11,FOLLOW_11_in_head_tag116); 
					}
					break;

			}

			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:43:5: ( title_tag | tag )*
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==54) ) {
					alt3=1;
				}
				else if ( (LA3_0==14||LA3_0==31||(LA3_0 >= 36 && LA3_0 <= 37)||(LA3_0 >= 39 && LA3_0 <= 41)||LA3_0==43||(LA3_0 >= 47 && LA3_0 <= 49)||LA3_0==56) ) {
					alt3=2;
				}

				switch (alt3) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:43:6: title_tag
					{
					pushFollow(FOLLOW_title_tag_in_head_tag127);
					title_tag();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:43:18: tag
					{
					pushFollow(FOLLOW_tag_in_head_tag131);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop3;
				}
			}

			match(input,21,FOLLOW_21_in_head_tag138); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "head_tag"



	// $ANTLR start "body_tag"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:46:1: body_tag : 'body' ( '[' )? ( STR | tag )* 'end_body' ;
	public final void body_tag() throws RecognitionException {
		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:47:2: ( 'body' ( '[' )? ( STR | tag )* 'end_body' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:47:4: 'body' ( '[' )? ( STR | tag )* 'end_body'
			{
			match(input,13,FOLLOW_13_in_body_tag152); 
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:47:11: ( '[' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==11) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:47:12: '['
					{
					match(input,11,FOLLOW_11_in_body_tag155); 
					}
					break;

			}

			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:48:4: ( STR | tag )*
			loop5:
			while (true) {
				int alt5=3;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==STR) ) {
					alt5=1;
				}
				else if ( (LA5_0==14||LA5_0==31||(LA5_0 >= 36 && LA5_0 <= 37)||(LA5_0 >= 39 && LA5_0 <= 41)||LA5_0==43||(LA5_0 >= 47 && LA5_0 <= 49)||LA5_0==56) ) {
					alt5=2;
				}

				switch (alt5) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:48:5: STR
					{
					match(input,STR,FOLLOW_STR_in_body_tag165); 
					}
					break;
				case 2 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:49:5: tag
					{
					pushFollow(FOLLOW_tag_in_body_tag172);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			match(input,18,FOLLOW_18_in_body_tag181); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "body_tag"



	// $ANTLR start "tag"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:52:1: tag : ( paragraph | new_line_tag | font_tag | bold_tag | italic_tag | u_line_tag | image_tag | link_tag | key_Subject | key_Text | key_Image | relation_tag );
	public final void tag() throws RecognitionException {
		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:53:2: ( paragraph | new_line_tag | font_tag | bold_tag | italic_tag | u_line_tag | image_tag | link_tag | key_Subject | key_Text | key_Image | relation_tag )
			int alt6=12;
			switch ( input.LA(1) ) {
			case 48:
				{
				alt6=1;
				}
				break;
			case 47:
				{
				alt6=2;
				}
				break;
			case 31:
				{
				alt6=3;
				}
				break;
			case 14:
				{
				alt6=4;
				}
				break;
			case 37:
				{
				alt6=5;
				}
				break;
			case 56:
				{
				alt6=6;
				}
				break;
			case 36:
				{
				alt6=7;
				}
				break;
			case 43:
				{
				alt6=8;
				}
				break;
			case 40:
				{
				alt6=9;
				}
				break;
			case 41:
				{
				alt6=10;
				}
				break;
			case 39:
				{
				alt6=11;
				}
				break;
			case 49:
				{
				alt6=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:53:4: paragraph
					{
					pushFollow(FOLLOW_paragraph_in_tag195);
					paragraph();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:54:4: new_line_tag
					{
					pushFollow(FOLLOW_new_line_tag_in_tag200);
					new_line_tag();
					state._fsp--;

					}
					break;
				case 3 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:55:4: font_tag
					{
					pushFollow(FOLLOW_font_tag_in_tag205);
					font_tag();
					state._fsp--;

					}
					break;
				case 4 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:56:4: bold_tag
					{
					pushFollow(FOLLOW_bold_tag_in_tag210);
					bold_tag();
					state._fsp--;

					}
					break;
				case 5 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:57:4: italic_tag
					{
					pushFollow(FOLLOW_italic_tag_in_tag215);
					italic_tag();
					state._fsp--;

					}
					break;
				case 6 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:58:4: u_line_tag
					{
					pushFollow(FOLLOW_u_line_tag_in_tag220);
					u_line_tag();
					state._fsp--;

					}
					break;
				case 7 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:59:4: image_tag
					{
					pushFollow(FOLLOW_image_tag_in_tag225);
					image_tag();
					state._fsp--;

					}
					break;
				case 8 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:60:4: link_tag
					{
					pushFollow(FOLLOW_link_tag_in_tag230);
					link_tag();
					state._fsp--;

					}
					break;
				case 9 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:61:4: key_Subject
					{
					pushFollow(FOLLOW_key_Subject_in_tag235);
					key_Subject();
					state._fsp--;

					}
					break;
				case 10 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:62:4: key_Text
					{
					pushFollow(FOLLOW_key_Text_in_tag240);
					key_Text();
					state._fsp--;

					}
					break;
				case 11 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:63:4: key_Image
					{
					pushFollow(FOLLOW_key_Image_in_tag245);
					key_Image();
					state._fsp--;

					}
					break;
				case 12 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:64:4: relation_tag
					{
					pushFollow(FOLLOW_relation_tag_in_tag250);
					relation_tag();
					state._fsp--;

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
	}
	// $ANTLR end "tag"



	// $ANTLR start "paragraph"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:67:1: paragraph : 'paragraph' '(' ( text_atribute )* ')' ( STR | tag )* 'end_paragraph' ;
	public final void paragraph() throws RecognitionException {
		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:68:2: ( 'paragraph' '(' ( text_atribute )* ')' ( STR | tag )* 'end_paragraph' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:70:3: 'paragraph' '(' ( text_atribute )* ')' ( STR | tag )* 'end_paragraph'
			{
			match(input,48,FOLLOW_48_in_paragraph268); 
			match(input,9,FOLLOW_9_in_paragraph270); 
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:70:18: ( text_atribute )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==12) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:70:19: text_atribute
					{
					pushFollow(FOLLOW_text_atribute_in_paragraph272);
					text_atribute();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			match(input,10,FOLLOW_10_in_paragraph275); 
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:72:3: ( STR | tag )*
			loop8:
			while (true) {
				int alt8=3;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==STR) ) {
					alt8=1;
				}
				else if ( (LA8_0==14||LA8_0==31||(LA8_0 >= 36 && LA8_0 <= 37)||(LA8_0 >= 39 && LA8_0 <= 41)||LA8_0==43||(LA8_0 >= 47 && LA8_0 <= 49)||LA8_0==56) ) {
					alt8=2;
				}

				switch (alt8) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:72:4: STR
					{
					match(input,STR,FOLLOW_STR_in_paragraph283); 
					}
					break;
				case 2 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:74:3: tag
					{
					pushFollow(FOLLOW_tag_in_paragraph294);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop8;
				}
			}

			match(input,27,FOLLOW_27_in_paragraph300); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "paragraph"



	// $ANTLR start "new_line_tag"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:79:1: new_line_tag : 'new_line' ( '[' )? ;
	public final void new_line_tag() throws RecognitionException {
		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:80:2: ( 'new_line' ( '[' )? )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:80:4: 'new_line' ( '[' )?
			{
			match(input,47,FOLLOW_47_in_new_line_tag315); 
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:80:15: ( '[' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==11) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:80:16: '['
					{
					match(input,11,FOLLOW_11_in_new_line_tag318); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "new_line_tag"



	// $ANTLR start "title_tag"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:83:1: title_tag : 'title' ( '[' )? ( STR | tag )* 'end_title' ;
	public final void title_tag() throws RecognitionException {
		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:84:2: ( 'title' ( '[' )? ( STR | tag )* 'end_title' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:85:3: 'title' ( '[' )? ( STR | tag )* 'end_title'
			{
			match(input,54,FOLLOW_54_in_title_tag337); 
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:85:11: ( '[' )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==11) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:85:12: '['
					{
					match(input,11,FOLLOW_11_in_title_tag340); 
					}
					break;

			}

			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:87:3: ( STR | tag )*
			loop11:
			while (true) {
				int alt11=3;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==STR) ) {
					alt11=1;
				}
				else if ( (LA11_0==14||LA11_0==31||(LA11_0 >= 36 && LA11_0 <= 37)||(LA11_0 >= 39 && LA11_0 <= 41)||LA11_0==43||(LA11_0 >= 47 && LA11_0 <= 49)||LA11_0==56) ) {
					alt11=2;
				}

				switch (alt11) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:87:4: STR
					{
					match(input,STR,FOLLOW_STR_in_title_tag351); 
					}
					break;
				case 2 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:90:3: tag
					{
					pushFollow(FOLLOW_tag_in_title_tag364);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop11;
				}
			}

			match(input,28,FOLLOW_28_in_title_tag372); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "title_tag"



	// $ANTLR start "image_tag"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:95:1: image_tag : 'image' '(' source ( image_atribute )* ')' ;
	public final void image_tag() throws RecognitionException {
		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:96:2: ( 'image' '(' source ( image_atribute )* ')' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:98:3: 'image' '(' source ( image_atribute )* ')'
			{
			match(input,36,FOLLOW_36_in_image_tag394); 
			match(input,9,FOLLOW_9_in_image_tag396); 
			pushFollow(FOLLOW_source_in_image_tag398);
			source();
			state._fsp--;

			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:98:23: ( image_atribute )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==12||LA12_0==33||LA12_0==57) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:98:24: image_atribute
					{
					pushFollow(FOLLOW_image_atribute_in_image_tag402);
					image_atribute();
					state._fsp--;

					}
					break;

				default :
					break loop12;
				}
			}

			match(input,10,FOLLOW_10_in_image_tag406); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "image_tag"



	// $ANTLR start "font_tag"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:102:1: font_tag : 'font' '(' ( font_atribute )* ')' ( STR | tag )* 'end_font' ;
	public final void font_tag() throws RecognitionException {
		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:103:2: ( 'font' '(' ( font_atribute )* ')' ( STR | tag )* 'end_font' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:105:3: 'font' '(' ( font_atribute )* ')' ( STR | tag )* 'end_font'
			{
			match(input,31,FOLLOW_31_in_font_tag429); 
			match(input,9,FOLLOW_9_in_font_tag431); 
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:105:13: ( font_atribute )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==17||LA13_0==30||LA13_0==51) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:105:14: font_atribute
					{
					pushFollow(FOLLOW_font_atribute_in_font_tag433);
					font_atribute();
					state._fsp--;

					}
					break;

				default :
					break loop13;
				}
			}

			match(input,10,FOLLOW_10_in_font_tag437); 
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:107:3: ( STR | tag )*
			loop14:
			while (true) {
				int alt14=3;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==STR) ) {
					alt14=1;
				}
				else if ( (LA14_0==14||LA14_0==31||(LA14_0 >= 36 && LA14_0 <= 37)||(LA14_0 >= 39 && LA14_0 <= 41)||LA14_0==43||(LA14_0 >= 47 && LA14_0 <= 49)||LA14_0==56) ) {
					alt14=2;
				}

				switch (alt14) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:107:4: STR
					{
					match(input,STR,FOLLOW_STR_in_font_tag445); 
					}
					break;
				case 2 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:110:4: tag
					{
					pushFollow(FOLLOW_tag_in_font_tag459);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop14;
				}
			}

			match(input,20,FOLLOW_20_in_font_tag467); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "font_tag"



	// $ANTLR start "link_tag"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:115:1: link_tag : 'link' '(' link_atribute ')' ( STR | tag )* 'end_link' ;
	public final void link_tag() throws RecognitionException {
		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:116:2: ( 'link' '(' link_atribute ')' ( STR | tag )* 'end_link' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:117:3: 'link' '(' link_atribute ')' ( STR | tag )* 'end_link'
			{
			match(input,43,FOLLOW_43_in_link_tag487); 
			match(input,9,FOLLOW_9_in_link_tag489); 
			pushFollow(FOLLOW_link_atribute_in_link_tag491);
			link_atribute();
			state._fsp--;

			match(input,10,FOLLOW_10_in_link_tag493); 
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:119:3: ( STR | tag )*
			loop15:
			while (true) {
				int alt15=3;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==STR) ) {
					alt15=1;
				}
				else if ( (LA15_0==14||LA15_0==31||(LA15_0 >= 36 && LA15_0 <= 37)||(LA15_0 >= 39 && LA15_0 <= 41)||LA15_0==43||(LA15_0 >= 47 && LA15_0 <= 49)||LA15_0==56) ) {
					alt15=2;
				}

				switch (alt15) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:119:4: STR
					{
					match(input,STR,FOLLOW_STR_in_link_tag503); 
					}
					break;
				case 2 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:122:4: tag
					{
					pushFollow(FOLLOW_tag_in_link_tag517);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop15;
				}
			}

			match(input,25,FOLLOW_25_in_link_tag526); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "link_tag"



	// $ANTLR start "bold_tag"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:128:1: bold_tag : 'bold' '[' ( STR | tag )* 'end_bold' ;
	public final void bold_tag() throws RecognitionException {
		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:129:2: ( 'bold' '[' ( STR | tag )* 'end_bold' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:130:3: 'bold' '[' ( STR | tag )* 'end_bold'
			{
			match(input,14,FOLLOW_14_in_bold_tag547); 
			match(input,11,FOLLOW_11_in_bold_tag549); 
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:132:3: ( STR | tag )*
			loop16:
			while (true) {
				int alt16=3;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==STR) ) {
					alt16=1;
				}
				else if ( (LA16_0==14||LA16_0==31||(LA16_0 >= 36 && LA16_0 <= 37)||(LA16_0 >= 39 && LA16_0 <= 41)||LA16_0==43||(LA16_0 >= 47 && LA16_0 <= 49)||LA16_0==56) ) {
					alt16=2;
				}

				switch (alt16) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:133:3: STR
					{
					match(input,STR,FOLLOW_STR_in_bold_tag559); 
					}
					break;
				case 2 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:135:5: tag
					{
					pushFollow(FOLLOW_tag_in_bold_tag568);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop16;
				}
			}

			match(input,19,FOLLOW_19_in_bold_tag574); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "bold_tag"



	// $ANTLR start "italic_tag"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:140:1: italic_tag : 'italic' '[' ( STR | tag )* 'end_italic' ;
	public final void italic_tag() throws RecognitionException {
		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:141:2: ( 'italic' '[' ( STR | tag )* 'end_italic' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:142:3: 'italic' '[' ( STR | tag )* 'end_italic'
			{
			match(input,37,FOLLOW_37_in_italic_tag591); 
			match(input,11,FOLLOW_11_in_italic_tag593); 
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:144:3: ( STR | tag )*
			loop17:
			while (true) {
				int alt17=3;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==STR) ) {
					alt17=1;
				}
				else if ( (LA17_0==14||LA17_0==31||(LA17_0 >= 36 && LA17_0 <= 37)||(LA17_0 >= 39 && LA17_0 <= 41)||LA17_0==43||(LA17_0 >= 47 && LA17_0 <= 49)||LA17_0==56) ) {
					alt17=2;
				}

				switch (alt17) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:145:3: STR
					{
					match(input,STR,FOLLOW_STR_in_italic_tag605); 
					}
					break;
				case 2 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:147:5: tag
					{
					pushFollow(FOLLOW_tag_in_italic_tag614);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop17;
				}
			}

			match(input,22,FOLLOW_22_in_italic_tag620); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "italic_tag"



	// $ANTLR start "u_line_tag"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:152:1: u_line_tag : 'u_line' '[' ( STR | tag )* 'end_u_line' ;
	public final void u_line_tag() throws RecognitionException {
		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:153:2: ( 'u_line' '[' ( STR | tag )* 'end_u_line' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:154:3: 'u_line' '[' ( STR | tag )* 'end_u_line'
			{
			match(input,56,FOLLOW_56_in_u_line_tag638); 
			match(input,11,FOLLOW_11_in_u_line_tag640); 
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:156:3: ( STR | tag )*
			loop18:
			while (true) {
				int alt18=3;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==STR) ) {
					alt18=1;
				}
				else if ( (LA18_0==14||LA18_0==31||(LA18_0 >= 36 && LA18_0 <= 37)||(LA18_0 >= 39 && LA18_0 <= 41)||LA18_0==43||(LA18_0 >= 47 && LA18_0 <= 49)||LA18_0==56) ) {
					alt18=2;
				}

				switch (alt18) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:157:3: STR
					{
					match(input,STR,FOLLOW_STR_in_u_line_tag652); 
					}
					break;
				case 2 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:159:5: tag
					{
					pushFollow(FOLLOW_tag_in_u_line_tag661);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop18;
				}
			}

			match(input,29,FOLLOW_29_in_u_line_tag667); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "u_line_tag"



	// $ANTLR start "font_atribute"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:164:1: font_atribute : ( 'color' '(' STR ')' | 'face' '(' STR ')' | 'size' '(' DIGITS ')' );
	public final void font_atribute() throws RecognitionException {
		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:165:2: ( 'color' '(' STR ')' | 'face' '(' STR ')' | 'size' '(' DIGITS ')' )
			int alt19=3;
			switch ( input.LA(1) ) {
			case 17:
				{
				alt19=1;
				}
				break;
			case 30:
				{
				alt19=2;
				}
				break;
			case 51:
				{
				alt19=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:165:4: 'color' '(' STR ')'
					{
					match(input,17,FOLLOW_17_in_font_atribute685); 
					match(input,9,FOLLOW_9_in_font_atribute687); 
					match(input,STR,FOLLOW_STR_in_font_atribute689); 
					match(input,10,FOLLOW_10_in_font_atribute691); 
					}
					break;
				case 2 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:167:4: 'face' '(' STR ')'
					{
					match(input,30,FOLLOW_30_in_font_atribute702); 
					match(input,9,FOLLOW_9_in_font_atribute704); 
					match(input,STR,FOLLOW_STR_in_font_atribute706); 
					match(input,10,FOLLOW_10_in_font_atribute708); 
					}
					break;
				case 3 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:169:4: 'size' '(' DIGITS ')'
					{
					match(input,51,FOLLOW_51_in_font_atribute716); 
					match(input,9,FOLLOW_9_in_font_atribute718); 
					match(input,DIGITS,FOLLOW_DIGITS_in_font_atribute720); 
					match(input,10,FOLLOW_10_in_font_atribute722); 
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
	}
	// $ANTLR end "font_atribute"



	// $ANTLR start "text_atribute"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:172:1: text_atribute : 'align' '(' ( 'left' | 'right' | 'center' | 'justify' ) ')' ;
	public final void text_atribute() throws RecognitionException {
		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:173:2: ( 'align' '(' ( 'left' | 'right' | 'center' | 'justify' ) ')' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:174:3: 'align' '(' ( 'left' | 'right' | 'center' | 'justify' ) ')'
			{
			match(input,12,FOLLOW_12_in_text_atribute738); 
			match(input,9,FOLLOW_9_in_text_atribute743); 
			if ( input.LA(1)==16||input.LA(1)==38||input.LA(1)==42||input.LA(1)==50 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,10,FOLLOW_10_in_text_atribute808); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "text_atribute"



	// $ANTLR start "image_atribute"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:188:1: image_atribute : ( 'align' '(' ( 'top' | 'bottom' | 'left' | 'right' | 'middle' ) ')' | 'height' '(' DIGITS ')' | 'width' '(' DIGITS ')' );
	public final void image_atribute() throws RecognitionException {
		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:189:2: ( 'align' '(' ( 'top' | 'bottom' | 'left' | 'right' | 'middle' ) ')' | 'height' '(' DIGITS ')' | 'width' '(' DIGITS ')' )
			int alt20=3;
			switch ( input.LA(1) ) {
			case 12:
				{
				alt20=1;
				}
				break;
			case 33:
				{
				alt20=2;
				}
				break;
			case 57:
				{
				alt20=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:190:3: 'align' '(' ( 'top' | 'bottom' | 'left' | 'right' | 'middle' ) ')'
					{
					match(input,12,FOLLOW_12_in_image_atribute822); 
					match(input,9,FOLLOW_9_in_image_atribute829); 
					if ( input.LA(1)==15||input.LA(1)==42||input.LA(1)==45||input.LA(1)==50||input.LA(1)==55 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,10,FOLLOW_10_in_image_atribute924); 
					}
					break;
				case 2 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:204:4: 'height' '(' DIGITS ')'
					{
					match(input,33,FOLLOW_33_in_image_atribute929); 
					match(input,9,FOLLOW_9_in_image_atribute931); 
					match(input,DIGITS,FOLLOW_DIGITS_in_image_atribute933); 
					match(input,10,FOLLOW_10_in_image_atribute935); 
					}
					break;
				case 3 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:205:4: 'width' '(' DIGITS ')'
					{
					match(input,57,FOLLOW_57_in_image_atribute941); 
					match(input,9,FOLLOW_9_in_image_atribute943); 
					match(input,DIGITS,FOLLOW_DIGITS_in_image_atribute945); 
					match(input,10,FOLLOW_10_in_image_atribute947); 
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
	}
	// $ANTLR end "image_atribute"



	// $ANTLR start "source"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:208:1: source : 'source' '(' STR ')' ;
	public final void source() throws RecognitionException {
		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:209:2: ( 'source' '(' STR ')' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:210:3: 'source' '(' STR ')'
			{
			match(input,52,FOLLOW_52_in_source966); 
			match(input,9,FOLLOW_9_in_source968); 
			match(input,STR,FOLLOW_STR_in_source970); 
			match(input,10,FOLLOW_10_in_source972); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "source"



	// $ANTLR start "link_atribute"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:214:1: link_atribute : 'href' '(' STR ')' ;
	public final void link_atribute() throws RecognitionException {
		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:215:2: ( 'href' '(' STR ')' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:216:3: 'href' '(' STR ')'
			{
			match(input,34,FOLLOW_34_in_link_atribute989); 
			match(input,9,FOLLOW_9_in_link_atribute991); 
			match(input,STR,FOLLOW_STR_in_link_atribute993); 
			match(input,10,FOLLOW_10_in_link_atribute995); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "link_atribute"



	// $ANTLR start "relation_tag"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:221:1: relation_tag : 'relation' '(' relation_atribute ')' ;
	public final void relation_tag() throws RecognitionException {
		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:222:2: ( 'relation' '(' relation_atribute ')' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:223:3: 'relation' '(' relation_atribute ')'
			{
			match(input,49,FOLLOW_49_in_relation_tag1017); 
			match(input,9,FOLLOW_9_in_relation_tag1019); 
			pushFollow(FOLLOW_relation_atribute_in_relation_tag1021);
			relation_atribute();
			state._fsp--;

			match(input,10,FOLLOW_10_in_relation_tag1023); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relation_tag"



	// $ANTLR start "relation_atribute"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:226:1: relation_atribute : 'source' '(' source1= STR ')' 'target' '(' target= STR ')' 'name' '(' name= STR ')' ;
	public final void relation_atribute() throws RecognitionException {
		Token source1=null;
		Token target=null;
		Token name=null;

		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:227:2: ( 'source' '(' source1= STR ')' 'target' '(' target= STR ')' 'name' '(' name= STR ')' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:228:3: 'source' '(' source1= STR ')' 'target' '(' target= STR ')' 'name' '(' name= STR ')'
			{
			match(input,52,FOLLOW_52_in_relation_atribute1042); 
			match(input,9,FOLLOW_9_in_relation_atribute1044); 
			source1=(Token)match(input,STR,FOLLOW_STR_in_relation_atribute1050); 
			match(input,10,FOLLOW_10_in_relation_atribute1052); 
			match(input,53,FOLLOW_53_in_relation_atribute1056); 
			match(input,9,FOLLOW_9_in_relation_atribute1058); 
			target=(Token)match(input,STR,FOLLOW_STR_in_relation_atribute1064); 
			match(input,10,FOLLOW_10_in_relation_atribute1066); 
			match(input,46,FOLLOW_46_in_relation_atribute1070); 
			match(input,9,FOLLOW_9_in_relation_atribute1072); 
			name=(Token)match(input,STR,FOLLOW_STR_in_relation_atribute1078); 
			match(input,10,FOLLOW_10_in_relation_atribute1080); 

						TempEdge edge = new TempEdge( (source1!=null?source1.getText():null), (target!=null?target.getText():null), (name!=null?name.getText():null));
						edges.add(edge);
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relation_atribute"



	// $ANTLR start "key_Subject"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:237:1: key_Subject : 'key_subject' '(' subject_atribute ')' ( STR | tag )* 'end_key_subject' ;
	public final void key_Subject() throws RecognitionException {
		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:238:2: ( 'key_subject' '(' subject_atribute ')' ( STR | tag )* 'end_key_subject' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:239:3: 'key_subject' '(' subject_atribute ')' ( STR | tag )* 'end_key_subject'
			{
			match(input,40,FOLLOW_40_in_key_Subject1097); 
			match(input,9,FOLLOW_9_in_key_Subject1099); 
			pushFollow(FOLLOW_subject_atribute_in_key_Subject1101);
			subject_atribute();
			state._fsp--;

			match(input,10,FOLLOW_10_in_key_Subject1103); 
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:240:3: ( STR | tag )*
			loop21:
			while (true) {
				int alt21=3;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==STR) ) {
					alt21=1;
				}
				else if ( (LA21_0==14||LA21_0==31||(LA21_0 >= 36 && LA21_0 <= 37)||(LA21_0 >= 39 && LA21_0 <= 41)||LA21_0==43||(LA21_0 >= 47 && LA21_0 <= 49)||LA21_0==56) ) {
					alt21=2;
				}

				switch (alt21) {
				case 1 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:240:4: STR
					{
					match(input,STR,FOLLOW_STR_in_key_Subject1108); 
					}
					break;
				case 2 :
					// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:241:5: tag
					{
					pushFollow(FOLLOW_tag_in_key_Subject1114);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop21;
				}
			}

			match(input,23,FOLLOW_23_in_key_Subject1123); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "key_Subject"



	// $ANTLR start "subject_atribute"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:246:1: subject_atribute : 'id' '(' id= STR ')' ;
	public final void subject_atribute() throws RecognitionException {
		Token id=null;

		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:247:2: ( 'id' '(' id= STR ')' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:248:3: 'id' '(' id= STR ')'
			{
			match(input,35,FOLLOW_35_in_subject_atribute1136); 
			match(input,9,FOLLOW_9_in_subject_atribute1138); 
			id=(Token)match(input,STR,FOLLOW_STR_in_subject_atribute1144); 
			match(input,10,FOLLOW_10_in_subject_atribute1146); 

						KeyNode subject = new KeySubject((id!=null?id.getText():null));
						SearchGraph.addVertexToSearchGraph(subject);
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "subject_atribute"



	// $ANTLR start "key_Text"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:254:1: key_Text : 'key_text' '(' 'id' '(' id= STR ')' ')' txt= STR 'end_key_text' ;
	public final void key_Text() throws RecognitionException {
		Token id=null;
		Token txt=null;

		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:255:2: ( 'key_text' '(' 'id' '(' id= STR ')' ')' txt= STR 'end_key_text' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:256:3: 'key_text' '(' 'id' '(' id= STR ')' ')' txt= STR 'end_key_text'
			{
			match(input,41,FOLLOW_41_in_key_Text1163); 
			match(input,9,FOLLOW_9_in_key_Text1165); 
			match(input,35,FOLLOW_35_in_key_Text1167); 
			match(input,9,FOLLOW_9_in_key_Text1169); 
			id=(Token)match(input,STR,FOLLOW_STR_in_key_Text1175); 
			match(input,10,FOLLOW_10_in_key_Text1177); 
			match(input,10,FOLLOW_10_in_key_Text1179); 
			txt=(Token)match(input,STR,FOLLOW_STR_in_key_Text1189); 

						KeyNode text = new KeyText((id!=null?id.getText():null), (txt!=null?txt.getText():null));
						SearchGraph.addVertexToSearchGraph(text);
					
			match(input,24,FOLLOW_24_in_key_Text1198); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "key_Text"



	// $ANTLR start "key_Image"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:265:1: key_Image : 'key_image' '(' key_image_atribute ')' ;
	public final void key_Image() throws RecognitionException {
		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:266:2: ( 'key_image' '(' key_image_atribute ')' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:267:3: 'key_image' '(' key_image_atribute ')'
			{
			match(input,39,FOLLOW_39_in_key_Image1211); 
			match(input,9,FOLLOW_9_in_key_Image1213); 
			pushFollow(FOLLOW_key_image_atribute_in_key_Image1215);
			key_image_atribute();
			state._fsp--;

			match(input,10,FOLLOW_10_in_key_Image1217); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "key_Image"



	// $ANTLR start "key_image_atribute"
	// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:270:1: key_image_atribute : 'id' '(' id= STR ')' 'source' '(' source1= STR ')' ;
	public final void key_image_atribute() throws RecognitionException {
		Token id=null;
		Token source1=null;

		try {
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:271:2: ( 'id' '(' id= STR ')' 'source' '(' source1= STR ')' )
			// /Users/morpheby/Documents/workspace/volynets-HTML-antlr/src/hello/SearchParser.g:272:3: 'id' '(' id= STR ')' 'source' '(' source1= STR ')'
			{
			match(input,35,FOLLOW_35_in_key_image_atribute1233); 
			match(input,9,FOLLOW_9_in_key_image_atribute1235); 
			id=(Token)match(input,STR,FOLLOW_STR_in_key_image_atribute1241); 
			match(input,10,FOLLOW_10_in_key_image_atribute1243); 
			match(input,52,FOLLOW_52_in_key_image_atribute1247); 
			match(input,9,FOLLOW_9_in_key_image_atribute1249); 
			source1=(Token)match(input,STR,FOLLOW_STR_in_key_image_atribute1255); 
			match(input,10,FOLLOW_10_in_key_image_atribute1257); 
					
						KeyImage image = new KeyImage( (id!=null?id.getText():null), (source1!=null?source1.getText():null));
						SearchGraph.addVertexToSearchGraph(image);		
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "key_image_atribute"

	// Delegated rules



	public static final BitSet FOLLOW_main_tag_in_page50 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_main_tag70 = new BitSet(new long[]{0x0000000100000800L});
	public static final BitSet FOLLOW_11_in_main_tag73 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_head_tag_in_main_tag83 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_body_tag_in_main_tag93 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_main_tag100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_head_tag113 = new BitSet(new long[]{0x01438BB080204800L});
	public static final BitSet FOLLOW_11_in_head_tag116 = new BitSet(new long[]{0x01438BB080204000L});
	public static final BitSet FOLLOW_title_tag_in_head_tag127 = new BitSet(new long[]{0x01438BB080204000L});
	public static final BitSet FOLLOW_tag_in_head_tag131 = new BitSet(new long[]{0x01438BB080204000L});
	public static final BitSet FOLLOW_21_in_head_tag138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_body_tag152 = new BitSet(new long[]{0x01038BB080044840L});
	public static final BitSet FOLLOW_11_in_body_tag155 = new BitSet(new long[]{0x01038BB080044040L});
	public static final BitSet FOLLOW_STR_in_body_tag165 = new BitSet(new long[]{0x01038BB080044040L});
	public static final BitSet FOLLOW_tag_in_body_tag172 = new BitSet(new long[]{0x01038BB080044040L});
	public static final BitSet FOLLOW_18_in_body_tag181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paragraph_in_tag195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_new_line_tag_in_tag200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_font_tag_in_tag205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bold_tag_in_tag210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_italic_tag_in_tag215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_u_line_tag_in_tag220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_image_tag_in_tag225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_link_tag_in_tag230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_key_Subject_in_tag235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_key_Text_in_tag240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_key_Image_in_tag245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relation_tag_in_tag250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_paragraph268 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_paragraph270 = new BitSet(new long[]{0x0000000000001400L});
	public static final BitSet FOLLOW_text_atribute_in_paragraph272 = new BitSet(new long[]{0x0000000000001400L});
	public static final BitSet FOLLOW_10_in_paragraph275 = new BitSet(new long[]{0x01038BB088004040L});
	public static final BitSet FOLLOW_STR_in_paragraph283 = new BitSet(new long[]{0x01038BB088004040L});
	public static final BitSet FOLLOW_tag_in_paragraph294 = new BitSet(new long[]{0x01038BB088004040L});
	public static final BitSet FOLLOW_27_in_paragraph300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_new_line_tag315 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_new_line_tag318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_title_tag337 = new BitSet(new long[]{0x01038BB090004840L});
	public static final BitSet FOLLOW_11_in_title_tag340 = new BitSet(new long[]{0x01038BB090004040L});
	public static final BitSet FOLLOW_STR_in_title_tag351 = new BitSet(new long[]{0x01038BB090004040L});
	public static final BitSet FOLLOW_tag_in_title_tag364 = new BitSet(new long[]{0x01038BB090004040L});
	public static final BitSet FOLLOW_28_in_title_tag372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_image_tag394 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_image_tag396 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_source_in_image_tag398 = new BitSet(new long[]{0x0200000200001400L});
	public static final BitSet FOLLOW_image_atribute_in_image_tag402 = new BitSet(new long[]{0x0200000200001400L});
	public static final BitSet FOLLOW_10_in_image_tag406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_font_tag429 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_font_tag431 = new BitSet(new long[]{0x0008000040020400L});
	public static final BitSet FOLLOW_font_atribute_in_font_tag433 = new BitSet(new long[]{0x0008000040020400L});
	public static final BitSet FOLLOW_10_in_font_tag437 = new BitSet(new long[]{0x01038BB080104040L});
	public static final BitSet FOLLOW_STR_in_font_tag445 = new BitSet(new long[]{0x01038BB080104040L});
	public static final BitSet FOLLOW_tag_in_font_tag459 = new BitSet(new long[]{0x01038BB080104040L});
	public static final BitSet FOLLOW_20_in_font_tag467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_link_tag487 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_link_tag489 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_link_atribute_in_link_tag491 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_link_tag493 = new BitSet(new long[]{0x01038BB082004040L});
	public static final BitSet FOLLOW_STR_in_link_tag503 = new BitSet(new long[]{0x01038BB082004040L});
	public static final BitSet FOLLOW_tag_in_link_tag517 = new BitSet(new long[]{0x01038BB082004040L});
	public static final BitSet FOLLOW_25_in_link_tag526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_bold_tag547 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_bold_tag549 = new BitSet(new long[]{0x01038BB080084040L});
	public static final BitSet FOLLOW_STR_in_bold_tag559 = new BitSet(new long[]{0x01038BB080084040L});
	public static final BitSet FOLLOW_tag_in_bold_tag568 = new BitSet(new long[]{0x01038BB080084040L});
	public static final BitSet FOLLOW_19_in_bold_tag574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_italic_tag591 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_italic_tag593 = new BitSet(new long[]{0x01038BB080404040L});
	public static final BitSet FOLLOW_STR_in_italic_tag605 = new BitSet(new long[]{0x01038BB080404040L});
	public static final BitSet FOLLOW_tag_in_italic_tag614 = new BitSet(new long[]{0x01038BB080404040L});
	public static final BitSet FOLLOW_22_in_italic_tag620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_u_line_tag638 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_u_line_tag640 = new BitSet(new long[]{0x01038BB0A0004040L});
	public static final BitSet FOLLOW_STR_in_u_line_tag652 = new BitSet(new long[]{0x01038BB0A0004040L});
	public static final BitSet FOLLOW_tag_in_u_line_tag661 = new BitSet(new long[]{0x01038BB0A0004040L});
	public static final BitSet FOLLOW_29_in_u_line_tag667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_font_atribute685 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_font_atribute687 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_font_atribute689 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_font_atribute691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_font_atribute702 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_font_atribute704 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_font_atribute706 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_font_atribute708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_font_atribute716 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_font_atribute718 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_DIGITS_in_font_atribute720 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_font_atribute722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_text_atribute738 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_text_atribute743 = new BitSet(new long[]{0x0004044000010000L});
	public static final BitSet FOLLOW_set_in_text_atribute748 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_text_atribute808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_image_atribute822 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_image_atribute829 = new BitSet(new long[]{0x0084240000008000L});
	public static final BitSet FOLLOW_set_in_image_atribute837 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_image_atribute924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_image_atribute929 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_image_atribute931 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_DIGITS_in_image_atribute933 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_image_atribute935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_image_atribute941 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_image_atribute943 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_DIGITS_in_image_atribute945 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_image_atribute947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_source966 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_source968 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_source970 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_source972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_link_atribute989 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_link_atribute991 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_link_atribute993 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_link_atribute995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_relation_tag1017 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_relation_tag1019 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_relation_atribute_in_relation_tag1021 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_relation_tag1023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_relation_atribute1042 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_relation_atribute1044 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_relation_atribute1050 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_relation_atribute1052 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_relation_atribute1056 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_relation_atribute1058 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_relation_atribute1064 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_relation_atribute1066 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_relation_atribute1070 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_relation_atribute1072 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_relation_atribute1078 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_relation_atribute1080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_key_Subject1097 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_key_Subject1099 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_subject_atribute_in_key_Subject1101 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_key_Subject1103 = new BitSet(new long[]{0x01038BB080804040L});
	public static final BitSet FOLLOW_STR_in_key_Subject1108 = new BitSet(new long[]{0x01038BB080804040L});
	public static final BitSet FOLLOW_tag_in_key_Subject1114 = new BitSet(new long[]{0x01038BB080804040L});
	public static final BitSet FOLLOW_23_in_key_Subject1123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_subject_atribute1136 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_subject_atribute1138 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_subject_atribute1144 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_subject_atribute1146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_key_Text1163 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_key_Text1165 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_key_Text1167 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_key_Text1169 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_key_Text1175 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_key_Text1177 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_key_Text1179 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_key_Text1189 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_key_Text1198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_key_Image1211 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_key_Image1213 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_key_image_atribute_in_key_Image1215 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_key_Image1217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_key_image_atribute1233 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_key_image_atribute1235 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_key_image_atribute1241 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_key_image_atribute1243 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_key_image_atribute1247 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_key_image_atribute1249 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_key_image_atribute1255 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_key_image_atribute1257 = new BitSet(new long[]{0x0000000000000002L});
}
