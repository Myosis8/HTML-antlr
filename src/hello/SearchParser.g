grammar SearchParser;

options {
  language = Java;
}

@header { 
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
}

@lexer::header {
  package hello;
  
}

@members {
	ArrayList< TempEdge > edges = new ArrayList< TempEdge >();
}

page returns [ArrayList< TempEdge > result]
	:	main_tag	 {$result = edges;}		  
	;



main_tag
	:	'main' ('[')?		
	  	head_tag	  	
	  	body_tag  
	 	'end_main'	 	
	;
head_tag
	:	'head' ('[')?		
	 	 (title_tag | tag)*
	 	'end_head'	 	
	;	
body_tag
	:	'body' ('[')?		
	 	(STR	
	 	|tag)* 	
	 	'end_body'	 	
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
		
		'paragraph' '('(text_atribute)*')'
		
		(STR 	
		| 
		tag)*
		'end_paragraph'
			
	;

new_line_tag
	:	'new_line' ('[')?
		
	;	
title_tag
	:	
		'title' ('[')?	
		
		(STR 
		
		| 
		tag)*		
		'end_title'
				
	;	

image_tag
	:
		
		'image' '(' source  (image_atribute)* ')'
		
	;

font_tag		
	:	
			
		'font' '('(font_atribute)* ')'
		
		(STR 
		
		| 
		 tag)*		
		'end_font'
		
	;
	
link_tag
	:			
		'link' '(' link_atribute ')'		
		
		(STR 
		
		| 
		 tag)*			
		'end_link'
		
		
	;	
	
bold_tag
	:
		'bold' '['
	
		(
		STR
		
		| tag)*
		'end_bold'
		
	;	

italic_tag
	:
		'italic' '['
			
		(
		STR
		
		| tag)*
		'end_italic'
		
	;	
	
u_line_tag
	:
		'u_line' '['
			
		(
		STR
		
		| tag)*
		'end_u_line'
		
	;		
		
font_atribute
	:	'color' '(' STR ')'	
			 
	|	'face' '(' STR ')'
		
	|	'size' '(' DIGITS ')'
			
	;
text_atribute
	:
		'align' 
		'('
			(	
				'left'
				
			|	'right'
				
			|	'center'
				
			|	'justify'
							
			)
		')'
	;		
image_atribute
	:
		'align' 	
			'(' 
			 	('top'		
				
			 |  'bottom'	
			 	
			 |  'left'		
			 	
			 |  'right'		
			 	
			 |  'middle'	
			 	
			 	)
		 	')'
	|	'height' '(' DIGITS ')'	
	|	'width' '(' DIGITS ')'	 		
	;	
	
source
	:
		'source' '(' STR ')'
		
	;
	
link_atribute
	:
		'href'	'(' STR ')'			
		
	;
	
//--------------------------------------------------------------------
relation_tag
	: 
		'relation' '(' relation_atribute ')'	  		
	;
	
relation_atribute
	:
		'source' '(' source1 = STR ')'
		'target' '(' target = STR ')'
		'name' '(' name = STR ')'
		{
			TempEdge edge = new TempEdge( $source1.text, $target.text, $name.text);
			edges.add(edge);
		}
	;

key_Subject
	:
		'key_subject' '(' subject_atribute ')'
		(STR
		| tag)*
		
		'end_key_subject'
	;

subject_atribute
	:
		'id' '(' id = STR ')'
		{
			KeyNode subject = new KeySubject($id.text);
			SearchGraph.addVertexToSearchGraph(subject);
		}
	;	
key_Text
	:
		'key_text' '(' 'id' '(' id = STR ')' ')'		
		txt = STR 
		{
			KeyNode text = new KeyText($id.text, $txt.text);
			SearchGraph.addVertexToSearchGraph(text);
		}
		'end_key_text'
	;

key_Image
	:
		'key_image' '(' key_image_atribute ')'		
	;
	
key_image_atribute
	:
		'id' '(' id = STR ')'
		'source' '(' source1 = STR ')'
		{		
			KeyImage image = new KeyImage( $id.text, $source1.text);
			SearchGraph.addVertexToSearchGraph(image);		
		}
	;		
//--------------------------------------------------------------------	
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