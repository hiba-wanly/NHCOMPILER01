lexer grammar projectLexer;

QOUT : '"';

NUM_BOOL : TRUE | FALSE;

AT: '@';
MINUS :'-';
PLUS : '+';
MULTI : '*' ;
DIVIDE : '/';
LINE_COMMENT : '//';
COMMENTSTART : '/* ';
COMMENTEND : '*/ ';
COMMA : ','  ;

/*BACKSLASH : '/';*/
ARRAYRIGHT:']';
ARRAYLEFT: '['   ; // -> pushMode(ARRAYRIGHT_R);

CURLERIGHT :'}';
CURLELEFT : '{' ; ///-> pushMode(CLASS_MODE);
HRIGHT:')';
HLEFT : '('  ;///-> pushMode(HRIGHT_R);

UNDERSCORE : '_';
QUISTION : '?';
EXCLAMATION:'!';
AND : '&&';
OR : '||' ;
DOT : '.';
LOGIC_SIGNS :' '* ('&&' | '||') ' '*;

SINGLS : '>' | '<' | '==' | '!=' | '<= ' | '=>'  ;
PLUSORMINUS : '++' | '--' ;

/* Data type */
VAR      : ' '* 'var' ' '*;
CONST    : ' '* 'const' ' '*;
FINAL    : ' '* 'final' ' '*;
DYNAMIC  : ' '* 'dynamic' ' '*;
INT      : ' '* 'int' ' '*;
STRING   : ' '* 'String' ' '*;
FLOAT    : ' '* 'float' ' '*;
DOUBLE   :' '* 'double' ' '*;
LIST     : ' '* 'list' ' '*;
MAPS     :  ' '* 'map' ' '*;
SET      : ' '* 'Set' ' '*;
HASH     : ' '* 'Hash' ' '*;
INTEGER  : ' '* 'Integer' ' '*;
ARRAY    :' '* 'array' ' '*;
BOOLEAN  : ' '* 'bool' ' '*;
//TYPET : (VOID | STRING | INT | DOUBLE | FLOAT)  ;// -> poshMode(CLASS_MODE);


/* Data type */

/* Kayword */

MAIN     :' '* 'main' ' '*;
VOID     :' '* 'void' ' '*;
CLASS    :' '* 'class' ' '*   ;//->pushMode(CLASS_MODE);
ABSTRACT : ' '* 'abstract' ' '*  ; //->pushMode(CLASS_MODE);
THIS     :' '*  'this' ' '*;
SWITCH   : ' '* 'switch' ' '* ; // ->pushMode(CLASS_MODE);
CASE     : ' '* 'case' ' '*  ;    //->poshMode(ARRAYSEMI);
IMPORT   :' '* 'import' ' '*;
SUPER    :' '* 'super' ' '*;
EXTENDS  : ' '* 'extends' ' '*;
NEW      : ' '* 'new'  ' '*;
PRINT    : ' '* 'print' ' '*  ; //->poshMode(ARRAYSEMI);
BREAK    : ' '* 'break' ' '*;
CONTINUE : ' '* 'continue' ' '*;
WHILE    :' '*  'while' ' '*  ;    //->pushMode(CLASS_MODE);
RETURN   :' '* 'return' ' '*;
THEN     :' '* 'then' ' '*;
DEFAULT  :' '* 'default' ' '* ;  //->poshMode(ARRAYSEMI);
STATIC   :' '* 'static' ' '*;
DO       : ' '* 'do' ' '*;
TRY      : ' '* 'try' ' '*  ;  // ->pushMode(CLASS_MODE);
CATCH    : ' '* 'catch' ' '*;
THROW    : ' '* 'throw' ' '*;
ELSE     : ' '* 'else' ' '* ;     //->pushMode(CLASS_MODE);
//IS       : 'is' ;
ENUM     :' '* 'enum' ' '*;
WITH     : ' '* 'with'  ' '*;
ONPRESSED :' '* 'onPressed' ' '*;
FIT :' '* 'fit' ' '* ;    //->pushMode(COMCR);
BOXFIT : ' '* 'BoxFit' ' '*;
FILL: ' '* 'fill' ' '*;
APPBAR :' '* 'appBar' ' '*;
APPBAR_CHILD :' '* 'AppBar' ' '*;
TITLE: ' '* 'title' ' '*;
BACHCOLOR :' '* 'backgroundColor' ' '*;
COLOR : ' '* 'Colors' ' '*;
RED :' '* 'red' ' '*;
GREEN : ' '* 'green' ' '*;


//TYPEARRAY : (VAR | STRING | INT | FLOAT) ;     //->poshMode(ARRAYSEMI);

//TYPEVAR : (VAR | CONST | DYNAMIC | FINAL | STRING | INT | FLOAT | DOUBLE | BOOLEAN) ;    //->pushMode(ARRAYSEMI);
/* Kayword */



/* flutter */

