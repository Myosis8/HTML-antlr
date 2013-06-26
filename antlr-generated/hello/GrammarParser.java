// $ANTLR 3.5 D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g 2013-06-03 22:23:11

  package hello;  
  import java.lang.StringBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIGITS", "LETTER", "STR", "STRING", 
		"WS", "'('", "'()'", "')'", "'align'", "'body'", "'bold'", "'bottom'", 
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


	public GrammarParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public GrammarParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return GrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g"; }


	  ParserBuilder builder = new ParserBuilder();



	// $ANTLR start "page"
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:21:1: page returns [StringBuilder result] : res= main_tag ;
	public final StringBuilder page() throws RecognitionException {
		StringBuilder result = null;


		StringBuilder res =null;

		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:22:2: (res= main_tag )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:22:4: res= main_tag
			{
			pushFollow(FOLLOW_main_tag_in_page55);
			res=main_tag();
			state._fsp--;

			result = res;
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
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:27:1: main_tag returns [StringBuilder result] : 'main' ( '()' )? head_tag body_tag 'end_main' ;
	public final StringBuilder main_tag() throws RecognitionException {
		StringBuilder result = null;


		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:28:2: ( 'main' ( '()' )? head_tag body_tag 'end_main' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:28:4: 'main' ( '()' )? head_tag body_tag 'end_main'
			{
			match(input,44,FOLLOW_44_in_main_tag79); 
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:28:11: ( '()' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==10) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:28:12: '()'
					{
					match(input,10,FOLLOW_10_in_main_tag82); 
					}
					break;

			}

				
						builder.append("<html>");
						builder.levelUp();
					
			pushFollow(FOLLOW_head_tag_in_main_tag95);
			head_tag();
			state._fsp--;

			pushFollow(FOLLOW_body_tag_in_main_tag105);
			body_tag();
			state._fsp--;

			match(input,26,FOLLOW_26_in_main_tag112); 

				 		builder.append("</html>");
				 		result = builder.getBuilder();
				 	
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
	// $ANTLR end "main_tag"



	// $ANTLR start "head_tag"
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:41:1: head_tag : 'head' ( '()' )? ( title_tag | tag )* 'end_head' ;
	public final void head_tag() throws RecognitionException {
		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:42:2: ( 'head' ( '()' )? ( title_tag | tag )* 'end_head' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:42:4: 'head' ( '()' )? ( title_tag | tag )* 'end_head'
			{
			match(input,32,FOLLOW_32_in_head_tag127); 
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:42:11: ( '()' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==10) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:42:12: '()'
					{
					match(input,10,FOLLOW_10_in_head_tag130); 
					}
					break;

			}


				  		builder.append("<head>");
				  		//builder.levelUp();
				  	
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:47:5: ( title_tag | tag )*
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
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:47:6: title_tag
					{
					pushFollow(FOLLOW_title_tag_in_head_tag143);
					title_tag();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:47:18: tag
					{
					pushFollow(FOLLOW_tag_in_head_tag147);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop3;
				}
			}

			match(input,21,FOLLOW_21_in_head_tag154); 

				 		builder.append("</head>");
				 	
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
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:53:1: body_tag : 'body' ( '()' )? ( STR | tag )* 'end_body' ;
	public final void body_tag() throws RecognitionException {
		Token STR1=null;

		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:54:2: ( 'body' ( '()' )? ( STR | tag )* 'end_body' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:54:4: 'body' ( '()' )? ( STR | tag )* 'end_body'
			{
			match(input,13,FOLLOW_13_in_body_tag170); 
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:54:11: ( '()' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==10) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:54:12: '()'
					{
					match(input,10,FOLLOW_10_in_body_tag173); 
					}
					break;

			}


						builder.append("<body>");
						//builder.levelUp();
					
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:59:4: ( STR | tag )*
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
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:59:5: STR
					{
					STR1=(Token)match(input,STR,FOLLOW_STR_in_body_tag185); 
					builder.append((STR1!=null?STR1.getText():null));
					}
					break;
				case 2 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:60:5: tag
					{
					pushFollow(FOLLOW_tag_in_body_tag193);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			match(input,18,FOLLOW_18_in_body_tag202); 

				 		builder.append("</body>");
				 		builder.levelDown();
				 	
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
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:67:1: tag : ( paragraph | new_line_tag | font_tag | bold_tag | italic_tag | u_line_tag | image_tag | link_tag | key_Subject | key_Text | key_Image | relation_tag );
	public final void tag() throws RecognitionException {
		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:68:2: ( paragraph | new_line_tag | font_tag | bold_tag | italic_tag | u_line_tag | image_tag | link_tag | key_Subject | key_Text | key_Image | relation_tag )
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
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:68:4: paragraph
					{
					pushFollow(FOLLOW_paragraph_in_tag218);
					paragraph();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:69:4: new_line_tag
					{
					pushFollow(FOLLOW_new_line_tag_in_tag223);
					new_line_tag();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:70:4: font_tag
					{
					pushFollow(FOLLOW_font_tag_in_tag228);
					font_tag();
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:71:4: bold_tag
					{
					pushFollow(FOLLOW_bold_tag_in_tag233);
					bold_tag();
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:72:4: italic_tag
					{
					pushFollow(FOLLOW_italic_tag_in_tag238);
					italic_tag();
					state._fsp--;

					}
					break;
				case 6 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:73:4: u_line_tag
					{
					pushFollow(FOLLOW_u_line_tag_in_tag243);
					u_line_tag();
					state._fsp--;

					}
					break;
				case 7 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:74:4: image_tag
					{
					pushFollow(FOLLOW_image_tag_in_tag248);
					image_tag();
					state._fsp--;

					}
					break;
				case 8 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:75:4: link_tag
					{
					pushFollow(FOLLOW_link_tag_in_tag253);
					link_tag();
					state._fsp--;

					}
					break;
				case 9 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:76:4: key_Subject
					{
					pushFollow(FOLLOW_key_Subject_in_tag258);
					key_Subject();
					state._fsp--;

					}
					break;
				case 10 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:77:4: key_Text
					{
					pushFollow(FOLLOW_key_Text_in_tag263);
					key_Text();
					state._fsp--;

					}
					break;
				case 11 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:78:4: key_Image
					{
					pushFollow(FOLLOW_key_Image_in_tag268);
					key_Image();
					state._fsp--;

					}
					break;
				case 12 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:79:4: relation_tag
					{
					pushFollow(FOLLOW_relation_tag_in_tag273);
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
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:83:1: paragraph : 'paragraph' '(' ( text_atribute )* ')' ( STR | tag )* 'end_paragraph' ;
	public final void paragraph() throws RecognitionException {
		Token STR2=null;

		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:84:2: ( 'paragraph' '(' ( text_atribute )* ')' ( STR | tag )* 'end_paragraph' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:85:3: 'paragraph' '(' ( text_atribute )* ')' ( STR | tag )* 'end_paragraph'
			{

						builder.levelUp();
						builder.appendT("<p");
					
			match(input,48,FOLLOW_48_in_paragraph295); 
			match(input,9,FOLLOW_9_in_paragraph297); 
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:89:18: ( text_atribute )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==12) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:89:19: text_atribute
					{
					pushFollow(FOLLOW_text_atribute_in_paragraph299);
					text_atribute();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			match(input,11,FOLLOW_11_in_paragraph302); 

						builder.appendN(">");
					
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:93:3: ( STR | tag )*
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
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:93:4: STR
					{
					STR2=(Token)match(input,STR,FOLLOW_STR_in_paragraph311); 
					builder.append((STR2!=null?STR2.getText():null));
					}
					break;
				case 2 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:95:3: tag
					{
					pushFollow(FOLLOW_tag_in_paragraph324);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop8;
				}
			}

			match(input,27,FOLLOW_27_in_paragraph330); 

						builder.append("</p>");
						builder.levelDown();
					
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
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:103:1: new_line_tag : 'new_line' ( '()' )? ;
	public final void new_line_tag() throws RecognitionException {
		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:104:2: ( 'new_line' ( '()' )? )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:104:4: 'new_line' ( '()' )?
			{
			match(input,47,FOLLOW_47_in_new_line_tag346); 
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:104:15: ( '()' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==10) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:104:16: '()'
					{
					match(input,10,FOLLOW_10_in_new_line_tag349); 
					}
					break;

			}


						builder.levelUp();	
						builder.append("<br>");
						builder.levelDown();
					
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
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:111:1: title_tag : 'title' ( '()' )? ( STR | tag )* 'end_title' ;
	public final void title_tag() throws RecognitionException {
		Token STR3=null;

		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:112:2: ( 'title' ( '()' )? ( STR | tag )* 'end_title' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:112:4: 'title' ( '()' )? ( STR | tag )* 'end_title'
			{
				builder.levelUp();
			match(input,54,FOLLOW_54_in_title_tag370); 
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:113:11: ( '()' )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==10) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:113:12: '()'
					{
					match(input,10,FOLLOW_10_in_title_tag373); 
					}
					break;

			}

				builder.append("<title>");
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:115:3: ( STR | tag )*
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
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:115:4: STR
					{
					STR3=(Token)match(input,STR,FOLLOW_STR_in_title_tag387); 

								builder.levelUp();
								builder.append((STR3!=null?STR3.getText():null));
								builder.levelDown();	
							
					}
					break;
				case 2 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:122:3: tag
					{
					pushFollow(FOLLOW_tag_in_title_tag401);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop11;
				}
			}

			match(input,28,FOLLOW_28_in_title_tag409); 

						 builder.append("</title>");
						 builder.levelDown();	
					
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
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:130:1: image_tag : 'image' '(' source_atribute ( image_atribute )* ')' ;
	public final void image_tag() throws RecognitionException {
		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:131:2: ( 'image' '(' source_atribute ( image_atribute )* ')' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:132:3: 'image' '(' source_atribute ( image_atribute )* ')'
			{

						builder.levelUp();
						builder.appendT("<img");			
					
			match(input,36,FOLLOW_36_in_image_tag435); 
			match(input,9,FOLLOW_9_in_image_tag437); 
			pushFollow(FOLLOW_source_atribute_in_image_tag439);
			source_atribute();
			state._fsp--;

			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:136:32: ( image_atribute )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==12||LA12_0==33||LA12_0==57) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:136:33: image_atribute
					{
					pushFollow(FOLLOW_image_atribute_in_image_tag443);
					image_atribute();
					state._fsp--;

					}
					break;

				default :
					break loop12;
				}
			}

			match(input,11,FOLLOW_11_in_image_tag447); 
				
						builder.appendN(">");
						builder.levelDown();			
					
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
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:143:1: font_tag : 'font' '(' ( font_atribute )* ')' ( STR | tag )* 'end_font' ;
	public final void font_tag() throws RecognitionException {
		Token STR4=null;

		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:144:2: ( 'font' '(' ( font_atribute )* ')' ( STR | tag )* 'end_font' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:145:3: 'font' '(' ( font_atribute )* ')' ( STR | tag )* 'end_font'
			{

						builder.levelUp();
						builder.appendT("<font ");			
					
			match(input,31,FOLLOW_31_in_font_tag473); 
			match(input,9,FOLLOW_9_in_font_tag475); 
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:149:13: ( font_atribute )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==17||LA13_0==30||LA13_0==51) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:149:14: font_atribute
					{
					pushFollow(FOLLOW_font_atribute_in_font_tag477);
					font_atribute();
					state._fsp--;

					}
					break;

				default :
					break loop13;
				}
			}

			match(input,11,FOLLOW_11_in_font_tag481); 
				
						builder.appendN(">");
					
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:153:3: ( STR | tag )*
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
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:153:4: STR
					{
					STR4=(Token)match(input,STR,FOLLOW_STR_in_font_tag490); 
						
								builder.levelUp();
								builder.append((STR4!=null?STR4.getText():null));
								builder.levelDown();
							
					}
					break;
				case 2 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:160:4: tag
					{
					pushFollow(FOLLOW_tag_in_font_tag505);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop14;
				}
			}

			match(input,20,FOLLOW_20_in_font_tag513); 

						builder.append("</font>");
						builder.levelDown();
					
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
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:168:1: link_tag : 'link' '(' link_atribute ')' ( STR | tag )* 'end_link' ;
	public final void link_tag() throws RecognitionException {
		Token STR5=null;

		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:169:2: ( 'link' '(' link_atribute ')' ( STR | tag )* 'end_link' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:169:4: 'link' '(' link_atribute ')' ( STR | tag )* 'end_link'
			{

						builder.levelUp();
						builder.appendT("<a");			
					
			match(input,43,FOLLOW_43_in_link_tag535); 
			match(input,9,FOLLOW_9_in_link_tag537); 
			pushFollow(FOLLOW_link_atribute_in_link_tag539);
			link_atribute();
			state._fsp--;

			match(input,11,FOLLOW_11_in_link_tag541); 
				
						builder.appendN(">");
					
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:177:3: ( STR | tag )*
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
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:177:4: STR
					{
					STR5=(Token)match(input,STR,FOLLOW_STR_in_link_tag552); 
						
								builder.levelUp();
								builder.append((STR5!=null?STR5.getText():null));
								builder.levelDown();
							
					}
					break;
				case 2 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:184:4: tag
					{
					pushFollow(FOLLOW_tag_in_link_tag567);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop15;
				}
			}

			match(input,25,FOLLOW_25_in_link_tag576); 

						builder.append("</a>");
						builder.levelDown();
					
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
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:193:1: bold_tag : 'bold' '()' ( STR | tag )* 'end_bold' ;
	public final void bold_tag() throws RecognitionException {
		Token STR6=null;

		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:194:2: ( 'bold' '()' ( STR | tag )* 'end_bold' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:195:3: 'bold' '()' ( STR | tag )* 'end_bold'
			{
			match(input,14,FOLLOW_14_in_bold_tag599); 
			match(input,10,FOLLOW_10_in_bold_tag601); 

						builder.levelUp();
						builder.append("<b>");			
					
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:200:3: ( STR | tag )*
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
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:201:3: STR
					{
					STR6=(Token)match(input,STR,FOLLOW_STR_in_bold_tag614); 
						
								builder.levelUp();
								builder.append((STR6!=null?STR6.getText():null));
								builder.levelDown();
							
					}
					break;
				case 2 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:207:5: tag
					{
					pushFollow(FOLLOW_tag_in_bold_tag624);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop16;
				}
			}

			match(input,19,FOLLOW_19_in_bold_tag630); 
						
						builder.append("</b>");
						builder.levelDown();			
					
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
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:215:1: italic_tag : 'italic' '()' ( STR | tag )* 'end_italic' ;
	public final void italic_tag() throws RecognitionException {
		Token STR7=null;

		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:216:2: ( 'italic' '()' ( STR | tag )* 'end_italic' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:217:3: 'italic' '()' ( STR | tag )* 'end_italic'
			{
			match(input,37,FOLLOW_37_in_italic_tag649); 
			match(input,10,FOLLOW_10_in_italic_tag651); 

						builder.levelUp();
						builder.append("<i>");			
					
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:222:3: ( STR | tag )*
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
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:223:3: STR
					{
					STR7=(Token)match(input,STR,FOLLOW_STR_in_italic_tag664); 
						
								builder.levelUp();
								builder.append((STR7!=null?STR7.getText():null));
								builder.levelDown();
							
					}
					break;
				case 2 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:229:5: tag
					{
					pushFollow(FOLLOW_tag_in_italic_tag674);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop17;
				}
			}

			match(input,22,FOLLOW_22_in_italic_tag680); 
						
						builder.append("</i>");
						builder.levelDown();			
					
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
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:237:1: u_line_tag : 'u_line' '()' ( STR | tag )* 'end_u_line' ;
	public final void u_line_tag() throws RecognitionException {
		Token STR8=null;

		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:238:2: ( 'u_line' '()' ( STR | tag )* 'end_u_line' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:239:3: 'u_line' '()' ( STR | tag )* 'end_u_line'
			{
			match(input,56,FOLLOW_56_in_u_line_tag700); 
			match(input,10,FOLLOW_10_in_u_line_tag702); 

						builder.levelUp();
						builder.append("<u>");			
					
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:244:3: ( STR | tag )*
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
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:245:3: STR
					{
					STR8=(Token)match(input,STR,FOLLOW_STR_in_u_line_tag715); 
						
								builder.levelUp();
								builder.append((STR8!=null?STR8.getText():null));
								builder.levelDown();
							
					}
					break;
				case 2 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:251:5: tag
					{
					pushFollow(FOLLOW_tag_in_u_line_tag725);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop18;
				}
			}

			match(input,29,FOLLOW_29_in_u_line_tag731); 
						
						builder.append("</u>");
						builder.levelDown();			
					
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
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:259:1: font_atribute : ( 'color' '(' STR ')' | 'face' '(' STR ')' | 'size' '(' DIGITS ')' );
	public final void font_atribute() throws RecognitionException {
		Token STR9=null;
		Token STR10=null;
		Token DIGITS11=null;

		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:260:2: ( 'color' '(' STR ')' | 'face' '(' STR ')' | 'size' '(' DIGITS ')' )
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
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:260:4: 'color' '(' STR ')'
					{
					match(input,17,FOLLOW_17_in_font_atribute751); 
					match(input,9,FOLLOW_9_in_font_atribute753); 
					STR9=(Token)match(input,STR,FOLLOW_STR_in_font_atribute755); 
					match(input,11,FOLLOW_11_in_font_atribute757); 
						
								builder.appendPlain(" color=");
							 	builder.appendPlain("\"" + (STR9!=null?STR9.getText():null) + "\"");
							
					}
					break;
				case 2 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:265:4: 'face' '(' STR ')'
					{
					match(input,30,FOLLOW_30_in_font_atribute769); 
					match(input,9,FOLLOW_9_in_font_atribute771); 
					STR10=(Token)match(input,STR,FOLLOW_STR_in_font_atribute773); 
					match(input,11,FOLLOW_11_in_font_atribute775); 
						
								builder.appendPlain(" face=");
							 	builder.appendPlain("\"" + (STR10!=null?STR10.getText():null) + "\"");
							
					}
					break;
				case 3 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:270:4: 'size' '(' DIGITS ')'
					{
					match(input,51,FOLLOW_51_in_font_atribute785); 
					match(input,9,FOLLOW_9_in_font_atribute787); 
					DIGITS11=(Token)match(input,DIGITS,FOLLOW_DIGITS_in_font_atribute789); 
					match(input,11,FOLLOW_11_in_font_atribute791); 
						builder.appendPlain(" size=");
							 	builder.appendPlain("\"" + (DIGITS11!=null?DIGITS11.getText():null) + "\"");
							
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
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:275:1: text_atribute : 'align' '(' ( 'left' | 'right' | 'center' | 'justify' ) ')' ;
	public final void text_atribute() throws RecognitionException {
		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:276:2: ( 'align' '(' ( 'left' | 'right' | 'center' | 'justify' ) ')' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:277:3: 'align' '(' ( 'left' | 'right' | 'center' | 'justify' ) ')'
			{
			match(input,12,FOLLOW_12_in_text_atribute808); 
			builder.appendPlain(" align=");
			match(input,9,FOLLOW_9_in_text_atribute814); 
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:279:4: ( 'left' | 'right' | 'center' | 'justify' )
			int alt20=4;
			switch ( input.LA(1) ) {
			case 42:
				{
				alt20=1;
				}
				break;
			case 50:
				{
				alt20=2;
				}
				break;
			case 16:
				{
				alt20=3;
				}
				break;
			case 38:
				{
				alt20=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:280:5: 'left'
					{
					match(input,42,FOLLOW_42_in_text_atribute826); 
						builder.appendPlain("\"left\"");
					}
					break;
				case 2 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:282:6: 'right'
					{
					match(input,50,FOLLOW_50_in_text_atribute839); 
						builder.appendPlain("\"right\"");
					}
					break;
				case 3 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:284:6: 'center'
					{
					match(input,16,FOLLOW_16_in_text_atribute852); 
						builder.appendPlain("\"center\"");
					}
					break;
				case 4 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:286:6: 'justify'
					{
					match(input,38,FOLLOW_38_in_text_atribute865); 
						builder.appendPlain("\"justify\"");
					}
					break;

			}

			match(input,11,FOLLOW_11_in_text_atribute883); 
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
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:291:1: image_atribute : ( 'align' '(' ( 'top' | 'bottom' | 'left' | 'right' | 'middle' ) ')' | 'height' '(' DIGITS ')' | 'width' '(' DIGITS ')' );
	public final void image_atribute() throws RecognitionException {
		Token DIGITS12=null;
		Token DIGITS13=null;

		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:292:2: ( 'align' '(' ( 'top' | 'bottom' | 'left' | 'right' | 'middle' ) ')' | 'height' '(' DIGITS ')' | 'width' '(' DIGITS ')' )
			int alt22=3;
			switch ( input.LA(1) ) {
			case 12:
				{
				alt22=1;
				}
				break;
			case 33:
				{
				alt22=2;
				}
				break;
			case 57:
				{
				alt22=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:293:3: 'align' '(' ( 'top' | 'bottom' | 'left' | 'right' | 'middle' ) ')'
					{
					match(input,12,FOLLOW_12_in_image_atribute897); 
					builder.appendPlain(" align=");
					match(input,9,FOLLOW_9_in_image_atribute904); 
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:295:6: ( 'top' | 'bottom' | 'left' | 'right' | 'middle' )
					int alt21=5;
					switch ( input.LA(1) ) {
					case 55:
						{
						alt21=1;
						}
						break;
					case 15:
						{
						alt21=2;
						}
						break;
					case 42:
						{
						alt21=3;
						}
						break;
					case 50:
						{
						alt21=4;
						}
						break;
					case 45:
						{
						alt21=5;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 21, 0, input);
						throw nvae;
					}
					switch (alt21) {
						case 1 :
							// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:295:7: 'top'
							{
							match(input,55,FOLLOW_55_in_image_atribute913); 
								builder.appendPlain("\"top\"");
							}
							break;
						case 2 :
							// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:297:8: 'bottom'
							{
							match(input,15,FOLLOW_15_in_image_atribute930); 
								builder.appendPlain("\"" + "bottom" + "\"");
							}
							break;
						case 3 :
							// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:299:8: 'left'
							{
							match(input,42,FOLLOW_42_in_image_atribute947); 
								builder.appendPlain("\"" + "left" + "\"");
							}
							break;
						case 4 :
							// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:301:8: 'right'
							{
							match(input,50,FOLLOW_50_in_image_atribute965); 
								builder.appendPlain("\"" + "right" + "\"");
							}
							break;
						case 5 :
							// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:303:8: 'middle'
							{
							match(input,45,FOLLOW_45_in_image_atribute983); 
								builder.appendPlain("\"" + "middle" + "\"");
							}
							break;

					}

					match(input,11,FOLLOW_11_in_image_atribute1004); 
					}
					break;
				case 2 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:307:4: 'height' '(' DIGITS ')'
					{
					match(input,33,FOLLOW_33_in_image_atribute1009); 
					match(input,9,FOLLOW_9_in_image_atribute1011); 
					DIGITS12=(Token)match(input,DIGITS,FOLLOW_DIGITS_in_image_atribute1013); 
					match(input,11,FOLLOW_11_in_image_atribute1015); 
						builder.appendPlain(" height=" + "\"" + (DIGITS12!=null?DIGITS12.getText():null) + "\"");
					}
					break;
				case 3 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:308:4: 'width' '(' DIGITS ')'
					{
					match(input,57,FOLLOW_57_in_image_atribute1023); 
					match(input,9,FOLLOW_9_in_image_atribute1025); 
					DIGITS13=(Token)match(input,DIGITS,FOLLOW_DIGITS_in_image_atribute1027); 
					match(input,11,FOLLOW_11_in_image_atribute1029); 
						builder.appendPlain(" width=" + "\"" + (DIGITS13!=null?DIGITS13.getText():null) + "\"");
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



	// $ANTLR start "source_atribute"
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:311:1: source_atribute : 'source' '(' STR ')' ;
	public final void source_atribute() throws RecognitionException {
		Token STR14=null;

		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:312:2: ( 'source' '(' STR ')' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:313:3: 'source' '(' STR ')'
			{
			match(input,52,FOLLOW_52_in_source_atribute1049); 
			match(input,9,FOLLOW_9_in_source_atribute1051); 
			STR14=(Token)match(input,STR,FOLLOW_STR_in_source_atribute1053); 
			match(input,11,FOLLOW_11_in_source_atribute1055); 
				
						builder.appendPlain(" src=");
					 	builder.appendPlain("\"" + (STR14!=null?STR14.getText():null) + "\"");
					
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
	// $ANTLR end "source_atribute"



	// $ANTLR start "link_atribute"
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:320:1: link_atribute : 'href' '(' STR ')' ;
	public final void link_atribute() throws RecognitionException {
		Token STR15=null;

		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:321:2: ( 'href' '(' STR ')' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:322:3: 'href' '(' STR ')'
			{
			match(input,34,FOLLOW_34_in_link_atribute1073); 
			match(input,9,FOLLOW_9_in_link_atribute1075); 
			STR15=(Token)match(input,STR,FOLLOW_STR_in_link_atribute1077); 
			match(input,11,FOLLOW_11_in_link_atribute1079); 
				
						builder.appendPlain(" href=");
						builder.appendPlain("\"" + (STR15!=null?STR15.getText():null) + "\"");
					
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
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:332:1: relation_tag : 'relation' '(' relation_atribute ')' ;
	public final void relation_tag() throws RecognitionException {
		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:333:2: ( 'relation' '(' relation_atribute ')' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:334:3: 'relation' '(' relation_atribute ')'
			{
			match(input,49,FOLLOW_49_in_relation_tag1108); 
			match(input,9,FOLLOW_9_in_relation_tag1110); 
			pushFollow(FOLLOW_relation_atribute_in_relation_tag1112);
			relation_atribute();
			state._fsp--;

			match(input,11,FOLLOW_11_in_relation_tag1114); 
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
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:336:1: relation_atribute : 'source' '(' sources= STR ')' 'target' '(' target= STR ')' 'name' '(' name= STR ')' ;
	public final void relation_atribute() throws RecognitionException {
		Token sources=null;
		Token target=null;
		Token name=null;

		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:337:2: ( 'source' '(' sources= STR ')' 'target' '(' target= STR ')' 'name' '(' name= STR ')' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:338:3: 'source' '(' sources= STR ')' 'target' '(' target= STR ')' 'name' '(' name= STR ')'
			{
			match(input,52,FOLLOW_52_in_relation_atribute1131); 
			match(input,9,FOLLOW_9_in_relation_atribute1133); 
			sources=(Token)match(input,STR,FOLLOW_STR_in_relation_atribute1139); 
			match(input,11,FOLLOW_11_in_relation_atribute1141); 
			match(input,53,FOLLOW_53_in_relation_atribute1146); 
			match(input,9,FOLLOW_9_in_relation_atribute1148); 
			target=(Token)match(input,STR,FOLLOW_STR_in_relation_atribute1154); 
			match(input,11,FOLLOW_11_in_relation_atribute1156); 
			match(input,46,FOLLOW_46_in_relation_atribute1160); 
			match(input,9,FOLLOW_9_in_relation_atribute1162); 
			name=(Token)match(input,STR,FOLLOW_STR_in_relation_atribute1168); 
			match(input,11,FOLLOW_11_in_relation_atribute1170); 
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
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:343:1: key_Subject : 'key_subject' '(' subject_atribute ')' ( STR | tag )* 'end_key_subject' ;
	public final void key_Subject() throws RecognitionException {
		Token STR16=null;

		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:344:2: ( 'key_subject' '(' subject_atribute ')' ( STR | tag )* 'end_key_subject' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:345:3: 'key_subject' '(' subject_atribute ')' ( STR | tag )* 'end_key_subject'
			{
			match(input,40,FOLLOW_40_in_key_Subject1186); 
			match(input,9,FOLLOW_9_in_key_Subject1188); 
			pushFollow(FOLLOW_subject_atribute_in_key_Subject1190);
			subject_atribute();
			state._fsp--;

			match(input,11,FOLLOW_11_in_key_Subject1192); 
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:346:3: ( STR | tag )*
			loop23:
			while (true) {
				int alt23=3;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==STR) ) {
					alt23=1;
				}
				else if ( (LA23_0==14||LA23_0==31||(LA23_0 >= 36 && LA23_0 <= 37)||(LA23_0 >= 39 && LA23_0 <= 41)||LA23_0==43||(LA23_0 >= 47 && LA23_0 <= 49)||LA23_0==56) ) {
					alt23=2;
				}

				switch (alt23) {
				case 1 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:346:4: STR
					{
					STR16=(Token)match(input,STR,FOLLOW_STR_in_key_Subject1197); 
						builder.append((STR16!=null?STR16.getText():null));
					}
					break;
				case 2 :
					// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:347:5: tag
					{
					pushFollow(FOLLOW_tag_in_key_Subject1205);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			match(input,23,FOLLOW_23_in_key_Subject1214); 
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
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:352:1: subject_atribute : 'id' '(' id= STR ')' ;
	public final void subject_atribute() throws RecognitionException {
		Token id=null;

		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:353:2: ( 'id' '(' id= STR ')' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:354:3: 'id' '(' id= STR ')'
			{
			match(input,35,FOLLOW_35_in_subject_atribute1227); 
			match(input,9,FOLLOW_9_in_subject_atribute1229); 
			id=(Token)match(input,STR,FOLLOW_STR_in_subject_atribute1235); 
			match(input,11,FOLLOW_11_in_subject_atribute1237); 
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
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:357:1: key_Text : 'key_text' '(' 'id' '(' id= STR ')' ')' txt= STR 'end_key_text' ;
	public final void key_Text() throws RecognitionException {
		Token id=null;
		Token txt=null;

		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:358:2: ( 'key_text' '(' 'id' '(' id= STR ')' ')' txt= STR 'end_key_text' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:359:3: 'key_text' '(' 'id' '(' id= STR ')' ')' txt= STR 'end_key_text'
			{
			match(input,41,FOLLOW_41_in_key_Text1253); 
			match(input,9,FOLLOW_9_in_key_Text1255); 
			match(input,35,FOLLOW_35_in_key_Text1257); 
			match(input,9,FOLLOW_9_in_key_Text1259); 
			id=(Token)match(input,STR,FOLLOW_STR_in_key_Text1265); 
			match(input,11,FOLLOW_11_in_key_Text1267); 
			match(input,11,FOLLOW_11_in_key_Text1269); 
			txt=(Token)match(input,STR,FOLLOW_STR_in_key_Text1280); 
				builder.append((txt!=null?txt.getText():null));
			match(input,24,FOLLOW_24_in_key_Text1287); 
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
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:364:1: key_Image : 'key_image' '(' key_image_atribute ')' ;
	public final void key_Image() throws RecognitionException {
		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:365:2: ( 'key_image' '(' key_image_atribute ')' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:366:3: 'key_image' '(' key_image_atribute ')'
			{

						builder.levelUp();
						builder.appendT("<img");			
					
			match(input,39,FOLLOW_39_in_key_Image1305); 
			match(input,9,FOLLOW_9_in_key_Image1307); 
			pushFollow(FOLLOW_key_image_atribute_in_key_Image1309);
			key_image_atribute();
			state._fsp--;

			match(input,11,FOLLOW_11_in_key_Image1311); 
				
						builder.appendN(">");
						builder.levelDown();			
					
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
	// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:377:1: key_image_atribute : 'id' '(' id= STR ')' 'source' '(' source= STR ')' ;
	public final void key_image_atribute() throws RecognitionException {
		Token id=null;
		Token source=null;

		try {
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:378:2: ( 'id' '(' id= STR ')' 'source' '(' source= STR ')' )
			// D:\\my documents\\University\\workspace\\HTML-antlr\\src\\hello\\Grammar.g:379:3: 'id' '(' id= STR ')' 'source' '(' source= STR ')'
			{
			match(input,35,FOLLOW_35_in_key_image_atribute1331); 
			match(input,9,FOLLOW_9_in_key_image_atribute1333); 
			id=(Token)match(input,STR,FOLLOW_STR_in_key_image_atribute1339); 
			match(input,11,FOLLOW_11_in_key_image_atribute1341); 
			match(input,52,FOLLOW_52_in_key_image_atribute1345); 
			match(input,9,FOLLOW_9_in_key_image_atribute1347); 
			source=(Token)match(input,STR,FOLLOW_STR_in_key_image_atribute1353); 
			match(input,11,FOLLOW_11_in_key_image_atribute1355); 
				
						builder.appendPlain(" src=");
					 	builder.appendPlain("\"" + (source!=null?source.getText():null) + "\"");
					
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



	public static final BitSet FOLLOW_main_tag_in_page55 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_main_tag79 = new BitSet(new long[]{0x0000000100000400L});
	public static final BitSet FOLLOW_10_in_main_tag82 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_head_tag_in_main_tag95 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_body_tag_in_main_tag105 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_main_tag112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_head_tag127 = new BitSet(new long[]{0x01438BB080204400L});
	public static final BitSet FOLLOW_10_in_head_tag130 = new BitSet(new long[]{0x01438BB080204000L});
	public static final BitSet FOLLOW_title_tag_in_head_tag143 = new BitSet(new long[]{0x01438BB080204000L});
	public static final BitSet FOLLOW_tag_in_head_tag147 = new BitSet(new long[]{0x01438BB080204000L});
	public static final BitSet FOLLOW_21_in_head_tag154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_body_tag170 = new BitSet(new long[]{0x01038BB080044440L});
	public static final BitSet FOLLOW_10_in_body_tag173 = new BitSet(new long[]{0x01038BB080044040L});
	public static final BitSet FOLLOW_STR_in_body_tag185 = new BitSet(new long[]{0x01038BB080044040L});
	public static final BitSet FOLLOW_tag_in_body_tag193 = new BitSet(new long[]{0x01038BB080044040L});
	public static final BitSet FOLLOW_18_in_body_tag202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paragraph_in_tag218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_new_line_tag_in_tag223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_font_tag_in_tag228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bold_tag_in_tag233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_italic_tag_in_tag238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_u_line_tag_in_tag243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_image_tag_in_tag248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_link_tag_in_tag253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_key_Subject_in_tag258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_key_Text_in_tag263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_key_Image_in_tag268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relation_tag_in_tag273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_paragraph295 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_paragraph297 = new BitSet(new long[]{0x0000000000001800L});
	public static final BitSet FOLLOW_text_atribute_in_paragraph299 = new BitSet(new long[]{0x0000000000001800L});
	public static final BitSet FOLLOW_11_in_paragraph302 = new BitSet(new long[]{0x01038BB088004040L});
	public static final BitSet FOLLOW_STR_in_paragraph311 = new BitSet(new long[]{0x01038BB088004040L});
	public static final BitSet FOLLOW_tag_in_paragraph324 = new BitSet(new long[]{0x01038BB088004040L});
	public static final BitSet FOLLOW_27_in_paragraph330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_new_line_tag346 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_new_line_tag349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_title_tag370 = new BitSet(new long[]{0x01038BB090004440L});
	public static final BitSet FOLLOW_10_in_title_tag373 = new BitSet(new long[]{0x01038BB090004040L});
	public static final BitSet FOLLOW_STR_in_title_tag387 = new BitSet(new long[]{0x01038BB090004040L});
	public static final BitSet FOLLOW_tag_in_title_tag401 = new BitSet(new long[]{0x01038BB090004040L});
	public static final BitSet FOLLOW_28_in_title_tag409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_image_tag435 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_image_tag437 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_source_atribute_in_image_tag439 = new BitSet(new long[]{0x0200000200001800L});
	public static final BitSet FOLLOW_image_atribute_in_image_tag443 = new BitSet(new long[]{0x0200000200001800L});
	public static final BitSet FOLLOW_11_in_image_tag447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_font_tag473 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_font_tag475 = new BitSet(new long[]{0x0008000040020800L});
	public static final BitSet FOLLOW_font_atribute_in_font_tag477 = new BitSet(new long[]{0x0008000040020800L});
	public static final BitSet FOLLOW_11_in_font_tag481 = new BitSet(new long[]{0x01038BB080104040L});
	public static final BitSet FOLLOW_STR_in_font_tag490 = new BitSet(new long[]{0x01038BB080104040L});
	public static final BitSet FOLLOW_tag_in_font_tag505 = new BitSet(new long[]{0x01038BB080104040L});
	public static final BitSet FOLLOW_20_in_font_tag513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_link_tag535 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_link_tag537 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_link_atribute_in_link_tag539 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_link_tag541 = new BitSet(new long[]{0x01038BB082004040L});
	public static final BitSet FOLLOW_STR_in_link_tag552 = new BitSet(new long[]{0x01038BB082004040L});
	public static final BitSet FOLLOW_tag_in_link_tag567 = new BitSet(new long[]{0x01038BB082004040L});
	public static final BitSet FOLLOW_25_in_link_tag576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_bold_tag599 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_bold_tag601 = new BitSet(new long[]{0x01038BB080084040L});
	public static final BitSet FOLLOW_STR_in_bold_tag614 = new BitSet(new long[]{0x01038BB080084040L});
	public static final BitSet FOLLOW_tag_in_bold_tag624 = new BitSet(new long[]{0x01038BB080084040L});
	public static final BitSet FOLLOW_19_in_bold_tag630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_italic_tag649 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_italic_tag651 = new BitSet(new long[]{0x01038BB080404040L});
	public static final BitSet FOLLOW_STR_in_italic_tag664 = new BitSet(new long[]{0x01038BB080404040L});
	public static final BitSet FOLLOW_tag_in_italic_tag674 = new BitSet(new long[]{0x01038BB080404040L});
	public static final BitSet FOLLOW_22_in_italic_tag680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_u_line_tag700 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_u_line_tag702 = new BitSet(new long[]{0x01038BB0A0004040L});
	public static final BitSet FOLLOW_STR_in_u_line_tag715 = new BitSet(new long[]{0x01038BB0A0004040L});
	public static final BitSet FOLLOW_tag_in_u_line_tag725 = new BitSet(new long[]{0x01038BB0A0004040L});
	public static final BitSet FOLLOW_29_in_u_line_tag731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_font_atribute751 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_font_atribute753 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_font_atribute755 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_font_atribute757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_font_atribute769 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_font_atribute771 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_font_atribute773 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_font_atribute775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_font_atribute785 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_font_atribute787 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_DIGITS_in_font_atribute789 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_font_atribute791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_text_atribute808 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_text_atribute814 = new BitSet(new long[]{0x0004044000010000L});
	public static final BitSet FOLLOW_42_in_text_atribute826 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_50_in_text_atribute839 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_16_in_text_atribute852 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_38_in_text_atribute865 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_text_atribute883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_image_atribute897 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_image_atribute904 = new BitSet(new long[]{0x0084240000008000L});
	public static final BitSet FOLLOW_55_in_image_atribute913 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_15_in_image_atribute930 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_42_in_image_atribute947 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_50_in_image_atribute965 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_45_in_image_atribute983 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_image_atribute1004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_image_atribute1009 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_image_atribute1011 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_DIGITS_in_image_atribute1013 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_image_atribute1015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_image_atribute1023 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_image_atribute1025 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_DIGITS_in_image_atribute1027 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_image_atribute1029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_source_atribute1049 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_source_atribute1051 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_source_atribute1053 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_source_atribute1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_link_atribute1073 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_link_atribute1075 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_link_atribute1077 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_link_atribute1079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_relation_tag1108 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_relation_tag1110 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_relation_atribute_in_relation_tag1112 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_relation_tag1114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_relation_atribute1131 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_relation_atribute1133 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_relation_atribute1139 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_relation_atribute1141 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_relation_atribute1146 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_relation_atribute1148 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_relation_atribute1154 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_relation_atribute1156 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_relation_atribute1160 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_relation_atribute1162 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_relation_atribute1168 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_relation_atribute1170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_key_Subject1186 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_key_Subject1188 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_subject_atribute_in_key_Subject1190 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_key_Subject1192 = new BitSet(new long[]{0x01038BB080804040L});
	public static final BitSet FOLLOW_STR_in_key_Subject1197 = new BitSet(new long[]{0x01038BB080804040L});
	public static final BitSet FOLLOW_tag_in_key_Subject1205 = new BitSet(new long[]{0x01038BB080804040L});
	public static final BitSet FOLLOW_23_in_key_Subject1214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_subject_atribute1227 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_subject_atribute1229 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_subject_atribute1235 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_subject_atribute1237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_key_Text1253 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_key_Text1255 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_key_Text1257 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_key_Text1259 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_key_Text1265 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_key_Text1267 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_key_Text1269 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_key_Text1280 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_key_Text1287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_key_Image1305 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_key_Image1307 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_key_image_atribute_in_key_Image1309 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_key_Image1311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_key_image_atribute1331 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_key_image_atribute1333 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_key_image_atribute1339 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_key_image_atribute1341 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_key_image_atribute1345 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_key_image_atribute1347 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STR_in_key_image_atribute1353 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_key_image_atribute1355 = new BitSet(new long[]{0x0000000000000002L});
}
