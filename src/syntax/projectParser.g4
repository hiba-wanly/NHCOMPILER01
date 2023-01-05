parser grammar projectParser;

options {tokenVocab = projectLexer ; }
prog : element+ ;
element : body ;
body : classS
     | functionStatement
     ;


float_f : NUM_FLOAT
        ;
int_i : NUM ;

double_d : NUM_DOUBLE
         ;

arrayType : array_var
          | array_int
          | array_string
          | array_float
          ;

array_var : VAR namen EQUAL ARRAYLEFT arraybody ARRAYRIGHT SEMECOLONS;
array_int : INT namen EQUAL ARRAYLEFT arrayINT ARRAYRIGHT SEMECOLONS;
array_string : STRING namen EQUAL ARRAYLEFT arraySTRING ARRAYRIGHT SEMECOLONS;
array_float : FLOAT namen EQUAL ARRAYLEFT arrayFLOAT ARRAYRIGHT SEMECOLONS;

arraybody : arrayINT | arraySTRING | arrayFLOAT
           ;
arrayINT : NUM (COMMA NUM)* ;
arraySTRING :  INPUT_D_Q_I  (COMMA  INPUT_D_Q_I )* ;
arrayFLOAT :  NUM_FLOAT (COMMA NUM_FLOAT)* ;





initial : var_Variable
        | var_Variable_expr
        | var_Variable_emp
        | varVariable_INPUT_D_Q_N
        | varVariable_INPUT_D_Q_I
        | const_Variable
        | const_Variable_expr
        | const_Variable_emp
        | const_Variable_INPUT_D_Q_N
        | const_Variable_INPUT_D_Q_I
        | dynamic_Variable
        | dynamic_Variable_expr
        | dynamic_Variable_emp
        | dynamic_Variable_INPUT_D_Q_N
        | dynamic_Variable_INPUT_D_Q_I
        | final_Variable
        | final_Variable_expr
        | final_Variable_emp
        | final_Variable_INPUT_D_Q_N
        | final_Variable_INPUT_D_Q_I
        | string_Variable_INPUT_D_Q_N
        | string_Variable_INPUT_D_Q_I
        | string_Variable_TEXT
        | int_Variable
        | int_Variable_expr
        | int_Variable_emp
        | float_Variable
        | double_Variable
        | boolean_Variable
        | arrayType
        ;

var_Variable : VAR namen EQUAL NUM SEMECOLON  ;
var_Variable_expr : VAR namen EQUAL expr;
var_Variable_emp : VAR namen SEMECOLON;

varVariable_INPUT_D_Q_N : VAR namen EQUAL INPUT_D_Q_N  SEMECOLON ;
varVariable_INPUT_D_Q_I : VAR namen EQUAL INPUT_D_Q_I  SEMECOLON ;
const_Variable : CONST namen EQUAL NUM SEMECOLON;
const_Variable_expr : CONST namen EQUAL expr;
const_Variable_emp : CONST namen SEMECOLON;

const_Variable_INPUT_D_Q_N : CONST namen EQUAL INPUT_D_Q_N SEMECOLON ;
const_Variable_INPUT_D_Q_I : CONST namen EQUAL INPUT_D_Q_I SEMECOLON ;
dynamic_Variable : DYNAMIC namen EQUAL NUM SEMECOLON ;
dynamic_Variable_expr : DYNAMIC namen EQUAL expr;
dynamic_Variable_emp : DYNAMIC namen SEMECOLON;

dynamic_Variable_INPUT_D_Q_N : DYNAMIC namen EQUAL INPUT_D_Q_N SEMECOLON ;
dynamic_Variable_INPUT_D_Q_I : DYNAMIC namen EQUAL INPUT_D_Q_I SEMECOLON ;
final_Variable : FINAL namen EQUAL NUM SEMECOLON ;
final_Variable_expr : FINAL namen EQUAL expr ;
final_Variable_emp : FINAL namen SEMECOLON;

final_Variable_INPUT_D_Q_N : FINAL namen EQUAL INPUT_D_Q_N SEMECOLON ;
final_Variable_INPUT_D_Q_I : FINAL namen EQUAL INPUT_D_Q_I SEMECOLON ;
string_Variable_INPUT_D_Q_N : STRING namen EQUAL INPUT_D_Q_N SEMECOLON ;
string_Variable_INPUT_D_Q_I : STRING namen EQUAL INPUT_D_Q_I SEMECOLON ;
string_Variable_TEXT : STRING namen EQUAL QOUT rule+ QOUT SEMECOLON ;
int_Variable : INT namen EQUAL NUM SEMECOLON ;
int_Variable_expr : INT namen EQUAL expr;
int_Variable_emp : INT namen SEMECOLON;

