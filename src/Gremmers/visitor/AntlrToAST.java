package Gremmers.visitor;

import Gremmers.AST;
import Gremmers.NameN;
import Gremmers.array.*;
import Gremmers.classes.AbstractStatment;
import Gremmers.classes.ClassStatement;
import Gremmers.classes.ExtendsClass;
import Gremmers.expr.*;
import Gremmers.functions.*;
import Gremmers.prog.Body;
import Gremmers.prog.Classes;
import Gremmers.prog.Element;
import Gremmers.prog.Prog;
import Gremmers.var.DoWhileStatement.DoWhileStatement;
import Gremmers.var.Double;
import Gremmers.var.Expression.Math;
import Gremmers.var.Expression.*;
import Gremmers.var.Float;
import Gremmers.var.IfStatement.*;
import Gremmers.var.Initial.*;
import Gremmers.var.*;
import Gremmers.var.Loop.ForLoop;
import Gremmers.var.Loop.Loop;
import Gremmers.var.PrintStatement.PrintIdNum;
import Gremmers.var.PrintStatement.PrintStatement;
import Gremmers.var.PrintStatement.PrintText;
import Gremmers.var.SwitchStatement.Case.CaseStatement;
import Gremmers.var.SwitchStatement.Case.CaseWithID;
import Gremmers.var.SwitchStatement.Case.CaseWithNUM;
import Gremmers.var.SwitchStatement.DefaultStatement;
import Gremmers.var.SwitchStatement.SwitchStatement;
import Gremmers.var.SwitchStatement.SwitchWithID;
import Gremmers.var.SwitchStatement.SwitchWithNUM;
import Gremmers.var.TryCatchStatement.TryCatchStatement;
import Gremmers.var.WhileStatement.WhileStatement;
import syntax.projectParser;
import syntax.projectParserBaseVisitor;

public class AntlrToAST extends projectParserBaseVisitor<AST> {

    @Override
    public Prog visitProg(projectParser.ProgContext ctx) {
       System.out.println("visitProg");
        Prog pp = new Prog();
//        System.out.println("H");
        for(int i = 0 ; i < ctx.element().size() ;i++){
//            System.out.println("HHH");
            if(ctx.element(i) != null){
                pp.getElements().add(visitElement(ctx.element(i)));
            }
        }
        return  pp ;
    }

    @Override
    public Element visitElement(projectParser.ElementContext ctx) {
       System.out.println("visitElement");
        Element e = new Element();
        if(ctx.body() != null) {
//            System.out.println("1");
            e.setBody(visitBody(ctx.body()));
        }
        return e;
    }


    @Override
    public Body visitBody(projectParser.BodyContext ctx) {
        System.out.println("visitBody");
        Body body = new Body();
        if(ctx.classS() != null) {
//            System.out.println("2");
            body.setClasses(visitClassS(ctx.classS()));
        }
        else if(ctx.functionStatement() != null) {
            body.setFunctions(visitFunctionStatement(ctx.functionStatement()));
        }
        return body;
    }

    @Override
    public Float visitFloat_f(projectParser.Float_fContext ctx) {
        System.out.println("visitfloat");
        Float float_p = new Float();
        float_p.setFLOAT(ctx.NUM_FLOAT().toString().trim());
        return float_p;
    }

    @Override
    public IntI visitInt_i(projectParser.Int_iContext ctx) {
        System.out.println("visitInt");
        IntI int_p = new IntI();
        int_p.setIntt(ctx.NUM().toString().trim());
        return int_p;
    }

    @Override
    public Double visitDouble_d(projectParser.Double_dContext ctx) {
        System.out.println("visitdouble");
        Double double_p = new Double();
        double_p.setDouble(ctx.NUM_DOUBLE().toString().trim());
        return double_p;
    }

    @Override
    public ArrayType visitArrayType(projectParser.ArrayTypeContext ctx) {
        System.out.println("visitArrayType");
        ArrayType a = new ArrayType();
        if(ctx.array_var() != null){
            a.setArrayVar(visitArray_var(ctx.array_var()));
        }
        if(ctx.array_int() != null){
            a.setArrayInt(visitArray_int(ctx.array_int()));
        }
        if(ctx.array_string() != null){
            a.setArrayString(visitArray_string(ctx.array_string()));
        }
        if(ctx.array_float() != null){
            a.setArrayfloat(visitArray_float(ctx.array_float()));
        }
        return a;
    }

    @Override
    public ArrayVar visitArray_var(projectParser.Array_varContext ctx) {
        System.out.println("visitArray_Var");
        ArrayVar arrvar = new ArrayVar();
        arrvar.setVar(ctx.VAR().toString().trim());
        arrvar.setId(visitNamen(ctx.namen()));
        arrvar.setArraybody(visitArraybody(ctx.arraybody()));
        return arrvar;
    }

    @Override
    public ArrayInt visitArray_int(projectParser.Array_intContext ctx) {
        System.out.println("visitArray_Int");
        ArrayInt arrint = new ArrayInt();
        arrint.setVar(ctx.INT().toString().trim());
        arrint.setId(visitNamen(ctx.namen()));
        arrint.setArrayVarInt(visitArrayINT(ctx.arrayINT()));
        return arrint;
    }

    @Override
    public ArrayString visitArray_string(projectParser.Array_stringContext ctx) {
        System.out.println("visitArray_String");
        ArrayString arrstr = new ArrayString();
        arrstr.setVar(ctx.STRING().toString().trim());
        arrstr.setId(visitNamen(ctx.namen()));
        arrstr.setArrayVarString(visitArraySTRING(ctx.arraySTRING()));
        return arrstr;
    }

    @Override
    public ArrayFloat visitArray_float(projectParser.Array_floatContext ctx) {
        System.out.println("visitArray_Float");
        ArrayFloat arrflo = new ArrayFloat();
        arrflo.setVar(ctx.FLOAT().toString().trim());
        arrflo.setId(visitNamen(ctx.namen()));
        arrflo.setArrayVarFloat(visitArrayFLOAT(ctx.arrayFLOAT()));
        return arrflo;
    }

    @Override
    public ArrayBody visitArraybody(projectParser.ArraybodyContext ctx) {
        System.out.println("visitArrayBody");
        ArrayBody aa = new ArrayBody();
        if(ctx.arrayINT() != null){
            aa.setArrayVarInt(visitArrayINT(ctx.arrayINT()));
        }
        if(ctx.arraySTRING() != null){
            aa.setArrayVarString(visitArraySTRING(ctx.arraySTRING()));
        }
        if(ctx.arrayFLOAT() != null){
            aa.setArrayVarFloat(visitArrayFLOAT(ctx.arrayFLOAT()));
        }
        return aa;
    }

    @Override
    public ArrayVarInt visitArrayINT(projectParser.ArrayINTContext ctx) {
        System.out.println("visitArrayInt");
        ArrayVarInt aarvarint = new ArrayVarInt();
        for(int i=0 ; i< ctx.NUM().size(); i++){
            if(ctx.NUM(i) != null){
            aarvarint.addChild((ctx.NUM(i).toString()));
        }}
        return aarvarint;
    }

    @Override
    public ArrayVarString visitArraySTRING(projectParser.ArraySTRINGContext ctx) {
        System.out.println("visitArrayString");
        ArrayVarString aarvarstr = new ArrayVarString();
        for(int i=0 ; i< ctx.INPUT_D_Q_I().size(); i++){
            if(ctx.INPUT_D_Q_I(i) != null){
            aarvarstr.addChild(ctx.INPUT_D_Q_I().get(i).getText());
        }}
        return aarvarstr;
    }

    @Override
    public ArrayVarFloat visitArrayFLOAT(projectParser.ArrayFLOATContext ctx) {
        System.out.println("visitArrayFloat");
        ArrayVarFloat aarvarflo = new ArrayVarFloat();
        for(int i=0 ; i< ctx.NUM_FLOAT().size(); i++){
            if(ctx.NUM_FLOAT(i) != null){
            aarvarflo.addChild(ctx.NUM_FLOAT().get(i).getText());
        }}
        return aarvarflo;
    }

