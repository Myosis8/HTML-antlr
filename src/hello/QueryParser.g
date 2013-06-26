grammar QueryParser;

options {
  language = Java;
}
@header { 
  package hello;
  import search.Query;
}
@lexer::header {
  package hello;
}
@members {
}
page returns [Query result]
	:	'*find every key node*'
		{
			Query query = new Query("***","***",1);
			result = query;
		}
	|	'*find every relation*'
		{
			Query query = new Query("***","***",2);
			result = query;
		}
	|	'*mass of*' STRING 
		{
			Query query = new Query($STRING.text,"***",3);
			result = query;
		}
	|	'*find subclass of*' STRING
		{
			Query query = new Query($STRING.text,"***",4);
			result = query;
		}
	|	'*type of*' STRING
		{
			Query query = new Query("*", $STRING.text,5);
			result = query;
		}
	|	STR
		{
			Query query = new Query("*", "*",6);
			result = query;
		}
	;
	
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