float_Variable : FLOAT  namen EQUAL NUM_FLOAT  SEMECOLON;
double_Variable : DOUBLE namen EQUAL NUM_DOUBLE  SEMECOLON ;
boolean_Variable : BOOLEAN namen EQUAL NUM_BOOL  SEMECOLON ;


loop : for_VAR_With_ID_ID
     | for_INT_With_ID_ID
     | for_VAR_With_ID_NUM
     | for_INT_With_ID_NUM
     ;

for_VAR_With_ID_ID : FOR HLEFT VAR ID EQUAL NUM SEMECOLON ID SINGLS ID SEMECOLON ID PLUSORMINUS HRIGHT CURLELEFT inputI+ CURLERIGHT ;
for_INT_With_ID_ID : FOR HLEFT INT ID EQUAL NUM SEMECOLON ID SINGLS ID SEMECOLON ID PLUSORMINUS HRIGHT CURLELEFT inputI+ CURLERIGHT  ;
for_VAR_With_ID_NUM : FOR HLEFT VAR ID EQUAL NUM SEMECOLON ID SINGLS NUM SEMECOLON ID PLUSORMINUS HRIGHT CURLELEFT inputI+ CURLERIGHT ;
for_INT_With_ID_NUM : FOR HLEFT INT ID EQUAL NUM SEMECOLON ID SINGLS NUM SEMECOLON ID PLUSORMINUS HRIGHT CURLELEFT inputI+ CURLERIGHT  ;



printstatement : print_ID
               | print_NUM
               | print_TEXT
               ;

print_ID : PRINT HLEFT INPUT_D_Q_I HRIGHT SEMECOLON ;
print_NUM : PRINT HLEFT INPUT_D_Q_N HRIGHT SEMECOLON ;
print_TEXT : PRINT HLEFT QOUT rule+ QOUT HRIGHT SEMECOLON ;


rule :  ID |  NUM
     ;

ifstatement : if_WithInput (elseif_WithInput)*  else_WithInput? ;


if_WithInput : IF HLEFT (conditions)+  HRIGHT CURLELEFT ifif CURLERIGHT ;

ifif : inputI+
     | BREAK SEMECOLON
     | CONTINUE SEMECOLON
     ;

elseif_WithInput : ELSEIF HLEFT (conditions)+  HRIGHT CURLELEFT ifif CURLERIGHT ;

else_WithInput : ELSE CURLELEFT ifif CURLERIGHT ;


whilestatemen :  WHILE HLEFT conditions+  HRIGHT CURLELEFT ifif CURLERIGHT ;

/* my edit "neme" in 12/30 */
switchstatement : switch_With_ID
                 | switch_With_NUM
                 ;
switch_With_ID : SWITCH HLEFT ID HRIGHT  CURLELEFT casestatement+ defaultstatement CURLERIGHT ;
switch_With_NUM : SWITCH HLEFT NUM HRIGHT CURLELEFT casestatement+  defaultstatement CURLERIGHT ;



casestatement : case_With_ID
              | case_With_NUM
              ;

case_With_ID : CASE INPUT_D_Q_I TOWPOINT CURLELEFT  inputI+ CURLERIGHT BREAK SEMECOLON ;
case_With_NUM : CASE NUM  TOWPOINT CURLELEFT  inputI+ CURLERIGHT BREAK SEMECOLON ;


defaultstatement : DEFAULT TOWPOINT CURLELEFT inputI+ CURLERIGHT  BREAK SEMECOLON                      // #default_State
                 ;

tryCatchstatement : TRY CURLELEFT inputI+ CURLERIGHT CATCH HLEFT ID HRIGHT CURLELEFT inputI+ CURLERIGHT   // #try_State
                  ;

boolean_p
    :TRUE|FALSE
    ;

numbers : int_i | float_f ;
var : ID ;
expression
    :numbers|var||boolean_p|math
    |HLEFT expression HRIGHT
    ;

math
    :(var|numbers) operation (var|numbers)
    ;