    @Override
    public Initial visitInitial(projectParser.InitialContext ctx) {
        System.out.println("visitInitial");
//        System.out.println("visitInitial");
        Initial in = new Initial();
        if(ctx.var_Variable() != null){
//            System.out.println("7");
            in.setVarvariable(visitVar_Variable(ctx.var_Variable()));
        }
        else if(ctx.var_Variable_expr() != null){
            in.setVarvariableexpr(visitVar_Variable_expr(ctx.var_Variable_expr()));
        }
        else if(ctx.var_Variable_emp() != null){
            in.setVarvariableemp(visitVar_Variable_emp(ctx.var_Variable_emp()));
        }
        else if(ctx.varVariable_INPUT_D_Q_N() != null){
            in.setVarvariable(visitVarVariable_INPUT_D_Q_N(ctx.varVariable_INPUT_D_Q_N()));
        }
        else if(ctx.varVariable_INPUT_D_Q_I() != null){
            in.setVarvariable(visitVarVariable_INPUT_D_Q_I(ctx.varVariable_INPUT_D_Q_I()));
        }
        else if(ctx.const_Variable() != null){
            in.setVarvariable(visitConst_Variable(ctx.const_Variable()));
        }
        else if(ctx.const_Variable_expr() != null){
            in.setVarvariableexpr(visitConst_Variable_expr(ctx.const_Variable_expr()));
        }
        else if(ctx.const_Variable_emp() != null){
            in.setVarvariableemp(visitConst_Variable_emp(ctx.const_Variable_emp()));
        }
        else if(ctx.const_Variable_INPUT_D_Q_N() != null){
            in.setVarvariable(visitConst_Variable_INPUT_D_Q_N(ctx.const_Variable_INPUT_D_Q_N()));
        }
        else if(ctx.const_Variable_INPUT_D_Q_I() != null){
            in.setVarvariable(visitConst_Variable_INPUT_D_Q_I(ctx.const_Variable_INPUT_D_Q_I()));
        }
        else if(ctx.dynamic_Variable() != null){
            in.setVarvariable(visitDynamic_Variable(ctx.dynamic_Variable()));
        }
        else if(ctx.dynamic_Variable_expr() != null){
            in.setVarvariableexpr(visitDynamic_Variable_expr(ctx.dynamic_Variable_expr()));
        }
        else if(ctx.dynamic_Variable_emp() != null){
            in.setVarvariableemp(visitDynamic_Variable_emp(ctx.dynamic_Variable_emp()));
        }
        else if(ctx.dynamic_Variable_INPUT_D_Q_N() != null){
            in.setVarvariable(visitDynamic_Variable_INPUT_D_Q_N(ctx.dynamic_Variable_INPUT_D_Q_N()));
        }
        else if(ctx.dynamic_Variable_INPUT_D_Q_I() != null){
            in.setVarvariable(visitDynamic_Variable_INPUT_D_Q_I(ctx.dynamic_Variable_INPUT_D_Q_I()));
        }
        else if(ctx.final_Variable() != null){
            in.setVarvariable(visitFinal_Variable(ctx.final_Variable()));
        }
        else if(ctx.final_Variable_expr() != null){
            in.setVarvariableexpr(visitFinal_Variable_expr(ctx.final_Variable_expr()));
        }
        else if(ctx.final_Variable_emp() != null){
            in.setVarvariableemp(visitFinal_Variable_emp(ctx.final_Variable_emp()));
        }
        else if(ctx.final_Variable_INPUT_D_Q_N() != null){
            in.setVarvariable(visitFinal_Variable_INPUT_D_Q_N(ctx.final_Variable_INPUT_D_Q_N()));
        }
        else if(ctx.final_Variable_INPUT_D_Q_I() != null){
            in.setVarvariable(visitFinal_Variable_INPUT_D_Q_I(ctx.final_Variable_INPUT_D_Q_I()));
        }
        else if(ctx.string_Variable_INPUT_D_Q_N() != null){
            in.setVarvariable(visitString_Variable_INPUT_D_Q_N(ctx.string_Variable_INPUT_D_Q_N()));
        }
        else if(ctx.string_Variable_INPUT_D_Q_I() != null){
            in.setVarvariable(visitString_Variable_INPUT_D_Q_I(ctx.string_Variable_INPUT_D_Q_I()));
        }
        else if(ctx.string_Variable_TEXT() != null){
            in.setVarvariableString(visitString_Variable_TEXT(ctx.string_Variable_TEXT()));
        }
        else if(ctx.int_Variable() != null){
            in.setVarvariable(visitInt_Variable(ctx.int_Variable()));
        }
        else if(ctx.int_Variable_expr() != null){
            in.setVarvariableexpr(visitInt_Variable_expr(ctx.int_Variable_expr()));
        }
        else if(ctx.int_Variable_emp() != null){
            in.setVarvariableemp(visitInt_Variable_emp(ctx.int_Variable_emp()));
        }
        else if(ctx.float_Variable() != null){
            in.setVarvariable(visitFloat_Variable(ctx.float_Variable()));
        }
        else if(ctx.double_Variable() != null){
            in.setVarvariable(visitDouble_Variable(ctx.double_Variable()));
        }
        else if(ctx.boolean_Variable() != null){
            in.setVarvariable(visitBoolean_Variable(ctx.boolean_Variable()));
        }
        else if(ctx.arrayType() != null){
            in.setArrayType(visitArrayType(ctx.arrayType()));
        }
        return in;
    }

