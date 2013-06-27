
grammar Grammar;

options {
  language = Java;
}

@header {
  package hello;  
  import java.lang.StringBuilder;
}
@lexer::header {
  package hello;
}

@members {
  ParserBuilder builder = new ParserBuilder();
}


page returns [StringBuilder result]
	:	res = main_tag	 {$result = res;}		  
	;



main_tag returns [StringBuilder result]
	:	'main' ('[')?	
		{	
			builder.append("<html>");
			builder.levelUp();
		}
	  	head_tag	  	
	  	body_tag  
	 	'end_main'
	 	{
	 		builder.append("</html>");
	 		result = builder.getBuilder();
	 	}
	;
head_tag
	:	'head' ('[')?
		{
	  		builder.append(
	  		  "<head>" +
	  		  "<meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\">" 
	  		);
	  		//builder.levelUp();
	  	}
	 	 (title_tag | tag)*
	 	'end_head'
	 	{
	 		builder.append("</head>");
	 	}
	;	
body_tag
	:	'body' ('[')?
		{
			builder.append("<body>");
			//builder.levelUp();
		}
	 	(STR	{builder.append($STR.text);}
	 	|tag)* 	
	 	'end_body'
	 	{
	 		builder.append("</body>");
	 		builder.levelDown();
	 	}
	;	
tag
	:	paragraph
	|	new_line_tag
	|	font_tag
	|	bold_tag
	|	italic_tag
	|	u_line_tag
	|	image_tag
	|	link_tag
	|	key_Subject
	|	key_Text
	|	key_Image
	|	relation_tag
	
	
	;	
paragraph
	:	
		{
			builder.levelUp();
			builder.appendT("<p");
		}
		'paragraph' '('(text_atribute)*')'
		{
			builder.appendN(">");
		}
		(STR 	{builder.append($STR.text);} 
		| 
		tag)*
		'end_paragraph'
		{
			builder.append("</p>");
			builder.levelDown();
		}	
	;

new_line_tag
	:	'new_line' ('[')?
		{
			builder.levelUp();	
			builder.append("<br>");
			builder.levelDown();
		}
	;	
title_tag
	:	{	builder.levelUp();}
		'title' ('[')?	
		{	builder.append("<title>");}		
		(STR 
		{
			builder.levelUp();
			builder.append($STR.text);
			builder.levelDown();	
		}
		| 
		tag)*		
		'end_title'
		{
			 builder.append("</title>");
			 builder.levelDown();	
		}			
	;	

image_tag
	:
		{
			builder.levelUp();
			builder.appendT("<img");			
		}	
		'image' '(' source_atribute  (image_atribute)* ')'
		{	
			builder.appendN(">");
			builder.levelDown();			
		}
	;

font_tag		
	:	
		{
			builder.levelUp();
			builder.appendT("<font ");			
		}		
		'font' '('(font_atribute)* ')'
		{	
			builder.appendN(">");
		}
		(STR 
		{	
			builder.levelUp();
			builder.append($STR.text);
			builder.levelDown();
		}
		| 
		 tag)*		
		'end_font'
		{
			builder.append("</font>");
			builder.levelDown();
		}
	;
	
link_tag
	:	{
			builder.levelUp();
			builder.appendT("<a");			
		}		
		'link' '(' link_atribute ')'		
		{	
			builder.appendN(">");
		}
		(STR 
		{	
			builder.levelUp();
			builder.append($STR.text);
			builder.levelDown();
		}
		| 
		 tag)*			
		'end_link'
		{
			builder.append("</a>");
			builder.levelDown();
		}	
		
	;	
	
bold_tag
	:
		'bold' '['
		{
			builder.levelUp();
			builder.append("<b>");			
		}	
		(
		STR
		{	
			builder.levelUp();
			builder.append($STR.text);
			builder.levelDown();
		}
		| tag)*
		'end_bold'
		{			
			builder.append("</b>");
			builder.levelDown();			
		}	
	;	

italic_tag
	:
		'italic' '['
		{
			builder.levelUp();
			builder.append("<i>");			
		}	
		(
		STR
		{	
			builder.levelUp();
			builder.append($STR.text);
			builder.levelDown();
		}
		| tag)*
		'end_italic'
		{			
			builder.append("</i>");
			builder.levelDown();			
		}	
	;	
	