boolExpresion
    :expression SINGLS expression
    |HLEFT boolExpresion HRIGHT
    ;
 logic
     :boolExpresion (nestedLogic)*
     |HLEFT logic HRIGHT (nestedLogic2)*
     ;
nestedLogic
    :LOGIC_SIGNS boolExpresion
    ;
 nestedLogic2
     :LOGIC_SIGNS HLEFT logic HRIGHT
     ;

conditions :boolExpresion
           |logic
           ;
operation
    :PLUS | MINUS | MULTI | DIVIDE
    ;


doWhilestatement: DO CURLELEFT inputI+ CURLERIGHT whilestatemen               //#while_State
                ;



expr : multiplication
     | addition
     | subtraction
     | division
     | identifier
     | integer_i           //////error
     ;

multiplication : NUM MULTI NUM SEMECOLON;
addition : NUM PLUS NUM SEMECOLON ;
subtraction : NUM MINUS NUM SEMECOLON;
division : NUM DIVIDE NUM SEMECOLON;
identifier : ID SEMECOLON ;
integer_i : NUM SEMECOLON;     //////////error



functionStatement :  void_Function_NOReturn_NoARG
                  | int_Function_Return_NoARG
                  | string_Function_Return_NoARG
                  | double_Function_Return_NoARG
                  | float_Function_Return_NoARG
                  | void_Function_NOReturn_ARG
                  | int_Function_Return_ARG
                  | string_Function_Return_ARG
                  | double_Function_Return_ARG
                  | floate_Function_Return_ARG
                  ;

  /*  function type WITH return "NO arg" */

void_Function_NOReturn_NoARG : VOID   namen HLEFT HRIGHT CURLELEFT inputI+ CURLERIGHT ;
int_Function_Return_NoARG : INT    namen HLEFT HRIGHT CURLELEFT inputI+ returnStatement SEMECOLON CURLERIGHT ;
string_Function_Return_NoARG : STRING namen HLEFT HRIGHT CURLELEFT inputI+ returnStatement SEMECOLON CURLERIGHT ;
double_Function_Return_NoARG : DOUBLE namen HLEFT HRIGHT CURLELEFT inputI+ returnStatement SEMECOLON CURLERIGHT ;
float_Function_Return_NoARG : FLOAT  namen HLEFT HRIGHT CURLELEFT inputI+ returnStatement SEMECOLON CURLERIGHT ;

   /*  function type WITH return " arg" */

void_Function_NOReturn_ARG : VOID   namen HLEFT argumentFunctionType+ HRIGHT CURLELEFT inputI+ CURLERIGHT ;
int_Function_Return_ARG : INT    namen HLEFT argumentFunctionType+ HRIGHT CURLELEFT inputI+ returnStatement SEMECOLON CURLERIGHT ;
string_Function_Return_ARG : STRING namen HLEFT argumentFunctionType+ HRIGHT CURLELEFT inputI+ returnStatement SEMECOLON CURLERIGHT;
double_Function_Return_ARG : DOUBLE namen HLEFT argumentFunctionType+ HRIGHT CURLELEFT inputI+ returnStatement SEMECOLON CURLERIGHT ;
floate_Function_Return_ARG : FLOAT  namen HLEFT argumentFunctionType+ HRIGHT CURLELEFT inputI+ returnStatement SEMECOLON CURLERIGHT ;


/* my edit "neme" in 12/30 */
argumentFunctionType : VAR namen COMMA | INT namen COMMA | DOUBLE namen COMMA | FLOAT namen COMMA | DYNAMIC namen COMMA | STRING namen COMMA  ;

returnStatement : returnID | returnINPUT_D_Q_I |  returnRule | return | returnNum | returnNumFloat | returnNumDouble;

returnID : RETURN ID;
returnINPUT_D_Q_I : RETURN INPUT_D_Q_I  ;
returnRule: RETURN QOUT rule+ QOUT;
return : RETURN;  ////
returnNum :RETURN NUM ;
returnNumFloat: RETURN NUM_FLOAT;
returnNumDouble : RETURN NUM_DOUBLE;


classS : classstatement
      | abstractstatment
      | extendsClass
      ;


classstatement : CLASS namen CURLELEFT inputclass+  CURLERIGHT                      //#class_State
               ;

abstractstatment : ABSTRACT CLASS namen CURLELEFT CURLERIGHT                   //#abstract_State
                 ;

