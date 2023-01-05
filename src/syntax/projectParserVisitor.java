// Generated from C:/Users/thuraya/IdeaProjects/hncompilerlastone/src/syntax\projectParser.g4 by ANTLR 4.10.1
package syntax;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link projectParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface projectParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link projectParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(projectParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(projectParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(projectParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#float_f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_f(projectParser.Float_fContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#int_i}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_i(projectParser.Int_iContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#double_d}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_d(projectParser.Double_dContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(projectParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#array_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_var(projectParser.Array_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#array_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_int(projectParser.Array_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#array_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_string(projectParser.Array_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#array_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_float(projectParser.Array_floatContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#arraybody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraybody(projectParser.ArraybodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#arrayINT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayINT(projectParser.ArrayINTContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#arraySTRING}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySTRING(projectParser.ArraySTRINGContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#arrayFLOAT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayFLOAT(projectParser.ArrayFLOATContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#initial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial(projectParser.InitialContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#var_Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_Variable(projectParser.Var_VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#var_Variable_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_Variable_expr(projectParser.Var_Variable_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#var_Variable_emp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_Variable_emp(projectParser.Var_Variable_empContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#varVariable_INPUT_D_Q_N}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarVariable_INPUT_D_Q_N(projectParser.VarVariable_INPUT_D_Q_NContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#varVariable_INPUT_D_Q_I}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarVariable_INPUT_D_Q_I(projectParser.VarVariable_INPUT_D_Q_IContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#const_Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_Variable(projectParser.Const_VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#const_Variable_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_Variable_expr(projectParser.Const_Variable_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#const_Variable_emp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_Variable_emp(projectParser.Const_Variable_empContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#const_Variable_INPUT_D_Q_N}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_Variable_INPUT_D_Q_N(projectParser.Const_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#const_Variable_INPUT_D_Q_I}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_Variable_INPUT_D_Q_I(projectParser.Const_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#dynamic_Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_Variable(projectParser.Dynamic_VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#dynamic_Variable_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_Variable_expr(projectParser.Dynamic_Variable_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#dynamic_Variable_emp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_Variable_emp(projectParser.Dynamic_Variable_empContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#dynamic_Variable_INPUT_D_Q_N}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_Variable_INPUT_D_Q_N(projectParser.Dynamic_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#dynamic_Variable_INPUT_D_Q_I}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_Variable_INPUT_D_Q_I(projectParser.Dynamic_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#final_Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal_Variable(projectParser.Final_VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#final_Variable_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal_Variable_expr(projectParser.Final_Variable_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#final_Variable_emp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal_Variable_emp(projectParser.Final_Variable_empContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#final_Variable_INPUT_D_Q_N}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal_Variable_INPUT_D_Q_N(projectParser.Final_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#final_Variable_INPUT_D_Q_I}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal_Variable_INPUT_D_Q_I(projectParser.Final_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#string_Variable_INPUT_D_Q_N}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_Variable_INPUT_D_Q_N(projectParser.String_Variable_INPUT_D_Q_NContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#string_Variable_INPUT_D_Q_I}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_Variable_INPUT_D_Q_I(projectParser.String_Variable_INPUT_D_Q_IContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#string_Variable_TEXT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_Variable_TEXT(projectParser.String_Variable_TEXTContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#int_Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_Variable(projectParser.Int_VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#int_Variable_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_Variable_expr(projectParser.Int_Variable_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#int_Variable_emp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_Variable_emp(projectParser.Int_Variable_empContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#float_Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_Variable(projectParser.Float_VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#double_Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_Variable(projectParser.Double_VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#boolean_Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_Variable(projectParser.Boolean_VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(projectParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#for_VAR_With_ID_ID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_VAR_With_ID_ID(projectParser.For_VAR_With_ID_IDContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#for_INT_With_ID_ID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_INT_With_ID_ID(projectParser.For_INT_With_ID_IDContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#for_VAR_With_ID_NUM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_VAR_With_ID_NUM(projectParser.For_VAR_With_ID_NUMContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#for_INT_With_ID_NUM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_INT_With_ID_NUM(projectParser.For_INT_With_ID_NUMContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#printstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintstatement(projectParser.PrintstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#print_ID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_ID(projectParser.Print_IDContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#print_NUM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_NUM(projectParser.Print_NUMContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#print_TEXT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_TEXT(projectParser.Print_TEXTContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(projectParser.RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(projectParser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#if_WithInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_WithInput(projectParser.If_WithInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#ifif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfif(projectParser.IfifContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#elseif_WithInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_WithInput(projectParser.Elseif_WithInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#else_WithInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_WithInput(projectParser.Else_WithInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#whilestatemen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestatemen(projectParser.WhilestatemenContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#switchstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchstatement(projectParser.SwitchstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#switch_With_ID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_With_ID(projectParser.Switch_With_IDContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#switch_With_NUM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_With_NUM(projectParser.Switch_With_NUMContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#casestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasestatement(projectParser.CasestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#case_With_ID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_With_ID(projectParser.Case_With_IDContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#case_With_NUM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_With_NUM(projectParser.Case_With_NUMContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#defaultstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultstatement(projectParser.DefaultstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#tryCatchstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchstatement(projectParser.TryCatchstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#boolean_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_p(projectParser.Boolean_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#numbers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumbers(projectParser.NumbersContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(projectParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(projectParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath(projectParser.MathContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#boolExpresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpresion(projectParser.BoolExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(projectParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#nestedLogic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedLogic(projectParser.NestedLogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#nestedLogic2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedLogic2(projectParser.NestedLogic2Context ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(projectParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(projectParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#doWhilestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhilestatement(projectParser.DoWhilestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(projectParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#multiplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(projectParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(projectParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#subtraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(projectParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(projectParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(projectParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#integer_i}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_i(projectParser.Integer_iContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(projectParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#void_Function_NOReturn_NoARG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid_Function_NOReturn_NoARG(projectParser.Void_Function_NOReturn_NoARGContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#int_Function_Return_NoARG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_Function_Return_NoARG(projectParser.Int_Function_Return_NoARGContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#string_Function_Return_NoARG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_Function_Return_NoARG(projectParser.String_Function_Return_NoARGContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#double_Function_Return_NoARG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_Function_Return_NoARG(projectParser.Double_Function_Return_NoARGContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#float_Function_Return_NoARG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_Function_Return_NoARG(projectParser.Float_Function_Return_NoARGContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#void_Function_NOReturn_ARG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid_Function_NOReturn_ARG(projectParser.Void_Function_NOReturn_ARGContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#int_Function_Return_ARG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_Function_Return_ARG(projectParser.Int_Function_Return_ARGContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#string_Function_Return_ARG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_Function_Return_ARG(projectParser.String_Function_Return_ARGContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#double_Function_Return_ARG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_Function_Return_ARG(projectParser.Double_Function_Return_ARGContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#floate_Function_Return_ARG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloate_Function_Return_ARG(projectParser.Floate_Function_Return_ARGContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#argumentFunctionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentFunctionType(projectParser.ArgumentFunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(projectParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#returnID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnID(projectParser.ReturnIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#returnINPUT_D_Q_I}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnINPUT_D_Q_I(projectParser.ReturnINPUT_D_Q_IContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#returnRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnRule(projectParser.ReturnRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(projectParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#returnNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnNum(projectParser.ReturnNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#returnNumFloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnNumFloat(projectParser.ReturnNumFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#returnNumDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnNumDouble(projectParser.ReturnNumDoubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#classS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassS(projectParser.ClassSContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#classstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassstatement(projectParser.ClassstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#abstractstatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractstatment(projectParser.AbstractstatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#extendsClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsClass(projectParser.ExtendsClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#extends_ClassStatment_Withinput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_ClassStatment_Withinput(projectParser.Extends_ClassStatment_WithinputContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#extends_ClassStatment_Withoutinput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_ClassStatment_Withoutinput(projectParser.Extends_ClassStatment_WithoutinputContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#extends_ClassStateFull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_ClassStateFull(projectParser.Extends_ClassStateFullContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#extends_ClassStateLess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_ClassStateLess(projectParser.Extends_ClassStateLessContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#extends_ClassStateFull_WithAppBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_ClassStateFull_WithAppBar(projectParser.Extends_ClassStateFull_WithAppBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#extends_ClassStateLess_WithAppBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_ClassStateLess_WithAppBar(projectParser.Extends_ClassStateLess_WithAppBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#extends_ClassStateFullwithinput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_ClassStateFullwithinput(projectParser.Extends_ClassStateFullwithinputContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#extends_ClassStateLesswithinput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_ClassStateLesswithinput(projectParser.Extends_ClassStateLesswithinputContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#extends_ClassStateFullwithinput_appBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_ClassStateFullwithinput_appBar(projectParser.Extends_ClassStateFullwithinput_appBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#extends_ClassStateLesswithinput_appBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_ClassStateLesswithinput_appBar(projectParser.Extends_ClassStateLesswithinput_appBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#input_AppBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_AppBar(projectParser.Input_AppBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#input_1AppBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_1AppBar(projectParser.Input_1AppBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#input_2AppBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_2AppBar(projectParser.Input_2AppBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#input_3AppBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_3AppBar(projectParser.Input_3AppBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#input_4AppBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_4AppBar(projectParser.Input_4AppBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(projectParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#color_red}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor_red(projectParser.Color_redContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#color_green}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor_green(projectParser.Color_greenContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#containerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerStatement(projectParser.ContainerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#rowStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowStatement(projectParser.RowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#colStatemenst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColStatemenst(projectParser.ColStatemenstContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#texeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexeStatement(projectParser.TexeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#text_INPUT_D_Q_N}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_INPUT_D_Q_N(projectParser.Text_INPUT_D_Q_NContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#text_INPUT_D_Q_I}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_INPUT_D_Q_I(projectParser.Text_INPUT_D_Q_IContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#text_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_rule(projectParser.Text_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#sizedBox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizedBox(projectParser.SizedBoxContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#hight_SizedBox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHight_SizedBox(projectParser.Hight_SizedBoxContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#width_SizedBox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth_SizedBox(projectParser.Width_SizedBoxContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#widthHight_SizedBox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidthHight_SizedBox(projectParser.WidthHight_SizedBoxContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#hightWidth_SizedBox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHightWidth_SizedBox(projectParser.HightWidth_SizedBoxContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#textButton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextButton(projectParser.TextButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#imageState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageState(projectParser.ImageStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#image_withAssetImage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage_withAssetImage(projectParser.Image_withAssetImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#image_withAssetImage_WithDirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage_withAssetImage_WithDirection(projectParser.Image_withAssetImage_WithDirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#image_withAssetImage_WithDirection_fit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage_withAssetImage_WithDirection_fit(projectParser.Image_withAssetImage_WithDirection_fitContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#image_withAsset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage_withAsset(projectParser.Image_withAssetContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#image_withNetWoek}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage_withNetWoek(projectParser.Image_withNetWoekContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#image_withFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage_withFile(projectParser.Image_withFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#imageDirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageDirection(projectParser.ImageDirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#imageHight_DF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageHight_DF(projectParser.ImageHight_DFContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#imageWidth_DF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageWidth_DF(projectParser.ImageWidth_DFContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#imageHightWidth_DF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageHightWidth_DF(projectParser.ImageHightWidth_DFContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#imageWidthHight_DF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageWidthHight_DF(projectParser.ImageWidthHight_DFContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#imageHightWidth_DN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageHightWidth_DN(projectParser.ImageHightWidth_DNContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#imageWidthHight_DN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageWidthHight_DN(projectParser.ImageWidthHight_DNContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#imageFit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageFit(projectParser.ImageFitContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#expandedStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpandedStatment(projectParser.ExpandedStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#expanded_withCol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpanded_withCol(projectParser.Expanded_withColContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#expanded_withRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpanded_withRow(projectParser.Expanded_withRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#paddingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaddingStatement(projectParser.PaddingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#padding_all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding_all(projectParser.Padding_allContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#padding_sym_vertical_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding_sym_vertical_num(projectParser.Padding_sym_vertical_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#padding_sym_vertical_numFloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding_sym_vertical_numFloat(projectParser.Padding_sym_vertical_numFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#padding_sym_horisantal_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding_sym_horisantal_num(projectParser.Padding_sym_horisantal_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#padding_sym_horisantal_numFloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding_sym_horisantal_numFloat(projectParser.Padding_sym_horisantal_numFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#padding_only}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding_only(projectParser.Padding_onlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(projectParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#top_direction_NUM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_direction_NUM(projectParser.Top_direction_NUMContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#right_direction_NUM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_direction_NUM(projectParser.Right_direction_NUMContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#bottom_direction_NUM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBottom_direction_NUM(projectParser.Bottom_direction_NUMContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#left_direction_NUM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_direction_NUM(projectParser.Left_direction_NUMContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#top_direction_FLOAT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_direction_FLOAT(projectParser.Top_direction_FLOATContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#right_direction_FLOAT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_direction_FLOAT(projectParser.Right_direction_FLOATContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#bottom_direction_FLOAT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBottom_direction_FLOAT(projectParser.Bottom_direction_FLOATContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#left_direction_FLOAT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_direction_FLOAT(projectParser.Left_direction_FLOATContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#top_direction_NUM_D}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_direction_NUM_D(projectParser.Top_direction_NUM_DContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#right_direction_NUM_D}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_direction_NUM_D(projectParser.Right_direction_NUM_DContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#bottom_direction_NUM_D}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBottom_direction_NUM_D(projectParser.Bottom_direction_NUM_DContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#left_direction_NUM_D}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_direction_NUM_D(projectParser.Left_direction_NUM_DContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#top_direction_FLOAT_D}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_direction_FLOAT_D(projectParser.Top_direction_FLOAT_DContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#right_direction_FLOAT_D}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_direction_FLOAT_D(projectParser.Right_direction_FLOAT_DContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#bottom_direction_FLOAT_D}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBottom_direction_FLOAT_D(projectParser.Bottom_direction_FLOAT_DContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#left_direction_FLOAT_D}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_direction_FLOAT_D(projectParser.Left_direction_FLOAT_DContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#flutterWidget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlutterWidget(projectParser.FlutterWidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#inputI}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputI(projectParser.InputIContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#inputclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputclass(projectParser.InputclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#namen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamen(projectParser.NamenContext ctx);
}