STATEFULLWIDGET :' '* 'StatefulWidget' ' '* ;
STATELESSWIDGET: ' '* 'StatelessWidget' ' '*;
WIDGET :' '* 'widget' ' '*;
BUILD_WIDGET  : ' '* 'Widget build(BuildContext context)' ' '*;
STACK  :' '* 'Stack' ' '*;
COLUMN :' '*  'Column' ' '*   ;   //->pushMode(COMCR);
ROW    : ' '* 'Row'  ' '*  ;    //->pushMode(COMCR);
BODY   :' '*  'body' ' '*;
CHILD  : ' '* 'child' ' '*;
CHILDREN :' '* 'children' ' '*;
CONTEXT :' '*  'context' ' '*;
CONTAINER : ' '* 'Container' ' '* ;   //->pushMode(COMCR);
TEXTBUTTON: ' '* 'TextButton' ' '*  ;  //->pushMode(COMCR);
TEXT : ' '* 'Text' ' '*  ;   //->pushMode(COMCR);
EXPANDED :' '* 'Expanded' ' '* ;   //->pushMode(COMCR);
SIZEDBOX : ' '* 'SizedBox' ' '*;
HIGHT :' '* 'height' ' '*;
WIDTH :' '* 'width' ' '*;
IMAGE : ' '* 'Image' ' '* ;   //->pushMode(COMCR);
IMAGE_CHILD : ' '* 'image' ' '*;
ASSET : ' '* 'asset' ' '*;
FILE :' '* 'file' ' '*;
NETWOK : ' '* 'netwok' ' '*;
ASSETSIMAGE:' '* 'AssetImage' ' '*;
IMAGE_INPUT_ASSET : '"' 'assets/'ID'.jpg' '"'      |'"' 'assets/'ID'.png''"'
                  | '"' 'assets/'ID NUM'.jpg' '"'  |'"' 'assets/'ID NUM'.png''"'
                  | '"' 'assets/'NUM ID'.jpg' '"'  |'"' 'assets/'NUM ID'.png''"'

                   ;

//mode ARRAYSEMI;
//SEMECOLONS : ' '* SEMECOLON ' ';//*-> popMode;
//mode CLASS_MODE;
//CURLERIGHT :' '*  '}' ' '* -> popMode;
//
//mode COMCR;
//COMMAA :' '*  ',' ' '* ->popMode;
//mode ARRAYRIGHT_R ;
//ARRAYRIGHT:' '* ']' ' '*->popMode;
//mode HRIGHT_R;
//HRIGHT:' '* ')' ' '* ->popMode;


OVERRIDE :' '* '@override' ' '*
      ;
SCAFFOLD :' '* 'Scaffold' ' '* ;
LISTVIEW :' '* 'ListView' ' '*;
PADDING  :' '* 'Padding' ' '* ;  //->pushMode(COMCR);
VERTICAL :' '* 'vertical' ' '*;
HORISANTAL : ' '* 'horizontal' ' '*;
LEFT : ' '* 'left' ' '*;
TOP : ' '* 'top' ' '*;
RIGHT :' '* 'right' ' '*;
BOTTOM:' '* 'bottom' ' '*;
PAD_ALL :' '* 'padding : const EdgeInsets.all' ' '*;
PAD_SYM :' '* 'padding : const EdgeInsets.symmetric' ' '*;
PAD_ON  :' '* 'padding : const EdgeInsets.only' ' '*;


INPUT_D_Q_N  :  '"'WS NUM WS'"'  | '"'NUM'"' | '"'NUM WS'"' | '"'WS NUM '"';
INPUT_D_Q_I  :  '"'WS ID WS '"'  | '"'ID'"'  | '"' ID WS '"'| '"'WS ID  '"';



/* flutter */

NUM_FLOAT :  NUM+ DOT NUM* ;
NUM_DOUBLE : NUM+ DOT NUM*    ;
TRUE :' '*  'true' ' '*;
FALSE :' '*  'false' ' '*;
TOWPOINT : ':';
SEMECOLON :';';
EQUAL    : '=' ;
FOR :' '* 'for' ' '*  ;//->pushMode(CLASS_MODE);
IF :' '* 'if' ' '* ; //->pushMode(CLASS_MODE);
ELSEIF :' '* 'else if' ' '* ; // ->pushMode(CLASS_MODE);




ID : [a-zA-Z]+ ;
NUM: '0'| '-'?[1-9] [0-9]*;
WS : [ \t\n\r]+  -> skip;
//COMMENT: '--' ~[\n\r]* -> skip;
STRINGWITHQOYCHAR : ('a'..'z' )+;
//STRINGWITHQOYNUM : '0'..'9'+ ;
WHITESPACE : ' '+  ;





fragment UPPERCASE : [A-Z] ;
fragment LOWERCASE : [a-z] ;


fragment S : 's' ;
fragment A : 'a' ;
fragment C : 'c' ;
fragment L : 'l' ;
fragment Y : ('Y'|'y') ;
fragment H : ('H'|'h') ;
fragment O : ('O'|'o') ;
fragment U : ('U'|'u') ;
fragment T : ('T'|'t') ;
fragment F : ('F'|'f') ;
fragment R : ('R'|'r') ;
//fragment CLASS : CLASS ;