extendsClass : extends_ClassStatment_Withinput
             | extends_ClassStatment_Withoutinput
             | extends_ClassStateFull
             | extends_ClassStateLess
             | extends_ClassStateFull_WithAppBar
             | extends_ClassStateLess_WithAppBar
             | extends_ClassStateFullwithinput_appBar
             | extends_ClassStateLesswithinput_appBar
             | extends_ClassStateFullwithinput
             | extends_ClassStateLesswithinput
             ;


extends_ClassStatment_Withinput : CLASS namen EXTENDS ID  CURLELEFT  inputclass+  CURLERIGHT ;

extends_ClassStatment_Withoutinput : CLASS namen EXTENDS ID  CURLELEFT         CURLERIGHT ;
extends_ClassStateFull : CLASS namen EXTENDS STATEFULLWIDGET CURLELEFT OVERRIDE BUILD_WIDGET CURLELEFT
                          RETURN SCAFFOLD HLEFT  BODY TOWPOINT  flutterWidget+ HRIGHT CURLERIGHT CURLERIGHT  ;

extends_ClassStateLess : CLASS namen EXTENDS STATELESSWIDGET CURLELEFT OVERRIDE BUILD_WIDGET CURLELEFT
                          RETURN SCAFFOLD HLEFT  BODY TOWPOINT  flutterWidget+ HRIGHT CURLERIGHT CURLERIGHT  ;



/*with appBar*/

extends_ClassStateFull_WithAppBar : CLASS namen EXTENDS STATEFULLWIDGET CURLELEFT OVERRIDE BUILD_WIDGET CURLELEFT
                          RETURN SCAFFOLD HLEFT APPBAR TOWPOINT APPBAR_CHILD HLEFT input_AppBar+ HRIGHT COMMA BODY TOWPOINT  flutterWidget+ HRIGHT CURLERIGHT CURLERIGHT  ;

extends_ClassStateLess_WithAppBar : CLASS namen EXTENDS STATELESSWIDGET CURLELEFT OVERRIDE BUILD_WIDGET CURLELEFT
                          RETURN SCAFFOLD HLEFT APPBAR TOWPOINT APPBAR_CHILD HLEFT input_AppBar+ HRIGHT COMMA BODY TOWPOINT  flutterWidget+ HRIGHT CURLERIGHT CURLERIGHT  ;


extends_ClassStateFullwithinput : CLASS namen EXTENDS STATEFULLWIDGET CURLELEFT inputclass+ OVERRIDE BUILD_WIDGET CURLELEFT
                                   RETURN SCAFFOLD HLEFT  BODY TOWPOINT  flutterWidget+ HRIGHT CURLERIGHT CURLERIGHT  ;
extends_ClassStateLesswithinput : CLASS namen EXTENDS STATELESSWIDGET CURLELEFT inputclass+ OVERRIDE BUILD_WIDGET CURLELEFT
                                  RETURN SCAFFOLD HLEFT  BODY TOWPOINT  flutterWidget+ HRIGHT CURLERIGHT CURLERIGHT ;


/*with appBar*/
extends_ClassStateFullwithinput_appBar : CLASS namen EXTENDS STATEFULLWIDGET CURLELEFT inputclass+ OVERRIDE BUILD_WIDGET CURLELEFT
                                   RETURN SCAFFOLD HLEFT APPBAR TOWPOINT APPBAR_CHILD HLEFT input_AppBar+ HRIGHT COMMA BODY TOWPOINT  flutterWidget+ HRIGHT CURLERIGHT CURLERIGHT  ;

extends_ClassStateLesswithinput_appBar : CLASS namen EXTENDS STATELESSWIDGET CURLELEFT inputclass+ OVERRIDE BUILD_WIDGET CURLELEFT
                                  RETURN SCAFFOLD HLEFT APPBAR TOWPOINT APPBAR_CHILD HLEFT input_AppBar+  BODY TOWPOINT  flutterWidget+ HRIGHT CURLERIGHT CURLERIGHT ;

input_AppBar : input_1AppBar| input_2AppBar | input_3AppBar | input_4AppBar;


input_1AppBar: TITLE TOWPOINT texeStatement ;

input_2AppBar: BACHCOLOR TOWPOINT COLOR DOT color COMMA;

input_3AppBar: TITLE TOWPOINT texeStatement  BACHCOLOR TOWPOINT COLOR DOT color COMMA ;

input_4AppBar: BACHCOLOR TOWPOINT COLOR DOT color COMMA TITLE TOWPOINT texeStatement;

