// Generated from C:/Users/thuraya/IdeaProjects/hncompilerlastone/src/syntax\projectParser.g4 by ANTLR 4.10.1
package syntax;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link projectParser}.
 */
public interface projectParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link projectParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(projectParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(projectParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(projectParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(projectParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(projectParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(projectParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#float_f}.
	 * @param ctx the parse tree
	 */
	void enterFloat_f(projectParser.Float_fContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#float_f}.
	 * @param ctx the parse tree
	 */
	void exitFloat_f(projectParser.Float_fContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#int_i}.
	 * @param ctx the parse tree
	 */
	void enterInt_i(projectParser.Int_iContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#int_i}.
	 * @param ctx the parse tree
	 */
	void exitInt_i(projectParser.Int_iContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#double_d}.
	 * @param ctx the parse tree
	 */
	void enterDouble_d(projectParser.Double_dContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#double_d}.
	 * @param ctx the parse tree
	 */
	void exitDouble_d(projectParser.Double_dContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(projectParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(projectParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#array_var}.
	 * @param ctx the parse tree
	 */
	void enterArray_var(projectParser.Array_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#array_var}.
	 * @param ctx the parse tree
	 */
	void exitArray_var(projectParser.Array_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#array_int}.
	 * @param ctx the parse tree
	 */
	void enterArray_int(projectParser.Array_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#array_int}.
	 * @param ctx the parse tree
	 */
	void exitArray_int(projectParser.Array_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#array_string}.
	 * @param ctx the parse tree
	 */
	void enterArray_string(projectParser.Array_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#array_string}.
	 * @param ctx the parse tree
	 */
	void exitArray_string(projectParser.Array_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#array_float}.
	 * @param ctx the parse tree
	 */
	void enterArray_float(projectParser.Array_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#array_float}.
	 * @param ctx the parse tree
	 */
	void exitArray_float(projectParser.Array_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#arraybody}.
	 * @param ctx the parse tree
	 */
	void enterArraybody(projectParser.ArraybodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#arraybody}.
	 * @param ctx the parse tree
	 */
	void exitArraybody(projectParser.ArraybodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#arrayINT}.
	 * @param ctx the parse tree
	 */
	void enterArrayINT(projectParser.ArrayINTContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#arrayINT}.
	 * @param ctx the parse tree
	 */
	void exitArrayINT(projectParser.ArrayINTContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#arraySTRING}.
	 * @param ctx the parse tree
	 */
	void enterArraySTRING(projectParser.ArraySTRINGContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#arraySTRING}.
	 * @param ctx the parse tree
	 */
	void exitArraySTRING(projectParser.ArraySTRINGContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#arrayFLOAT}.
	 * @param ctx the parse tree
	 */
	void enterArrayFLOAT(projectParser.ArrayFLOATContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#arrayFLOAT}.
	 * @param ctx the parse tree
	 */
	void exitArrayFLOAT(projectParser.ArrayFLOATContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterInitial(projectParser.InitialContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitInitial(projectParser.InitialContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#var_Variable}.
	 * @param ctx the parse tree
	 */
	void enterVar_Variable(projectParser.Var_VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#var_Variable}.
	 * @param ctx the parse tree
	 */
	void exitVar_Variable(projectParser.Var_VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#var_Variable_expr}.
	 * @param ctx the parse tree
	 */
	void enterVar_Variable_expr(projectParser.Var_Variable_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#var_Variable_expr}.
	 * @param ctx the parse tree
	 */
	void exitVar_Variable_expr(projectParser.Var_Variable_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#var_Variable_emp}.
	 * @param ctx the parse tree
	 */
	void enterVar_Variable_emp(projectParser.Var_Variable_empContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#var_Variable_emp}.
	 * @param ctx the parse tree
	 */
	void exitVar_Variable_emp(projectParser.Var_Variable_empContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#varVariable_INPUT_D_Q_N}.
	 * @param ctx the parse tree
	 */
	void enterVarVariable_INPUT_D_Q_N(projectParser.VarVariable_INPUT_D_Q_NContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#varVariable_INPUT_D_Q_N}.
	 * @param ctx the parse tree
	 */
	void exitVarVariable_INPUT_D_Q_N(projectParser.VarVariable_INPUT_D_Q_NContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#varVariable_INPUT_D_Q_I}.
	 * @param ctx the parse tree
	 */
	void enterVarVariable_INPUT_D_Q_I(projectParser.VarVariable_INPUT_D_Q_IContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#varVariable_INPUT_D_Q_I}.
	 * @param ctx the parse tree
	 */
	void exitVarVariable_INPUT_D_Q_I(projectParser.VarVariable_INPUT_D_Q_IContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#const_Variable}.
	 * @param ctx the parse tree
	 */
	void enterConst_Variable(projectParser.Const_VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#const_Variable}.
	 * @param ctx the parse tree
	 */
	void exitConst_Variable(projectParser.Const_VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#const_Variable_expr}.
	 * @param ctx the parse tree
	 */
	void enterConst_Variable_expr(projectParser.Const_Variable_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#const_Variable_expr}.
	 * @param ctx the parse tree
	 */
	void exitConst_Variable_expr(projectParser.Const_Variable_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#const_Variable_emp}.
	 * @param ctx the parse tree
	 */
	void enterConst_Variable_emp(projectParser.Const_Variable_empContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#const_Variable_emp}.
	 * @param ctx the parse tree
	 */
	void exitConst_Variable_emp(projectParser.Const_Variable_empContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#const_Variable_INPUT_D_Q_N}.
	 * @param ctx the parse tree
	 */
	void enterConst_Variable_INPUT_D_Q_N(projectParser.Const_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#const_Variable_INPUT_D_Q_N}.
	 * @param ctx the parse tree
	 */
	void exitConst_Variable_INPUT_D_Q_N(projectParser.Const_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#const_Variable_INPUT_D_Q_I}.
	 * @param ctx the parse tree
	 */
	void enterConst_Variable_INPUT_D_Q_I(projectParser.Const_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#const_Variable_INPUT_D_Q_I}.
	 * @param ctx the parse tree
	 */
	void exitConst_Variable_INPUT_D_Q_I(projectParser.Const_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#dynamic_Variable}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_Variable(projectParser.Dynamic_VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#dynamic_Variable}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_Variable(projectParser.Dynamic_VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#dynamic_Variable_expr}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_Variable_expr(projectParser.Dynamic_Variable_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#dynamic_Variable_expr}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_Variable_expr(projectParser.Dynamic_Variable_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#dynamic_Variable_emp}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_Variable_emp(projectParser.Dynamic_Variable_empContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#dynamic_Variable_emp}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_Variable_emp(projectParser.Dynamic_Variable_empContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#dynamic_Variable_INPUT_D_Q_N}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_Variable_INPUT_D_Q_N(projectParser.Dynamic_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#dynamic_Variable_INPUT_D_Q_N}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_Variable_INPUT_D_Q_N(projectParser.Dynamic_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#dynamic_Variable_INPUT_D_Q_I}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_Variable_INPUT_D_Q_I(projectParser.Dynamic_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#dynamic_Variable_INPUT_D_Q_I}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_Variable_INPUT_D_Q_I(projectParser.Dynamic_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#final_Variable}.
	 * @param ctx the parse tree
	 */
	void enterFinal_Variable(projectParser.Final_VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#final_Variable}.
	 * @param ctx the parse tree
	 */
	void exitFinal_Variable(projectParser.Final_VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#final_Variable_expr}.
	 * @param ctx the parse tree
	 */
	void enterFinal_Variable_expr(projectParser.Final_Variable_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#final_Variable_expr}.
	 * @param ctx the parse tree
	 */
	void exitFinal_Variable_expr(projectParser.Final_Variable_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#final_Variable_emp}.
	 * @param ctx the parse tree
	 */
	void enterFinal_Variable_emp(projectParser.Final_Variable_empContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#final_Variable_emp}.
	 * @param ctx the parse tree
	 */
	void exitFinal_Variable_emp(projectParser.Final_Variable_empContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#final_Variable_INPUT_D_Q_N}.
	 * @param ctx the parse tree
	 */
	void enterFinal_Variable_INPUT_D_Q_N(projectParser.Final_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#final_Variable_INPUT_D_Q_N}.
	 * @param ctx the parse tree
	 */
	void exitFinal_Variable_INPUT_D_Q_N(projectParser.Final_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#final_Variable_INPUT_D_Q_I}.
	 * @param ctx the parse tree
	 */
	void enterFinal_Variable_INPUT_D_Q_I(projectParser.Final_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#final_Variable_INPUT_D_Q_I}.
	 * @param ctx the parse tree
	 */
	void exitFinal_Variable_INPUT_D_Q_I(projectParser.Final_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#string_Variable_INPUT_D_Q_N}.
	 * @param ctx the parse tree
	 */
	void enterString_Variable_INPUT_D_Q_N(projectParser.String_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#string_Variable_INPUT_D_Q_N}.
	 * @param ctx the parse tree
	 */
	void exitString_Variable_INPUT_D_Q_N(projectParser.String_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#string_Variable_INPUT_D_Q_I}.
	 * @param ctx the parse tree
	 */
	void enterString_Variable_INPUT_D_Q_I(projectParser.String_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#string_Variable_INPUT_D_Q_I}.
	 * @param ctx the parse tree
	 */
	void exitString_Variable_INPUT_D_Q_I(projectParser.String_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#string_Variable_TEXT}.
	 * @param ctx the parse tree
	 */
	void enterString_Variable_TEXT(projectParser.String_Variable_TEXTContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#string_Variable_TEXT}.
	 * @param ctx the parse tree
	 */
	void exitString_Variable_TEXT(projectParser.String_Variable_TEXTContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#int_Variable}.
	 * @param ctx the parse tree
	 */
	void enterInt_Variable(projectParser.Int_VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#int_Variable}.
	 * @param ctx the parse tree
	 */
	void exitInt_Variable(projectParser.Int_VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#int_Variable_expr}.
	 * @param ctx the parse tree
	 */
	void enterInt_Variable_expr(projectParser.Int_Variable_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#int_Variable_expr}.
	 * @param ctx the parse tree
	 */
	void exitInt_Variable_expr(projectParser.Int_Variable_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#int_Variable_emp}.
	 * @param ctx the parse tree
	 */
	void enterInt_Variable_emp(projectParser.Int_Variable_empContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#int_Variable_emp}.
	 * @param ctx the parse tree
	 */
	void exitInt_Variable_emp(projectParser.Int_Variable_empContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#float_Variable}.
	 * @param ctx the parse tree
	 */
	void enterFloat_Variable(projectParser.Float_VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#float_Variable}.
	 * @param ctx the parse tree
	 */
	void exitFloat_Variable(projectParser.Float_VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#double_Variable}.
	 * @param ctx the parse tree
	 */
	void enterDouble_Variable(projectParser.Double_VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#double_Variable}.
	 * @param ctx the parse tree
	 */
	void exitDouble_Variable(projectParser.Double_VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#boolean_Variable}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_Variable(projectParser.Boolean_VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#boolean_Variable}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_Variable(projectParser.Boolean_VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(projectParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(projectParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#for_VAR_With_ID_ID}.
	 * @param ctx the parse tree
	 */
	void enterFor_VAR_With_ID_ID(projectParser.For_VAR_With_ID_IDContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#for_VAR_With_ID_ID}.
	 * @param ctx the parse tree
	 */
	void exitFor_VAR_With_ID_ID(projectParser.For_VAR_With_ID_IDContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#for_INT_With_ID_ID}.
	 * @param ctx the parse tree
	 */
	void enterFor_INT_With_ID_ID(projectParser.For_INT_With_ID_IDContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#for_INT_With_ID_ID}.
	 * @param ctx the parse tree
	 */
	void exitFor_INT_With_ID_ID(projectParser.For_INT_With_ID_IDContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#for_VAR_With_ID_NUM}.
	 * @param ctx the parse tree
	 */
	void enterFor_VAR_With_ID_NUM(projectParser.For_VAR_With_ID_NUMContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#for_VAR_With_ID_NUM}.
	 * @param ctx the parse tree
	 */
	void exitFor_VAR_With_ID_NUM(projectParser.For_VAR_With_ID_NUMContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#for_INT_With_ID_NUM}.
	 * @param ctx the parse tree
	 */
	void enterFor_INT_With_ID_NUM(projectParser.For_INT_With_ID_NUMContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#for_INT_With_ID_NUM}.
	 * @param ctx the parse tree
	 */
	void exitFor_INT_With_ID_NUM(projectParser.For_INT_With_ID_NUMContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#printstatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintstatement(projectParser.PrintstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#printstatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintstatement(projectParser.PrintstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#print_ID}.
	 * @param ctx the parse tree
	 */
	void enterPrint_ID(projectParser.Print_IDContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#print_ID}.
	 * @param ctx the parse tree
	 */
	void exitPrint_ID(projectParser.Print_IDContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#print_NUM}.
	 * @param ctx the parse tree
	 */
	void enterPrint_NUM(projectParser.Print_NUMContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#print_NUM}.
	 * @param ctx the parse tree
	 */
	void exitPrint_NUM(projectParser.Print_NUMContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#print_TEXT}.
	 * @param ctx the parse tree
	 */
	void enterPrint_TEXT(projectParser.Print_TEXTContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#print_TEXT}.
	 * @param ctx the parse tree
	 */
	void exitPrint_TEXT(projectParser.Print_TEXTContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(projectParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(projectParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(projectParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(projectParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#if_WithInput}.
	 * @param ctx the parse tree
	 */
	void enterIf_WithInput(projectParser.If_WithInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#if_WithInput}.
	 * @param ctx the parse tree
	 */
	void exitIf_WithInput(projectParser.If_WithInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#ifif}.
	 * @param ctx the parse tree
	 */
	void enterIfif(projectParser.IfifContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#ifif}.
	 * @param ctx the parse tree
	 */
	void exitIfif(projectParser.IfifContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#elseif_WithInput}.
	 * @param ctx the parse tree
	 */
	void enterElseif_WithInput(projectParser.Elseif_WithInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#elseif_WithInput}.
	 * @param ctx the parse tree
	 */
	void exitElseif_WithInput(projectParser.Elseif_WithInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#else_WithInput}.
	 * @param ctx the parse tree
	 */
	void enterElse_WithInput(projectParser.Else_WithInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#else_WithInput}.
	 * @param ctx the parse tree
	 */
	void exitElse_WithInput(projectParser.Else_WithInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#whilestatemen}.
	 * @param ctx the parse tree
	 */
	void enterWhilestatemen(projectParser.WhilestatemenContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#whilestatemen}.
	 * @param ctx the parse tree
	 */
	void exitWhilestatemen(projectParser.WhilestatemenContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#switchstatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchstatement(projectParser.SwitchstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#switchstatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchstatement(projectParser.SwitchstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#switch_With_ID}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_With_ID(projectParser.Switch_With_IDContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#switch_With_ID}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_With_ID(projectParser.Switch_With_IDContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#switch_With_NUM}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_With_NUM(projectParser.Switch_With_NUMContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#switch_With_NUM}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_With_NUM(projectParser.Switch_With_NUMContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#casestatement}.
	 * @param ctx the parse tree
	 */
	void enterCasestatement(projectParser.CasestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#casestatement}.
	 * @param ctx the parse tree
	 */
	void exitCasestatement(projectParser.CasestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#case_With_ID}.
	 * @param ctx the parse tree
	 */
	void enterCase_With_ID(projectParser.Case_With_IDContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#case_With_ID}.
	 * @param ctx the parse tree
	 */
	void exitCase_With_ID(projectParser.Case_With_IDContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#case_With_NUM}.
	 * @param ctx the parse tree
	 */
	void enterCase_With_NUM(projectParser.Case_With_NUMContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#case_With_NUM}.
	 * @param ctx the parse tree
	 */
	void exitCase_With_NUM(projectParser.Case_With_NUMContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#defaultstatement}.
	 * @param ctx the parse tree
	 */
	void enterDefaultstatement(projectParser.DefaultstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#defaultstatement}.
	 * @param ctx the parse tree
	 */
	void exitDefaultstatement(projectParser.DefaultstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#tryCatchstatement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchstatement(projectParser.TryCatchstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#tryCatchstatement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchstatement(projectParser.TryCatchstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#boolean_p}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_p(projectParser.Boolean_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#boolean_p}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_p(projectParser.Boolean_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#numbers}.
	 * @param ctx the parse tree
	 */
	void enterNumbers(projectParser.NumbersContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#numbers}.
	 * @param ctx the parse tree
	 */
	void exitNumbers(projectParser.NumbersContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(projectParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(projectParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(projectParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(projectParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMath(projectParser.MathContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMath(projectParser.MathContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#boolExpresion}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpresion(projectParser.BoolExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#boolExpresion}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpresion(projectParser.BoolExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(projectParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(projectParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#nestedLogic}.
	 * @param ctx the parse tree
	 */
	void enterNestedLogic(projectParser.NestedLogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#nestedLogic}.
	 * @param ctx the parse tree
	 */
	void exitNestedLogic(projectParser.NestedLogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#nestedLogic2}.
	 * @param ctx the parse tree
	 */
	void enterNestedLogic2(projectParser.NestedLogic2Context ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#nestedLogic2}.
	 * @param ctx the parse tree
	 */
	void exitNestedLogic2(projectParser.NestedLogic2Context ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(projectParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(projectParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(projectParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(projectParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#doWhilestatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhilestatement(projectParser.DoWhilestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#doWhilestatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhilestatement(projectParser.DoWhilestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(projectParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(projectParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(projectParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(projectParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(projectParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(projectParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#subtraction}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(projectParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#subtraction}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(projectParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#division}.
	 * @param ctx the parse tree
	 */
	void enterDivision(projectParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#division}.
	 * @param ctx the parse tree
	 */
	void exitDivision(projectParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(projectParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(projectParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#integer_i}.
	 * @param ctx the parse tree
	 */
	void enterInteger_i(projectParser.Integer_iContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#integer_i}.
	 * @param ctx the parse tree
	 */
	void exitInteger_i(projectParser.Integer_iContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(projectParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(projectParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#void_Function_NOReturn_NoARG}.
	 * @param ctx the parse tree
	 */
	void enterVoid_Function_NOReturn_NoARG(projectParser.Void_Function_NOReturn_NoARGContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#void_Function_NOReturn_NoARG}.
	 * @param ctx the parse tree
	 */
	void exitVoid_Function_NOReturn_NoARG(projectParser.Void_Function_NOReturn_NoARGContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#int_Function_Return_NoARG}.
	 * @param ctx the parse tree
	 */
	void enterInt_Function_Return_NoARG(projectParser.Int_Function_Return_NoARGContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#int_Function_Return_NoARG}.
	 * @param ctx the parse tree
	 */
	void exitInt_Function_Return_NoARG(projectParser.Int_Function_Return_NoARGContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#string_Function_Return_NoARG}.
	 * @param ctx the parse tree
	 */
	void enterString_Function_Return_NoARG(projectParser.String_Function_Return_NoARGContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#string_Function_Return_NoARG}.
	 * @param ctx the parse tree
	 */
	void exitString_Function_Return_NoARG(projectParser.String_Function_Return_NoARGContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#double_Function_Return_NoARG}.
	 * @param ctx the parse tree
	 */
	void enterDouble_Function_Return_NoARG(projectParser.Double_Function_Return_NoARGContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#double_Function_Return_NoARG}.
	 * @param ctx the parse tree
	 */
	void exitDouble_Function_Return_NoARG(projectParser.Double_Function_Return_NoARGContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#float_Function_Return_NoARG}.
	 * @param ctx the parse tree
	 */
	void enterFloat_Function_Return_NoARG(projectParser.Float_Function_Return_NoARGContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#float_Function_Return_NoARG}.
	 * @param ctx the parse tree
	 */
	void exitFloat_Function_Return_NoARG(projectParser.Float_Function_Return_NoARGContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#void_Function_NOReturn_ARG}.
	 * @param ctx the parse tree
	 */
	void enterVoid_Function_NOReturn_ARG(projectParser.Void_Function_NOReturn_ARGContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#void_Function_NOReturn_ARG}.
	 * @param ctx the parse tree
	 */
	void exitVoid_Function_NOReturn_ARG(projectParser.Void_Function_NOReturn_ARGContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#int_Function_Return_ARG}.
	 * @param ctx the parse tree
	 */
	void enterInt_Function_Return_ARG(projectParser.Int_Function_Return_ARGContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#int_Function_Return_ARG}.
	 * @param ctx the parse tree
	 */
	void exitInt_Function_Return_ARG(projectParser.Int_Function_Return_ARGContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#string_Function_Return_ARG}.
	 * @param ctx the parse tree
	 */
	void enterString_Function_Return_ARG(projectParser.String_Function_Return_ARGContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#string_Function_Return_ARG}.
	 * @param ctx the parse tree
	 */
	void exitString_Function_Return_ARG(projectParser.String_Function_Return_ARGContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#double_Function_Return_ARG}.
	 * @param ctx the parse tree
	 */
	void enterDouble_Function_Return_ARG(projectParser.Double_Function_Return_ARGContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#double_Function_Return_ARG}.
	 * @param ctx the parse tree
	 */
	void exitDouble_Function_Return_ARG(projectParser.Double_Function_Return_ARGContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#floate_Function_Return_ARG}.
	 * @param ctx the parse tree
	 */
	void enterFloate_Function_Return_ARG(projectParser.Floate_Function_Return_ARGContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#floate_Function_Return_ARG}.
	 * @param ctx the parse tree
	 */
	void exitFloate_Function_Return_ARG(projectParser.Floate_Function_Return_ARGContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#argumentFunctionType}.
	 * @param ctx the parse tree
	 */
	void enterArgumentFunctionType(projectParser.ArgumentFunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#argumentFunctionType}.
	 * @param ctx the parse tree
	 */
	void exitArgumentFunctionType(projectParser.ArgumentFunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(projectParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(projectParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#returnID}.
	 * @param ctx the parse tree
	 */
	void enterReturnID(projectParser.ReturnIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#returnID}.
	 * @param ctx the parse tree
	 */
	void exitReturnID(projectParser.ReturnIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#returnINPUT_D_Q_I}.
	 * @param ctx the parse tree
	 */
	void enterReturnINPUT_D_Q_I(projectParser.ReturnINPUT_D_Q_IContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#returnINPUT_D_Q_I}.
	 * @param ctx the parse tree
	 */
	void exitReturnINPUT_D_Q_I(projectParser.ReturnINPUT_D_Q_IContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#returnRule}.
	 * @param ctx the parse tree
	 */
	void enterReturnRule(projectParser.ReturnRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#returnRule}.
	 * @param ctx the parse tree
	 */
	void exitReturnRule(projectParser.ReturnRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(projectParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(projectParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#returnNum}.
	 * @param ctx the parse tree
	 */
	void enterReturnNum(projectParser.ReturnNumContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#returnNum}.
	 * @param ctx the parse tree
	 */
	void exitReturnNum(projectParser.ReturnNumContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#returnNumFloat}.
	 * @param ctx the parse tree
	 */
	void enterReturnNumFloat(projectParser.ReturnNumFloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#returnNumFloat}.
	 * @param ctx the parse tree
	 */
	void exitReturnNumFloat(projectParser.ReturnNumFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#returnNumDouble}.
	 * @param ctx the parse tree
	 */
	void enterReturnNumDouble(projectParser.ReturnNumDoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#returnNumDouble}.
	 * @param ctx the parse tree
	 */
	void exitReturnNumDouble(projectParser.ReturnNumDoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#classS}.
	 * @param ctx the parse tree
	 */
	void enterClassS(projectParser.ClassSContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#classS}.
	 * @param ctx the parse tree
	 */
	void exitClassS(projectParser.ClassSContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#classstatement}.
	 * @param ctx the parse tree
	 */
	void enterClassstatement(projectParser.ClassstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#classstatement}.
	 * @param ctx the parse tree
	 */
	void exitClassstatement(projectParser.ClassstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#abstractstatment}.
	 * @param ctx the parse tree
	 */
	void enterAbstractstatment(projectParser.AbstractstatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#abstractstatment}.
	 * @param ctx the parse tree
	 */
	void exitAbstractstatment(projectParser.AbstractstatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#extendsClass}.
	 * @param ctx the parse tree
	 */
	void enterExtendsClass(projectParser.ExtendsClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#extendsClass}.
	 * @param ctx the parse tree
	 */
	void exitExtendsClass(projectParser.ExtendsClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#extends_ClassStatment_Withinput}.
	 * @param ctx the parse tree
	 */
	void enterExtends_ClassStatment_Withinput(projectParser.Extends_ClassStatment_WithinputContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#extends_ClassStatment_Withinput}.
	 * @param ctx the parse tree
	 */
	void exitExtends_ClassStatment_Withinput(projectParser.Extends_ClassStatment_WithinputContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#extends_ClassStatment_Withoutinput}.
	 * @param ctx the parse tree
	 */
	void enterExtends_ClassStatment_Withoutinput(projectParser.Extends_ClassStatment_WithoutinputContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#extends_ClassStatment_Withoutinput}.
	 * @param ctx the parse tree
	 */
	void exitExtends_ClassStatment_Withoutinput(projectParser.Extends_ClassStatment_WithoutinputContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#extends_ClassStateFull}.
	 * @param ctx the parse tree
	 */
	void enterExtends_ClassStateFull(projectParser.Extends_ClassStateFullContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#extends_ClassStateFull}.
	 * @param ctx the parse tree
	 */
	void exitExtends_ClassStateFull(projectParser.Extends_ClassStateFullContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#extends_ClassStateLess}.
	 * @param ctx the parse tree
	 */
	void enterExtends_ClassStateLess(projectParser.Extends_ClassStateLessContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#extends_ClassStateLess}.
	 * @param ctx the parse tree
	 */
	void exitExtends_ClassStateLess(projectParser.Extends_ClassStateLessContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#extends_ClassStateFull_WithAppBar}.
	 * @param ctx the parse tree
	 */
	void enterExtends_ClassStateFull_WithAppBar(projectParser.Extends_ClassStateFull_WithAppBarContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#extends_ClassStateFull_WithAppBar}.
	 * @param ctx the parse tree
	 */
	void exitExtends_ClassStateFull_WithAppBar(projectParser.Extends_ClassStateFull_WithAppBarContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#extends_ClassStateLess_WithAppBar}.
	 * @param ctx the parse tree
	 */
	void enterExtends_ClassStateLess_WithAppBar(projectParser.Extends_ClassStateLess_WithAppBarContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#extends_ClassStateLess_WithAppBar}.
	 * @param ctx the parse tree
	 */
	void exitExtends_ClassStateLess_WithAppBar(projectParser.Extends_ClassStateLess_WithAppBarContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#extends_ClassStateFullwithinput}.
	 * @param ctx the parse tree
	 */
	void enterExtends_ClassStateFullwithinput(projectParser.Extends_ClassStateFullwithinputContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#extends_ClassStateFullwithinput}.
	 * @param ctx the parse tree
	 */
	void exitExtends_ClassStateFullwithinput(projectParser.Extends_ClassStateFullwithinputContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#extends_ClassStateLesswithinput}.
	 * @param ctx the parse tree
	 */
	void enterExtends_ClassStateLesswithinput(projectParser.Extends_ClassStateLesswithinputContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#extends_ClassStateLesswithinput}.
	 * @param ctx the parse tree
	 */
	void exitExtends_ClassStateLesswithinput(projectParser.Extends_ClassStateLesswithinputContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#extends_ClassStateFullwithinput_appBar}.
	 * @param ctx the parse tree
	 */
	void enterExtends_ClassStateFullwithinput_appBar(projectParser.Extends_ClassStateFullwithinput_appBarContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#extends_ClassStateFullwithinput_appBar}.
	 * @param ctx the parse tree
	 */
	void exitExtends_ClassStateFullwithinput_appBar(projectParser.Extends_ClassStateFullwithinput_appBarContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#extends_ClassStateLesswithinput_appBar}.
	 * @param ctx the parse tree
	 */
	void enterExtends_ClassStateLesswithinput_appBar(projectParser.Extends_ClassStateLesswithinput_appBarContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#extends_ClassStateLesswithinput_appBar}.
	 * @param ctx the parse tree
	 */
	void exitExtends_ClassStateLesswithinput_appBar(projectParser.Extends_ClassStateLesswithinput_appBarContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#input_AppBar}.
	 * @param ctx the parse tree
	 */
	void enterInput_AppBar(projectParser.Input_AppBarContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#input_AppBar}.
	 * @param ctx the parse tree
	 */
	void exitInput_AppBar(projectParser.Input_AppBarContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#input_1AppBar}.
	 * @param ctx the parse tree
	 */
	void enterInput_1AppBar(projectParser.Input_1AppBarContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#input_1AppBar}.
	 * @param ctx the parse tree
	 */
	void exitInput_1AppBar(projectParser.Input_1AppBarContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#input_2AppBar}.
	 * @param ctx the parse tree
	 */
	void enterInput_2AppBar(projectParser.Input_2AppBarContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#input_2AppBar}.
	 * @param ctx the parse tree
	 */
	void exitInput_2AppBar(projectParser.Input_2AppBarContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#input_3AppBar}.
	 * @param ctx the parse tree
	 */
	void enterInput_3AppBar(projectParser.Input_3AppBarContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#input_3AppBar}.
	 * @param ctx the parse tree
	 */
	void exitInput_3AppBar(projectParser.Input_3AppBarContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#input_4AppBar}.
	 * @param ctx the parse tree
	 */
	void enterInput_4AppBar(projectParser.Input_4AppBarContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#input_4AppBar}.
	 * @param ctx the parse tree
	 */
	void exitInput_4AppBar(projectParser.Input_4AppBarContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(projectParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(projectParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#color_red}.
	 * @param ctx the parse tree
	 */
	void enterColor_red(projectParser.Color_redContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#color_red}.
	 * @param ctx the parse tree
	 */
	void exitColor_red(projectParser.Color_redContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#color_green}.
	 * @param ctx the parse tree
	 */
	void enterColor_green(projectParser.Color_greenContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#color_green}.
	 * @param ctx the parse tree
	 */
	void exitColor_green(projectParser.Color_greenContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#containerStatement}.
	 * @param ctx the parse tree
	 */
	void enterContainerStatement(projectParser.ContainerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#containerStatement}.
	 * @param ctx the parse tree
	 */
	void exitContainerStatement(projectParser.ContainerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#rowStatement}.
	 * @param ctx the parse tree
	 */
	void enterRowStatement(projectParser.RowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#rowStatement}.
	 * @param ctx the parse tree
	 */
	void exitRowStatement(projectParser.RowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#colStatemenst}.
	 * @param ctx the parse tree
	 */
	void enterColStatemenst(projectParser.ColStatemenstContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#colStatemenst}.
	 * @param ctx the parse tree
	 */
	void exitColStatemenst(projectParser.ColStatemenstContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#texeStatement}.
	 * @param ctx the parse tree
	 */
	void enterTexeStatement(projectParser.TexeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#texeStatement}.
	 * @param ctx the parse tree
	 */
	void exitTexeStatement(projectParser.TexeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#text_INPUT_D_Q_N}.
	 * @param ctx the parse tree
	 */
	void enterText_INPUT_D_Q_N(projectParser.Text_INPUT_D_Q_NContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#text_INPUT_D_Q_N}.
	 * @param ctx the parse tree
	 */
	void exitText_INPUT_D_Q_N(projectParser.Text_INPUT_D_Q_NContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#text_INPUT_D_Q_I}.
	 * @param ctx the parse tree
	 */
	void enterText_INPUT_D_Q_I(projectParser.Text_INPUT_D_Q_IContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#text_INPUT_D_Q_I}.
	 * @param ctx the parse tree
	 */
	void exitText_INPUT_D_Q_I(projectParser.Text_INPUT_D_Q_IContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#text_rule}.
	 * @param ctx the parse tree
	 */
	void enterText_rule(projectParser.Text_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#text_rule}.
	 * @param ctx the parse tree
	 */
	void exitText_rule(projectParser.Text_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#sizedBox}.
	 * @param ctx the parse tree
	 */
	void enterSizedBox(projectParser.SizedBoxContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#sizedBox}.
	 * @param ctx the parse tree
	 */
	void exitSizedBox(projectParser.SizedBoxContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#hight_SizedBox}.
	 * @param ctx the parse tree
	 */
	void enterHight_SizedBox(projectParser.Hight_SizedBoxContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#hight_SizedBox}.
	 * @param ctx the parse tree
	 */
	void exitHight_SizedBox(projectParser.Hight_SizedBoxContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#width_SizedBox}.
	 * @param ctx the parse tree
	 */
	void enterWidth_SizedBox(projectParser.Width_SizedBoxContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#width_SizedBox}.
	 * @param ctx the parse tree
	 */
	void exitWidth_SizedBox(projectParser.Width_SizedBoxContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#widthHight_SizedBox}.
	 * @param ctx the parse tree
	 */
	void enterWidthHight_SizedBox(projectParser.WidthHight_SizedBoxContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#widthHight_SizedBox}.
	 * @param ctx the parse tree
	 */
	void exitWidthHight_SizedBox(projectParser.WidthHight_SizedBoxContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#hightWidth_SizedBox}.
	 * @param ctx the parse tree
	 */
	void enterHightWidth_SizedBox(projectParser.HightWidth_SizedBoxContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#hightWidth_SizedBox}.
	 * @param ctx the parse tree
	 */
	void exitHightWidth_SizedBox(projectParser.HightWidth_SizedBoxContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#textButton}.
	 * @param ctx the parse tree
	 */
	void enterTextButton(projectParser.TextButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#textButton}.
	 * @param ctx the parse tree
	 */
	void exitTextButton(projectParser.TextButtonContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#imageState}.
	 * @param ctx the parse tree
	 */
	void enterImageState(projectParser.ImageStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#imageState}.
	 * @param ctx the parse tree
	 */
	void exitImageState(projectParser.ImageStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#image_withAssetImage}.
	 * @param ctx the parse tree
	 */
	void enterImage_withAssetImage(projectParser.Image_withAssetImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#image_withAssetImage}.
	 * @param ctx the parse tree
	 */
	void exitImage_withAssetImage(projectParser.Image_withAssetImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#image_withAssetImage_WithDirection}.
	 * @param ctx the parse tree
	 */
	void enterImage_withAssetImage_WithDirection(projectParser.Image_withAssetImage_WithDirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#image_withAssetImage_WithDirection}.
	 * @param ctx the parse tree
	 */
	void exitImage_withAssetImage_WithDirection(projectParser.Image_withAssetImage_WithDirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#image_withAssetImage_WithDirection_fit}.
	 * @param ctx the parse tree
	 */
	void enterImage_withAssetImage_WithDirection_fit(projectParser.Image_withAssetImage_WithDirection_fitContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#image_withAssetImage_WithDirection_fit}.
	 * @param ctx the parse tree
	 */
	void exitImage_withAssetImage_WithDirection_fit(projectParser.Image_withAssetImage_WithDirection_fitContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#image_withAsset}.
	 * @param ctx the parse tree
	 */
	void enterImage_withAsset(projectParser.Image_withAssetContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#image_withAsset}.
	 * @param ctx the parse tree
	 */
	void exitImage_withAsset(projectParser.Image_withAssetContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#image_withNetWoek}.
	 * @param ctx the parse tree
	 */
	void enterImage_withNetWoek(projectParser.Image_withNetWoekContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#image_withNetWoek}.
	 * @param ctx the parse tree
	 */
	void exitImage_withNetWoek(projectParser.Image_withNetWoekContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#image_withFile}.
	 * @param ctx the parse tree
	 */
	void enterImage_withFile(projectParser.Image_withFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#image_withFile}.
	 * @param ctx the parse tree
	 */
	void exitImage_withFile(projectParser.Image_withFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#imageDirection}.
	 * @param ctx the parse tree
	 */
	void enterImageDirection(projectParser.ImageDirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#imageDirection}.
	 * @param ctx the parse tree
	 */
	void exitImageDirection(projectParser.ImageDirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#imageHight_DF}.
	 * @param ctx the parse tree
	 */
	void enterImageHight_DF(projectParser.ImageHight_DFContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#imageHight_DF}.
	 * @param ctx the parse tree
	 */
	void exitImageHight_DF(projectParser.ImageHight_DFContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#imageWidth_DF}.
	 * @param ctx the parse tree
	 */
	void enterImageWidth_DF(projectParser.ImageWidth_DFContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#imageWidth_DF}.
	 * @param ctx the parse tree
	 */
	void exitImageWidth_DF(projectParser.ImageWidth_DFContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#imageHightWidth_DF}.
	 * @param ctx the parse tree
	 */
	void enterImageHightWidth_DF(projectParser.ImageHightWidth_DFContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#imageHightWidth_DF}.
	 * @param ctx the parse tree
	 */
	void exitImageHightWidth_DF(projectParser.ImageHightWidth_DFContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#imageWidthHight_DF}.
	 * @param ctx the parse tree
	 */
	void enterImageWidthHight_DF(projectParser.ImageWidthHight_DFContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#imageWidthHight_DF}.
	 * @param ctx the parse tree
	 */
	void exitImageWidthHight_DF(projectParser.ImageWidthHight_DFContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#imageHightWidth_DN}.
	 * @param ctx the parse tree
	 */
	void enterImageHightWidth_DN(projectParser.ImageHightWidth_DNContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#imageHightWidth_DN}.
	 * @param ctx the parse tree
	 */
	void exitImageHightWidth_DN(projectParser.ImageHightWidth_DNContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#imageWidthHight_DN}.
	 * @param ctx the parse tree
	 */
	void enterImageWidthHight_DN(projectParser.ImageWidthHight_DNContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#imageWidthHight_DN}.
	 * @param ctx the parse tree
	 */
	void exitImageWidthHight_DN(projectParser.ImageWidthHight_DNContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#imageFit}.
	 * @param ctx the parse tree
	 */
	void enterImageFit(projectParser.ImageFitContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#imageFit}.
	 * @param ctx the parse tree
	 */
	void exitImageFit(projectParser.ImageFitContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#expandedStatment}.
	 * @param ctx the parse tree
	 */
	void enterExpandedStatment(projectParser.ExpandedStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#expandedStatment}.
	 * @param ctx the parse tree
	 */
	void exitExpandedStatment(projectParser.ExpandedStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#expanded_withCol}.
	 * @param ctx the parse tree
	 */
	void enterExpanded_withCol(projectParser.Expanded_withColContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#expanded_withCol}.
	 * @param ctx the parse tree
	 */
	void exitExpanded_withCol(projectParser.Expanded_withColContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#expanded_withRow}.
	 * @param ctx the parse tree
	 */
	void enterExpanded_withRow(projectParser.Expanded_withRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#expanded_withRow}.
	 * @param ctx the parse tree
	 */
	void exitExpanded_withRow(projectParser.Expanded_withRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#paddingStatement}.
	 * @param ctx the parse tree
	 */
	void enterPaddingStatement(projectParser.PaddingStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#paddingStatement}.
	 * @param ctx the parse tree
	 */
	void exitPaddingStatement(projectParser.PaddingStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#padding_all}.
	 * @param ctx the parse tree
	 */
	void enterPadding_all(projectParser.Padding_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#padding_all}.
	 * @param ctx the parse tree
	 */
	void exitPadding_all(projectParser.Padding_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#padding_sym_vertical_num}.
	 * @param ctx the parse tree
	 */
	void enterPadding_sym_vertical_num(projectParser.Padding_sym_vertical_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#padding_sym_vertical_num}.
	 * @param ctx the parse tree
	 */
	void exitPadding_sym_vertical_num(projectParser.Padding_sym_vertical_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#padding_sym_vertical_numFloat}.
	 * @param ctx the parse tree
	 */
	void enterPadding_sym_vertical_numFloat(projectParser.Padding_sym_vertical_numFloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#padding_sym_vertical_numFloat}.
	 * @param ctx the parse tree
	 */
	void exitPadding_sym_vertical_numFloat(projectParser.Padding_sym_vertical_numFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#padding_sym_horisantal_num}.
	 * @param ctx the parse tree
	 */
	void enterPadding_sym_horisantal_num(projectParser.Padding_sym_horisantal_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#padding_sym_horisantal_num}.
	 * @param ctx the parse tree
	 */
	void exitPadding_sym_horisantal_num(projectParser.Padding_sym_horisantal_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#padding_sym_horisantal_numFloat}.
	 * @param ctx the parse tree
	 */
	void enterPadding_sym_horisantal_numFloat(projectParser.Padding_sym_horisantal_numFloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#padding_sym_horisantal_numFloat}.
	 * @param ctx the parse tree
	 */
	void exitPadding_sym_horisantal_numFloat(projectParser.Padding_sym_horisantal_numFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#padding_only}.
	 * @param ctx the parse tree
	 */
	void enterPadding_only(projectParser.Padding_onlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#padding_only}.
	 * @param ctx the parse tree
	 */
	void exitPadding_only(projectParser.Padding_onlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(projectParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(projectParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#top_direction_NUM}.
	 * @param ctx the parse tree
	 */
	void enterTop_direction_NUM(projectParser.Top_direction_NUMContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#top_direction_NUM}.
	 * @param ctx the parse tree
	 */
	void exitTop_direction_NUM(projectParser.Top_direction_NUMContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#right_direction_NUM}.
	 * @param ctx the parse tree
	 */
	void enterRight_direction_NUM(projectParser.Right_direction_NUMContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#right_direction_NUM}.
	 * @param ctx the parse tree
	 */
	void exitRight_direction_NUM(projectParser.Right_direction_NUMContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#bottom_direction_NUM}.
	 * @param ctx the parse tree
	 */
	void enterBottom_direction_NUM(projectParser.Bottom_direction_NUMContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#bottom_direction_NUM}.
	 * @param ctx the parse tree
	 */
	void exitBottom_direction_NUM(projectParser.Bottom_direction_NUMContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#left_direction_NUM}.
	 * @param ctx the parse tree
	 */
	void enterLeft_direction_NUM(projectParser.Left_direction_NUMContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#left_direction_NUM}.
	 * @param ctx the parse tree
	 */
	void exitLeft_direction_NUM(projectParser.Left_direction_NUMContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#top_direction_FLOAT}.
	 * @param ctx the parse tree
	 */
	void enterTop_direction_FLOAT(projectParser.Top_direction_FLOATContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#top_direction_FLOAT}.
	 * @param ctx the parse tree
	 */
	void exitTop_direction_FLOAT(projectParser.Top_direction_FLOATContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#right_direction_FLOAT}.
	 * @param ctx the parse tree
	 */
	void enterRight_direction_FLOAT(projectParser.Right_direction_FLOATContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#right_direction_FLOAT}.
	 * @param ctx the parse tree
	 */
	void exitRight_direction_FLOAT(projectParser.Right_direction_FLOATContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#bottom_direction_FLOAT}.
	 * @param ctx the parse tree
	 */
	void enterBottom_direction_FLOAT(projectParser.Bottom_direction_FLOATContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#bottom_direction_FLOAT}.
	 * @param ctx the parse tree
	 */
	void exitBottom_direction_FLOAT(projectParser.Bottom_direction_FLOATContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#left_direction_FLOAT}.
	 * @param ctx the parse tree
	 */
	void enterLeft_direction_FLOAT(projectParser.Left_direction_FLOATContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#left_direction_FLOAT}.
	 * @param ctx the parse tree
	 */
	void exitLeft_direction_FLOAT(projectParser.Left_direction_FLOATContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#top_direction_NUM_D}.
	 * @param ctx the parse tree
	 */
	void enterTop_direction_NUM_D(projectParser.Top_direction_NUM_DContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#top_direction_NUM_D}.
	 * @param ctx the parse tree
	 */
	void exitTop_direction_NUM_D(projectParser.Top_direction_NUM_DContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#right_direction_NUM_D}.
	 * @param ctx the parse tree
	 */
	void enterRight_direction_NUM_D(projectParser.Right_direction_NUM_DContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#right_direction_NUM_D}.
	 * @param ctx the parse tree
	 */
	void exitRight_direction_NUM_D(projectParser.Right_direction_NUM_DContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#bottom_direction_NUM_D}.
	 * @param ctx the parse tree
	 */
	void enterBottom_direction_NUM_D(projectParser.Bottom_direction_NUM_DContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#bottom_direction_NUM_D}.
	 * @param ctx the parse tree
	 */
	void exitBottom_direction_NUM_D(projectParser.Bottom_direction_NUM_DContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#left_direction_NUM_D}.
	 * @param ctx the parse tree
	 */
	void enterLeft_direction_NUM_D(projectParser.Left_direction_NUM_DContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#left_direction_NUM_D}.
	 * @param ctx the parse tree
	 */
	void exitLeft_direction_NUM_D(projectParser.Left_direction_NUM_DContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#top_direction_FLOAT_D}.
	 * @param ctx the parse tree
	 */
	void enterTop_direction_FLOAT_D(projectParser.Top_direction_FLOAT_DContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#top_direction_FLOAT_D}.
	 * @param ctx the parse tree
	 */
	void exitTop_direction_FLOAT_D(projectParser.Top_direction_FLOAT_DContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#right_direction_FLOAT_D}.
	 * @param ctx the parse tree
	 */
	void enterRight_direction_FLOAT_D(projectParser.Right_direction_FLOAT_DContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#right_direction_FLOAT_D}.
	 * @param ctx the parse tree
	 */
	void exitRight_direction_FLOAT_D(projectParser.Right_direction_FLOAT_DContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#bottom_direction_FLOAT_D}.
	 * @param ctx the parse tree
	 */
	void enterBottom_direction_FLOAT_D(projectParser.Bottom_direction_FLOAT_DContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#bottom_direction_FLOAT_D}.
	 * @param ctx the parse tree
	 */
	void exitBottom_direction_FLOAT_D(projectParser.Bottom_direction_FLOAT_DContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#left_direction_FLOAT_D}.
	 * @param ctx the parse tree
	 */
	void enterLeft_direction_FLOAT_D(projectParser.Left_direction_FLOAT_DContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#left_direction_FLOAT_D}.
	 * @param ctx the parse tree
	 */
	void exitLeft_direction_FLOAT_D(projectParser.Left_direction_FLOAT_DContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#flutterWidget}.
	 * @param ctx the parse tree
	 */
	void enterFlutterWidget(projectParser.FlutterWidgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#flutterWidget}.
	 * @param ctx the parse tree
	 */
	void exitFlutterWidget(projectParser.FlutterWidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#inputI}.
	 * @param ctx the parse tree
	 */
	void enterInputI(projectParser.InputIContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#inputI}.
	 * @param ctx the parse tree
	 */
	void exitInputI(projectParser.InputIContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#inputclass}.
	 * @param ctx the parse tree
	 */
	void enterInputclass(projectParser.InputclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#inputclass}.
	 * @param ctx the parse tree
	 */
	void exitInputclass(projectParser.InputclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#namen}.
	 * @param ctx the parse tree
	 */
	void enterNamen(projectParser.NamenContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#namen}.
	 * @param ctx the parse tree
	 */
	void exitNamen(projectParser.NamenContext ctx);
}