u_line_tag
	:
		'u_line' '['
		{
			builder.levelUp();
			builder.append("<u>");			
		}	
		(
		STR
		{	
			builder.levelUp();
			builder.append($STR.text);
			builder.levelDown();
		}
		| tag)*
		'end_u_line'
		{			
			builder.append("</u>");
			builder.levelDown();			
		}	
	;		
		
font_atribute
	:	'color' '(' STR ')'	
		{	
			builder.appendPlain(" color=");
		 	builder.appendPlain("\"" + $STR.text + "\"");
		}	 
	|	'face' '(' STR ')'
		{	
			builder.appendPlain(" face=");
		 	builder.appendPlain("\"" + $STR.text + "\"");
		}	
	|	'size' '(' DIGITS ')'
		{	builder.appendPlain(" size=");
		 	builder.appendPlain("\"" + $DIGITS.text + "\"");
		}	
	;
text_atribute
	:
		'align' {builder.appendPlain(" align=");}
		'('
			(	
				'left'
				{	builder.appendPlain("\"left\"");}
			|	'right'
				{	builder.appendPlain("\"right\"");}
			|	'center'
				{	builder.appendPlain("\"center\"");}
			|	'justify'
				{	builder.appendPlain("\"justify\"");}			
			)
		')'
	;		
image_atribute
	:
		'align' {builder.appendPlain(" align=");}// '(' ('top'	{builder.appendPlain("top");} ) | 'bottom' {builder.appendPlain("\"" + "bottom" + "\"");} ')'	
			'(' 
			 	('top'		
				{	builder.appendPlain("\"top\"");}
			 |  'bottom'	
			 	{	builder.appendPlain("\"" + "bottom" + "\"");}
			 |  'left'		
			 	{	builder.appendPlain("\"" + "left" + "\"");}
			 |  'right'		
			 	{	builder.appendPlain("\"" + "right" + "\"");}
			 |  'middle'	
			 	{	builder.appendPlain("\"" + "middle" + "\"");}
			 	)
		 	')'
	|	'height' '(' DIGITS ')'	{	builder.appendPlain(" height=" + "\"" + $DIGITS.text + "\"");}	
	|	'width' '(' DIGITS ')'	{	builder.appendPlain(" width=" + "\"" + $DIGITS.text + "\"");} 		
	;	
	
source_atribute
	:
		'source' '(' STR ')'
		{	
			builder.appendPlain(" src=");
		 	builder.appendPlain("\"" + $STR.text + "\"");
		}
	;
	
link_atribute
	:
		'href'	'(' STR ')'			
		{	
			builder.appendPlain(" href=");
			builder.appendPlain("\"" + $STR.text + "\"");
		}
	;
	
				
//-------------------------------------------------------------------

relation_tag
	: 
		'relation' '(' relation_atribute ')'	  		
	;
relation_atribute
	:
		'source' '(' sources = STR ')' 
		'target' '(' target = STR ')'
		'name' '(' name = STR ')'		
	;
	
key_Subject
	:
		'key_subject' '(' subject_atribute ')'
		(STR	{	builder.append($STR.text);}
		| tag)*
		
		'end_key_subject'
	;

subject_atribute
	:
		'id' '(' id = STR ')'
		
	;	
key_Text
	:
		'key_text' '(' 'id' '(' id = STR ')' ')'		
		 txt = STR 	{	builder.append($txt.text);}
		'end_key_text'
	;

key_Image
	:
		{
			builder.levelUp();
			builder.appendT("<img");			
		}	
		'key_image' '(' key_image_atribute ')'	
		{	
			builder.appendN(">");
			builder.levelDown();			
		}	
	;
	
key_image_atribute
	:
		'id' '(' id = STR ')'
		'source' '(' source = STR ')'	
		{	
			builder.appendPlain(" src=");
		 	builder.appendPlain("\"" + $source.text + "\"");
		}
		
	;	

//-------------------------------------------------------------------
DIGITS : ('0'..'9')+ ;  	 
LETTER : 'a'..'z' | 'A'..'Z' ;
STRING : LETTER+;
STR 
	: 	'*'
		{ 	StringBuilder temp = new StringBuilder();} 
		('/' '*' 	{ 	temp.appendCodePoint('*');}	
		| c=~('*') 	{ 	temp.appendCodePoint(c);}	
		 )*	
		'*' 
		{ 	setText(temp.toString());}
	;
WS : (' ' | '\t' | '\n' | '\f' | '\r')+ {$channel = HIDDEN;};