color :  color_red | color_green;

color_red:RED;
color_green:GREEN;

/* flutter component */




containerStatement :  CONTAINER HLEFT CHILD TOWPOINT flutterWidget+ HRIGHT  COMMA
                   ;


rowStatement  : ROW HLEFT CHILDREN TOWPOINT ARRAYLEFT flutterWidget+ ARRAYRIGHT HRIGHT COMMA   //#row_State
              ;

colStatemenst : COLUMN HLEFT CHILDREN TOWPOINT ARRAYLEFT flutterWidget+ ARRAYRIGHT HRIGHT COMMA  ;  // #colo_state


texeStatement : text_INPUT_D_Q_N
              | text_INPUT_D_Q_I
              | text_rule
              ;

text_INPUT_D_Q_N : TEXT HLEFT INPUT_D_Q_N HRIGHT COMMA;
text_INPUT_D_Q_I : TEXT HLEFT INPUT_D_Q_I HRIGHT COMMA;
text_rule : TEXT HLEFT QOUT rule+ QOUT HRIGHT COMMA;


sizedBox  : hight_SizedBox
          | width_SizedBox
          | widthHight_SizedBox
          | hightWidth_SizedBox
          ;

hight_SizedBox : SIZEDBOX HLEFT HIGHT TOWPOINT NUM_FLOAT COMMA HRIGHT COMMA  ;
width_SizedBox : SIZEDBOX HLEFT WIDTH TOWPOINT NUM_FLOAT COMMA HRIGHT COMMA     ;
widthHight_SizedBox : SIZEDBOX HLEFT WIDTH TOWPOINT NUM_FLOAT COMMA HIGHT TOWPOINT NUM_FLOAT COMMA HRIGHT COMMA ;
hightWidth_SizedBox : SIZEDBOX HLEFT HIGHT TOWPOINT NUM_FLOAT COMMA WIDTH TOWPOINT NUM_FLOAT COMMA HRIGHT COMMA  ;

textButton  : TEXTBUTTON HLEFT CHILD TOWPOINT flutterWidget+   ONPRESSED TOWPOINT HLEFT HRIGHT CURLELEFT CURLERIGHT HRIGHT  COMMA
            ;



imageState : image_withAssetImage
           | image_withAssetImage_WithDirection
           | image_withAssetImage_WithDirection_fit
           | image_withAsset
           | image_withNetWoek
           | image_withFile
           ;

image_withAssetImage : IMAGE HLEFT IMAGE_CHILD TOWPOINT ASSETSIMAGE HLEFT IMAGE_INPUT_ASSET  HRIGHT  HRIGHT COMMA  ;
image_withAssetImage_WithDirection : IMAGE HLEFT IMAGE_CHILD TOWPOINT ASSETSIMAGE HLEFT IMAGE_INPUT_ASSET  HRIGHT COMMA imageDirection+ HRIGHT COMMA ;
image_withAssetImage_WithDirection_fit : IMAGE HLEFT IMAGE_CHILD TOWPOINT ASSETSIMAGE HLEFT IMAGE_INPUT_ASSET  HRIGHT COMMA imageDirection+ imageFit HRIGHT COMMA ;
image_withAsset : IMAGE DOT ASSET HLEFT HRIGHT COMMA  ;
image_withNetWoek : IMAGE DOT NETWORK HLEFT HRIGHT COMMA ;
image_withFile : IMAGE DOT FILE HLEFT HRIGHT COMMA  ;

imageDirection :  imageHight_DF
               |  imageWidth_DF
               |  imageHightWidth_DF
               |  imageWidthHight_DF
               |  imageHightWidth_DN
               |  imageWidthHight_DN
               ;

imageHight_DF: HIGHT TOWPOINT NUM_FLOAT ;
imageWidth_DF :WIDTH TOWPOINT NUM_FLOAT ;
imageHightWidth_DF: HIGHT TOWPOINT NUM_FLOAT COMMA WIDTH TOWPOINT NUM_FLOAT COMMA;
imageWidthHight_DF: WIDTH TOWPOINT NUM_FLOAT COMMA HIGHT TOWPOINT NUM_FLOAT COMMA;
imageHightWidth_DN :   HIGHT TOWPOINT NUM COMMA WIDTH TOWPOINT NUM COMMA;
imageWidthHight_DN :   WIDTH TOWPOINT NUM COMMA HIGHT TOWPOINT NUM COMMA;