    @Override
    public varVariable visitVar_Variable(projectParser.Var_VariableContext ctx) {
        System.out.println("visitVar_Variable");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.VAR().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.NUM().toString().trim());
        return vv;
    }

    @Override
    public varVariableExpr visitVar_Variable_expr(projectParser.Var_Variable_exprContext ctx) {
        System.out.println("visitVar_Variable_Expr");
        varVariableExpr vv = new varVariableExpr();
        vv.setVarVaiableType(ctx.VAR().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableExpr(visitExpr(ctx.expr()));
        return vv;
    }

    @Override
    public varVariableEmp visitVar_Variable_emp(projectParser.Var_Variable_empContext ctx) {
        System.out.println("visitVar_Variable_Emp");
        varVariableEmp vv = new varVariableEmp();
        vv.setVarVaiableType(ctx.VAR().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        return vv;
    }

    @Override
    public varVariable visitVarVariable_INPUT_D_Q_N(projectParser.VarVariable_INPUT_D_Q_NContext ctx) {
        System.out.println("visitVar_Variable_DQN");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.VAR().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.INPUT_D_Q_N().toString().trim());
        return vv;
    }

    @Override
    public varVariable visitVarVariable_INPUT_D_Q_I(projectParser.VarVariable_INPUT_D_Q_IContext ctx) {
        System.out.println("visitVar_Variable_DQI");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.VAR().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.INPUT_D_Q_I().toString().trim());
        return vv;
    }

    @Override
    public varVariable visitConst_Variable(projectParser.Const_VariableContext ctx) {
        System.out.println("visitConst_Variable");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.CONST().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.NUM().toString().trim());
        return vv;
    }

    @Override
    public varVariableExpr visitConst_Variable_expr(projectParser.Const_Variable_exprContext ctx) {
        System.out.println("visitConst_Variable_Expr");
        varVariableExpr vv = new varVariableExpr();
        vv.setVarVaiableType(ctx.CONST().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableExpr(visitExpr(ctx.expr()));
        return vv;
    }

    @Override
    public varVariableEmp visitConst_Variable_emp(projectParser.Const_Variable_empContext ctx) {
        System.out.println("visitConst_Variable_Emp");
        varVariableEmp vv = new varVariableEmp();
        vv.setVarVaiableType(ctx.CONST().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        return vv;
    }

    @Override
    public varVariable visitConst_Variable_INPUT_D_Q_N(projectParser.Const_Variable_INPUT_D_Q_NContext ctx) {
        System.out.println("visitConst_Variable_DQN");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.CONST().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.INPUT_D_Q_N().toString().trim());
        return vv;
    }

    @Override
    public varVariable visitConst_Variable_INPUT_D_Q_I(projectParser.Const_Variable_INPUT_D_Q_IContext ctx) {
        System.out.println("visitConst_Variable_DQI");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.CONST().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.INPUT_D_Q_I().toString().trim());
        return vv;
    }

    @Override
    public varVariable visitDynamic_Variable(projectParser.Dynamic_VariableContext ctx) {
        System.out.println("visitDynamic_Variable");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.DYNAMIC().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.NUM().toString().trim());
        return vv;
    }

    @Override
    public varVariableExpr visitDynamic_Variable_expr(projectParser.Dynamic_Variable_exprContext ctx) {
        System.out.println("visitDynamic_Variable_Expr");
        varVariableExpr vv = new varVariableExpr();
        vv.setVarVaiableType(ctx.DYNAMIC().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableExpr(visitExpr(ctx.expr()));
        return vv;
    }

    @Override
    public varVariableEmp visitDynamic_Variable_emp(projectParser.Dynamic_Variable_empContext ctx) {
        System.out.println("visitDynamic_Variable_Emp");
        varVariableEmp vv = new varVariableEmp();
        vv.setVarVaiableType(ctx.DYNAMIC().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        return vv;
    }

    @Override
    public varVariable visitDynamic_Variable_INPUT_D_Q_N(projectParser.Dynamic_Variable_INPUT_D_Q_NContext ctx) {
        System.out.println("visitDynamic_Variable_DQN");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.DYNAMIC().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.INPUT_D_Q_N().toString().trim());
        return vv;
    }

    @Override
    public varVariable visitDynamic_Variable_INPUT_D_Q_I(projectParser.Dynamic_Variable_INPUT_D_Q_IContext ctx) {
        System.out.println("visitDynamic_Variable_DQI");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.DYNAMIC().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.INPUT_D_Q_I().toString().trim());
        return vv;
    }

    @Override
    public varVariable visitFinal_Variable(projectParser.Final_VariableContext ctx) {
        System.out.println("visitFinal_Variable");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.FINAL().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.NUM().toString().trim());
        return vv;
    }

    @Override
    public varVariableExpr visitFinal_Variable_expr(projectParser.Final_Variable_exprContext ctx) {
        System.out.println("visitFinal_Variable_Expr");
        varVariableExpr vv = new varVariableExpr();
        vv.setVarVaiableType(ctx.FINAL().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableExpr(visitExpr(ctx.expr()));
        return vv;
    }

    @Override
    public varVariableEmp visitFinal_Variable_emp(projectParser.Final_Variable_empContext ctx) {
        System.out.println("visitFinal_Variable_Emp");
        varVariableEmp vv = new varVariableEmp();
        vv.setVarVaiableType(ctx.FINAL().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        return vv;
    }

    @Override
    public varVariable visitFinal_Variable_INPUT_D_Q_N(projectParser.Final_Variable_INPUT_D_Q_NContext ctx) {
        System.out.println("visitFinal_Variable_DQN");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.FINAL().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.INPUT_D_Q_N().toString().trim());
        return vv;
    }

    @Override
    public varVariable visitFinal_Variable_INPUT_D_Q_I(projectParser.Final_Variable_INPUT_D_Q_IContext ctx) {
        System.out.println("visitFinal_Variable_DQI");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.FINAL().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.INPUT_D_Q_I().toString().trim());
        return vv;
    }

    @Override
    public varVariable visitString_Variable_INPUT_D_Q_N(projectParser.String_Variable_INPUT_D_Q_NContext ctx) {
        System.out.println("visitString_Variable_DQN");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.STRING().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.INPUT_D_Q_N().toString().trim());
        return vv;
    }

    @Override
    public varVariable visitString_Variable_INPUT_D_Q_I(projectParser.String_Variable_INPUT_D_Q_IContext ctx) {
        System.out.println("visitString_Variable_DQI");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.STRING().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.INPUT_D_Q_I().toString().trim());
        return vv;
    }

    @Override
    public varVariableString visitString_Variable_TEXT(projectParser.String_Variable_TEXTContext ctx) {
        System.out.println("visitString_Variable_Text");
        varVariableString vv = new varVariableString();
        vv.setVarVaiableType(ctx.STRING().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        for (int i=0 ; i<ctx.rule_().size() ; i++){
            if(ctx.rule_(i) != null){
            vv.getVarVaiablerule().add((visitRule(ctx.rule_(i))));
        }}
        return vv;
    }

    @Override
    public varVariable visitInt_Variable(projectParser.Int_VariableContext ctx) {
        System.out.println("visitInt_Variable");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.INT().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.NUM().toString().trim());
        return vv;
    }

    @Override
    public varVariableExpr visitInt_Variable_expr(projectParser.Int_Variable_exprContext ctx) {
        System.out.println("visitInt_Variable_Expr");
        varVariableExpr vv = new varVariableExpr();
        vv.setVarVaiableType(ctx.INT().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableExpr(visitExpr(ctx.expr()));
        return vv;
    }

    @Override
    public varVariableEmp visitInt_Variable_emp(projectParser.Int_Variable_empContext ctx) {
        System.out.println("visitInt_Variable_Emp");
        varVariableEmp vv = new varVariableEmp();
        vv.setVarVaiableType(ctx.INT().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        return vv;
    }

    @Override
    public varVariable visitFloat_Variable(projectParser.Float_VariableContext ctx) {
        System.out.println("visitFloat_Variable");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.FLOAT().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.NUM_FLOAT().toString().trim());
        return vv;
    }

    @Override
    public varVariable visitDouble_Variable(projectParser.Double_VariableContext ctx) {
        System.out.println("visitDouble_Variable");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.DOUBLE().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.NUM_DOUBLE().toString().trim());
        return vv;
    }

    @Override
    public varVariable visitBoolean_Variable(projectParser.Boolean_VariableContext ctx) {
        System.out.println("visitBoolean_Variable");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.BOOLEAN().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.NUM_BOOL().toString().trim());
        return vv;
    }

    @Override
    public Loop visitLoop(projectParser.LoopContext ctx) {
        System.out.println("visitLoop");
        Loop lo = new Loop();
        if(ctx.for_INT_With_ID_ID() != null){
            lo.setForloop(visitFor_VAR_With_ID_ID(ctx.for_VAR_With_ID_ID()));
        }
        if(ctx.for_INT_With_ID_ID() != null){
            lo.setForloop(visitFor_INT_With_ID_ID(ctx.for_INT_With_ID_ID()));
        }
        if(ctx.for_VAR_With_ID_NUM() != null){
            lo.setForloop(visitFor_VAR_With_ID_NUM(ctx.for_VAR_With_ID_NUM()));
        }
        if(ctx.for_INT_With_ID_NUM() != null){
            lo.setForloop(visitFor_INT_With_ID_NUM(ctx.for_INT_With_ID_NUM()));
        }
        return  lo;
    }

    @Override
    public ForLoop visitFor_VAR_With_ID_ID(projectParser.For_VAR_With_ID_IDContext ctx) {
        System.out.println("visitFor_Var_ID_ID");
        ForLoop fo = new ForLoop();
        fo.setForf(ctx.FOR().toString().trim());
        fo.setVarr(ctx.VAR().toString().trim());
        fo.setId(ctx.getChild(3).toString().trim());
        fo.setNum(ctx.NUM().toString().trim());
        fo.setId1(ctx.getChild(7).toString().trim());
        fo.setSingl(ctx.SINGLS().toString().trim());
        fo.setId2(ctx.getChild(9).toString().trim());
        fo.setId3(ctx.getChild(11).toString().trim());
        fo.setPlmi(ctx.PLUSORMINUS().toString().trim());
        for(int i=0;i<ctx.inputI().size() ; i++){
            if(ctx.inputI(i) != null){
            fo.getInputs().add((visitInputI(ctx.inputI(i))));
        }}
        return fo;
    }

    @Override
    public ForLoop visitFor_INT_With_ID_ID(projectParser.For_INT_With_ID_IDContext ctx) {
        System.out.println("visitFor_Int_ID_ID");
        ForLoop fo = new ForLoop();
        fo.setForf(ctx.FOR().toString().trim());
        fo.setVarr(ctx.INT().toString().trim());
        fo.setId(ctx.getChild(3).toString().trim());
        fo.setNum(ctx.NUM().toString().trim());
        fo.setId1(ctx.getChild(7).toString().trim());
        fo.setSingl(ctx.SINGLS().toString().trim());
        fo.setId2(ctx.getChild(9).toString().trim());
        fo.setId3(ctx.getChild(11).toString().trim());
        fo.setPlmi(ctx.PLUSORMINUS().toString().trim());
        for(int i=0;i<ctx.inputI().size() ; i++){
            if(ctx.inputI(i) != null){
            fo.getInputs().add((visitInputI(ctx.inputI(i))));
        }}
        return fo;
    }

    @Override
    public ForLoop visitFor_VAR_With_ID_NUM(projectParser.For_VAR_With_ID_NUMContext ctx) {
        System.out.println("visitFor_Var_ID_Num");
        ForLoop fo = new ForLoop();
        fo.setForf(ctx.FOR().toString().trim());
        fo.setVarr(ctx.VAR().toString().trim());
        fo.setId(ctx.getChild(3).toString().trim());
        fo.setNum(ctx.getChild(5).toString().trim());
        fo.setId1(ctx.getChild(7).toString().trim());
        fo.setSingl(ctx.SINGLS().toString().trim());
        fo.setId2(ctx.getChild(9).toString().trim());
        fo.setId3(ctx.getChild(11).toString().trim());
        fo.setPlmi(ctx.PLUSORMINUS().toString().trim());
        for(int i=0;i<ctx.inputI().size() ; i++){
            if(ctx.inputI(i) != null){
            fo.getInputs().add((visitInputI(ctx.inputI(i))));
        }}
        return fo;
    }

    @Override
    public ForLoop visitFor_INT_With_ID_NUM(projectParser.For_INT_With_ID_NUMContext ctx) {
        System.out.println("visitFor_Int_ID_Num");
        ForLoop fo = new ForLoop();
        fo.setForf(ctx.FOR().toString().trim());
        fo.setVarr(ctx.INT().toString().trim());
        fo.setId(ctx.getChild(3).toString().trim());
        fo.setNum(ctx.getChild(5).toString().trim());
        fo.setId1(ctx.getChild(7).toString().trim());
        fo.setSingl(ctx.SINGLS().toString().trim());
        fo.setId2(ctx.getChild(9).toString().trim());
        fo.setId3(ctx.getChild(11).toString().trim());
        fo.setPlmi(ctx.PLUSORMINUS().toString().trim());
        for(int i=0;i<ctx.inputI().size() ; i++){
            if(ctx.inputI(i) != null){
            fo.getInputs().add((visitInputI(ctx.inputI(i))));
        }}
        return fo;
    }

    @Override
    public PrintStatement visitPrintstatement(projectParser.PrintstatementContext ctx) {
        System.out.println("visitPrint");
        PrintStatement pr = new PrintStatement();
         if(ctx.print_ID() != null){
             pr.setPrindidnum(visitPrint_ID(ctx.print_ID()));
         }
         if(ctx.print_NUM() != null){
             pr.setPrindidnum(visitPrint_NUM(ctx.print_NUM()));
         }
         if(ctx.print_TEXT() != null){
             pr.setPrindText(visitPrint_TEXT(ctx.print_TEXT()));
         }
        return pr;
    }

    @Override
    public PrintIdNum visitPrint_ID(projectParser.Print_IDContext ctx) {
        System.out.println("visitPrint_Id");
        PrintIdNum pp = new PrintIdNum();
        pp.setPrin(ctx.PRINT().toString().trim());
        pp.setWorld(ctx.INPUT_D_Q_I().toString().trim());
        return pp;
    }

    @Override
    public PrintIdNum visitPrint_NUM(projectParser.Print_NUMContext ctx) {
        System.out.println("visitPrint_Num");
        PrintIdNum pp = new PrintIdNum();
        pp.setPrin(ctx.PRINT().toString().trim());
        pp.setWorld(ctx.INPUT_D_Q_N().toString().trim());
        return pp;
    }

    @Override
    public PrintText visitPrint_TEXT(projectParser.Print_TEXTContext ctx) {
        System.out.println("visitPrint_Text");
        PrintText pp = new PrintText();
        pp.setPrin(ctx.PRINT().toString().trim());
        for(int i=0;i<ctx.rule_().size(); i++){
            if(ctx.rule_(i) != null){
               pp.getRules().add((visitRule(ctx.rule_(i))));
           }
        }
        return pp;
    }

    @Override
    public Rule visitRule(projectParser.RuleContext ctx) {
        System.out.println("visitRule");
        Rule rr = new Rule();
        if(ctx.ID() != null){
            rr.setId(ctx.ID().toString().trim());
        }
        if(ctx.NUM() != null){
            rr.setNum(ctx.NUM().toString().trim());
        }
        return rr;
    }

    @Override
    public IfStatment visitIfstatement(projectParser.IfstatementContext ctx) {
        System.out.println("visitIfStatment");
        IfStatment ifif = new IfStatment();
        ifif.setIfin(visitIf_WithInput(ctx.if_WithInput()));
        for(int i=0;i<ctx.elseif_WithInput().size();i++){
            if(ctx.elseif_WithInput(i) != null){
            ifif.getElseifin().add((visitElseif_WithInput(ctx.elseif_WithInput(i))));
        }}
        if(ctx.else_WithInput() != null){
            ifif.setElsein(visitElse_WithInput(ctx.else_WithInput()));
        }
        return ifif ;
    }

    @Override
    public IFInput visitIf_WithInput(projectParser.If_WithInputContext ctx) {
        System.out.println("visitIf");
        IFInput ifin = new IFInput();
          ifin.setIfif(ctx.IF().toString().trim());
          for(int i=0;i<ctx.conditions().size() ; i++){
              if(ctx.conditions(i) != null) {
                  ifin.getCond().add((visitConditions(ctx.conditions(i))));
              }
          }
          ifin.setIfatr(visitIfif(ctx.ifif()));
          return ifin;
    }

    @Override
    public WhileStatement visitWhilestatemen(projectParser.WhilestatemenContext ctx) {
        System.out.println("visitWhile");
        WhileStatement whilstat = new WhileStatement();
         whilstat.setWhilee(ctx.WHILE().toString().trim());
         for(int i=0;i<ctx.conditions().size(); i++){
             if(ctx.conditions(i) != null){
                 whilstat.getCond().add((visitConditions(ctx.conditions(i))));
             }
         }
         whilstat.setIfif(visitIfif(ctx.ifif()));
        return whilstat;
    }

    @Override
    public SwitchStatement visitSwitchstatement(projectParser.SwitchstatementContext ctx) {
        System.out.println("visitSwitchStatment");
        SwitchStatement swstat = new SwitchStatement();
        if(ctx.switch_With_ID() != null){
            swstat.setSwitchid(visitSwitch_With_ID(ctx.switch_With_ID()));
        }
        else if(ctx.switch_With_NUM() != null){
            swstat.setSwitchnum(visitSwitch_With_NUM(ctx.switch_With_NUM()));
        }
        return swstat;
    }

    @Override
    public SwitchWithID visitSwitch_With_ID(projectParser.Switch_With_IDContext ctx) {
        System.out.println("visitSwitch_Id");
        SwitchWithID switid = new SwitchWithID();
        switid.setSwitchh(ctx.SWITCH().toString().trim());
        switid.setId(ctx.ID().toString().trim());
        for(int i=0;i<ctx.casestatement().size(); i++){
            if(ctx.casestatement(i) != null){
            switid.getCasestat().add((visitCasestatement(ctx.casestatement(i))));
        }}
        switid.setDef(visitDefaultstatement(ctx.defaultstatement()));
        return switid;
    }

    @Override
    public SwitchWithNUM visitSwitch_With_NUM(projectParser.Switch_With_NUMContext ctx) {
        System.out.println("visitSwitch_Num");
        SwitchWithNUM switnum = new SwitchWithNUM();
        switnum.setSwitchh(ctx.SWITCH().toString().trim());
        switnum.setNumm(ctx.NUM().toString().trim());
        for(int i=0;i<ctx.casestatement().size(); i++){
            if(ctx.casestatement(i) != null){
            switnum.getCasestat().add((visitCasestatement(ctx.casestatement(i))));
        }}
        switnum.setDef(visitDefaultstatement(ctx.defaultstatement()));
        return switnum;
    }

    @Override
    public CaseStatement visitCasestatement(projectParser.CasestatementContext ctx) {
        System.out.println("visitCase");
        CaseStatement casestat = new CaseStatement();
        if(ctx.case_With_ID() != null){
            casestat.setCaseid(visitCase_With_ID(ctx.case_With_ID()));
        }
        if(ctx.case_With_NUM() != null){
            casestat.setCasenum(visitCase_With_NUM(ctx.case_With_NUM()));
        }
        return casestat;
    }

    @Override
    public CaseWithID visitCase_With_ID(projectParser.Case_With_IDContext ctx) {
        System.out.println("visitCase_Id");
        CaseWithID caseid = new CaseWithID();
        caseid.setCasee(ctx.CASE().toString().trim());
        caseid.setInputt(ctx.INPUT_D_Q_I().toString().trim());
        for(int i=0;i<ctx.inputI().size();i++){
            if(ctx.inputI(i) != null){
            caseid.getInp().add((visitInputI(ctx.inputI(i))));
        }}
        caseid.setBreakk(ctx.BREAK().toString().trim());
        return caseid;
    }

    @Override
    public CaseWithNUM visitCase_With_NUM(projectParser.Case_With_NUMContext ctx) {
        System.out.println("visitCase_Num");
        CaseWithNUM casenum = new CaseWithNUM();
        casenum.setCass(ctx.CASE().toString().trim());
        casenum.setNumm(ctx.NUM().toString().trim());
        for(int i=0;i<ctx.inputI().size();i++){
            if(ctx.inputI(i) != null){
            casenum.getInp().add((visitInputI(ctx.inputI(i))));
        }}
        casenum.setBeakk(ctx.BREAK().toString().trim());
        return casenum;
    }

    @Override
    public DefaultStatement visitDefaultstatement(projectParser.DefaultstatementContext ctx) {
        System.out.println("visitDefault");
       DefaultStatement def = new DefaultStatement();
       def.setDef(ctx.DEFAULT().toString().trim());
       for(int i=0;i<ctx.inputI().size(); i++) {
           if(ctx.inputI(i) != null){
           def.getInp().add((visitInputI(ctx.inputI(i))));
       }}
       def.setBreakk(ctx.BREAK().toString().trim());
       return def;
    }

    @Override
    public TryCatchStatement visitTryCatchstatement(projectParser.TryCatchstatementContext ctx) {
        System.out.println("visitTryCatch");
        TryCatchStatement trystat = new TryCatchStatement();
       trystat.setTryy(ctx.TRY().toString().trim());
       for(int i=0;i<ctx.inputI().size();i++){
           if(ctx.inputI(i) != null){
           trystat.getInp().add((visitInputI(ctx.inputI(i))));
        }}
        trystat.setCatchh(ctx.CATCH().toString().trim());
        trystat.setIdd(ctx.ID().toString().trim());
        if(ctx.inputI(9) != null){
          for(int i=0;i<ctx.inputI().size();i++){
              if(ctx.inputI(i) != null){
             trystat.getInp().add((visitInputI(ctx.inputI(i))));
          }}
        }
        return  trystat;
    }

    @Override
    public booleanP visitBoolean_p(projectParser.Boolean_pContext ctx) {
        System.out.println("visitBoolean_p");
        booleanP boolean_p = new booleanP();

        if (ctx.TRUE() != null) {
            boolean_p.setTRUE(ctx.TRUE().toString().trim());
        }
        else if (ctx.FALSE() != null) {
            boolean_p.setFALSE(ctx.FALSE().toString().trim());
        }
        return boolean_p;
    }

    @Override
    public NumbersIF visitNumbers(projectParser.NumbersContext ctx) {

        System.out.println("visitNumbers");
        NumbersIF  numbers=new NumbersIF();
        if(ctx.float_f()!=null) {
            numbers.setFf(visitFloat_f(ctx.float_f()));
        }
        else if(ctx.int_i()!=null) {
            numbers.setIi(visitInt_i(ctx.int_i()));
        }
        return numbers;
    }

    @Override
    public Var visitVar(projectParser.VarContext ctx) {
        System.out.println("visitVar");
        Var vv = new Var();
        vv.setVARNAME(ctx.ID().toString().trim());
        return vv;
    }

    @Override
    public Expression visitExpression(projectParser.ExpressionContext ctx) {

        System.out.println("visitExpression");
        Expression  expression=new Expression();
        if (ctx.numbers() != null) {
            expression.setNumbers(visitNumbers(ctx.numbers()));
        }
        else if (ctx.boolean_p() != null) {
            expression.setBoolean_p(visitBoolean_p(ctx.boolean_p()));
        }
        else if (ctx.var() != null) {
            expression.setVar(visitVar(ctx.var()));
        }
        else if (ctx.expression() != null) {
            expression.setExpression(visitExpression(ctx.expression()));
        }
        else if(ctx.math() != null){
            expression.setMath(visitMath(ctx.math()));
        }
        return expression;

    }

    @Override
    public Math visitMath(projectParser.MathContext ctx) {
        System.out.println("visitMath");
        Math math = new Math();
        if (ctx.var().isEmpty()){
            math.setNumbers1(visitNumbers(ctx.numbers(0)));
            math.setNumbers2(visitNumbers(ctx.numbers(1)));
        }
        else if(ctx.numbers().isEmpty()){
            math.setVar1(visitVar(ctx.var(0)));
            math.setVar2(visitVar(ctx.var(1)));
        }else{
            math.setVar1(visitVar(ctx.var(0)));
            math.setNumbers1(visitNumbers(ctx.numbers(0)));
        }
        math.setOperation(visitOperation(ctx.operation()));
        return math;
    }

    @Override
    public BoolExpresions visitBoolExpresion(projectParser.BoolExpresionContext ctx) {

        System.out.println("visitBoolExpresion");
        BoolExpresions  boolExpresion=new BoolExpresions();
        if(ctx.expression()!=null) {
            boolExpresion.setExpression1(visitExpression(ctx.expression(0)));
            boolExpresion.setBOOLEAN_SIGNS(ctx.SINGLS().toString().trim());
            if (ctx.expression() != null)
                boolExpresion.setExpression2(visitExpression(ctx.expression(1)));
        }
        else if(ctx.boolExpresion()!=null){
            boolExpresion.setBoolExpresion(visitBoolExpresion(ctx.boolExpresion()));
        }

        return boolExpresion;
    }

    @Override
    public Logic visitLogic(projectParser.LogicContext ctx) {
        System.out.println("visitLogic");
        Logic   logic=new Logic();
        if(ctx.boolExpresion()!=null){
            logic.setBoolExpresion(visitBoolExpresion(ctx.boolExpresion()));
            for (int i = 0; i < ctx.nestedLogic().size(); i++) {
                if(ctx.nestedLogic(i) != null){
                logic.getNestedLogics().add( visitNestedLogic(ctx.nestedLogic(i)));
            }}
        }
        else if(ctx.logic()!=null){
            logic.setLogic(visitLogic(ctx.logic()));
            for (int i = 0; i < ctx.nestedLogic2().size(); i++) {
                if(ctx.nestedLogic2(i) != null){
                logic.getNestedLogic2s().add( visitNestedLogic2(ctx.nestedLogic2(i)));
            }}
        }
        return logic;
    }

    @Override
    public NestedLogic visitNestedLogic(projectParser.NestedLogicContext ctx) {

        System.out.println("visitNestedLogic");
        NestedLogic nestedLogic=new NestedLogic();
        nestedLogic.setLOGIC_SIGNS(ctx.LOGIC_SIGNS().toString().trim());
        nestedLogic.setBoolExpresion(visitBoolExpresion(ctx.boolExpresion()));

        return nestedLogic;
    }

    @Override
    public NestedLogic2 visitNestedLogic2(projectParser.NestedLogic2Context ctx) {

        System.out.println("visitNestedLogic2");
        NestedLogic2 nestedLogic2=new NestedLogic2();
        nestedLogic2.setLOGIC_SIGNS(ctx.LOGIC_SIGNS().toString().trim());
        nestedLogic2.setLogic(visitLogic(ctx.logic()));

        return nestedLogic2;
    }

    @Override
    public Conditions visitConditions(projectParser.ConditionsContext ctx) {

        System.out.println("visitConditions");
        Conditions  conditions=new Conditions();
        if(ctx.boolExpresion()!=null) {
            conditions.setBoolExpresion(visitBoolExpresion(ctx.boolExpresion()));
        }
        else if(ctx.logic()!=null) {
            conditions.setLogic(visitLogic(ctx.logic()));
        }
        return conditions;
    }

    @Override
    public Operations visitOperation(projectParser.OperationContext ctx) {
        System.out.println("visitOperation");
        Operations operation=new Operations();
        if(ctx.PLUS()!=null){
            operation.setPLUS(ctx.PLUS().toString().trim());
        }

        else  if(ctx.MINUS()!=null){
            operation.setMINUS(ctx.MINUS().toString().trim());
        }
        else if(ctx.MULTI()!=null){
            operation.setMULTI(ctx.MULTI().toString().trim());
        }
        else if(ctx.DIVIDE()!=null){
            operation.setDIVIDE(ctx.DIVIDE().toString().trim());
        }

        return operation;
    }

    @Override
    public DoWhileStatement visitDoWhilestatement(projectParser.DoWhilestatementContext ctx) {
        System.out.println("visitdoWhile");
        DoWhileStatement dostat = new DoWhileStatement();
         dostat.setDoo(ctx.DO().toString().trim());
         for(int i=0;i<ctx.inputI().size();i++){
             if(ctx.inputI(i) != null){
                dostat.getInn().add((visitInputI(ctx.inputI(i))));
             }
         }
         dostat.setWhileStatement(visitWhilestatemen(ctx.whilestatemen()));
        return dostat;
    }

    @Override
    public Expr visitExpr(projectParser.ExprContext ctx) {
        System.out.println("visitExpr");
        Expr ex = new Expr();
        if(ctx.multiplication() != null){
            ex.setMultiplication(visitMultiplication(ctx.multiplication()));
        }
        if(ctx.addition() != null){
            ex.setAddition(visitAddition(ctx.addition()));
        }
        if(ctx.subtraction() != null){
            ex.setSubtraction(visitSubtraction(ctx.subtraction()));
        }
        if(ctx.division() != null){
            ex.setDivision(visitDivision(ctx.division()));
        }
        if(ctx.identifier() != null){
            ex.setIdentifier(visitIdentifier(ctx.identifier()));
        }
        if(ctx.integer_i() != null){
            ex.setInteger(visitInteger_i(ctx.integer_i()));
        }
        return ex;
    }

    @Override
    public Multiplication visitMultiplication(projectParser.MultiplicationContext ctx) {
        System.out.println("visitMultiplication");
        Multiplication mm = new Multiplication();
        mm.setNum1(ctx.getChild(0).toString().trim());
        mm.setM(ctx.MULTI().toString().trim());
        mm.setNum2(ctx.getChild(2).toString().trim());
        return mm;
    }

    @Override
    public Addition visitAddition(projectParser.AdditionContext ctx) {
        System.out.println("visitAddition");
        Addition mm = new Addition();
        mm.setNum1(ctx.getChild(0).toString().trim());
        mm.setM(ctx.PLUS().toString().trim());
        mm.setNum2(ctx.getChild(2).toString().trim());
        return mm;
    }

    @Override
    public Subtraction visitSubtraction(projectParser.SubtractionContext ctx) {
        System.out.println("visitSubtraction");
        Subtraction mm = new Subtraction();
        mm.setNum1(ctx.getChild(0).toString().trim());
        mm.setM(ctx.MINUS().toString().trim());
        mm.setNum2(ctx.getChild(2).toString().trim());
        return mm;
    }

    @Override
    public Division visitDivision(projectParser.DivisionContext ctx) {
        System.out.println("visitDivision");
        Division mm = new Division();
        mm.setNum1(ctx.getChild(0).toString().trim());
        mm.setM(ctx.DIVIDE().toString().trim());
        mm.setNum2(ctx.getChild(2).toString().trim());
        return mm;
    }

    @Override
    public Identifier visitIdentifier(projectParser.IdentifierContext ctx) {
        System.out.println("visitIdentifier");
        Identifier ii = new Identifier();
        ii.setIdentifier(ctx.ID().toString().trim());
        return ii;
    }

    @Override
    public IntegerII visitInteger_i(projectParser.Integer_iContext ctx) {
        System.out.println("visitInteger_i");
        IntegerII ii = new IntegerII();
            ii.setIntegerII(ctx.NUM().toString().trim());
            return ii;
    }

    @Override
    public Functions visitFunctionStatement(projectParser.FunctionStatementContext ctx) {
        System.out.println("visitFunction");
        Functions fun = new Functions();
          if(ctx.void_Function_NOReturn_NoARG() != null){
              fun.setVoidWithoutArg(visitVoid_Function_NOReturn_NoARG(ctx.void_Function_NOReturn_NoARG()));
          }
        if(ctx.int_Function_Return_NoARG() != null){
            fun.setFunWithoutArg(visitInt_Function_Return_NoARG(ctx.int_Function_Return_NoARG()));
        }
        if(ctx.string_Function_Return_NoARG() != null){
            fun.setFunWithoutArg(visitString_Function_Return_NoARG(ctx.string_Function_Return_NoARG()));
        }
        if(ctx.double_Function_Return_NoARG() != null){
            fun.setFunWithoutArg(visitDouble_Function_Return_NoARG(ctx.double_Function_Return_NoARG()));
        }
        if(ctx.float_Function_Return_NoARG() != null){
            fun.setFunWithoutArg(visitFloat_Function_Return_NoARG(ctx.float_Function_Return_NoARG()));
        }

        if(ctx.void_Function_NOReturn_ARG() != null){
            fun.setVoidWithArg(visitVoid_Function_NOReturn_ARG(ctx.void_Function_NOReturn_ARG()));
        }
        if(ctx.int_Function_Return_ARG() != null){
            fun.setFunWithArg(visitInt_Function_Return_ARG(ctx.int_Function_Return_ARG()));
        }
        if(ctx.string_Function_Return_ARG() != null){
            fun.setFunWithArg(visitString_Function_Return_ARG(ctx.string_Function_Return_ARG()));
        }
        if(ctx.double_Function_Return_ARG() != null){
            fun.setFunWithArg(visitDouble_Function_Return_ARG(ctx.double_Function_Return_ARG()));
        }
        if(ctx.floate_Function_Return_ARG() != null){
            fun.setFunWithArg(visitFloate_Function_Return_ARG(ctx.floate_Function_Return_ARG()));
        }
        return fun;
    }

    @Override
    public VoidWithoutArg visitVoid_Function_NOReturn_NoARG(projectParser.Void_Function_NOReturn_NoARGContext ctx) {
        System.out.println("visitVoid_Fun_N");
        VoidWithoutArg voidd = new VoidWithoutArg();
        voidd.setViodd(ctx.VOID().toString().trim());
        voidd.setNamee(visitNamen(ctx.namen()));

        for (int i=0;i<ctx.inputI().size(); i++){
            if(ctx.inputI(i) != null){
              voidd.getInp().add((visitInputI(ctx.inputI(i))));
            }
        }
        return voidd;    }

    @Override
    public FunWithoutArg visitInt_Function_Return_NoARG(projectParser.Int_Function_Return_NoARGContext ctx) {
        System.out.println("visitInt_Fun_N");
        FunWithoutArg fun = new FunWithoutArg();
       fun.setType(ctx.INT().toString().trim());
       fun.setName(visitNamen(ctx.namen()));
       for(int i=0;i<ctx.inputI().size();i++){
           if(ctx.inputI(i) != null){
             fun.getInputs().add((visitInputI(ctx.inputI(i))));
           }
       }
       fun.setReturnStatement(visitReturnStatement(ctx.returnStatement()));
       return fun ;
    }

    @Override
    public FunWithoutArg visitString_Function_Return_NoARG(projectParser.String_Function_Return_NoARGContext ctx) {
        System.out.println("visitString_Fun_N");
        FunWithoutArg fun = new FunWithoutArg();
        fun.setType(ctx.STRING().toString().trim());
        fun.setName(visitNamen(ctx.namen()));
        for(int i=0;i<ctx.inputI().size();i++){
            if(ctx.inputI(i) != null){
               fun.getInputs().add((visitInputI(ctx.inputI(i))));
            }
        }
        fun.setReturnStatement(visitReturnStatement(ctx.returnStatement()));
        return fun ;
    }

    @Override
    public FunWithoutArg visitDouble_Function_Return_NoARG(projectParser.Double_Function_Return_NoARGContext ctx) {
        System.out.println("visitdouble_Fun_N");
        FunWithoutArg fun = new FunWithoutArg();
        fun.setType(ctx.DOUBLE().toString().trim());
        fun.setName(visitNamen(ctx.namen()));
        for(int i=0;i<ctx.inputI().size();i++){
            if(ctx.inputI(i) != null){
               fun.getInputs().add((visitInputI(ctx.inputI(i))));
           }
        }
        fun.setReturnStatement(visitReturnStatement(ctx.returnStatement()));
        return fun ;
    }

    @Override
    public FunWithoutArg visitFloat_Function_Return_NoARG(projectParser.Float_Function_Return_NoARGContext ctx) {
        System.out.println("visitFloat_Fun_N");
        FunWithoutArg fun = new FunWithoutArg();
        fun.setType(ctx.FLOAT().toString().trim());
        fun.setName(visitNamen(ctx.namen()));
        for(int i=0;i<ctx.inputI().size();i++){
            if(ctx.inputI(i) != null){
               fun.getInputs().add((visitInputI(ctx.inputI(i))));
           }
        }
        fun.setReturnStatement(visitReturnStatement(ctx.returnStatement()));
        return fun ;
    }

    @Override
    public VoidWithArg visitVoid_Function_NOReturn_ARG(projectParser.Void_Function_NOReturn_ARGContext ctx) {
        System.out.println("visitVoid_Fun_A");
        VoidWithArg voidd = new VoidWithArg();
        voidd.setVoidd(ctx.VOID().toString().trim());
        voidd.setNamee(visitNamen(ctx.namen()));
        for (int i=0;i<ctx.argumentFunctionType().size(); i++){
            if(ctx.argumentFunctionType(i) != null){
            voidd.getArgumentFunctionTypes().add((visitArgumentFunctionType(ctx.argumentFunctionType(i))));
        }}
        for (int i=0;i<ctx.inputI().size(); i++){
            if(ctx.inputI(i) != null){
            voidd.getInputs().add((visitInputI(ctx.inputI(i))));
        }}
        return voidd;
    }

    @Override
    public FunWithArg visitInt_Function_Return_ARG(projectParser.Int_Function_Return_ARGContext ctx) {
        System.out.println("visitInt_Fun_A");
        FunWithArg fun = new FunWithArg();
        fun.setType(ctx.INT().toString().trim());
        fun.setName(visitNamen(ctx.namen()));
        for(int i=0;i<ctx.argumentFunctionType().size();i++){
            if(ctx.argumentFunctionType(i) != null){
            fun.getArgumentFunctionTypes().add((visitArgumentFunctionType(ctx.argumentFunctionType(i))));
        }}
        for(int i=0;i<ctx.inputI().size();i++){
            if(ctx.inputI(i) != null){
            fun.getInputs().add((visitInputI(ctx.inputI(i))));
        }}
        fun.setReturnStatement(visitReturnStatement(ctx.returnStatement()));
        return fun ;
    }

    @Override
    public FunWithArg visitString_Function_Return_ARG(projectParser.String_Function_Return_ARGContext ctx) {
        System.out.println("visitString_Fun_A");
        FunWithArg fun = new FunWithArg();
        fun.setType(ctx.STRING().toString().trim());
        fun.setName(visitNamen(ctx.namen()));
        for(int i=0;i<ctx.argumentFunctionType().size();i++){
            if(ctx.argumentFunctionType(i) != null){
            fun.getArgumentFunctionTypes().add((visitArgumentFunctionType(ctx.argumentFunctionType(i))));
        }}
        for(int i=0;i<ctx.inputI().size();i++){
            if(ctx.inputI(i) != null){
            fun.getInputs().add((visitInputI(ctx.inputI(i))));
        }}
        fun.setReturnStatement(visitReturnStatement(ctx.returnStatement()));
        return fun ;
    }

    @Override
    public FunWithArg visitDouble_Function_Return_ARG(projectParser.Double_Function_Return_ARGContext ctx) {
        System.out.println("visitDouble_Fun_A");
        FunWithArg fun = new FunWithArg();
        fun.setType(ctx.DOUBLE().toString().trim());
        fun.setName(visitNamen(ctx.namen()));
        for(int i=0;i<ctx.argumentFunctionType().size();i++){
            if(ctx.argumentFunctionType(i) != null){
            fun.getArgumentFunctionTypes().add((visitArgumentFunctionType(ctx.argumentFunctionType(i))));
        }}
        for(int i=0;i<ctx.inputI().size();i++){
            if(ctx.inputI(i) != null){
            fun.getInputs().add((visitInputI(ctx.inputI(i))));
        }}
        fun.setReturnStatement(visitReturnStatement(ctx.returnStatement()));
        return fun ;
    }

    @Override
    public FunWithArg visitFloate_Function_Return_ARG(projectParser.Floate_Function_Return_ARGContext ctx) {
        System.out.println("visitFloat_Fun_A");
        FunWithArg fun = new FunWithArg();
        fun.setType(ctx.FLOAT().toString().trim());
        fun.setName(visitNamen(ctx.namen()));
        for(int i=0;i<ctx.argumentFunctionType().size();i++){
            if(ctx.argumentFunctionType(i) != null){
            fun.getArgumentFunctionTypes().add((visitArgumentFunctionType(ctx.argumentFunctionType(i))));
        }}
        for(int i=0;i<ctx.inputI().size();i++){
            if(ctx.inputI(i) != null){
            fun.getInputs().add((visitInputI(ctx.inputI(i))));
        }}
        fun.setReturnStatement(visitReturnStatement(ctx.returnStatement()));
        return fun ;     }

    @Override
    public ArgumentFunctionType visitArgumentFunctionType(projectParser.ArgumentFunctionTypeContext ctx) {
        System.out.println("visitArgument_Fun");
        ArgumentFunctionType arg = new ArgumentFunctionType();
        if(ctx.VAR() != null){
            arg.setTypee(ctx.VAR().toString().trim());
            arg.setNamee(visitNamen(ctx.namen()));
        }
        else if(ctx.INT() != null){
            arg.setTypee(ctx.INT().toString().trim());
            arg.setNamee(visitNamen(ctx.namen()));
        }
        else if(ctx.DOUBLE() != null){
            arg.setTypee(ctx.DOUBLE().toString().trim());
            arg.setNamee(visitNamen(ctx.namen()));
        }
        else if(ctx.FLOAT() != null){
            arg.setTypee(ctx.FLOAT().toString().trim());
            arg.setNamee(visitNamen(ctx.namen()));
        }
        else if(ctx.DYNAMIC() != null){
            arg.setTypee(ctx.DYNAMIC().toString().trim());
            arg.setNamee(visitNamen(ctx.namen()));
        }
        if(ctx.STRING() != null){
            arg.setTypee(ctx.STRING().toString().trim());
            arg.setNamee(visitNamen(ctx.namen()));
        }
        return arg;
    }

    @Override
    public ReturnStatement visitReturnStatement(projectParser.ReturnStatementContext ctx) {
        System.out.println("visitReturn");
        ReturnStatement returnStatement = new ReturnStatement();
        if(ctx.returnID() != null){
            returnStatement.setReturnType(visitReturnID(ctx.returnID()));
        }
        if(ctx.returnINPUT_D_Q_I() != null){
            returnStatement.setReturnType(visitReturnINPUT_D_Q_I(ctx.returnINPUT_D_Q_I()));
        }
        if(ctx.returnRule() != null){
            returnStatement.setReturnType(visitReturnRule(ctx.returnRule()));
        }
//        if(ctx.return() != null){
//            returnStatement.setReturnType(visitReturn(ctx.return()));
//        }  /////////error
        if(ctx.returnNum() != null){
            returnStatement.setReturnType(visitReturnNum(ctx.returnNum()));
        }
        if(ctx.returnNumFloat() != null){
            returnStatement.setReturnType(visitReturnNumFloat(ctx.returnNumFloat()));
        }
        if(ctx.returnNumDouble() != null){
            returnStatement.setReturnType(visitReturnNumDouble(ctx.returnNumDouble()));
        }
        return returnStatement;
    }

    @Override
    public Classes visitClassS(projectParser.ClassSContext ctx) {
       System.out.println("visitClasses");
        Classes clas = new Classes();
        if(ctx.classstatement() != null){
//            System.out.println("3");
            clas.setClassStatement(visitClassstatement(ctx.classstatement()));
        }
        else if(ctx.abstractstatment() != null){
            clas.setAbstractStatment(visitAbstractstatment(ctx.abstractstatment()));
        }
        else if(ctx.extendsClass() != null){
            clas.setExtendsClass(visitExtendsClass(ctx.extendsClass()));
        }
        return clas;
    }

    @Override
    public ClassStatement visitClassstatement(projectParser.ClassstatementContext ctx) {
        System.out.println("VisitClassStatment");
        ClassStatement clas = new ClassStatement();
        clas.setClas(ctx.CLASS().toString().trim());
        clas.setId(visitNamen(ctx.namen()));
        for(int i=0; i<ctx.inputclass().size() ; i++){
//            System.out.println("iii"+i);
            if(ctx.inputclass(i) != null){
            clas.getInputclasses().add(visitInputclass(ctx.inputclass(i)));
//             clas.getInputclasses().add(visitInputclass(ctx.inputclass().get(i)));
            }
        }
        return clas;
    }

    @Override
    public AbstractStatment visitAbstractstatment(projectParser.AbstractstatmentContext ctx) {
        System.out.println("visitAbstract_Class");
        AbstractStatment abclas = new AbstractStatment();
         abclas.setAbstr(ctx.ABSTRACT().toString().trim());
        abclas.setClas(ctx.CLASS().toString().trim());
         abclas.setId(visitNamen(ctx.namen()));
        return abclas;
    }

    @Override
    public ExtendsClass visitExtendsClass(projectParser.ExtendsClassContext ctx) {
        ExtendsClass extclas = new ExtendsClass();
        /////////
        return extclas;
    }

    @Override
    public AST visitExtends_ClassStatment_Withinput(projectParser.Extends_ClassStatment_WithinputContext ctx) {
        return super.visitExtends_ClassStatment_Withinput(ctx);
    }

    @Override
    public AST visitExtends_ClassStatment_Withoutinput(projectParser.Extends_ClassStatment_WithoutinputContext ctx) {
        return super.visitExtends_ClassStatment_Withoutinput(ctx);
    }

    @Override
    public AST visitExtends_ClassStateFull(projectParser.Extends_ClassStateFullContext ctx) {
        return super.visitExtends_ClassStateFull(ctx);
    }

    @Override
    public AST visitExtends_ClassStateLess(projectParser.Extends_ClassStateLessContext ctx) {
        return super.visitExtends_ClassStateLess(ctx);
    }

    @Override
    public AST visitExtends_ClassStateFull_WithAppBar(projectParser.Extends_ClassStateFull_WithAppBarContext ctx) {
        return super.visitExtends_ClassStateFull_WithAppBar(ctx);
    }

    @Override
    public AST visitExtends_ClassStateLess_WithAppBar(projectParser.Extends_ClassStateLess_WithAppBarContext ctx) {
        return super.visitExtends_ClassStateLess_WithAppBar(ctx);
    }

    @Override
    public AST visitExtends_ClassStateFullwithinput(projectParser.Extends_ClassStateFullwithinputContext ctx) {
        return super.visitExtends_ClassStateFullwithinput(ctx);
    }

    @Override
    public AST visitExtends_ClassStateLesswithinput(projectParser.Extends_ClassStateLesswithinputContext ctx) {
        return super.visitExtends_ClassStateLesswithinput(ctx);
    }

    @Override
    public AST visitExtends_ClassStateFullwithinput_appBar(projectParser.Extends_ClassStateFullwithinput_appBarContext ctx) {
        return super.visitExtends_ClassStateFullwithinput_appBar(ctx);
    }

    @Override
    public AST visitExtends_ClassStateLesswithinput_appBar(projectParser.Extends_ClassStateLesswithinput_appBarContext ctx) {
        return super.visitExtends_ClassStateLesswithinput_appBar(ctx);
    }

    @Override
    public AST visitInput_AppBar(projectParser.Input_AppBarContext ctx) {
        return super.visitInput_AppBar(ctx);
    }

    @Override
    public AST visitColor(projectParser.ColorContext ctx) {
        return super.visitColor(ctx);
    }


    @Override
    public AST visitRowStatement(projectParser.RowStatementContext ctx) {
        return super.visitRowStatement(ctx);
    }

    @Override
    public AST visitColStatemenst(projectParser.ColStatemenstContext ctx) {
        return super.visitColStatemenst(ctx);
    }

    @Override
    public AST visitTexeStatement(projectParser.TexeStatementContext ctx) {
        return super.visitTexeStatement(ctx);
    }

    @Override
    public AST visitText_INPUT_D_Q_N(projectParser.Text_INPUT_D_Q_NContext ctx) {
        return super.visitText_INPUT_D_Q_N(ctx);
    }

    @Override
    public AST visitText_INPUT_D_Q_I(projectParser.Text_INPUT_D_Q_IContext ctx) {
        return super.visitText_INPUT_D_Q_I(ctx);
    }

    @Override
    public AST visitText_rule(projectParser.Text_ruleContext ctx) {
        return super.visitText_rule(ctx);
    }

    @Override
    public AST visitSizedBox(projectParser.SizedBoxContext ctx) {
        return super.visitSizedBox(ctx);
    }

    @Override
    public AST visitHight_SizedBox(projectParser.Hight_SizedBoxContext ctx) {
        return super.visitHight_SizedBox(ctx);
    }

    @Override
    public AST visitWidth_SizedBox(projectParser.Width_SizedBoxContext ctx) {
        return super.visitWidth_SizedBox(ctx);
    }

    @Override
    public AST visitWidthHight_SizedBox(projectParser.WidthHight_SizedBoxContext ctx) {
        return super.visitWidthHight_SizedBox(ctx);
    }

    @Override
    public AST visitHightWidth_SizedBox(projectParser.HightWidth_SizedBoxContext ctx) {
        return super.visitHightWidth_SizedBox(ctx);
    }

    @Override
    public AST visitTextButton(projectParser.TextButtonContext ctx) {
        return super.visitTextButton(ctx);
    }

    @Override
    public AST visitImageState(projectParser.ImageStateContext ctx) {
        return super.visitImageState(ctx);
    }

    @Override
    public AST visitImage_withAssetImage(projectParser.Image_withAssetImageContext ctx) {
        return super.visitImage_withAssetImage(ctx);
    }

    @Override
    public AST visitImage_withAssetImage_WithDirection(projectParser.Image_withAssetImage_WithDirectionContext ctx) {
        return super.visitImage_withAssetImage_WithDirection(ctx);
    }

    @Override
    public AST visitImage_withAssetImage_WithDirection_fit(projectParser.Image_withAssetImage_WithDirection_fitContext ctx) {
        return super.visitImage_withAssetImage_WithDirection_fit(ctx);
    }

    @Override
    public AST visitImage_withAsset(projectParser.Image_withAssetContext ctx) {
        return super.visitImage_withAsset(ctx);
    }

    @Override
    public AST visitImage_withNetWoek(projectParser.Image_withNetWoekContext ctx) {
        return super.visitImage_withNetWoek(ctx);
    }

    @Override
    public AST visitImage_withFile(projectParser.Image_withFileContext ctx) {
        return super.visitImage_withFile(ctx);
    }

    @Override
    public AST visitImageDirection(projectParser.ImageDirectionContext ctx) {
        return super.visitImageDirection(ctx);
    }

    @Override
    public AST visitImageFit(projectParser.ImageFitContext ctx) {
        return super.visitImageFit(ctx);
    }

    @Override
    public AST visitExpandedStatment(projectParser.ExpandedStatmentContext ctx) {
        return super.visitExpandedStatment(ctx);
    }

    @Override
    public AST visitExpanded_withCol(projectParser.Expanded_withColContext ctx) {
        return super.visitExpanded_withCol(ctx);
    }

    @Override
    public AST visitExpanded_withRow(projectParser.Expanded_withRowContext ctx) {
        return super.visitExpanded_withRow(ctx);
    }

    @Override
    public AST visitPaddingStatement(projectParser.PaddingStatementContext ctx) {
        return super.visitPaddingStatement(ctx);
    }

    @Override
    public AST visitPadding_all(projectParser.Padding_allContext ctx) {
        return super.visitPadding_all(ctx);
    }

    @Override
    public AST visitPadding_sym_vertical_num(projectParser.Padding_sym_vertical_numContext ctx) {
        return super.visitPadding_sym_vertical_num(ctx);
    }

    @Override
    public AST visitPadding_sym_vertical_numFloat(projectParser.Padding_sym_vertical_numFloatContext ctx) {
        return super.visitPadding_sym_vertical_numFloat(ctx);
    }

    @Override
    public AST visitPadding_sym_horisantal_num(projectParser.Padding_sym_horisantal_numContext ctx) {
        return super.visitPadding_sym_horisantal_num(ctx);
    }

    @Override
    public AST visitPadding_sym_horisantal_numFloat(projectParser.Padding_sym_horisantal_numFloatContext ctx) {
        return super.visitPadding_sym_horisantal_numFloat(ctx);
    }

    @Override
    public AST visitPadding_only(projectParser.Padding_onlyContext ctx) {
        return super.visitPadding_only(ctx);
    }

    @Override
    public AST visitDirection(projectParser.DirectionContext ctx) {
        return super.visitDirection(ctx);
    }

    @Override
    public AST visitFlutterWidget(projectParser.FlutterWidgetContext ctx) {
        return super.visitFlutterWidget(ctx);
    }

    @Override
    public Input visitInputI(projectParser.InputIContext ctx) {
       System.out.println("visitInputI");
        Input input = new Input();
        if(ctx.initial() != null){
            input.setInitial(visitInitial(ctx.initial()));
        }
        if(ctx.ifstatement() != null){
            input.setIfStatment(visitIfstatement(ctx.ifstatement()));
        }
        if(ctx.loop() != null){
            input.setLoop(visitLoop(ctx.loop()));
        }
        if(ctx.doWhilestatement() != null){
            input.setDoWhileStatement(visitDoWhilestatement(ctx.doWhilestatement()));
        }
        if(ctx.whilestatemen() != null){
            input.setWhileStatement(visitWhilestatemen(ctx.whilestatemen()));
        }
        if(ctx.printstatement() != null){
            input.setPrintStatement(visitPrintstatement(ctx.printstatement()));
        }
        if(ctx.switchstatement() != null){
            input.setSwitchStatement(visitSwitchstatement(ctx.switchstatement()));
        }
        if(ctx.tryCatchstatement() != null){
            input.setTryCatchStatement(visitTryCatchstatement(ctx.tryCatchstatement()));
        }
        return input;
    }

    @Override
    public InputClasses visitInputclass(projectParser.InputclassContext ctx) {

        System.out.println("visitInputClass");
        InputClasses input = new InputClasses();
        if(ctx.initial() != null){
//            System.out.println("5");
            input.setInitial(visitInitial(ctx.initial()));
        }

        if(ctx.functionStatement() != null){
            input.setFun(visitFunctionStatement(ctx.functionStatement()));
        }
        return input;
    }

    @Override
    public IFIF visitIfif(projectParser.IfifContext ctx) {
        System.out.println("visitIFif");
        IFIF ifif = new IFIF();
        if(ctx.BREAK() != null){
            ifif.setBrek(ctx.BREAK().toString().trim());
        }
        if(ctx.CONTINUE() != null){
            ifif.setCont(ctx.CONTINUE().toString().trim());
        }
        if(ctx.inputI() != null){
            for(int i=0;i<ctx.inputI().size(); i++){
                if(ctx.inputI(i) != null){
                ifif.getInp().add((visitInputI(ctx.inputI(i))));
            }}
        }
        return ifif;
    }

    @Override
    public ElseIfInput visitElseif_WithInput(projectParser.Elseif_WithInputContext ctx) {
        System.out.println("visitElse_If");
        ElseIfInput elseif = new ElseIfInput();
        elseif.setElseif(ctx.ELSEIF().toString().trim());
        for(int i=0;i<ctx.conditions().size();i++){
            if(ctx.conditions(i) != null){
                elseif.getCond().add((visitConditions(ctx.conditions(i))));
            }
        }

        elseif.setIfatr(visitIfif(ctx.ifif()));
        return elseif;
    }

    @Override
    public ElseInput visitElse_WithInput(projectParser.Else_WithInputContext ctx) {
        System.out.println("visitElse");
        ElseInput elsee = new ElseInput();
        elsee.setElsee(ctx.ELSE().toString().trim());
        elsee.setIfif(visitIfif(ctx.ifif()));
        return elsee;
    }

    @Override
    public AST visitContainerStatement(projectParser.ContainerStatementContext ctx) {
        return super.visitContainerStatement(ctx);
    }

    @Override
    public ReturnType visitReturnID(projectParser.ReturnIDContext ctx) {
        System.out.println("visitReturn_Id");
        ReturnType returnType = new ReturnType();
        if(ctx.RETURN() != null){
            returnType.setReturnn(ctx.RETURN().toString().trim());
        }
        if(ctx.ID() != null){
            returnType.setIdd(ctx.ID().toString().trim());
        }
        return returnType;
    }

    @Override
    public ReturnType visitReturnINPUT_D_Q_I(projectParser.ReturnINPUT_D_Q_IContext ctx) {
        System.out.println("visitReturn_DQI");
        ReturnType returnType = new ReturnType();
        if(ctx.RETURN() != null){
            returnType.setReturnn(ctx.RETURN().toString().trim());
        }
        if(ctx.INPUT_D_Q_I() != null){
            returnType.setIdd(ctx.INPUT_D_Q_I().toString().trim());
        }
        return returnType;
    }

    @Override
    public ReturnType visitReturnRule(projectParser.ReturnRuleContext ctx) {
        System.out.println("visitReturn_Rule");
        ReturnType returnType = new ReturnType();
        if(ctx.RETURN() != null){
            returnType.setReturnn(ctx.RETURN().toString().trim());
        }
        for(int i=0;i<ctx.rule_().size();i++){
            if(ctx.rule_(i) != null){
            returnType.getRules().add((visitRule(ctx.rule_(i))));
        }}
        return returnType;
    }

    @Override
    public ReturnType visitReturn(projectParser.ReturnContext ctx) {
        System.out.println("visitReturn_R");
        ReturnType returnType = new ReturnType();
        if(ctx.RETURN() != null){
            returnType.setReturnn(ctx.RETURN().toString().trim());
        }
        return returnType;
    }

    @Override
    public ReturnType visitReturnNum(projectParser.ReturnNumContext ctx) {
        System.out.println("visitReturn_Num");
        ReturnType returnType = new ReturnType();
        if(ctx.RETURN() != null){
            returnType.setReturnn(ctx.RETURN().toString().trim());
        }
        if(ctx.NUM() != null){
            returnType.setIdd(ctx.NUM().toString().trim());
        }
        return returnType;
    }

    @Override
    public ReturnType visitReturnNumFloat(projectParser.ReturnNumFloatContext ctx) {
        System.out.println("visitReturn_Float");
        ReturnType returnType = new ReturnType();
        if(ctx.RETURN() != null){
            returnType.setReturnn(ctx.RETURN().toString().trim());
        }
        if(ctx.NUM_FLOAT() != null){
            returnType.setIdd(ctx.NUM_FLOAT().toString().trim());
        }
        return returnType;
    }

    @Override
    public ReturnType visitReturnNumDouble(projectParser.ReturnNumDoubleContext ctx) {
        System.out.println("visitReturn_Double");
        ReturnType returnType = new ReturnType();
        if(ctx.RETURN() != null){
            returnType.setReturnn(ctx.RETURN().toString().trim());
        }
        if(ctx.NUM_DOUBLE() != null){
            returnType.setIdd(ctx.NUM_DOUBLE().toString().trim());
        }
        return returnType;
    }

    @Override
    public AST visitInput_1AppBar(projectParser.Input_1AppBarContext ctx) {
        return super.visitInput_1AppBar(ctx);
    }

    @Override
    public AST visitInput_2AppBar(projectParser.Input_2AppBarContext ctx) {
        return super.visitInput_2AppBar(ctx);
    }

    @Override
    public AST visitInput_3AppBar(projectParser.Input_3AppBarContext ctx) {
        return super.visitInput_3AppBar(ctx);
    }

    @Override
    public AST visitInput_4AppBar(projectParser.Input_4AppBarContext ctx) {
        return super.visitInput_4AppBar(ctx);
    }

    @Override
    public AST visitColor_red(projectParser.Color_redContext ctx) {
        return super.visitColor_red(ctx);
    }

    @Override
    public AST visitColor_green(projectParser.Color_greenContext ctx) {
        return super.visitColor_green(ctx);
    }

    @Override
    public AST visitImageHight_DF(projectParser.ImageHight_DFContext ctx) {
        return super.visitImageHight_DF(ctx);
    }

    @Override
    public AST visitImageWidth_DF(projectParser.ImageWidth_DFContext ctx) {
        return super.visitImageWidth_DF(ctx);
    }

    @Override
    public AST visitImageHightWidth_DF(projectParser.ImageHightWidth_DFContext ctx) {
        return super.visitImageHightWidth_DF(ctx);
    }

    @Override
    public AST visitImageWidthHight_DF(projectParser.ImageWidthHight_DFContext ctx) {
        return super.visitImageWidthHight_DF(ctx);
    }

    @Override
    public AST visitImageHightWidth_DN(projectParser.ImageHightWidth_DNContext ctx) {
        return super.visitImageHightWidth_DN(ctx);
    }

    @Override
    public AST visitImageWidthHight_DN(projectParser.ImageWidthHight_DNContext ctx) {
        return super.visitImageWidthHight_DN(ctx);
    }

    @Override
    public AST visitTop_direction_NUM(projectParser.Top_direction_NUMContext ctx) {
        return super.visitTop_direction_NUM(ctx);
    }

    @Override
    public AST visitRight_direction_NUM(projectParser.Right_direction_NUMContext ctx) {
        return super.visitRight_direction_NUM(ctx);
    }

    @Override
    public AST visitBottom_direction_NUM(projectParser.Bottom_direction_NUMContext ctx) {
        return super.visitBottom_direction_NUM(ctx);
    }

    @Override
    public AST visitLeft_direction_NUM(projectParser.Left_direction_NUMContext ctx) {
        return super.visitLeft_direction_NUM(ctx);
    }

    @Override
    public AST visitTop_direction_FLOAT(projectParser.Top_direction_FLOATContext ctx) {
        return super.visitTop_direction_FLOAT(ctx);
    }

    @Override
    public AST visitRight_direction_FLOAT(projectParser.Right_direction_FLOATContext ctx) {
        return super.visitRight_direction_FLOAT(ctx);
    }

    @Override
    public AST visitBottom_direction_FLOAT(projectParser.Bottom_direction_FLOATContext ctx) {
        return super.visitBottom_direction_FLOAT(ctx);
    }

    @Override
    public AST visitLeft_direction_FLOAT(projectParser.Left_direction_FLOATContext ctx) {
        return super.visitLeft_direction_FLOAT(ctx);
    }

    @Override
    public AST visitTop_direction_NUM_D(projectParser.Top_direction_NUM_DContext ctx) {
        return super.visitTop_direction_NUM_D(ctx);
    }

    @Override
    public AST visitRight_direction_NUM_D(projectParser.Right_direction_NUM_DContext ctx) {
        return super.visitRight_direction_NUM_D(ctx);
    }

    @Override
    public AST visitBottom_direction_NUM_D(projectParser.Bottom_direction_NUM_DContext ctx) {
        return super.visitBottom_direction_NUM_D(ctx);
    }

    @Override
    public AST visitLeft_direction_NUM_D(projectParser.Left_direction_NUM_DContext ctx) {
        return super.visitLeft_direction_NUM_D(ctx);
    }

    @Override
    public AST visitTop_direction_FLOAT_D(projectParser.Top_direction_FLOAT_DContext ctx) {
        return super.visitTop_direction_FLOAT_D(ctx);
    }

    @Override
    public AST visitRight_direction_FLOAT_D(projectParser.Right_direction_FLOAT_DContext ctx) {
        return super.visitRight_direction_FLOAT_D(ctx);
    }

    @Override
    public AST visitBottom_direction_FLOAT_D(projectParser.Bottom_direction_FLOAT_DContext ctx) {
        return super.visitBottom_direction_FLOAT_D(ctx);
    }

    @Override
    public AST visitLeft_direction_FLOAT_D(projectParser.Left_direction_FLOAT_DContext ctx) {
        return super.visitLeft_direction_FLOAT_D(ctx);
    }

    @Override
    public NameN visitNamen(projectParser.NamenContext ctx) {
        System.out.println("visitNameN");
        NameN nam = new NameN();
        nam.setNam(ctx.ID().toString().trim());
        return nam;
    }
}