imageFit : FIT TOWPOINT BOXFIT DOT FILL COMMA ;

expandedStatment : expanded_withCol
                 | expanded_withRow
                 ;

expanded_withCol : EXPANDED HLEFT CHILD TOWPOINT colStatemenst  HRIGHT COMMA  ;
expanded_withRow : EXPANDED HLEFT CHILD TOWPOINT rowStatement  HRIGHT COMMA ;



paddingStatement : padding_all
                 | padding_sym_vertical_num
                 | padding_sym_vertical_numFloat
                 | padding_sym_horisantal_num
                 | padding_sym_horisantal_numFloat
                 | padding_only
                 ;

padding_all : PADDING HLEFT PAD_ALL HLEFT NUM_FLOAT HRIGHT COMMA CHILD TOWPOINT flutterWidget+ HRIGHT  COMMA ;
padding_sym_vertical_num : PADDING HLEFT PAD_SYM HLEFT VERTICAL TOWPOINT NUM HRIGHT COMMA CHILD TOWPOINT flutterWidget+ HRIGHT  COMMA ;
padding_sym_vertical_numFloat : PADDING HLEFT PAD_SYM HLEFT VERTICAL TOWPOINT NUM_FLOAT HRIGHT COMMA CHILD TOWPOINT flutterWidget+ HRIGHT COMMA ;
padding_sym_horisantal_num : PADDING HLEFT PAD_SYM HLEFT HORISANTAL TOWPOINT NUM HRIGHT COMMA CHILD TOWPOINT flutterWidget+ HRIGHT  COMMA ;
padding_sym_horisantal_numFloat :  PADDING HLEFT PAD_SYM HLEFT HORISANTAL TOWPOINT NUM_FLOAT HRIGHT COMMA CHILD TOWPOINT flutterWidget+ HRIGHT COMMA ;
padding_only : PADDING HLEFT PAD_ON  HLEFT direction+ HRIGHT COMMA CHILD TOWPOINT flutterWidget+  HRIGHT   COMMA  ;


direction : top_direction_NUM | right_direction_NUM | bottom_direction_NUM | left_direction_NUM
          | top_direction_FLOAT | right_direction_FLOAT | bottom_direction_FLOAT | left_direction_FLOAT
          | top_direction_NUM_D | right_direction_NUM_D | bottom_direction_NUM_D | left_direction_NUM_D
          | top_direction_FLOAT_D | right_direction_FLOAT_D | bottom_direction_FLOAT_D | left_direction_FLOAT_D
          ;

top_direction_NUM : TOP TOWPOINT NUM ;
right_direction_NUM : RIGHT TOWPOINT NUM ;
bottom_direction_NUM : BOTTOM TOWPOINT NUM;
left_direction_NUM : LEFT TOWPOINT NUM;

top_direction_FLOAT : TOP TOWPOINT NUM_FLOAT ;
right_direction_FLOAT : RIGHT TOWPOINT NUM_FLOAT ;
bottom_direction_FLOAT : BOTTOM TOWPOINT NUM_FLOAT;
left_direction_FLOAT : LEFT TOWPOINT NUM_FLOAT;

top_direction_NUM_D : TOP TOWPOINT NUM COMMA direction+ ;
right_direction_NUM_D : RIGHT TOWPOINT NUM COMMA direction+ ;
bottom_direction_NUM_D : BOTTOM TOWPOINT NUM COMMA direction+;
left_direction_NUM_D : LEFT TOWPOINT NUM COMMA direction+;

top_direction_FLOAT_D : TOP TOWPOINT NUM_FLOAT COMMA direction+ ;
right_direction_FLOAT_D : RIGHT TOWPOINT NUM_FLOAT COMMA direction+ ;
bottom_direction_FLOAT_D : BOTTOM TOWPOINT NUM_FLOAT COMMA direction+;
left_direction_FLOAT_D : LEFT TOWPOINT NUM_FLOAT COMMA direction+;




flutterWidget : containerStatement
              | rowStatement
              | colStatemenst
              | texeStatement
              | sizedBox
              | textButton
              | imageState
              | expandedStatment
              | paddingStatement
              ;


inputI : initial
      | ifstatement
      | loop
      | doWhilestatement
      | whilestatemen
      | printstatement
      | switchstatement
      | tryCatchstatement
      ;

 inputclass : initial
            | functionStatement
            ;


namen : ID;