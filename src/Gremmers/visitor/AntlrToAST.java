package Gremmers.visitor;

import Gremmers.AST;
import Gremmers.Flutter.AppBar.*;
import Gremmers.Flutter.Column.Column;
import Gremmers.Flutter.Container.Container;
import Gremmers.Flutter.FlutterWidget.FlutterWidget;
import Gremmers.Flutter.Image.*;
import Gremmers.Flutter.Image.Direction.imageDirection;
import Gremmers.Flutter.Image.Direction.imageHightWidth_Reverse_DF;
import Gremmers.Flutter.Image.Direction.imageHightWidth_Reverse_DN;
import Gremmers.Flutter.Image.Direction.imageHight_AND_Width_DF;
import Gremmers.Flutter.Padding.*;
import Gremmers.Flutter.Padding.direction.*;
import Gremmers.Flutter.Row.Row;
import Gremmers.Flutter.SizedBox.SizedBoxClasses;
import Gremmers.Flutter.SizedBox.hight_AND_widthSizedBox;
import Gremmers.Flutter.SizedBox.widthHight_SizedBox;
import Gremmers.Flutter.TextButton.textButton;
import Gremmers.Flutter.TextStatement.TextClasses;
import Gremmers.Flutter.TextStatement.text_INPUT_D_Q_I;
import Gremmers.Flutter.TextStatement.text_INPUT_D_Q_N;
import Gremmers.Flutter.TextStatement.text_rule;
import Gremmers.Flutter.expandedClasses.expandedClasses;
import Gremmers.Flutter.expandedClasses.expanded_withCol_withRow;
import Gremmers.Flutter.extendClasses.extendClasses.*;
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
import symbol.SymbolRow;
import symbol.SymbolTable;
import syntax.projectParser;
import syntax.projectParserBaseVisitor;

public class AntlrToAST extends projectParserBaseVisitor<AST> {

    public SymbolTable symbolTable = new SymbolTable();


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
        createSymbolRow("prog","progname","progvalue",ctx.start.getLine());
//        this.symbolTable.printSymbol();
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
        createSymbolRow("Element","elemname","elemvalue",ctx.start.getLine());
        return e;
    }


    @Override
    public Body visitBody(projectParser.BodyContext ctx) {
        System.out.println("visitBody");
        Body body = new Body();
        if(ctx.classS() != null) {
//            System.out.println("2");
            body.setClasses(visitClassS(ctx.classS()));
            createSymbolRow("Class","","",ctx.start.getLine());
        }
        else if(ctx.functionStatement() != null) {
            body.setFunctions(visitFunctionStatement(ctx.functionStatement()));
            createSymbolRow("Function","","",ctx.start.getLine());
        }
        return body;
    }

    @Override
    public Float visitFloat_f(projectParser.Float_fContext ctx) {
        System.out.println("visitfloat");
        Float float_p = new Float();
        float_p.setFLOAT(ctx.NUM_FLOAT().toString().trim());
        createSymbolRow("initial","var",float_p.getFLOAT(),ctx.start.getLine());
        return float_p;
    }

    @Override
    public IntI visitInt_i(projectParser.Int_iContext ctx) {
        System.out.println("visitInt");
        IntI int_p = new IntI();
        int_p.setIntt(ctx.NUM().toString().trim());
        createSymbolRow("initial","int",int_p.getIntt(),ctx.start.getLine());
        return int_p;
    }

    @Override
    public Double visitDouble_d(projectParser.Double_dContext ctx) {
        System.out.println("visitdouble");
        Double double_p = new Double();
        double_p.setDouble(ctx.NUM_DOUBLE().toString().trim());
        createSymbolRow("initial","double",double_p.getDouble(),ctx.start.getLine());
        return double_p;
    }

    @Override
    public ArrayType visitArrayType(projectParser.ArrayTypeContext ctx) {
        System.out.println("visitArrayType");
        ArrayType a = new ArrayType();
        if(ctx.array_var() != null){
            a.setArrayVar(visitArray_var(ctx.array_var()));
            createSymbolRow("array","arrayvar",a.getArrayVar().toString(),ctx.start.getLine());
        }
        if(ctx.array_int() != null){
            a.setArrayInt(visitArray_int(ctx.array_int()));
            createSymbolRow("array","arrayint",a.getArrayInt().toString(),ctx.start.getLine());
        }
        if(ctx.array_string() != null){
            a.setArrayString(visitArray_string(ctx.array_string()));
            createSymbolRow("array","arraystring",a.getArrayString().toString(),ctx.start.getLine());
        }
        if(ctx.array_float() != null){
            a.setArrayfloat(visitArray_float(ctx.array_float()));
            createSymbolRow("array","arrayfloat",a.getArrayFloat().toString(),ctx.start.getLine());
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
        createSymbolRow(arrvar.getVar(),arrvar.getId().toString(),arrvar.getArraybody().toString(),ctx.start.getLine());
        return arrvar;
    }

    @Override
    public ArrayInt visitArray_int(projectParser.Array_intContext ctx) {
        System.out.println("visitArray_Int");
        ArrayInt arrint = new ArrayInt();
        arrint.setVar(ctx.INT().toString().trim());
        arrint.setId(visitNamen(ctx.namen()));
        arrint.setArrayVarInt(visitArrayINT(ctx.arrayINT()));
        createSymbolRow(arrint.getVar(),arrint.getId().toString(),arrint.getArrayVarInt().toString(),ctx.start.getLine());
        return arrint;
    }

    @Override
    public ArrayString visitArray_string(projectParser.Array_stringContext ctx) {
        System.out.println("visitArray_String");
        ArrayString arrstr = new ArrayString();
        arrstr.setVar(ctx.STRING().toString().trim());
        arrstr.setId(visitNamen(ctx.namen()));
        arrstr.setArrayVarString(visitArraySTRING(ctx.arraySTRING()));
        createSymbolRow(arrstr.getVar(),arrstr.getId().toString(),arrstr.getArrayVarString().toString(),ctx.start.getLine());
        return arrstr;
    }

    @Override
    public ArrayFloat visitArray_float(projectParser.Array_floatContext ctx) {
        System.out.println("visitArray_Float");
        ArrayFloat arrflo = new ArrayFloat();
        arrflo.setVar(ctx.FLOAT().toString().trim());
        arrflo.setId(visitNamen(ctx.namen()));
        arrflo.setArrayVarFloat(visitArrayFLOAT(ctx.arrayFLOAT()));
        createSymbolRow(arrflo.getVar(),arrflo.getId().toString(),arrflo.getArrayVarFloat().toString(),ctx.start.getLine());
        return arrflo;
    }

    @Override
    public ArrayBody visitArraybody(projectParser.ArraybodyContext ctx) {
        System.out.println("visitArrayBody");
        ArrayBody aa = new ArrayBody();
        if(ctx.arrayINT() != null){
            aa.setArrayVarInt(visitArrayINT(ctx.arrayINT()));
            createSymbolRow("arraybody",aa.getArrayVarInt().toString(),"value",ctx.start.getLine());
        }
        if(ctx.arraySTRING() != null){
            aa.setArrayVarString(visitArraySTRING(ctx.arraySTRING()));
            createSymbolRow("arraybody",aa.getArrayVarString().toString(),"value",ctx.start.getLine());
        }
        if(ctx.arrayFLOAT() != null){
            aa.setArrayVarFloat(visitArrayFLOAT(ctx.arrayFLOAT()));
            createSymbolRow("arraybody",aa.getArrayVarFloat().toString(),"value",ctx.start.getLine());
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
        createSymbolRow("arraybody","",aarvarint.toString(),ctx.start.getLine());
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
        createSymbolRow("arraybody","",aarvarstr.toString(),ctx.start.getLine());
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
        createSymbolRow("arraybody","",aarvarflo.toString(),ctx.start.getLine());
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
            createSymbolRow("initial","varvariable",in.getVarvariable().toString(),ctx.start.getLine());
        }
        else if(ctx.var_Variable_expr() != null){
            in.setVarvariableexpr(visitVar_Variable_expr(ctx.var_Variable_expr()));
            createSymbolRow("initial","varvariableExpr",in.getVarvariableexpr().toString(),ctx.start.getLine());
        }
        else if(ctx.var_Variable_emp() != null){
            in.setVarvariableemp(visitVar_Variable_emp(ctx.var_Variable_emp()));
            createSymbolRow("initial","varvariableEmp",in.getVarvariableemp().toString(),ctx.start.getLine());
        }
        else if(ctx.varVariable_INPUT_D_Q_N() != null){
            in.setVarvariable(visitVarVariable_INPUT_D_Q_N(ctx.varVariable_INPUT_D_Q_N()));
            createSymbolRow("initial","varvariableDQN",in.getVarvariable().toString(),ctx.start.getLine());
        }
        else if(ctx.varVariable_INPUT_D_Q_I() != null){
            in.setVarvariable(visitVarVariable_INPUT_D_Q_I(ctx.varVariable_INPUT_D_Q_I()));
            createSymbolRow("initial","varvariableDQI",in.getVarvariable().toString(),ctx.start.getLine());
        }
        else if(ctx.const_Variable() != null){
            in.setVarvariable(visitConst_Variable(ctx.const_Variable()));
            createSymbolRow("initial","constvariable",in.getVarvariable().toString(),ctx.start.getLine());
        }
        else if(ctx.const_Variable_expr() != null){
            in.setVarvariableexpr(visitConst_Variable_expr(ctx.const_Variable_expr()));
            createSymbolRow("initial","constvariableExpr",in.getVarvariableexpr().toString(),ctx.start.getLine());
        }
        else if(ctx.const_Variable_emp() != null){
            in.setVarvariableemp(visitConst_Variable_emp(ctx.const_Variable_emp()));
            createSymbolRow("initial","constvariableEmp",in.getVarvariableemp().toString(),ctx.start.getLine());
        }
        else if(ctx.const_Variable_INPUT_D_Q_N() != null){
            in.setVarvariable(visitConst_Variable_INPUT_D_Q_N(ctx.const_Variable_INPUT_D_Q_N()));
            createSymbolRow("initial","constvariableDQN",in.getVarvariable().toString(),ctx.start.getLine());
        }
        else if(ctx.const_Variable_INPUT_D_Q_I() != null){
            in.setVarvariable(visitConst_Variable_INPUT_D_Q_I(ctx.const_Variable_INPUT_D_Q_I()));
            createSymbolRow("initial","constvariableDQI",in.getVarvariable().toString(),ctx.start.getLine());
        }
        else if(ctx.dynamic_Variable() != null){
            in.setVarvariable(visitDynamic_Variable(ctx.dynamic_Variable()));
            createSymbolRow("initial","dynamicvariable",in.getVarvariable().toString(),ctx.start.getLine());
        }
        else if(ctx.dynamic_Variable_expr() != null){
            in.setVarvariableexpr(visitDynamic_Variable_expr(ctx.dynamic_Variable_expr()));
            createSymbolRow("initial","dynamicvariableExpr",in.getVarvariableexpr().toString(),ctx.start.getLine());
        }
        else if(ctx.dynamic_Variable_emp() != null){
            in.setVarvariableemp(visitDynamic_Variable_emp(ctx.dynamic_Variable_emp()));
            createSymbolRow("initial","dynamicvariableEmp",in.getVarvariableemp().toString(),ctx.start.getLine());
        }
        else if(ctx.dynamic_Variable_INPUT_D_Q_N() != null){
            in.setVarvariable(visitDynamic_Variable_INPUT_D_Q_N(ctx.dynamic_Variable_INPUT_D_Q_N()));
            createSymbolRow("initial","dynamicvariableDQN",in.getVarvariable().toString(),ctx.start.getLine());
        }
        else if(ctx.dynamic_Variable_INPUT_D_Q_I() != null){
            in.setVarvariable(visitDynamic_Variable_INPUT_D_Q_I(ctx.dynamic_Variable_INPUT_D_Q_I()));
            createSymbolRow("initial","dynamicvariableDQI",in.getVarvariable().toString(),ctx.start.getLine());
        }
        else if(ctx.final_Variable() != null){
            in.setVarvariable(visitFinal_Variable(ctx.final_Variable()));
            createSymbolRow("initial","finalvariable",in.getVarvariable().toString(),ctx.start.getLine());
        }
        else if(ctx.final_Variable_expr() != null){
            in.setVarvariableexpr(visitFinal_Variable_expr(ctx.final_Variable_expr()));
            createSymbolRow("initial","finalvariableExp",in.getVarvariableexpr().toString(),ctx.start.getLine());
        }
        else if(ctx.final_Variable_emp() != null){
            in.setVarvariableemp(visitFinal_Variable_emp(ctx.final_Variable_emp()));
            createSymbolRow("initial","finalvariableEmp",in.getVarvariableemp().toString(),ctx.start.getLine());
        }
        else if(ctx.final_Variable_INPUT_D_Q_N() != null){
            in.setVarvariable(visitFinal_Variable_INPUT_D_Q_N(ctx.final_Variable_INPUT_D_Q_N()));
            createSymbolRow("initial","finalvariableDQN",in.getVarvariable().toString(),ctx.start.getLine());
        }
        else if(ctx.final_Variable_INPUT_D_Q_I() != null){
            in.setVarvariable(visitFinal_Variable_INPUT_D_Q_I(ctx.final_Variable_INPUT_D_Q_I()));
            createSymbolRow("initial","finalvariableDQI",in.getVarvariable().toString(),ctx.start.getLine());
        }
        else if(ctx.string_Variable_INPUT_D_Q_N() != null){
            in.setVarvariable(visitString_Variable_INPUT_D_Q_N(ctx.string_Variable_INPUT_D_Q_N()));
            createSymbolRow("initial","stringvariableDQN",in.getVarvariable().toString(),ctx.start.getLine());
        }
        else if(ctx.string_Variable_INPUT_D_Q_I() != null){
            in.setVarvariable(visitString_Variable_INPUT_D_Q_I(ctx.string_Variable_INPUT_D_Q_I()));
            createSymbolRow("initial","stringvariableDQI",in.getVarvariable().toString(),ctx.start.getLine());
        }
        else if(ctx.string_Variable_TEXT() != null){
            in.setVarvariableString(visitString_Variable_TEXT(ctx.string_Variable_TEXT()));
            createSymbolRow("initial","stringvariableText",in.getVarvariableString().toString(),ctx.start.getLine());
        }
        else if(ctx.int_Variable() != null){
            in.setVarvariable(visitInt_Variable(ctx.int_Variable()));
            createSymbolRow("initial","intvariable",in.getVarvariable().toString(),ctx.start.getLine());
        }
        else if(ctx.int_Variable_expr() != null){
            in.setVarvariableexpr(visitInt_Variable_expr(ctx.int_Variable_expr()));
            createSymbolRow("initial","intvariableExpr",in.getVarvariableexpr().toString(),ctx.start.getLine());
        }
        else if(ctx.int_Variable_emp() != null){
            in.setVarvariableemp(visitInt_Variable_emp(ctx.int_Variable_emp()));
            createSymbolRow("initial","intvariableEmp",in.getVarvariableemp().toString(),ctx.start.getLine());
        }
        else if(ctx.float_Variable() != null){
            in.setVarvariable(visitFloat_Variable(ctx.float_Variable()));
            createSymbolRow("initial","floatvariable",in.getVarvariable().toString(),ctx.start.getLine());
        }
        else if(ctx.double_Variable() != null){
            in.setVarvariable(visitDouble_Variable(ctx.double_Variable()));
            createSymbolRow("initial","doublevariable",in.getVarvariable().toString(),ctx.start.getLine());
        }
        else if(ctx.boolean_Variable() != null){
            in.setVarvariable(visitBoolean_Variable(ctx.boolean_Variable()));
            createSymbolRow("initial","booleanvariable",in.getVarvariable().toString(),ctx.start.getLine());
        }
        else if(ctx.arrayType() != null){
            in.setArrayType(visitArrayType(ctx.arrayType()));
            createSymbolRow("initial","arraytypevariable",in.getArrayType().toString(),ctx.start.getLine());
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
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiablevalue(),ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariableExpr visitVar_Variable_expr(projectParser.Var_Variable_exprContext ctx) {
        System.out.println("visitVar_Variable_Expr");
        varVariableExpr vv = new varVariableExpr();
        vv.setVarVaiableType(ctx.VAR().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableExpr(visitExpr(ctx.expr()));
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiableExpr().toString(),ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariableEmp visitVar_Variable_emp(projectParser.Var_Variable_empContext ctx) {
        System.out.println("visitVar_Variable_Emp");
        varVariableEmp vv = new varVariableEmp();
        vv.setVarVaiableType(ctx.VAR().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),"",ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariable visitVarVariable_INPUT_D_Q_N(projectParser.VarVariable_INPUT_D_Q_NContext ctx) {
        System.out.println("visitVar_Variable_DQN");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.VAR().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.INPUT_D_Q_N().toString().trim());
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiablevalue(),ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariable visitVarVariable_INPUT_D_Q_I(projectParser.VarVariable_INPUT_D_Q_IContext ctx) {
        System.out.println("visitVar_Variable_DQI");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.VAR().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.INPUT_D_Q_I().toString().trim());
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiablevalue(),ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariable visitConst_Variable(projectParser.Const_VariableContext ctx) {
        System.out.println("visitConst_Variable");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.CONST().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.NUM().toString().trim());
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiablevalue(),ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariableExpr visitConst_Variable_expr(projectParser.Const_Variable_exprContext ctx) {
        System.out.println("visitConst_Variable_Expr");
        varVariableExpr vv = new varVariableExpr();
        vv.setVarVaiableType(ctx.CONST().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableExpr(visitExpr(ctx.expr()));
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiableExpr().toString(),ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariableEmp visitConst_Variable_emp(projectParser.Const_Variable_empContext ctx) {
        System.out.println("visitConst_Variable_Emp");
        varVariableEmp vv = new varVariableEmp();
        vv.setVarVaiableType(ctx.CONST().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),"",ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariable visitConst_Variable_INPUT_D_Q_N(projectParser.Const_Variable_INPUT_D_Q_NContext ctx) {
        System.out.println("visitConst_Variable_DQN");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.CONST().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.INPUT_D_Q_N().toString().trim());
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiablevalue(),ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariable visitConst_Variable_INPUT_D_Q_I(projectParser.Const_Variable_INPUT_D_Q_IContext ctx) {
        System.out.println("visitConst_Variable_DQI");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.CONST().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.INPUT_D_Q_I().toString().trim());
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiablevalue(),ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariable visitDynamic_Variable(projectParser.Dynamic_VariableContext ctx) {
        System.out.println("visitDynamic_Variable");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.DYNAMIC().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.NUM().toString().trim());
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiablevalue(),ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariableExpr visitDynamic_Variable_expr(projectParser.Dynamic_Variable_exprContext ctx) {
        System.out.println("visitDynamic_Variable_Expr");
        varVariableExpr vv = new varVariableExpr();
        vv.setVarVaiableType(ctx.DYNAMIC().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableExpr(visitExpr(ctx.expr()));
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiableExpr().toString(),ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariableEmp visitDynamic_Variable_emp(projectParser.Dynamic_Variable_empContext ctx) {
        System.out.println("visitDynamic_Variable_Emp");
        varVariableEmp vv = new varVariableEmp();
        vv.setVarVaiableType(ctx.DYNAMIC().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),"",ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariable visitDynamic_Variable_INPUT_D_Q_N(projectParser.Dynamic_Variable_INPUT_D_Q_NContext ctx) {
        System.out.println("visitDynamic_Variable_DQN");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.DYNAMIC().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.INPUT_D_Q_N().toString().trim());
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiablevalue(),ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariable visitDynamic_Variable_INPUT_D_Q_I(projectParser.Dynamic_Variable_INPUT_D_Q_IContext ctx) {
        System.out.println("visitDynamic_Variable_DQI");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.DYNAMIC().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.INPUT_D_Q_I().toString().trim());
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiablevalue(),ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariable visitFinal_Variable(projectParser.Final_VariableContext ctx) {
        System.out.println("visitFinal_Variable");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.FINAL().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.NUM().toString().trim());
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiablevalue(),ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariableExpr visitFinal_Variable_expr(projectParser.Final_Variable_exprContext ctx) {
        System.out.println("visitFinal_Variable_Expr");
        varVariableExpr vv = new varVariableExpr();
        vv.setVarVaiableType(ctx.FINAL().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableExpr(visitExpr(ctx.expr()));
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiableExpr().toString(),ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariableEmp visitFinal_Variable_emp(projectParser.Final_Variable_empContext ctx) {
        System.out.println("visitFinal_Variable_Emp");
        varVariableEmp vv = new varVariableEmp();
        vv.setVarVaiableType(ctx.FINAL().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),"",ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariable visitFinal_Variable_INPUT_D_Q_N(projectParser.Final_Variable_INPUT_D_Q_NContext ctx) {
        System.out.println("visitFinal_Variable_DQN");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.FINAL().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.INPUT_D_Q_N().toString().trim());
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiablevalue(),ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariable visitFinal_Variable_INPUT_D_Q_I(projectParser.Final_Variable_INPUT_D_Q_IContext ctx) {
        System.out.println("visitFinal_Variable_DQI");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.FINAL().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.INPUT_D_Q_I().toString().trim());
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiablevalue(),ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariable visitString_Variable_INPUT_D_Q_N(projectParser.String_Variable_INPUT_D_Q_NContext ctx) {
        System.out.println("visitString_Variable_DQN");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.STRING().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.INPUT_D_Q_N().toString().trim());
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiablevalue(),ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariable visitString_Variable_INPUT_D_Q_I(projectParser.String_Variable_INPUT_D_Q_IContext ctx) {
        System.out.println("visitString_Variable_DQI");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.STRING().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.INPUT_D_Q_I().toString().trim());
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiablevalue(),ctx.start.getLine());
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
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiablerule().toString(),ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariable visitInt_Variable(projectParser.Int_VariableContext ctx) {
        System.out.println("visitInt_Variable");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.INT().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.NUM().toString().trim());
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiablevalue(),ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariableExpr visitInt_Variable_expr(projectParser.Int_Variable_exprContext ctx) {
        System.out.println("visitInt_Variable_Expr");
        varVariableExpr vv = new varVariableExpr();
        vv.setVarVaiableType(ctx.INT().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableExpr(visitExpr(ctx.expr()));
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiableExpr().toString(),ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariableEmp visitInt_Variable_emp(projectParser.Int_Variable_empContext ctx) {
        System.out.println("visitInt_Variable_Emp");
        varVariableEmp vv = new varVariableEmp();
        vv.setVarVaiableType(ctx.INT().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),"",ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariable visitFloat_Variable(projectParser.Float_VariableContext ctx) {
        System.out.println("visitFloat_Variable");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.FLOAT().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.NUM_FLOAT().toString().trim());
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiablevalue(),ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariable visitDouble_Variable(projectParser.Double_VariableContext ctx) {
        System.out.println("visitDouble_Variable");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.DOUBLE().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.NUM_DOUBLE().toString().trim());
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiablevalue(),ctx.start.getLine());
        return vv;
    }

    @Override
    public varVariable visitBoolean_Variable(projectParser.Boolean_VariableContext ctx) {
        System.out.println("visitBoolean_Variable");
        varVariable vv = new varVariable();
        vv.setVarVaiableType(ctx.BOOLEAN().toString().trim());
        vv.setVarVaiableId(visitNamen(ctx.namen()));
        vv.setVarVaiableValue(ctx.NUM_BOOL().toString().trim());
        createSymbolRow(vv.getVarVaiabletype(),vv.getVarVaiableid().toString(),vv.getVarVaiablevalue(),ctx.start.getLine());
        return vv;
    }

    @Override
    public Loop visitLoop(projectParser.LoopContext ctx) {
        System.out.println("visitLoop");
        Loop lo = new Loop();
        if(ctx.for_VAR_With_ID_ID() != null){
            lo.setForloop(visitFor_VAR_With_ID_ID(ctx.for_VAR_With_ID_ID()));
            createSymbolRow("loop","forVarIDID",lo.getForloop().toString(),ctx.start.getLine());
        }
        if(ctx.for_INT_With_ID_ID() != null){
            lo.setForloop(visitFor_INT_With_ID_ID(ctx.for_INT_With_ID_ID()));
            createSymbolRow("loop","forIntIDID",lo.getForloop().toString(),ctx.start.getLine());
        }
        if(ctx.for_VAR_With_ID_NUM() != null){
            lo.setForloop(visitFor_VAR_With_ID_NUM(ctx.for_VAR_With_ID_NUM()));
            createSymbolRow("loop","forVarIDNUM",lo.getForloop().toString(),ctx.start.getLine());
        }
        if(ctx.for_INT_With_ID_NUM() != null){
            lo.setForloop(visitFor_INT_With_ID_NUM(ctx.for_INT_With_ID_NUM()));
            createSymbolRow("loop","forIntIDNUM",lo.getForloop().toString(),ctx.start.getLine());
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
        createSymbolRow(fo.getForf(),fo.getVarr(),fo.getInputs().toString(),ctx.start.getLine());
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
        createSymbolRow(fo.getForf(),fo.getVarr(),fo.getInputs().toString(),ctx.start.getLine());
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
        createSymbolRow(fo.getForf(),fo.getVarr(),fo.getInputs().toString(),ctx.start.getLine());
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
        createSymbolRow(fo.getForf(),fo.getVarr(),fo.getInputs().toString(),ctx.start.getLine());
        return fo;
    }

    @Override
    public PrintStatement visitPrintstatement(projectParser.PrintstatementContext ctx) {
        System.out.println("visitPrint");
        PrintStatement pr = new PrintStatement();
        if(ctx.print_ID() != null){
            pr.setPrindidnum(visitPrint_ID(ctx.print_ID()));
            createSymbolRow("print","printID",pr.getPrindidnum().toString(),ctx.start.getLine());
        }
        if(ctx.print_NUM() != null){
            pr.setPrindidnum(visitPrint_NUM(ctx.print_NUM()));
            createSymbolRow("print","printNUM",pr.getPrindidnum().toString(),ctx.start.getLine());
        }
        if(ctx.print_TEXT() != null){
            pr.setPrindText(visitPrint_TEXT(ctx.print_TEXT()));
            createSymbolRow("print","printIEXT",pr.getPrindText().toString(),ctx.start.getLine());
        }
        return pr;
    }

    @Override
    public PrintIdNum visitPrint_ID(projectParser.Print_IDContext ctx) {
        System.out.println("visitPrint_Id");
        PrintIdNum pp = new PrintIdNum();
        pp.setPrin(ctx.PRINT().toString().trim());
        pp.setWorld(ctx.INPUT_D_Q_I().toString().trim());
        createSymbolRow("printID",pp.getPrin(),pp.getWorld().toString(),ctx.start.getLine());
        return pp;
    }

    @Override
    public PrintIdNum visitPrint_NUM(projectParser.Print_NUMContext ctx) {
        System.out.println("visitPrint_Num");
        PrintIdNum pp = new PrintIdNum();
        pp.setPrin(ctx.PRINT().toString().trim());
        pp.setWorld(ctx.INPUT_D_Q_N().toString().trim());
        createSymbolRow("printNUM",pp.getPrin(),pp.getWorld().toString(),ctx.start.getLine());
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
        createSymbolRow("printTEXT",pp.getPrin(),pp.getRules().toString().toString(),ctx.start.getLine());
        return pp;
    }

    @Override
    public Rule visitRule(projectParser.RuleContext ctx) {
        System.out.println("visitRule");
        Rule rr = new Rule();
        if(ctx.ID() != null){
            rr.setId(ctx.ID().toString().trim());
            createSymbolRow("Rule","ID",rr.getId(),ctx.start.getLine());
        }
        if(ctx.NUM() != null){
            rr.setNum(ctx.NUM().toString().trim());
            createSymbolRow("Rule","NUM",rr.getId(),ctx.start.getLine());
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
        createSymbolRow("if",ifif.getElseifin().toString(),ifif.getElsein().toString(),ctx.start.getLine());
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
        createSymbolRow("if",ifin.getIfif(),ifin.getIfatr().toString(),ctx.start.getLine());
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
        createSymbolRow(whilstat.getWhilee(),whilstat.getCond().toString(),whilstat.getIfif().toString(),ctx.start.getLine());
        return whilstat;
    }

    @Override
    public SwitchStatement visitSwitchstatement(projectParser.SwitchstatementContext ctx) {
        System.out.println("visitSwitchStatment");
        SwitchStatement swstat = new SwitchStatement();
        if(ctx.switch_With_ID() != null){
            swstat.setSwitchid(visitSwitch_With_ID(ctx.switch_With_ID()));
            createSymbolRow("switch",swstat.getSwitchid().toString(),"",ctx.start.getLine());
        }
        else if(ctx.switch_With_NUM() != null){
            swstat.setSwitchnum(visitSwitch_With_NUM(ctx.switch_With_NUM()));
            createSymbolRow("switch",swstat.getSwitchnum().toString(),"",ctx.start.getLine());
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
        createSymbolRow(switid.getSwitchh(),switid.getId(),switid.getDef().toString(),ctx.start.getLine());
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
        createSymbolRow(switnum.getSwitchh(),switnum.getNumm(),switnum.getDef().toString(),ctx.start.getLine());
        return switnum;
    }

    @Override
    public CaseStatement visitCasestatement(projectParser.CasestatementContext ctx) {
        System.out.println("visitCase");
        CaseStatement casestat = new CaseStatement();
        if(ctx.case_With_ID() != null){
            casestat.setCaseid(visitCase_With_ID(ctx.case_With_ID()));
            createSymbolRow("case",casestat.getCaseid().toString(),"",ctx.start.getLine());
        }
        if(ctx.case_With_NUM() != null){
            casestat.setCasenum(visitCase_With_NUM(ctx.case_With_NUM()));
            createSymbolRow("case",casestat.getCasenum().toString(),"",ctx.start.getLine());
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
        createSymbolRow(caseid.getCasee(),caseid.getInputt(),caseid.getInp().toString(),ctx.start.getLine());
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
        createSymbolRow(casenum.getCass(),casenum.getNumm(),casenum.getInp().toString(),ctx.start.getLine());
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
        createSymbolRow(def.getDef(),def.getInp().toString(),def.getBreakk(),ctx.start.getLine());
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
        if(ctx.inputI() != null){
            for(int i=0;i<ctx.inputI().size();i++){
                if(ctx.inputI(i) != null){
                    trystat.getInp2().add((visitInputI(ctx.inputI(i))));
                }}
        }
        createSymbolRow(trystat.getTryy(),trystat.getInp().toString(),trystat.getInp2().toString(),ctx.start.getLine());
        return  trystat;
    }

    @Override
    public booleanP visitBoolean_p(projectParser.Boolean_pContext ctx) {
        System.out.println("visitBoolean_p");
        booleanP boolean_p = new booleanP();

        if (ctx.TRUE() != null) {
            boolean_p.setTRUE(ctx.TRUE().toString().trim());
            createSymbolRow("boolean","true",boolean_p.getTRUE(),ctx.start.getLine());
        }
        else if (ctx.FALSE() != null) {
            boolean_p.setFALSE(ctx.FALSE().toString().trim());
            createSymbolRow("boolean","false",boolean_p.getFALSE(),ctx.start.getLine());
        }
        return boolean_p;
    }

    @Override
    public NumbersIF visitNumbers(projectParser.NumbersContext ctx) {

        System.out.println("visitNumbers");
        NumbersIF  numbers=new NumbersIF();
        if(ctx.float_f()!=null) {
            numbers.setFf(visitFloat_f(ctx.float_f()));
            createSymbolRow("Number","float",numbers.getFf().toString(),ctx.start.getLine());
        }
        else if(ctx.int_i()!=null) {
            numbers.setIi(visitInt_i(ctx.int_i()));
            createSymbolRow("Number","int",numbers.getInt().toString(),ctx.start.getLine());
        }
        return numbers;
    }

    @Override
    public Var visitVar(projectParser.VarContext ctx) {
        System.out.println("visitVar");
        Var vv = new Var();
        vv.setVARNAME(ctx.ID().toString().trim());
        createSymbolRow("var",vv.getVARNAME(),"",ctx.start.getLine());
        return vv;
    }

    @Override
    public Expression visitExpression(projectParser.ExpressionContext ctx) {

        System.out.println("visitExpression");
        Expression  expression=new Expression();
        if (ctx.numbers() != null) {
            expression.setNumbers(visitNumbers(ctx.numbers()));
            createSymbolRow("Expression","number",expression.getNumbers().toString(),ctx.start.getLine());
        }
        else if (ctx.boolean_p() != null) {
            expression.setBoolean_p(visitBoolean_p(ctx.boolean_p()));
            createSymbolRow("Expression","boolean",expression.getBoolean_p().toString(),ctx.start.getLine());
        }
        else if (ctx.var() != null) {
            expression.setVar(visitVar(ctx.var()));
            createSymbolRow("Expression","var",expression.getVar().toString(),ctx.start.getLine());
        }
        else if (ctx.expression() != null) {
            expression.setExpression(visitExpression(ctx.expression()));
            createSymbolRow("Expression","expr",expression.getExpression().toString(),ctx.start.getLine());
        }
        else if(ctx.math() != null){
            expression.setMath(visitMath(ctx.math()));
            createSymbolRow("Expression","math",expression.getMath().toString(),ctx.start.getLine());
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
            createSymbolRow("conditions","Expression",conditions.getBoolExpresion().toString(),ctx.start.getLine());
        }
        else if(ctx.logic()!=null) {
            conditions.setLogic(visitLogic(ctx.logic()));
            createSymbolRow("conditions","logic",conditions.getLogic().toString(),ctx.start.getLine());
        }

        return conditions;
    }

    @Override
    public Operations visitOperation(projectParser.OperationContext ctx) {
        System.out.println("visitOperation");
        Operations operation=new Operations();
        if(ctx.PLUS()!=null){
            operation.setPLUS(ctx.PLUS().toString().trim());
            createSymbolRow("Operation "," Plus ",operation.getPLUS().toString(),ctx.start.getLine());
        }

        else  if(ctx.MINUS()!=null){
            operation.setMINUS(ctx.MINUS().toString().trim());
            createSymbolRow("Operation "," Ninus ",operation.getMINUS().toString(),ctx.start.getLine());

        }
        else if(ctx.MULTI()!=null){
            operation.setMULTI(ctx.MULTI().toString().trim());
            createSymbolRow("Operation "," Multi ",operation.getMULTI().toString(),ctx.start.getLine());

        }
        else if(ctx.DIVIDE()!=null){
            operation.setDIVIDE(ctx.DIVIDE().toString().trim());
            createSymbolRow("Operation "," Divide ",operation.getDIVIDE().toString(),ctx.start.getLine());

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
        createSymbolRow(dostat.getDoo(),dostat.getInn().toString(),dostat.getWhileStatement().toString(),ctx.start.getLine());
        return dostat;
    }

    @Override
    public Expr visitExpr(projectParser.ExprContext ctx) {
        System.out.println("visitExpr");
        Expr ex = new Expr();
        if(ctx.multiplication() != null){
            ex.setMultiplication(visitMultiplication(ctx.multiplication()));
            createSymbolRow("Expression "," Multiplication ",ex.getMultiplication().toString(),ctx.start.getLine());
        }
        if(ctx.addition() != null){
            ex.setAddition(visitAddition(ctx.addition()));
            createSymbolRow("Expression "," Addition ",ex.getAddition().toString(),ctx.start.getLine());
        }
        if(ctx.subtraction() != null){
            ex.setSubtraction(visitSubtraction(ctx.subtraction()));
            createSymbolRow("Expression "," Subtraction ",ex.getSubtraction().toString(),ctx.start.getLine());
        }
        if(ctx.division() != null){
            ex.setDivision(visitDivision(ctx.division()));
            createSymbolRow("Expression "," Division ",ex.getDivision().toString(),ctx.start.getLine());
        }
        if(ctx.identifier() != null){
            ex.setIdentifier(visitIdentifier(ctx.identifier()));
            createSymbolRow("Expression "," Identifier ",ex.getIdentifier().toString(),ctx.start.getLine());

        }
        if(ctx.integer_i() != null){
            ex.setInteger(visitInteger_i(ctx.integer_i()));
            createSymbolRow("Expression "," Integer ",ex.getInteger().toString(),ctx.start.getLine());

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
        createSymbolRow(mm.getNum1(),mm.getM(),mm.getNum2(),ctx.start.getLine());
        return mm;
    }

    @Override
    public Addition visitAddition(projectParser.AdditionContext ctx) {
        System.out.println("visitAddition");
        Addition mm = new Addition();
        mm.setNum1(ctx.getChild(0).toString().trim());
        mm.setM(ctx.PLUS().toString().trim());
        mm.setNum2(ctx.getChild(2).toString().trim());
        createSymbolRow(mm.getNum1(),mm.getM(),mm.getNum2(),ctx.start.getLine());
        return mm;
    }

    @Override
    public Subtraction visitSubtraction(projectParser.SubtractionContext ctx) {
        System.out.println("visitSubtraction");
        Subtraction mm = new Subtraction();
        mm.setNum1(ctx.getChild(0).toString().trim());
        mm.setM(ctx.MINUS().toString().trim());
        mm.setNum2(ctx.getChild(2).toString().trim());
        createSymbolRow(mm.getNum1(),mm.getM(),mm.getNum2(),ctx.start.getLine());
        return mm;
    }

    @Override
    public Division visitDivision(projectParser.DivisionContext ctx) {
        System.out.println("visitDivision");
        Division mm = new Division();
        mm.setNum1(ctx.getChild(0).toString().trim());
        mm.setM(ctx.DIVIDE().toString().trim());
        mm.setNum2(ctx.getChild(2).toString().trim());
        createSymbolRow(mm.getNum1(),mm.getM(),mm.getNum2(),ctx.start.getLine());
        return mm;
    }

    @Override
    public Identifier visitIdentifier(projectParser.IdentifierContext ctx) {
        System.out.println("visitIdentifier");
        Identifier ii = new Identifier();
        ii.setIdentifier(ctx.ID().toString().trim());
        createSymbolRow("visitIdentifier "," Identifier ",ii.getIdentifier().toString(),ctx.start.getLine());

        return ii;
    }

    @Override
    public IntegerII visitInteger_i(projectParser.Integer_iContext ctx) {
        System.out.println("visitInteger_i");
        IntegerII ii = new IntegerII();
        ii.setIntegerII(ctx.NUM().toString().trim());
        createSymbolRow("visitIdentifier "," Integer_i ",ii.getIntegerII().toString(),ctx.start.getLine());

        return ii;
    }

    @Override
    public Functions visitFunctionStatement(projectParser.FunctionStatementContext ctx) {
        System.out.println("visitFunction");
        Functions fun = new Functions();
        if(ctx.void_Function_NOReturn_NoARG() != null){
            fun.setVoidWithoutArg(visitVoid_Function_NOReturn_NoARG(ctx.void_Function_NOReturn_NoARG()));
            createSymbolRow("FunctionStatement "," --void NOReturn_NoARG-- ","void NOReturn_NoARG ",ctx.start.getLine());
        }
        if(ctx.int_Function_Return_NoARG() != null){
            fun.setFunWithoutArg(visitInt_Function_Return_NoARG(ctx.int_Function_Return_NoARG()));
            createSymbolRow("FunctionStatement "," --int Return_NoARG-- "," int Return_NoARG ",ctx.start.getLine());
        }
        if(ctx.string_Function_Return_NoARG() != null){
            fun.setFunWithoutArg(visitString_Function_Return_NoARG(ctx.string_Function_Return_NoARG()));
            createSymbolRow("FunctionStatement "," --string Return_NoARG-- "," string Return_NoARG ",ctx.start.getLine());
        }
        if(ctx.double_Function_Return_NoARG() != null){
            fun.setFunWithoutArg(visitDouble_Function_Return_NoARG(ctx.double_Function_Return_NoARG()));
            createSymbolRow("FunctionStatement "," --double Return_NoARG-- ","double Return_NoARG ",ctx.start.getLine());
        }
        if(ctx.float_Function_Return_NoARG() != null){
            fun.setFunWithoutArg(visitFloat_Function_Return_NoARG(ctx.float_Function_Return_NoARG()));
            createSymbolRow("FunctionStatement "," --float Return_NoARG-- ","float Return_NoARG ",ctx.start.getLine());
        }
        if(ctx.void_Function_NOReturn_ARG() != null){
            fun.setVoidWithArg(visitVoid_Function_NOReturn_ARG(ctx.void_Function_NOReturn_ARG()));
            createSymbolRow("FunctionStatement "," --void NOReturn_ARG-- ","void NOReturn_ARG ",ctx.start.getLine());
        }
        if(ctx.int_Function_Return_ARG() != null){
            fun.setFunWithArg(visitInt_Function_Return_ARG(ctx.int_Function_Return_ARG()));
            createSymbolRow("FunctionStatement "," --int Return_ARG-- ","int Return_ARG ",ctx.start.getLine());
        }
        if(ctx.string_Function_Return_ARG() != null){
            fun.setFunWithArg(visitString_Function_Return_ARG(ctx.string_Function_Return_ARG()));
            createSymbolRow("FunctionStatement "," --string Return_ARG-- ","string Return_ARG ",ctx.start.getLine());
        }
        if(ctx.double_Function_Return_ARG() != null){
            fun.setFunWithArg(visitDouble_Function_Return_ARG(ctx.double_Function_Return_ARG()));
            createSymbolRow("FunctionStatement "," --double Return_ARG-- ","double Return_ARG ",ctx.start.getLine());
        }
        if(ctx.floate_Function_Return_ARG() != null){
            fun.setFunWithArg(visitFloate_Function_Return_ARG(ctx.floate_Function_Return_ARG()));
            createSymbolRow("FunctionStatement "," --float Return_ARG-- ","void Return_ARG ",ctx.start.getLine());
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
        createSymbolRow(voidd.getViodd(),voidd.getNamee().toString(),voidd.getInp().toString(),ctx.start.getLine());
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
        createSymbolRow(fun.getType(),fun.getName().toString(),fun.getInputs().toString(),ctx.start.getLine());
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
        createSymbolRow(fun.getType(),fun.getName().toString(),fun.getInputs().toString(),ctx.start.getLine());
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
        createSymbolRow(fun.getType(),fun.getName().toString(),fun.getInputs().toString(),ctx.start.getLine());
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
        createSymbolRow(fun.getType(),fun.getName().toString(),fun.getInputs().toString(),ctx.start.getLine());
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
        createSymbolRow(voidd.getVoidd(),voidd.getNamee().toString(),voidd.getInputs().toString(),ctx.start.getLine());
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
        createSymbolRow(fun.getType(),fun.getName().toString(),fun.getInputs().toString(),ctx.start.getLine());
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
        createSymbolRow(fun.getType(),fun.getName().toString(),fun.getInputs().toString(),ctx.start.getLine());
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
        createSymbolRow(fun.getType(),fun.getName().toString(),fun.getInputs().toString(),ctx.start.getLine());
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
        createSymbolRow(fun.getType(),fun.getName().toString(),fun.getInputs().toString(),ctx.start.getLine());
        return fun ;     }

    @Override
    public ArgumentFunctionType visitArgumentFunctionType(projectParser.ArgumentFunctionTypeContext ctx) {
        System.out.println("visitArgument_Fun");
        ArgumentFunctionType arg = new ArgumentFunctionType();
        if(ctx.VAR() != null){
            arg.setTypee(ctx.VAR().toString().trim());
            arg.setNamee(visitNamen(ctx.namen()));
            createSymbolRow("ArgumentFunctionType ",arg.getTypee().toString() ,arg.getNamee().toString(),ctx.start.getLine());
        }
        else if(ctx.INT() != null){
            arg.setTypee(ctx.INT().toString().trim());
            arg.setNamee(visitNamen(ctx.namen()));
            createSymbolRow("ArgumentFunctionType ",arg.getTypee().toString() ,arg.getNamee().toString(),ctx.start.getLine());

        }
        else if(ctx.DOUBLE() != null){
            arg.setTypee(ctx.DOUBLE().toString().trim());
            arg.setNamee(visitNamen(ctx.namen()));
            createSymbolRow("ArgumentFunctionType ",arg.getTypee().toString() ,arg.getNamee().toString(),ctx.start.getLine());

        }
        else if(ctx.FLOAT() != null){
            arg.setTypee(ctx.FLOAT().toString().trim());
            arg.setNamee(visitNamen(ctx.namen()));
            createSymbolRow("ArgumentFunctionType ",arg.getTypee().toString() ,arg.getNamee().toString(),ctx.start.getLine());

        }
        else if(ctx.DYNAMIC() != null){
            arg.setTypee(ctx.DYNAMIC().toString().trim());
            arg.setNamee(visitNamen(ctx.namen()));
            createSymbolRow("ArgumentFunctionType ",arg.getTypee().toString() ,arg.getNamee().toString(),ctx.start.getLine());

        }
        if(ctx.STRING() != null){
            arg.setTypee(ctx.STRING().toString().trim());
            arg.setNamee(visitNamen(ctx.namen()));
            createSymbolRow("ArgumentFunctionType ",arg.getTypee().toString() ,arg.getNamee().toString(),ctx.start.getLine());

        }
        return arg;
    }

    @Override
    public ReturnStatement visitReturnStatement(projectParser.ReturnStatementContext ctx) {
        System.out.println("visitReturn");
        ReturnStatement returnStatement = new ReturnStatement();
        if(ctx.returnID() != null){
            returnStatement.setReturnType(visitReturnID(ctx.returnID()));
            createSymbolRow("ReturnStatement ","return type" ,returnStatement.getReturnType().toString(),ctx.start.getLine());

        }
        if(ctx.returnINPUT_D_Q_I() != null){
            returnStatement.setReturnType(visitReturnINPUT_D_Q_I(ctx.returnINPUT_D_Q_I()));
            createSymbolRow("ReturnStatement ","return type" ,returnStatement.getReturnType().toString(),ctx.start.getLine());

        }
        if(ctx.returnRule() != null){
            returnStatement.setReturnType(visitReturnRule(ctx.returnRule()));
            createSymbolRow("ReturnStatement ","return type" ,returnStatement.getReturnType().toString(),ctx.start.getLine());

        }
//        if(ctx.return() != null){
//            returnStatement.setReturnType(visitReturn(ctx.return()));
//        }  /////////error
        if(ctx.returnNum() != null){
            returnStatement.setReturnType(visitReturnNum(ctx.returnNum()));
            createSymbolRow("ReturnStatement ","return type" ,returnStatement.getReturnType().toString(),ctx.start.getLine());

        }
        if(ctx.returnNumFloat() != null){
            returnStatement.setReturnType(visitReturnNumFloat(ctx.returnNumFloat()));
            createSymbolRow("ReturnStatement ","return type" ,returnStatement.getReturnType().toString(),ctx.start.getLine());

        }
        if(ctx.returnNumDouble() != null){
            returnStatement.setReturnType(visitReturnNumDouble(ctx.returnNumDouble()));
            createSymbolRow("ReturnStatement ","return type" ,returnStatement.getReturnType().toString(),ctx.start.getLine());

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
        createSymbolRow(clas.getClas(),clas.getId().toString(),clas.getInputclasses().toString(),ctx.start.getLine());
        return clas;
    }

    @Override
    public AbstractStatment visitAbstractstatment(projectParser.AbstractstatmentContext ctx) {
        System.out.println("visitAbstract_Class");
        AbstractStatment abclas = new AbstractStatment();
        abclas.setAbstr(ctx.ABSTRACT().toString().trim());
        abclas.setClas(ctx.CLASS().toString().trim());
        abclas.setId(visitNamen(ctx.namen()));
        createSymbolRow(abclas.getAbstr().toString(),abclas.getClas().toString(),abclas.getId().toString(),ctx.start.getLine());
        return abclas;
    }

    @Override
    public ExtendsClass visitExtendsClass(projectParser.ExtendsClassContext ctx) {
        System.out.println("visitExtendsClass");
        ExtendsClass extclas = new ExtendsClass();
        if(ctx.extends_ClassStateFull() != null){
            extclas.setAttr_extends_ClassStateFull_AND_Less(visitExtends_ClassStateFull(ctx.extends_ClassStateFull()));
            createSymbolRow(" Flutter Widget -> Class Extends  ","Widget Components" , "StateFull",ctx.start.getLine());

        }
        if(ctx.extends_ClassStateLess() != null){
            extclas.setAttr_extends_ClassStateFull_AND_Less(visitExtends_ClassStateLess(ctx.extends_ClassStateLess()));
            createSymbolRow(" Flutter Widget -> Class Extends  ","Widget Components" , "StateLess",ctx.start.getLine());

        }
        if(ctx.extends_ClassStateFull_WithAppBar() != null){
            extclas.setAttr_extends_ClassStateFull_AND_Less_WithAppBar(visitExtends_ClassStateFull_WithAppBar(ctx.extends_ClassStateFull_WithAppBar()));
            createSymbolRow(" Flutter Widget -> Class Extends  ","Widget Components" , "StateFull_WithAppBar",ctx.start.getLine());

        }
        if(ctx.extends_ClassStateLess_WithAppBar() != null){
            extclas.setAttr_extends_ClassStateFull_AND_Less_WithAppBar(visitExtends_ClassStateLess_WithAppBar(ctx.extends_ClassStateLess_WithAppBar()));
            createSymbolRow(" Flutter Widget -> Class Extends  ","Widget Components" , "StateLess_WithAppBar",ctx.start.getLine());

        }
        if(ctx.extends_ClassStateFullwithinput() != null){
            extclas.setAttr_extends_ClassStateFull_AND_Less_withinput(visitExtends_ClassStateFullwithinput(ctx.extends_ClassStateFullwithinput()));
            createSymbolRow(" Flutter Widget -> Class Extends  ","Widget Components" , "StateFullwithinput",ctx.start.getLine());

        }
        if(ctx.extends_ClassStateLesswithinput() != null){
            extclas.setAttr_extends_ClassStateFull_AND_Less_withinput(visitExtends_ClassStateLesswithinput(ctx.extends_ClassStateLesswithinput()));
            createSymbolRow(" Flutter Widget -> Class Extends  ","Widget Components" , "StateLesswithinput",ctx.start.getLine());

        }
        if(ctx.extends_ClassStateFullwithinput_appBar() != null){
            extclas.setAttr_extends_ClassStateFull_AND_Less_withinput_appBar(visitExtends_ClassStateFullwithinput_appBar(ctx.extends_ClassStateFullwithinput_appBar()));
            createSymbolRow(" Flutter Widget -> Class Extends  ","Widget Components" , "StateFullwithinput_appBar",ctx.start.getLine());

        }
        if(ctx.extends_ClassStateLesswithinput_appBar() != null){
            extclas.setAttr_extends_ClassStateFull_AND_Less_withinput_appBar(visitExtends_ClassStateLesswithinput_appBar(ctx.extends_ClassStateLesswithinput_appBar()));
            createSymbolRow(" Flutter Widget -> Class Extends  ","Widget Components" , "StateLesswithinput_appBar",ctx.start.getLine());

        }
        if(ctx.extends_ClassStateFullwithinput() != null){
            extclas.setAttr_extends_ClassStatment_Withinput(visitExtends_ClassStatment_Withinput(ctx.extends_ClassStatment_Withinput()));
            createSymbolRow(" Flutter Widget -> Class Extends  ","Widget Components" , "StateFullwithinput",ctx.start.getLine());

        }
        if(ctx.extends_ClassStatment_Withoutinput() != null){
            extclas.setAttr_extends_ClassStatment_Withoutinput(visitExtends_ClassStatment_Withoutinput(ctx.extends_ClassStatment_Withoutinput()));
            createSymbolRow(" Flutter Widget -> Class Extends  ","Widget Components" , "Statment_Withoutinput",ctx.start.getLine());

        }
        return extclas;
    }

    @Override
    public extends_ClassStatment_Withinput visitExtends_ClassStatment_Withinput(projectParser.Extends_ClassStatment_WithinputContext ctx) {
        System.out.println("visitExtends_ClassStatment_Withinput");
        extends_ClassStatment_Withinput ee = new extends_ClassStatment_Withinput();
        ee.setCLASS(ctx.CLASS().toString().trim());
        ee.setID(visitNamen(ctx.namen()));
        ee.setEXTENDS(ctx.EXTENDS().toString().trim());
        ee.setID_ID(ctx.ID().toString().trim());
        ee.setNumline(ctx.start.getLine());
        ee.setChildrenCount(ctx.getChildCount());

        for (int i=0 ; i< ctx.inputclass().size() ; i++ ){
            if(ctx.inputclass(i) != null){
                ee.getInputclasses().add((visitInputclass(ctx.inputclass(i))));
            }
        }
        createSymbolRow(" Class Extends with input ",ee.getID().toString() , ee.getInputclasses().toString(),ctx.start.getLine());

        return ee;
    }

    @Override
    public extends_ClassStatment_Withoutinput visitExtends_ClassStatment_Withoutinput(projectParser.Extends_ClassStatment_WithoutinputContext ctx) {
        System.out.println("visitExtends_ClassStatment_Withoutinput");
        extends_ClassStatment_Withoutinput ee = new extends_ClassStatment_Withoutinput();
        ee.setCLASS(ctx.CLASS().toString().trim());
        ee.setID(visitNamen(ctx.namen()));
        ee.setEXTENDS(ctx.EXTENDS().toString().trim());
        ee.setID_ID(ctx.ID().toString().trim());
        ee.setNumline(ctx.start.getLine());
        ee.setChildrenCount(ctx.getChildCount());


        createSymbolRow(" Class Extends without input ",ee.getID().toString() , ee.getID_ID().toString(),ctx.start.getLine());

        return ee;
    }

    @Override
    public extends_ClassStateFull_AND_Less visitExtends_ClassStateFull(projectParser.Extends_ClassStateFullContext ctx) {
        System.out.println("visitExtends_ClassStateFull");
        extends_ClassStateFull_AND_Less ee = new extends_ClassStateFull_AND_Less();
        ee.setCLASS(ctx.CLASS().toString().trim());
        ee.setID(visitNamen(ctx.namen()));
        ee.setEXTENDS(ctx.EXTENDS().toString().trim());
        ee.setType(ctx.STATEFULLWIDGET().toString().trim());
        ee.setOVERRIDE(ctx.OVERRIDE().toString().trim());
        ee.setBUILD_WIDGET(ctx.BUILD_WIDGET().toString().trim());
        ee.setRETURN(ctx.RETURN().toString().trim());
        ee.setSCAFFOLD(ctx.SCAFFOLD().toString().trim());
        ee.setBODY(ctx.BODY().toString().trim());
        ee.setNumline(ctx.start.getLine());
        ee.setChildrenCount(ctx.getChildCount());

        for (int i =0 ; i< ctx.flutterWidget().size() ; i++){
            if(ctx.flutterWidget(i) != null){
                ee.getFlutterWidget().add((visitFlutterWidget(ctx.flutterWidget(i))));
            }
        }

        createSymbolRow(" Class Extends  ",ee.getType().toString() , ee.getFlutterWidget().toString(),ctx.start.getLine());

        return ee;
    }

    @Override
    public extends_ClassStateFull_AND_Less visitExtends_ClassStateLess(projectParser.Extends_ClassStateLessContext ctx) {
        System.out.println("visitExtends_ClassStateLess");
        extends_ClassStateFull_AND_Less ee = new extends_ClassStateFull_AND_Less();
        ee.setCLASS(ctx.CLASS().toString().trim());
        ee.setID(visitNamen(ctx.namen()));
        ee.setEXTENDS(ctx.EXTENDS().toString().trim());
        ee.setType(ctx.STATELESSWIDGET().toString().trim());
        ee.setOVERRIDE(ctx.OVERRIDE().toString().trim());
        ee.setBUILD_WIDGET(ctx.BUILD_WIDGET().toString().trim());
        ee.setRETURN(ctx.RETURN().toString().trim());
        ee.setSCAFFOLD(ctx.SCAFFOLD().toString().trim());
        ee.setBODY(ctx.BODY().toString().trim());
        ee.setNumline(ctx.start.getLine());
        ee.setChildrenCount(ctx.getChildCount());

        for (int i =0 ; i< ctx.flutterWidget().size() ; i++){
            if(ctx.flutterWidget(i) != null){
                ee.getFlutterWidget().add((visitFlutterWidget(ctx.flutterWidget(i))));
            }
        }
        createSymbolRow(" Class Extends  ",ee.getType().toString() , ee.getFlutterWidget().toString(),ctx.start.getLine());
        return ee;
    }

    @Override
    public extends_ClassStateFull_AND_Less_WithAppBar visitExtends_ClassStateFull_WithAppBar(projectParser.Extends_ClassStateFull_WithAppBarContext ctx) {
        System.out.println("visitExtends_ClassStateFull_WithAppBar");
        extends_ClassStateFull_AND_Less_WithAppBar ee = new extends_ClassStateFull_AND_Less_WithAppBar();
        ee.setCLASS(ctx.CLASS().toString().trim());
        ee.setID(visitNamen(ctx.namen()));
        ee.setEXTENDS(ctx.EXTENDS().toString().trim());
        ee.setType(ctx.STATEFULLWIDGET().toString().trim());
        ee.setOVERRIDE(ctx.OVERRIDE().toString().trim());
        ee.setBUILD_WIDGET(ctx.BUILD_WIDGET().toString().trim());
        ee.setRETURN(ctx.RETURN().toString().trim());
        ee.setSCAFFOLD(ctx.SCAFFOLD().toString().trim());
        ee.setAPPBAR(ctx.APPBAR().toString().trim());
        ee.setAPPBAR_CHILD(ctx.APPBAR_CHILD().toString().trim());
        ee.setBODY(ctx.BODY().toString().trim());
        ee.setNumline(ctx.start.getLine());
        ee.setChildrenCount(ctx.getChildCount());

        for (int i =0 ; i< ctx.flutterWidget().size() ; i++){
            if(ctx.flutterWidget(i) != null){
                ee.getFlutterWidget().add((visitFlutterWidget(ctx.flutterWidget(i))));
            }
        }

        for (int i =0 ; i< ctx.input_AppBar().size() ; i++){
            if(ctx.input_AppBar(i) != null){
                ee.getAttr_input_AppBar().add((visitInput_AppBar(ctx.input_AppBar(i))));
            }
        }

        createSymbolRow(" Class Extends With AppBar ",ee.getType().toString() , ee.getFlutterWidget().toString(),ctx.start.getLine());

        return ee;
    }

    @Override
    public extends_ClassStateFull_AND_Less_WithAppBar visitExtends_ClassStateLess_WithAppBar(projectParser.Extends_ClassStateLess_WithAppBarContext ctx) {
        System.out.println("visitExtends_ClassStateLess_WithAppBar");
        extends_ClassStateFull_AND_Less_WithAppBar ee = new extends_ClassStateFull_AND_Less_WithAppBar();
        ee.setCLASS(ctx.CLASS().toString().trim());
        ee.setID(visitNamen(ctx.namen()));
        ee.setEXTENDS(ctx.EXTENDS().toString().trim());
        ee.setType(ctx.STATELESSWIDGET().toString().trim());
        ee.setOVERRIDE(ctx.OVERRIDE().toString().trim());
        ee.setBUILD_WIDGET(ctx.BUILD_WIDGET().toString().trim());
        ee.setRETURN(ctx.RETURN().toString().trim());
        ee.setSCAFFOLD(ctx.SCAFFOLD().toString().trim());
        ee.setAPPBAR(ctx.APPBAR().toString().trim());
        ee.setAPPBAR_CHILD(ctx.APPBAR_CHILD().toString().trim());
        ee.setBODY(ctx.BODY().toString().trim());
        ee.setNumline(ctx.start.getLine());
        ee.setChildrenCount(ctx.getChildCount());

        for (int i =0 ; i< ctx.flutterWidget().size() ; i++){
            if(ctx.flutterWidget(i) != null){
                ee.getFlutterWidget().add((visitFlutterWidget(ctx.flutterWidget(i))));
            }
        }

        for (int i =0 ; i< ctx.input_AppBar().size() ; i++){
            if(ctx.input_AppBar(i) != null){
                ee.getAttr_input_AppBar().add((visitInput_AppBar(ctx.input_AppBar(i))));
            }
        }

        createSymbolRow(" Class Extends With AppBar ",ee.getType().toString() , ee.getFlutterWidget().toString(),ctx.start.getLine());

        return ee;    }

    @Override
    public extends_ClassStateFull_AND_Less_withinput visitExtends_ClassStateFullwithinput(projectParser.Extends_ClassStateFullwithinputContext ctx) {
        System.out.println("visitExtends_ClassStateFullwithinput");
        extends_ClassStateFull_AND_Less_withinput ee = new extends_ClassStateFull_AND_Less_withinput();
        ee.setCLASS(ctx.CLASS().toString().trim());
        ee.setID(visitNamen(ctx.namen()));
        ee.setEXTENDS(ctx.EXTENDS().toString().trim());
        ee.setType(ctx.STATEFULLWIDGET().toString().trim());
        ee.setOVERRIDE(ctx.OVERRIDE().toString().trim());
        ee.setBUILD_WIDGET(ctx.BUILD_WIDGET().toString().trim());
        ee.setRETURN(ctx.RETURN().toString().trim());
        ee.setSCAFFOLD(ctx.SCAFFOLD().toString().trim());
        ee.setBODY(ctx.BODY().toString().trim());
        ee.setNumline(ctx.start.getLine());
        ee.setChildrenCount(ctx.getChildCount());

        for (int i =0 ; i< ctx.flutterWidget().size() ; i++){
            if(ctx.flutterWidget(i) != null){
                ee.getFlutterWidget().add((visitFlutterWidget(ctx.flutterWidget(i))));
            }
        }

        for (int i =0 ; i< ctx.inputclass().size() ; i++){
            if(ctx.inputclass(i) != null){
                ee. getInputClasses().add((visitInputclass(ctx.inputclass(i))));
            }
        }
        createSymbolRow(" Class Extends With input",ee.getType().toString() , ee.getFlutterWidget().toString(),ctx.start.getLine());


        return ee;    }

    @Override
    public extends_ClassStateFull_AND_Less_withinput visitExtends_ClassStateLesswithinput(projectParser.Extends_ClassStateLesswithinputContext ctx) {
        System.out.println("visitExtends_ClassStateLesswithinput");
        extends_ClassStateFull_AND_Less_withinput ee = new extends_ClassStateFull_AND_Less_withinput();
        ee.setCLASS(ctx.CLASS().toString().trim());
        ee.setID(visitNamen(ctx.namen()));
        ee.setEXTENDS(ctx.EXTENDS().toString().trim());
        ee.setType(ctx.STATELESSWIDGET().toString().trim());
        ee.setOVERRIDE(ctx.OVERRIDE().toString().trim());
        ee.setBUILD_WIDGET(ctx.BUILD_WIDGET().toString().trim());
        ee.setRETURN(ctx.RETURN().toString().trim());
        ee.setSCAFFOLD(ctx.SCAFFOLD().toString().trim());
        ee.setBODY(ctx.BODY().toString().trim());
        ee.setNumline(ctx.start.getLine());
        ee.setChildrenCount(ctx.getChildCount());

        for (int i =0 ; i< ctx.flutterWidget().size() ; i++){
            if(ctx.flutterWidget(i) != null){
                ee.getFlutterWidget().add((visitFlutterWidget(ctx.flutterWidget(i))));
            }
        }

        for (int i =0 ; i< ctx.inputclass().size() ; i++){
            if(ctx.inputclass(i) != null){
                ee. getInputClasses().add((visitInputclass(ctx.inputclass(i))));
            }
        }

        createSymbolRow(" Class Extends with input",ee.getType().toString() , ee.getFlutterWidget().toString(),ctx.start.getLine());


        return ee;    }

    @Override
    public extends_ClassStateFull_AND_Less_withinput_appBar visitExtends_ClassStateFullwithinput_appBar(projectParser.Extends_ClassStateFullwithinput_appBarContext ctx) {
        System.out.println("visitExtends_ClassStateFullwithinput_appBar");
        extends_ClassStateFull_AND_Less_withinput_appBar ee = new extends_ClassStateFull_AND_Less_withinput_appBar();
        ee.setCLASS(ctx.CLASS().toString().trim());
        ee.setID(visitNamen(ctx.namen()));
        ee.setEXTENDS(ctx.EXTENDS().toString().trim());
        ee.setType(ctx.STATEFULLWIDGET().toString().trim());
        ee.setOVERRIDE(ctx.OVERRIDE().toString().trim());
        ee.setBUILD_WIDGET(ctx.BUILD_WIDGET().toString().trim());
        ee.setRETURN(ctx.RETURN().toString().trim());
        ee.setSCAFFOLD(ctx.SCAFFOLD().toString().trim());
        ee.setBODY(ctx.BODY().toString().trim());
        ee.setAPPBAR(ctx.APPBAR().toString().trim());
        ee.setAPPBAR_CHILD(ctx.APPBAR_CHILD().toString().trim());
        ee.setNumline(ctx.start.getLine());
        ee.setChildrenCount(ctx.getChildCount());

        for (int i =0 ; i< ctx.input_AppBar().size() ; i++){
            if(ctx.input_AppBar(i) != null){
                ee.getAttr_input_AppBar().add((visitInput_AppBar(ctx.input_AppBar(i))));
            }
        }
        for (int i =0 ; i< ctx.flutterWidget().size() ; i++){
            if(ctx.flutterWidget(i) != null){
                ee.getFlutterWidget().add((visitFlutterWidget(ctx.flutterWidget(i))));
            }
        }

        for (int i =0 ; i< ctx.inputclass().size() ; i++){
            if(ctx.inputclass(i) != null){
                ee. getInputClasses().add((visitInputclass(ctx.inputclass(i))));
            }
        }

        createSymbolRow(" Class Extends with input AppBar ",ee.getType().toString() , ee.getFlutterWidget().toString(),ctx.start.getLine());

        return ee;    }

    @Override
    public extends_ClassStateFull_AND_Less_withinput_appBar visitExtends_ClassStateLesswithinput_appBar(projectParser.Extends_ClassStateLesswithinput_appBarContext ctx) {
        System.out.println("visitExtends_ClassStateLesswithinput_appBar");
        extends_ClassStateFull_AND_Less_withinput_appBar  ee = new extends_ClassStateFull_AND_Less_withinput_appBar();
        ee.setCLASS(ctx.CLASS().toString().trim());
        ee.setID(visitNamen(ctx.namen()));
        ee.setEXTENDS(ctx.EXTENDS().toString().trim());
        ee.setType(ctx.STATELESSWIDGET().toString().trim());
        ee.setOVERRIDE(ctx.OVERRIDE().toString().trim());
        ee.setBUILD_WIDGET(ctx.BUILD_WIDGET().toString().trim());
        ee.setRETURN(ctx.RETURN().toString().trim());
        ee.setSCAFFOLD(ctx.SCAFFOLD().toString().trim());
        ee.setBODY(ctx.BODY().toString().trim());
        ee.setAPPBAR(ctx.APPBAR().toString().trim());
        ee.setAPPBAR_CHILD(ctx.APPBAR_CHILD().toString().trim());
        ee.setNumline(ctx.start.getLine());
        ee.setChildrenCount(ctx.getChildCount());

        for (int i =0 ; i< ctx.input_AppBar().size() ; i++){
            if(ctx.input_AppBar(i) != null){
                ee.getAttr_input_AppBar().add((visitInput_AppBar(ctx.input_AppBar(i))));
            }
        }
        for (int i =0 ; i< ctx.flutterWidget().size() ; i++){
            if(ctx.flutterWidget(i) != null){
                ee.getFlutterWidget().add((visitFlutterWidget(ctx.flutterWidget(i))));
            }
        }

        for (int i =0 ; i< ctx.inputclass().size() ; i++){
            if(ctx.inputclass(i) != null){
                ee.getInputClasses().add((visitInputclass(ctx.inputclass(i))));
            }
        }
        createSymbolRow(" Class Extends with input AppBar ",ee.getType().toString() , ee.getFlutterWidget().toString(),ctx.start.getLine());


        return ee;    }

    @Override
    public input_AppBar visitInput_AppBar(projectParser.Input_AppBarContext ctx) {
        System.out.println("visitInput_AppBar");
        input_AppBar input = new input_AppBar();
        if(ctx.input_1AppBar() != null ){
            input.setinput_1AppBar(visitInput_1AppBar(ctx.input_1AppBar()));
            input.setNumline(ctx.start.getLine());
            input.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter Widget ->  "," inputAppBar " , "input_1AppBar",ctx.start.getLine());

        }
        if(ctx.input_2AppBar() != null ){
            input.setinput_2AppBar(visitInput_2AppBar(ctx.input_2AppBar()));
            input.setNumline(ctx.start.getLine());
            input.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter Widget ->  "," inputAppBar " , "input_2AppBar",ctx.start.getLine());

        }
        if(ctx.input_3AppBar() != null ){
            input.setinput_3AppBar(visitInput_3AppBar(ctx.input_3AppBar()));
            input.setNumline(ctx.start.getLine());
            input.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter Widget ->  "," inputAppBar " , "input_3AppBar",ctx.start.getLine());

        }
        if(ctx.input_4AppBar() != null ){
            input.setinput_4AppBar(visitInput_4AppBar(ctx.input_4AppBar()));
            input.setNumline(ctx.start.getLine());
            input.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter Widget ->  "," inputAppBar " , "input_4AppBar",ctx.start.getLine());

        }

        return input;    }

    @Override
    public Color visitColor(projectParser.ColorContext ctx) {
        System.out.println("visitColor");
        Color color = new Color();
        if(ctx.color_red() != null){
            color.setAttr_color_red_green(visitColor_red(ctx.color_red()));
            color.setNumline(ctx.start.getLine());
            color.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Colors ","Color type " , "red",ctx.start.getLine());

        }

        if(ctx.color_green() != null){
            color.setAttr_color_red_green(visitColor_green(ctx.color_green()));
            color.setNumline(ctx.start.getLine());
            color.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Colors ","Color type " , "green",ctx.start.getLine());

        }
        return color;
    }


    @Override
    public Row visitRowStatement(projectParser.RowStatementContext ctx) {
        System.out.println("visitRowStatement");
        Row row = new Row();
        row.setROW(ctx.ROW().toString().trim());
        row.setCHILDREN(ctx.CHILDREN().toString().trim());
        row.setNumline(ctx.start.getLine());
        row.setChildrenCount(ctx.getChildCount());
        for (int i =0 ; i< ctx.flutterWidget().size() ; i++){
            if(ctx.flutterWidget(i) != null){
                row.getFlutterWidget().add((visitFlutterWidget(ctx.flutterWidget(i))));
            }
        }
        createSymbolRow("Flutter Widget -> Row",row.getROW().toString(),row.getFlutterWidget().toString(),ctx.start.getLine());


        return row;
    }

    @Override
    public Column visitColStatemenst(projectParser.ColStatemenstContext ctx) {
        System.out.println("visitColStatement");
        Column c = new Column();
        c.setCOLUMN(ctx.COLUMN().toString().trim());
        c.setCHILDREN(ctx.CHILDREN().toString().trim());
        c.setNumline(ctx.start.getLine());
        c.setChildrenCount(ctx.getChildCount());

        for (int i =0 ; i< ctx.flutterWidget().size() ; i++){
            if(ctx.flutterWidget(i) != null){
                c.getFlutterWidget().add((visitFlutterWidget(ctx.flutterWidget(i))));
            }
        }

        createSymbolRow("Flutter Widget -> Column",c.getCOLUMN().toString(),c.getFlutterWidget().toString(),ctx.start.getLine());


        return c;
    }

    @Override
    public TextClasses visitTexeStatement(projectParser.TexeStatementContext ctx) {
        System.out.println("visitTexeStatement");
        TextClasses t = new TextClasses();
        if(ctx.text_INPUT_D_Q_I() != null ){
            t.settext_INPUT_D_Q_I(visitText_INPUT_D_Q_I(ctx.text_INPUT_D_Q_I()));
            t.setNumline(ctx.start.getLine());
            t.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter Widget -> Text"," INPUT_D_Q_I","text_INPUT_D_Q_I",ctx.start.getLine());

        }
        if(ctx.text_INPUT_D_Q_N() != null){
            t.settext_INPUT_D_Q_N(visitText_INPUT_D_Q_N(ctx.text_INPUT_D_Q_N()));
            t.setNumline(ctx.start.getLine());
            t.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter Widget -> Text"," INPUT_D_Q_N","text_INPUT_D_Q_N",ctx.start.getLine());

        }
        if(ctx.text_rule() != null){
            t.settext_rule(visitText_rule(ctx.text_rule()));
            t.setNumline(ctx.start.getLine());
            t.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter Widget -> Text"," rule "," text_rule ",ctx.start.getLine());

        }
        return t;
    }

    @Override
    public text_INPUT_D_Q_N visitText_INPUT_D_Q_N(projectParser.Text_INPUT_D_Q_NContext ctx) {
        System.out.println("visitText_INPUT_D_Q_N");
        text_INPUT_D_Q_N textInputDQN = new  text_INPUT_D_Q_N();
        textInputDQN.setTEXT(ctx.TEXT().toString().trim());
        textInputDQN.setINPUT_D_Q_N(ctx.INPUT_D_Q_N().toString().trim());
        textInputDQN.setNumline(ctx.start.getLine());
        textInputDQN.setChildrenCount(ctx.getChildCount());

        createSymbolRow(textInputDQN.getTEXT().toString(),"text",textInputDQN.getINPUT_D_Q_N().toString(),ctx.start.getLine());


        return textInputDQN;
    }

    @Override
    public text_INPUT_D_Q_I visitText_INPUT_D_Q_I(projectParser.Text_INPUT_D_Q_IContext ctx) {
        System.out.println("visitText_INPUT_D_Q_I");
        text_INPUT_D_Q_I textInputDQN = new  text_INPUT_D_Q_I();
        textInputDQN.setTEXT(ctx.TEXT().toString().trim());
        textInputDQN.setINPUT_D_Q_I(ctx.INPUT_D_Q_I().toString().trim());
        textInputDQN.setNumline(ctx.start.getLine());
        textInputDQN.setChildrenCount(ctx.getChildCount());

        createSymbolRow(textInputDQN.getTEXT().toString(),"text",textInputDQN.getINPUT_D_Q_I().toString(),ctx.start.getLine());

        return textInputDQN;
    }

    @Override
    public text_rule visitText_rule(projectParser.Text_ruleContext ctx) {
        System.out.println("visitText_rule");
        text_rule textRule = new text_rule();
        textRule.setTEXT(ctx.TEXT().toString().trim());
        for (int i =0 ; i< ctx.rule_().size() ; i++){
            if(ctx.rule_(i) != null){
                textRule.getRules().add((visitRule(ctx.rule_(i))));
            }
        }
        textRule.setNumline(ctx.start.getLine());
        textRule.setChildrenCount(ctx.getChildCount());
        createSymbolRow(textRule.getTEXT().toString(),"text",textRule.getRules().toString(),ctx.start.getLine());

        return textRule;
    }

    @Override
    public SizedBoxClasses visitSizedBox(projectParser.SizedBoxContext ctx) {
        System.out.println("visitSizedBox");
        SizedBoxClasses sized = new SizedBoxClasses();

        if(ctx.hight_SizedBox() != null){
            sized.sethight_AND_widthSizedBox(visitHight_SizedBox(ctx.hight_SizedBox()));
            sized.setNumline(ctx.start.getLine());
            sized.setChildrenCount(ctx.getChildCount());
            createSymbolRow(" Flutter Widget -> SizedBox ","Hight","Float",ctx.start.getLine());

        }
        if(ctx.width_SizedBox() != null){
            sized.sethight_AND_widthSizedBox(visitWidth_SizedBox(ctx.width_SizedBox()));
            sized.setNumline(ctx.start.getLine());
            sized.setChildrenCount(ctx.getChildCount());
            createSymbolRow(" Flutter Widget -> SizedBox ","Width","Float",ctx.start.getLine());

        }
        if(ctx.hightWidth_SizedBox() != null){
            sized.setwidthHight_SizedBox(visitHightWidth_SizedBox(ctx.hightWidth_SizedBox()));
            sized.setNumline(ctx.start.getLine());
            sized.setChildrenCount(ctx.getChildCount());
            createSymbolRow(" Flutter Widget -> SizedBox ","HightWidth","Float",ctx.start.getLine());

        }
        if(ctx.widthHight_SizedBox() != null){
            sized.setwidthHight_SizedBox(visitWidthHight_SizedBox(ctx.widthHight_SizedBox()));
            sized.setNumline(ctx.start.getLine());
            sized.setChildrenCount(ctx.getChildCount());
            createSymbolRow(" Flutter Widget -> SizedBox ","WidthHight","Float",ctx.start.getLine());

        }
        return sized;
    }

    @Override
    public hight_AND_widthSizedBox visitHight_SizedBox(projectParser.Hight_SizedBoxContext ctx) {
        System.out.println("visitHight_SizedBox");
        hight_AND_widthSizedBox hw = new hight_AND_widthSizedBox();
        hw.setSIZEDBOX(ctx.SIZEDBOX().toString().trim());
        hw.setType(ctx.HIGHT().toString().trim());
        hw.setNUM_FLOAT(ctx.NUM_FLOAT().toString().trim());
        hw.setNumline(ctx.start.getLine());
        hw.setChildrenCount(ctx.getChildCount());
        createSymbolRow("SizedBox ",hw.getType().toString(),hw.getNUM_FLOAT().toString(),ctx.start.getLine());

        return hw;
    }

    @Override
    public hight_AND_widthSizedBox visitWidth_SizedBox(projectParser.Width_SizedBoxContext ctx) {
        System.out.println("visitWidth_SizedBox");
        hight_AND_widthSizedBox hw = new hight_AND_widthSizedBox();
        hw.setSIZEDBOX(ctx.SIZEDBOX().toString().trim());
        hw.setType(ctx.WIDTH().toString().trim());
        hw.setNUM_FLOAT(ctx.NUM_FLOAT().toString().trim());
        hw.setNumline(ctx.start.getLine());
        hw.setChildrenCount(ctx.getChildCount());
        createSymbolRow("SizedBox ",hw.getType().toString(),hw.getNUM_FLOAT().toString(),ctx.start.getLine());

        return  hw;
    }

    @Override
    public widthHight_SizedBox visitWidthHight_SizedBox(projectParser.WidthHight_SizedBoxContext ctx) {
        System.out.println("visitWidthHight_SizedBox");
        widthHight_SizedBox widthHight_sizedBox = new widthHight_SizedBox();
        widthHight_sizedBox.setWIDTH(ctx.WIDTH().toString().trim());
        widthHight_sizedBox.setNUM_FLOAT_WIDTH(ctx.getChild(4).toString().trim());
        widthHight_sizedBox.setHIGHT(ctx.HIGHT().toString().trim());
        widthHight_sizedBox.setNUM_FLOAT_HIGHT(ctx.getChild(8).toString().trim());
        widthHight_sizedBox.setNumline(ctx.start.getLine());
        widthHight_sizedBox.setChildrenCount(ctx.getChildCount());
        createSymbolRow("SizedBox "," WidthHight ","Float & Float",ctx.start.getLine());

        return widthHight_sizedBox;
    }

    @Override
    public widthHight_SizedBox visitHightWidth_SizedBox(projectParser.HightWidth_SizedBoxContext ctx) {
        System.out.println("visitHightWidth_SizedBox");
        widthHight_SizedBox widthHight_sizedBox = new widthHight_SizedBox();
        widthHight_sizedBox.setHIGHT(ctx.HIGHT().toString().trim());
        widthHight_sizedBox.setNUM_FLOAT_HIGHT(ctx.getChild(4).toString().trim());
        widthHight_sizedBox.setWIDTH(ctx.WIDTH().toString().trim());
        widthHight_sizedBox.setNUM_FLOAT_WIDTH(ctx.getChild(8).toString().trim());
        widthHight_sizedBox.setNumline(ctx.start.getLine());
        widthHight_sizedBox.setChildrenCount(ctx.getChildCount());

        createSymbolRow("SizedBox "," HightWidth ","Float & Float",ctx.start.getLine());

        return widthHight_sizedBox;
    }

    @Override
    public textButton visitTextButton(projectParser.TextButtonContext ctx) {
        System.out.println("visitTextButton");
        textButton tt = new textButton();
        tt.setTEXTBUTTON(ctx.TEXTBUTTON().toString().trim());
        tt.setCHILD(ctx.CHILD().toString().trim());
        tt.setONPRESSED(ctx.ONPRESSED().toString().trim());
        tt.setNumline(ctx.start.getLine());
        tt.setChildrenCount(ctx.getChildCount());
        for (int i =0 ; i< ctx.flutterWidget().size() ; i++){
            if(ctx.flutterWidget(i) != null){
                tt.getFlutterWidget().add((visitFlutterWidget(ctx.flutterWidget(i))));
            }
        }
        createSymbolRow(" TextButton "," textBottun ",tt.getFlutterWidget().toString(),ctx.start.getLine());

        return tt;
    }

    @Override
    public imageClasses visitImageState(projectParser.ImageStateContext ctx) {
        System.out.println("visitImageState");
        imageClasses im = new imageClasses();
        if(ctx.image_withAsset() != null){
            im.setimage_withAsset_Network_File(visitImage_withAsset(ctx.image_withAsset()));
            im.setNumline(ctx.start.getLine());
            im.setChildrenCount(ctx.getChildCount());
            createSymbolRow(" Flutter Widget -> Image "," Wiget Components "," With Assets",ctx.start.getLine());


        }
        if(ctx.image_withFile() != null){
            im.setimage_withAsset_Network_File(visitImage_withFile(ctx.image_withFile()));
            im.setNumline(ctx.start.getLine());
            im.setChildrenCount(ctx.getChildCount());
            createSymbolRow(" Flutter Widget -> Image "," Wiget Components "," File ",ctx.start.getLine());

        }
        if(ctx.image_withNetWoek() != null){
            im.setimage_withAsset_Network_File(visitImage_withNetWoek(ctx.image_withNetWoek()));
            im.setNumline(ctx.start.getLine());
            im.setChildrenCount(ctx.getChildCount());
            createSymbolRow(" Flutter Widget -> Image "," Wiget Components "," Network ",ctx.start.getLine());

        }
        if(ctx.image_withAssetImage() != null){
            im.setimage_withAssetImage(visitImage_withAssetImage(ctx.image_withAssetImage()));
            im.setNumline(ctx.start.getLine());
            im.setChildrenCount(ctx.getChildCount());
            createSymbolRow(" Flutter Widget -> Image "," Wiget Components "," Assets .",ctx.start.getLine());

        }
        if(ctx.image_withAssetImage_WithDirection() != null){
            im.setimage_withAssetImage_WithDirection(visitImage_withAssetImage_WithDirection(ctx.image_withAssetImage_WithDirection()));
            im.setNumline(ctx.start.getLine());
            im.setChildrenCount(ctx.getChildCount());
            createSymbolRow(" Flutter Widget -> Image "," Wiget Components "," With Decoration",ctx.start.getLine());

        }
        if(ctx.image_withAssetImage_WithDirection_fit() != null){
            im.setimage_withAssetImage_WithDirection_fit(visitImage_withAssetImage_WithDirection_fit(ctx.image_withAssetImage_WithDirection_fit()));
            im.setNumline(ctx.start.getLine());
            im.setChildrenCount(ctx.getChildCount());
            createSymbolRow(" Flutter Widget -> Image "," Wiget Components "," With Decoration Fit",ctx.start.getLine());

        }
        return im;
    }

    @Override
    public image_withAssetImage visitImage_withAssetImage(projectParser.Image_withAssetImageContext ctx) {
        System.out.println("visitImage_withAssetImage");
        image_withAssetImage imageWithAssetImage = new image_withAssetImage();
        imageWithAssetImage.setIMAGE(ctx.IMAGE().toString().trim());
        imageWithAssetImage.setIMAGE_CHILD(ctx.IMAGE_CHILD().toString().trim());
        imageWithAssetImage.setIMAGE_INPUT_ASSET(ctx.IMAGE_INPUT_ASSET().toString().trim());
        imageWithAssetImage.setASSETSIMAGE(ctx.ASSETSIMAGE().toString().trim());
        imageWithAssetImage.setNumline(ctx.start.getLine());
        imageWithAssetImage.setChildrenCount(ctx.getChildCount());

        createSymbolRow(" Image Assets",imageWithAssetImage.getASSETSIMAGE().toString(),imageWithAssetImage.getIMAGE_INPUT_ASSET().toString(),ctx.start.getLine());



        return  imageWithAssetImage;
    }

    @Override
    public image_withAssetImage_WithDirection visitImage_withAssetImage_WithDirection(projectParser.Image_withAssetImage_WithDirectionContext ctx) {
        System.out.println("visitImage_withAssetImage_WithDirection");
        image_withAssetImage_WithDirection imageWithAssetImageWithDirection = new image_withAssetImage_WithDirection();
        imageWithAssetImageWithDirection.setIMAGE(ctx.IMAGE().toString().trim());
        imageWithAssetImageWithDirection.setIMAGE_CHILD(ctx.IMAGE_CHILD().toString().trim());
        imageWithAssetImageWithDirection.setIMAGE_INPUT_ASSET(ctx.IMAGE_INPUT_ASSET().toString().trim());
        imageWithAssetImageWithDirection.setASSETSIMAGE(ctx.ASSETSIMAGE().toString().trim());
        imageWithAssetImageWithDirection.setNumline(ctx.start.getLine());
        imageWithAssetImageWithDirection.setChildrenCount(ctx.getChildCount());
        for(int i = 0 ; i<ctx.imageDirection().size() ; i++){
            if(ctx.imageDirection(i) != null){
                imageWithAssetImageWithDirection.getimageDirection().add(visitImageDirection(ctx.imageDirection(i)));
            }
        }
        createSymbolRow(" ImageDirection "," AssetsImage ",imageWithAssetImageWithDirection.getimageDirection().toString(),ctx.start.getLine());


        return imageWithAssetImageWithDirection;
    }

    @Override
    public image_withAssetImage_WithDirection_fit visitImage_withAssetImage_WithDirection_fit(projectParser.Image_withAssetImage_WithDirection_fitContext ctx) {
        System.out.println("visitImage_withAssetImage_WithDirection_fit");
        image_withAssetImage_WithDirection_fit imageWithAssetImageWithDirectionFit = new image_withAssetImage_WithDirection_fit();
        imageWithAssetImageWithDirectionFit.setIMAGE(ctx.IMAGE().toString().trim());
        imageWithAssetImageWithDirectionFit.setIMAGE_CHILD(ctx.IMAGE_CHILD().toString().trim());
        imageWithAssetImageWithDirectionFit.setASSETSIMAGE(ctx.ASSETSIMAGE().toString().trim());
        imageWithAssetImageWithDirectionFit.setIMAGE_INPUT_ASSET(ctx.IMAGE_INPUT_ASSET().toString().trim());
        imageWithAssetImageWithDirectionFit.setImageFit(visitImageFit(ctx.imageFit()));
        imageWithAssetImageWithDirectionFit.setNumline(ctx.start.getLine());
        imageWithAssetImageWithDirectionFit.setChildrenCount(ctx.getChildCount());
        for(int i = 0 ; i<ctx.imageDirection().size() ; i++){
            if(ctx.imageDirection(i) != null){
                imageWithAssetImageWithDirectionFit.getimageDirection().add(visitImageDirection(ctx.imageDirection(i)));
            }
        }

        createSymbolRow(" ImageDirectionWithFit "," Asstes ",imageWithAssetImageWithDirectionFit.getimageDirection().toString(),ctx.start.getLine());


        return imageWithAssetImageWithDirectionFit;
    }

    @Override
    public image_withAsset_Network_File visitImage_withAsset(projectParser.Image_withAssetContext ctx) {
        System.out.println("visitImage_withAsset");
        image_withAsset_Network_File imageWithAssetNetworkFile = new image_withAsset_Network_File();
        imageWithAssetNetworkFile.setIMAGE(ctx.IMAGE().toString().trim());
        imageWithAssetNetworkFile.setType(ctx.ASSET().toString().trim());
        imageWithAssetNetworkFile.setNumline(ctx.start.getLine());
        imageWithAssetNetworkFile.setChildrenCount(ctx.getChildCount());

        createSymbolRow(" ImageType "," Assets ",imageWithAssetNetworkFile.getType().toString(),ctx.start.getLine());



        return  imageWithAssetNetworkFile;
    }

    @Override
    public image_withAsset_Network_File visitImage_withNetWoek(projectParser.Image_withNetWoekContext ctx) {
        System.out.println("visitImage_withNetWoek");
        image_withAsset_Network_File imageWithAssetNetworkFile = new image_withAsset_Network_File();
        imageWithAssetNetworkFile.setIMAGE(ctx.IMAGE().toString().trim());
        imageWithAssetNetworkFile.setType(ctx.NETWORK().toString().trim());
        imageWithAssetNetworkFile.setNumline(ctx.start.getLine());
        imageWithAssetNetworkFile.setChildrenCount(ctx.getChildCount());


        createSymbolRow(" ImageType ","Network ",imageWithAssetNetworkFile.getType().toString(),ctx.start.getLine());


        return imageWithAssetNetworkFile;
    }

    @Override
    public image_withAsset_Network_File visitImage_withFile(projectParser.Image_withFileContext ctx) {
        System.out.println("visitImage_withFile");
        image_withAsset_Network_File imageWithAssetNetworkFile = new image_withAsset_Network_File();
        imageWithAssetNetworkFile.setIMAGE(ctx.IMAGE().toString().trim());
        imageWithAssetNetworkFile.setType(ctx.FILE().toString().trim());
        imageWithAssetNetworkFile.setNumline(ctx.start.getLine());
        imageWithAssetNetworkFile.setChildrenCount(ctx.getChildCount());

        createSymbolRow(" ImageType "," File ",imageWithAssetNetworkFile.getType().toString(),ctx.start.getLine());


        return imageWithAssetNetworkFile;
    }
    @Override
    public imageDirection visitImageDirection(projectParser.ImageDirectionContext ctx) {
        System.out.println("visitImageDirection");
        imageDirection image = new imageDirection();
        if(ctx.imageHight_DF() != null){
            image.setimageHight_AND_Width_DF(visitImageHight_DF(ctx.imageHight_DF()));
            image.setNumline(ctx.start.getLine());
            image.setChildrenCount(ctx.getChildCount());
            createSymbolRow(" Flutter Widget -> ImageDirection "," imageHight "," Float  ",ctx.start.getLine());
        }
        if(ctx.imageWidth_DF() != null){
            image.setimageHight_AND_Width_DF(visitImageWidth_DF(ctx.imageWidth_DF()));
            image.setNumline(ctx.start.getLine());
            image.setChildrenCount(ctx.getChildCount());
            createSymbolRow(" Flutter Widget -> ImageDirection "," imageWidth "," Float  ",ctx.start.getLine());
        }
        if(ctx.imageHightWidth_DF() != null){
            image.setimageHightWidth_Reverse_DF(visitImageHightWidth_DF(ctx.imageHightWidth_DF()));
            image.setNumline(ctx.start.getLine());
            image.setChildrenCount(ctx.getChildCount());
            createSymbolRow(" Flutter Widget -> ImageDirection "," imageHightWidth_F "," Float  ",ctx.start.getLine());
        }
        if(ctx.imageWidthHight_DF() != null){
            image.setimageHightWidth_Reverse_DF(visitImageWidthHight_DF(ctx.imageWidthHight_DF()));
            image.setNumline(ctx.start.getLine());
            image.setChildrenCount(ctx.getChildCount());
            createSymbolRow(" Flutter Widget -> ImageDirection "," imageWidthHight_F "," Float  ",ctx.start.getLine());
        }
        if(ctx.imageHightWidth_DN() != null){
            image.setimageHightWidth_Reverse_DN(visitImageHightWidth_DN(ctx.imageHightWidth_DN()));
            image.setNumline(ctx.start.getLine());
            image.setChildrenCount(ctx.getChildCount());
            createSymbolRow(" Flutter Widget -> ImageDirection "," imageHightWidth_N "," Num  ",ctx.start.getLine());
        }
        if(ctx.imageWidthHight_DN() != null){
            image.setimageHightWidth_Reverse_DN(visitImageWidthHight_DN(ctx.imageWidthHight_DN()));
            image.setNumline(ctx.start.getLine());
            image.setChildrenCount(ctx.getChildCount());
            createSymbolRow(" Flutter Widget -> ImageDirection "," imageWidthHight_F "," Num  ",ctx.start.getLine());
        }


        return image;
    }

    @Override
    public imageFit visitImageFit(projectParser.ImageFitContext ctx) {
        System.out.println("visitImageFit");
        imageFit imagefit = new imageFit();
        imagefit.setFIT(ctx.FIT().toString().trim());
        imagefit.setBOXFIT(ctx.BOXFIT().toString().trim());
        imagefit.setFILL(ctx.FILL().toString().trim());
        imagefit.setNumline(ctx.start.getLine());
        imagefit.setChildrenCount(ctx.getChildCount());

        createSymbolRow(" ImageFit "," BoxFit "," Fill  ",ctx.start.getLine());

        return imagefit;
    }


    @Override
    public expandedClasses visitExpandedStatment(projectParser.ExpandedStatmentContext ctx) {
        System.out.println("visitExpandedStatment");
        expandedClasses e = new expandedClasses();
        if(ctx.expanded_withCol() != null){
            e.setAttr_expanded_withCol_withRow(visitExpanded_withCol(ctx.expanded_withCol()));
            e.setNumline(ctx.start.getLine());
            e.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter Widget -> Expanded "," Wiget Components ","  Row  ",ctx.start.getLine());

        }
        if(ctx.expanded_withRow() != null){
            e.setAttr_expanded_withCol_withRow(visitExpanded_withRow(ctx.expanded_withRow()));
            e.setNumline(ctx.start.getLine());
            e.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter Widget -> Expanded "," Wiget Components "," Column   ",ctx.start.getLine());

        }
        return e;
    }

    @Override
    public expanded_withCol_withRow visitExpanded_withCol(projectParser.Expanded_withColContext ctx) {
        System.out.println("visitExpanded_withCol");
        expanded_withCol_withRow nn = new expanded_withCol_withRow();
        nn.setEXPANDED(ctx.EXPANDED().toString().trim());
        nn.setCHILD(ctx.CHILD().toString().trim());
        nn.setColumn(visitColStatemenst(ctx.colStatemenst()));
        nn.setNumline(ctx.start.getLine());
        nn.setChildrenCount(ctx.getChildCount());

        createSymbolRow(" Expanded "," expanded col "," ColumnStatement  ",ctx.start.getLine());
        return nn;
    }

    @Override
    public expanded_withCol_withRow visitExpanded_withRow(projectParser.Expanded_withRowContext ctx) {
        System.out.println("visitExpanded_withRow");
        expanded_withCol_withRow nn = new expanded_withCol_withRow();
        nn.setEXPANDED(ctx.EXPANDED().toString().trim());
        nn.setCHILD(ctx.CHILD().toString().trim());
        nn.setRow(visitRowStatement(ctx.rowStatement()));
        nn.setNumline(ctx.start.getLine());
        nn.setChildrenCount(ctx.getChildCount());
        createSymbolRow(" Expanded "," expanded row "," rowStatement  ",ctx.start.getLine());
        return nn;
    }

    @Override
    public paddingClasses visitPaddingStatement(projectParser.PaddingStatementContext ctx) {
        System.out.println("visitPaddingStatement");
        paddingClasses padding = new paddingClasses();

        if(ctx.padding_all() != null){
            padding.setpadding_all(visitPadding_all(ctx.padding_all()));
            padding.setNumline(ctx.start.getLine());
            padding.setChildrenCount(ctx.getChildCount());
        }
        if(ctx.padding_only()!= null){
            padding.setpadding_only(visitPadding_only(ctx.padding_only()));
            padding.setNumline(ctx.start.getLine());
            padding.setChildrenCount(ctx.getChildCount());
        }
        if(ctx.padding_sym_horisantal_num() != null){
            padding.setpadding_sym_horisantal_num_numFloat(visitPadding_sym_horisantal_num(ctx.padding_sym_horisantal_num()));
            padding.setNumline(ctx.start.getLine());
            padding.setChildrenCount(ctx.getChildCount());
        }
        if(ctx.padding_sym_horisantal_numFloat() != null){
            padding.setpadding_sym_horisantal_num_numFloat(visitPadding_sym_horisantal_numFloat(ctx.padding_sym_horisantal_numFloat()));
            padding.setNumline(ctx.start.getLine());
            padding.setChildrenCount(ctx.getChildCount());
        }
        if(ctx.padding_sym_vertical_num() != null){
            padding.setpadding_sym_vertical_num_numFloat(visitPadding_sym_vertical_num(ctx.padding_sym_vertical_num()));
            padding.setNumline(ctx.start.getLine());
            padding.setChildrenCount(ctx.getChildCount());
        }
        if(ctx.padding_sym_vertical_numFloat() != null){
            padding.setpadding_sym_vertical_num_numFloat(visitPadding_sym_vertical_numFloat(ctx.padding_sym_vertical_numFloat()));
            padding.setNumline(ctx.start.getLine());
            padding.setChildrenCount(ctx.getChildCount());
        }
        createSymbolRow("Flutter widget -> Padding "," Wiget Components "," List of padding type  ",ctx.start.getLine());
        return padding;
    }

    @Override
    public padding_all visitPadding_all(projectParser.Padding_allContext ctx) {
        System.out.println("visitPadding_all");
        padding_all paddingAll = new padding_all();
        paddingAll.setPADDING(ctx.PADDING().toString().trim());
        paddingAll.setPAD_ALL(ctx.PAD_ALL().toString().trim());
        paddingAll.setNUM_FLOAT(ctx.NUM_FLOAT().toString().trim());
        paddingAll.setCHILD(ctx.CHILD().toString().trim());
        for (int i =0 ; i< ctx.flutterWidget().size() ; i++){
            if(ctx.flutterWidget(i) != null){
                paddingAll.getFlutterWidget().add((visitFlutterWidget(ctx.flutterWidget(i))));
            }
        }
        paddingAll.setNumline(ctx.start.getLine());
        paddingAll.setChildrenCount(ctx.getChildCount());

        createSymbolRow(" Padding "," Padding all "," Float  ",ctx.start.getLine());
        return paddingAll;
    }
    @Override
    public padding_sym_vertical_num_numFloat visitPadding_sym_vertical_num(projectParser.Padding_sym_vertical_numContext ctx) {
        System.out.println("visitPadding_sym_vertical_num");
        padding_sym_vertical_num_numFloat nn = new padding_sym_vertical_num_numFloat();
        nn.setPADDING(ctx.PADDING().toString().trim());
        nn.setPAD_SYM(ctx.PAD_SYM().toString().trim());
        nn.setNUM(ctx.NUM().toString().trim());
        nn.setVERTICAL(ctx.VERTICAL().toString().trim());
        nn.setCHILD(ctx.CHILD().toString().trim());
        for (int i =0 ; i< ctx.flutterWidget().size() ; i++){
            if(ctx.flutterWidget(i) != null){
                nn.getFlutterWidget().add((visitFlutterWidget(ctx.flutterWidget(i))));
            }
        }
        nn.setNumline(ctx.start.getLine());
        nn.setChildrenCount(ctx.getChildCount());

        createSymbolRow(" Padding "," Padding Symmatric vertical"," Num  ",ctx.start.getLine());
        return nn;
    }

    @Override
    public padding_sym_vertical_num_numFloat visitPadding_sym_vertical_numFloat(projectParser.Padding_sym_vertical_numFloatContext ctx) {
        System.out.println("visitPadding_sym_vertical_numFloat");
        padding_sym_vertical_num_numFloat nn = new padding_sym_vertical_num_numFloat();
        nn.setPADDING(ctx.PADDING().toString().trim());
        nn.setPAD_SYM(ctx.PAD_SYM().toString().trim());
        nn.setNUM(ctx.NUM_FLOAT().toString().trim());
        nn.setVERTICAL(ctx.VERTICAL().toString().trim());
        nn.setCHILD(ctx.CHILD().toString().trim());
        for (int i =0 ; i< ctx.flutterWidget().size() ; i++){
            if(ctx.flutterWidget(i) != null){
                nn.getFlutterWidget().add((visitFlutterWidget(ctx.flutterWidget(i))));
            }
        }
        nn.setNumline(ctx.start.getLine());
        nn.setChildrenCount(ctx.getChildCount());

        createSymbolRow(" Padding "," Padding Symmatric vertical"," Float  ",ctx.start.getLine());
        return nn;

    }

    @Override
    public padding_sym_horisantal_num_numFloat visitPadding_sym_horisantal_num(projectParser.Padding_sym_horisantal_numContext ctx) {
        System.out.println("visitPadding_sym_horisantal_num");
        padding_sym_horisantal_num_numFloat nn = new padding_sym_horisantal_num_numFloat();
        nn.setPADDING(ctx.PADDING().toString().trim());
        nn.setPAD_SYM(ctx.PAD_SYM().toString().trim());
        nn.setNUM(ctx.NUM().toString().trim());
        nn.setHORISANTAL(ctx.HORISANTAL().toString().trim());
        nn.setCHILD(ctx.CHILD().toString().trim());
        for (int i =0 ; i< ctx.flutterWidget().size() ; i++){
            if(ctx.flutterWidget(i) != null){
                nn.getFlutterWidget().add((visitFlutterWidget(ctx.flutterWidget(i))));
            }
        }
        nn.setNumline(ctx.start.getLine());
        nn.setChildrenCount(ctx.getChildCount());
        createSymbolRow(" Padding "," Padding Symmatric horisantal"," Num  ",ctx.start.getLine());
        return nn;
    }

    @Override
    public padding_sym_horisantal_num_numFloat visitPadding_sym_horisantal_numFloat(projectParser.Padding_sym_horisantal_numFloatContext ctx) {
        System.out.println("visitPadding_sym_horisantal_numFloat");
        padding_sym_horisantal_num_numFloat nn = new padding_sym_horisantal_num_numFloat();
        nn.setPADDING(ctx.PADDING().toString().trim());
        nn.setPAD_SYM(ctx.PAD_SYM().toString().trim());
        nn.setNUM(ctx.NUM_FLOAT().toString().trim());
        nn.setHORISANTAL(ctx.HORISANTAL().toString().trim());
        nn.setCHILD(ctx.CHILD().toString().trim());
        for (int i =0 ; i< ctx.flutterWidget().size() ; i++){
            if(ctx.flutterWidget(i) != null){
                nn.getFlutterWidget().add((visitFlutterWidget(ctx.flutterWidget(i))));
            }
        }
        nn.setNumline(ctx.start.getLine());
        nn.setChildrenCount(ctx.getChildCount());
        createSymbolRow(" Padding "," Padding Symmatric horisantal"," Float  ",ctx.start.getLine());
        return nn;
    }

    @Override
    public padding_only visitPadding_only(projectParser.Padding_onlyContext ctx) {
        System.out.println("visitPadding_only");
        padding_only paddingOnly = new padding_only();
        paddingOnly.setPADDING(ctx.PADDING().toString().trim());
        paddingOnly.setPAD_ON(ctx.PAD_ON().toString().trim());
        paddingOnly.setCHILD(ctx.CHILD().toString().trim());
        for (int i =0 ; i< ctx.flutterWidget().size() ; i++){
            if(ctx.flutterWidget(i) != null){
                paddingOnly.getFlutterWidget().add((visitFlutterWidget(ctx.flutterWidget(i))));
            }
        }
        for (int i =0 ; i< ctx.direction().size() ; i++){
            if(ctx.direction(i) != null){
                paddingOnly.getdirection().add((visitDirection(ctx.direction(i))));
            }
        }
        paddingOnly.setNumline(ctx.start.getLine());
        paddingOnly.setChildrenCount(ctx.getChildCount());
        createSymbolRow(" Padding  "," padding only "," List of direction type ",ctx.start.getLine());


        return paddingOnly;
    }

    @Override
    public direction visitDirection(projectParser.DirectionContext ctx) {
        System.out.println("visitDirection");
        direction d = new direction();
        if(ctx.top_direction_FLOAT() != null ){
            d.setDirections_direction_FLOAT(visitTop_direction_FLOAT(ctx.top_direction_FLOAT()));
            d.setNumline(ctx.start.getLine());
            d.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter widget -> Padding "," top direction  ","  Float ",ctx.start.getLine());
        }
        if(ctx.right_direction_FLOAT() != null ){
            d.setDirections_direction_FLOAT(visitRight_direction_FLOAT(ctx.right_direction_FLOAT()));
            d.setNumline(ctx.start.getLine());
            d.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter widget -> Padding "," right direction  ","  Float ",ctx.start.getLine());
        }
        if(ctx.left_direction_FLOAT() != null ){
            d.setDirections_direction_FLOAT(visitLeft_direction_FLOAT(ctx.left_direction_FLOAT()));
            d.setNumline(ctx.start.getLine());
            d.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter widget -> Padding "," left direction  ","  Float ",ctx.start.getLine());
        }
        if(ctx.bottom_direction_FLOAT() != null ){
            d.setDirections_direction_FLOAT(visitBottom_direction_FLOAT(ctx.bottom_direction_FLOAT()));
            d.setNumline(ctx.start.getLine());
            d.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter widget -> Padding "," bottom direction  ","  Float ",ctx.start.getLine());
        }

        if(ctx.top_direction_FLOAT_D() != null ){
            d.setDirections_direction_FLOAT_D(visitTop_direction_FLOAT_D(ctx.top_direction_FLOAT_D()));
            d.setNumline(ctx.start.getLine());
            d.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter widget -> Padding "," top direction+  ","  Float ",ctx.start.getLine());
        }
        if(ctx.right_direction_FLOAT_D() != null ){
            d.setDirections_direction_FLOAT_D(visitRight_direction_FLOAT_D(ctx.right_direction_FLOAT_D()));
            d.setNumline(ctx.start.getLine());
            d.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter widget -> Padding "," right direction+  ","  Float ",ctx.start.getLine());
        }
        if(ctx.left_direction_FLOAT_D() != null ){
            d.setDirections_direction_FLOAT_D(visitLeft_direction_FLOAT_D(ctx.left_direction_FLOAT_D()));
            d.setNumline(ctx.start.getLine());
            d.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter widget -> Padding "," left direction+  ","  Float ",ctx.start.getLine());
        }
        if(ctx.bottom_direction_FLOAT_D() != null ){
            d.setDirections_direction_FLOAT_D(visitBottom_direction_FLOAT_D(ctx.bottom_direction_FLOAT_D()));
            d.setNumline(ctx.start.getLine());
            d.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter widget -> Padding "," bottom direction+  ","  Float ",ctx.start.getLine());
        }

        if(ctx.top_direction_NUM() != null){
            d.setDirections_direction_NUM(visitTop_direction_NUM(ctx.top_direction_NUM()));
            d.setNumline(ctx.start.getLine());
            d.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter widget -> Padding "," top direction  ","  Num ",ctx.start.getLine());
        }
        if(ctx.right_direction_NUM() != null){
            d.setDirections_direction_NUM(visitRight_direction_NUM(ctx.right_direction_NUM()));
            d.setNumline(ctx.start.getLine());
            d.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter widget -> Padding "," right direction  ","  Num ",ctx.start.getLine());
        }
        if(ctx.left_direction_NUM() != null){
            d.setDirections_direction_NUM(visitLeft_direction_NUM(ctx.left_direction_NUM()));
            d.setNumline(ctx.start.getLine());
            d.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter widget -> Padding "," left direction  ","  Num ",ctx.start.getLine());
        }
        if(ctx.bottom_direction_NUM() != null){
            d.setDirections_direction_NUM(visitBottom_direction_NUM(ctx.bottom_direction_NUM()));
            d.setNumline(ctx.start.getLine());
            d.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter widget -> Padding "," bottom direction  ","  Num ",ctx.start.getLine());
        }
        if(ctx.top_direction_NUM_D() != null){
            d.setDirections_direction_NUM_D(visitTop_direction_NUM_D(ctx.top_direction_NUM_D()));
            d.setNumline(ctx.start.getLine());
            d.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter widget -> Padding "," top direction+  ","  Num ",ctx.start.getLine());
        }
        if(ctx.right_direction_NUM_D() != null){
            d.setDirections_direction_NUM_D(visitRight_direction_NUM_D(ctx.right_direction_NUM_D()));
            d.setNumline(ctx.start.getLine());
            d.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter widget -> Padding "," right direction+  ","  Num ",ctx.start.getLine());
        }
        if(ctx.left_direction_NUM_D() != null){
            d.setDirections_direction_NUM_D(visitLeft_direction_NUM_D(ctx.left_direction_NUM_D()));
            d.setNumline(ctx.start.getLine());
            d.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter widget -> Padding "," left direction+  ","  Num ",ctx.start.getLine());
        }
        if(ctx.bottom_direction_NUM_D() != null){
            d.setDirections_direction_NUM_D(visitBottom_direction_NUM_D(ctx.bottom_direction_NUM_D()));
            d.setNumline(ctx.start.getLine());
            d.setChildrenCount(ctx.getChildCount());
            createSymbolRow("Flutter widget -> Padding "," bottom direction+  ","  Num ",ctx.start.getLine());
        }



        return d;
    }

    @Override
    public FlutterWidget visitFlutterWidget(projectParser.FlutterWidgetContext ctx) {
        System.out.println("visitFlutterWidget");
        FlutterWidget flutterWidget = new FlutterWidget();
        if(ctx.colStatemenst() != null){
            flutterWidget.setColumn(visitColStatemenst(ctx.colStatemenst()));
            flutterWidget.setNumline(ctx.start.getLine());
            flutterWidget.setChildrenCount(ctx.getChildCount());
        }
        if(ctx.rowStatement() != null){
            flutterWidget.setRow(visitRowStatement(ctx.rowStatement()));
            flutterWidget.setNumline(ctx.start.getLine());
            flutterWidget.setChildrenCount(ctx.getChildCount());
        }
        if(ctx.containerStatement() != null){
            flutterWidget.setContainer(visitContainerStatement(ctx.containerStatement()));
            flutterWidget.setNumline(ctx.start.getLine());
            flutterWidget.setChildrenCount(ctx.getChildCount());
        }
        if(ctx.textButton() != null){
            flutterWidget.settextButton(visitTextButton(ctx.textButton()));
            flutterWidget.setNumline(ctx.start.getLine());
            flutterWidget.setChildrenCount(ctx.getChildCount());
        }
        if(ctx.texeStatement() != null){
            flutterWidget.setTextClasses(visitTexeStatement(ctx.texeStatement()));
            flutterWidget.setNumline(ctx.start.getLine());
            flutterWidget.setChildrenCount(ctx.getChildCount());
        }
        if(ctx.sizedBox() != null){
            flutterWidget.setSizedBoxClasses(visitSizedBox(ctx.sizedBox()));
            flutterWidget.setNumline(ctx.start.getLine());
            flutterWidget.setChildrenCount(ctx.getChildCount());
        }
        if(ctx.imageState() != null){
            flutterWidget.setimageClasses(visitImageState(ctx.imageState()));
            flutterWidget.setNumline(ctx.start.getLine());
            flutterWidget.setChildrenCount(ctx.getChildCount());
        }
        if(ctx.paddingStatement() != null){
            flutterWidget.setpaddingClasses(visitPaddingStatement(ctx.paddingStatement()));
            flutterWidget.setNumline(ctx.start.getLine());
            flutterWidget.setChildrenCount(ctx.getChildCount());
        }

        createSymbolRow("Flutter widget "," Widget Components "," object from Widget Components ",ctx.start.getLine());

        return flutterWidget;
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
            createSymbolRow("Input Classes ","visitInputClass ",input.getInitial().toString(),ctx.start.getLine());

        }

        if(ctx.functionStatement() != null){
            input.setFun(visitFunctionStatement(ctx.functionStatement()));
            createSymbolRow("Input Classes ","visitInputClass ",input.getFun().toString(),ctx.start.getLine());

        }
        return input;
    }

    @Override
    public IFIF visitIfif(projectParser.IfifContext ctx) {
        System.out.println("visitIFif");
        IFIF ifif = new IFIF();
        if(ctx.BREAK() != null){
            ifif.setBrek(ctx.BREAK().toString().trim());
            createSymbolRow("condition ","condition with break type "," break",ctx.start.getLine());

        }
        if(ctx.CONTINUE() != null){
            ifif.setCont(ctx.CONTINUE().toString().trim());
            createSymbolRow("condition ","condition with continue type "," continue",ctx.start.getLine());

        }
        if(ctx.inputI() != null){
            for(int i=0;i<ctx.inputI().size(); i++){
                if(ctx.inputI(i) != null){
                    ifif.getInp().add((visitInputI(ctx.inputI(i))));
                }}
            createSymbolRow("condition ","condition with input type "," inputI",ctx.start.getLine());

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
        createSymbolRow("Else_WithInput Condition ",elseif.getElseif().toString(),elseif.getCond().toString(),ctx.start.getLine());

        return elseif;
    }

    @Override
    public ElseInput visitElse_WithInput(projectParser.Else_WithInputContext ctx) {
        System.out.println("visitElse");
        ElseInput elsee = new ElseInput();
        elsee.setElsee(ctx.ELSE().toString().trim());
        elsee.setIfif(visitIfif(ctx.ifif()));

        createSymbolRow("Else_WithInput",elsee.getElsee().toString(),elsee.getIfif().toString(),ctx.start.getLine());


        return elsee;
    }

    @Override
    public Container visitContainerStatement(projectParser.ContainerStatementContext ctx) {
        System.out.println("visitContainerStatement");
        Container container = new Container();
        container.setCONTAINER(ctx.CONTAINER().toString().trim());
        container.setCHILD(ctx.CHILD().toString().trim());

        for (int i =0 ; i< ctx.flutterWidget().size() ; i++){
            if(ctx.flutterWidget(i) != null){
                container.getFlutterWidget().add((visitFlutterWidget(ctx.flutterWidget(i))));
            }
        }
        container.setNumline(ctx.start.getLine());
        container.setChildrenCount(ctx.getChildCount());

        createSymbolRow(" Container Widget "," Container "," List of flutter widget ",ctx.start.getLine());

        return container;
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
    public input_1AppBar visitInput_1AppBar(projectParser.Input_1AppBarContext ctx) {
        System.out.println("visitInput_1AppBar");
        input_1AppBar input1AppBar = new input_1AppBar();
        input1AppBar.setTITLE(ctx.TITLE().toString().trim());
        input1AppBar.setTextClasses(visitTexeStatement(ctx.texeStatement()));
        input1AppBar.setNumline(ctx.start.getLine());
        input1AppBar.setChildrenCount(ctx.getChildCount());

        createSymbolRow("Input AppBar type 1 : ","with Title"," title ",ctx.start.getLine());

        return input1AppBar;

    }

    @Override
    public input_2AppBar visitInput_2AppBar(projectParser.Input_2AppBarContext ctx) {
        System.out.println("visitInput_2AppBar");
        input_2AppBar input2AppBar = new input_2AppBar();
        input2AppBar.setBACHCOLOR(ctx.BACHCOLOR().toString().trim());
        input2AppBar.setCOLOR(ctx.COLOR().toString().trim());
        input2AppBar.setColor(visitColor(ctx.color()));
        input2AppBar.setNumline(ctx.start.getLine());
        input2AppBar.setChildrenCount(ctx.getChildCount());

        createSymbolRow("Input AppBar type 2 : ","with just Color"," color ",ctx.start.getLine());

        return input2AppBar;
    }

    @Override
    public input_3AppBar visitInput_3AppBar(projectParser.Input_3AppBarContext ctx) {
        System.out.println("visitInput_3AppBar");
        input_3AppBar input3AppBar = new input_3AppBar();
        input3AppBar.setTITLE(ctx.TITLE().toString().trim());
        input3AppBar.setTextClasses(visitTexeStatement(ctx.texeStatement()));
        input3AppBar.setBACHCOLOR(ctx.BACHCOLOR().toString().trim());
        input3AppBar.setCOLOR(ctx.COLOR().toString().trim());
        input3AppBar.setColor(visitColor(ctx.color()));
        input3AppBar.setNumline(ctx.start.getLine());
        input3AppBar.setChildrenCount(ctx.getChildCount());

        createSymbolRow("Input AppBar type 3 : ","with Title and Color","  title color ",ctx.start.getLine());

        return input3AppBar;
    }

    @Override
    public input_4AppBar visitInput_4AppBar(projectParser.Input_4AppBarContext ctx) {
        System.out.println("visitInput_4AppBar");
        input_4AppBar input4AppBar = new input_4AppBar();
        input4AppBar.setBACHCOLOR(ctx.BACHCOLOR().toString().trim());
        input4AppBar.setCOLOR(ctx.COLOR().toString().trim());
        input4AppBar.setColor(visitColor(ctx.color()));
        input4AppBar.setTITLE(ctx.TITLE().toString().trim());
        input4AppBar.setTextClasses(visitTexeStatement(ctx.texeStatement()));
        input4AppBar.setNumline(ctx.start.getLine());
        input4AppBar.setChildrenCount(ctx.getChildCount());

        createSymbolRow("Input AppBar type 4 :","with Color and Title"," color title ",ctx.start.getLine());

        return input4AppBar;
    }
    @Override
    public color_red_green visitColor_red(projectParser.Color_redContext ctx) {
        System.out.println("visitColor_red");
        color_red_green colorRedGreen = new color_red_green();
        colorRedGreen.setColor_type(ctx.RED().toString().trim());
        colorRedGreen.setNumline(ctx.start.getLine());
        colorRedGreen.setChildrenCount(ctx.getChildCount());

        createSymbolRow(" type_Color ","Color",colorRedGreen.getColor_type().toString(),ctx.start.getLine());

        return  colorRedGreen;
    }

    @Override
    public color_red_green visitColor_green(projectParser.Color_greenContext ctx) {
        System.out.println("visitColor_green");
        color_red_green colorRedGreen = new color_red_green();
        colorRedGreen.setColor_type(ctx.GREEN().toString().trim());
        colorRedGreen.setNumline(ctx.start.getLine());
        colorRedGreen.setChildrenCount(ctx.getChildCount());

        createSymbolRow("type_Color ","Color ",colorRedGreen.getColor_type().toString(),ctx.start.getLine());

        return colorRedGreen;
    }
    @Override
    public imageHight_AND_Width_DF visitImageHight_DF(projectParser.ImageHight_DFContext ctx) {
        System.out.println("visitImageHight_DF");
        imageHight_AND_Width_DF imageHightAndWidthDf = new imageHight_AND_Width_DF();
        imageHightAndWidthDf.setType(ctx.HIGHT().toString().trim());
        imageHightAndWidthDf.setNUM_FLOAT(ctx.NUM_FLOAT().toString().trim());
        imageHightAndWidthDf.setNumline(ctx.start.getLine());
        imageHightAndWidthDf.setChildrenCount(ctx.getChildCount());

        createSymbolRow("Image Decoration ",imageHightAndWidthDf.getType().toString(),imageHightAndWidthDf.getNUM_FLOAT().toString(),ctx.start.getLine());

        return imageHightAndWidthDf;
    }

    @Override
    public imageHight_AND_Width_DF visitImageWidth_DF(projectParser.ImageWidth_DFContext ctx) {
        System.out.println("visitImageWidth_DF");
        imageHight_AND_Width_DF imageHightAndWidthDf = new imageHight_AND_Width_DF();
        imageHightAndWidthDf.setType(ctx.WIDTH().toString().trim());
        imageHightAndWidthDf.setNUM_FLOAT(ctx.NUM_FLOAT().toString().trim());
        imageHightAndWidthDf.setNumline(ctx.start.getLine());
        imageHightAndWidthDf.setChildrenCount(ctx.getChildCount());

        createSymbolRow("Image Decoration ",imageHightAndWidthDf.getType().toString(),imageHightAndWidthDf.getNUM_FLOAT().toString(),ctx.start.getLine());

        return imageHightAndWidthDf;
    }
    @Override
    public imageHightWidth_Reverse_DF visitImageHightWidth_DF(projectParser.ImageHightWidth_DFContext ctx) {
        System.out.println("visitImageHightWidth_DF");
        imageHightWidth_Reverse_DF imageHightWidth_reverse_df = new imageHightWidth_Reverse_DF();
        imageHightWidth_reverse_df.setHIGHT(ctx.HIGHT().toString().trim());
        imageHightWidth_reverse_df.setNUM_FLOAT_HIGHT(ctx.getChild(2).toString().trim());
        imageHightWidth_reverse_df.setWIDTH(ctx.WIDTH().toString().trim());
        imageHightWidth_reverse_df.setNUM_FLOAT_WIDTH(ctx.getChild(6).toString().trim());
        imageHightWidth_reverse_df.setNumline(ctx.start.getLine());
        imageHightWidth_reverse_df.setChildrenCount(ctx.getChildCount());


        createSymbolRow("Image Direction","ImageHightWidth","Float",ctx.start.getLine());

        return imageHightWidth_reverse_df;
    }

    @Override
    public imageHightWidth_Reverse_DF visitImageWidthHight_DF(projectParser.ImageWidthHight_DFContext ctx) {
        System.out.println("visitImageWidthHight_DF");
        imageHightWidth_Reverse_DF imageHightWidth_reverse_df = new imageHightWidth_Reverse_DF();
        imageHightWidth_reverse_df.setWIDTH(ctx.WIDTH().toString().trim());
        imageHightWidth_reverse_df.setNUM_FLOAT_WIDTH(ctx.getChild(2).toString().trim());
        imageHightWidth_reverse_df.setHIGHT(ctx.HIGHT().toString().trim());
        imageHightWidth_reverse_df.setNUM_FLOAT_HIGHT(ctx.getChild(6).toString().trim());
        imageHightWidth_reverse_df.setNumline(ctx.start.getLine());
        imageHightWidth_reverse_df.setChildrenCount(ctx.getChildCount());


        createSymbolRow("Image Direction","ImageWidthHight","Float",ctx.start.getLine());

        return imageHightWidth_reverse_df;
    }


    @Override
    public imageHightWidth_Reverse_DN visitImageHightWidth_DN(projectParser.ImageHightWidth_DNContext ctx) {
        System.out.println("visitImageHightWidth_DN");
        imageHightWidth_Reverse_DN image = new imageHightWidth_Reverse_DN();
        image.setHIGHT(ctx.HIGHT().toString().trim());
        image.setNUM_HIGHT(ctx.getChild(2).toString().trim());
        image.setWIDTH(ctx.WIDTH().toString().trim());
        image.setNUM_WIDTH(ctx.getChild(6).toString().trim());
        image.setNumline(ctx.start.getLine());
        image.setChildrenCount(ctx.getChildCount());

        createSymbolRow("Image Direction","ImageHightWidth","Num",ctx.start.getLine());


        return image;

    }

    @Override
    public imageHightWidth_Reverse_DN visitImageWidthHight_DN(projectParser.ImageWidthHight_DNContext ctx) {
        System.out.println("visitImageWidthHight_DN");
        imageHightWidth_Reverse_DN image = new imageHightWidth_Reverse_DN();
        image.setWIDTH(ctx.WIDTH().toString().trim());
        image.setNUM_WIDTH(ctx.getChild(2).toString().trim());
        image.setHIGHT(ctx.HIGHT().toString().trim());
        image.setNUM_HIGHT(ctx.getChild(6).toString().trim());
        image.setNumline(ctx.start.getLine());
        image.setChildrenCount(ctx.getChildCount());

        createSymbolRow("Image Direction","ImageWidthHight","Num",ctx.start.getLine());

        return image;
    }


    @Override
    public Directions_direction_NUM visitTop_direction_NUM(projectParser.Top_direction_NUMContext ctx) {
        System.out.println("visitTop_direction_NUM");
        Directions_direction_NUM directionsDirectionNum = new Directions_direction_NUM();
        directionsDirectionNum.setType(ctx.TOP().toString().trim());
        directionsDirectionNum.setNUM(ctx.NUM().toString().trim());
        directionsDirectionNum.setNumline(ctx.start.getLine());
        directionsDirectionNum.setChildrenCount(ctx.getChildCount());

        createSymbolRow("Direction",directionsDirectionNum.getType().toString(),directionsDirectionNum.getNUM().toString(),ctx.start.getLine());

        return directionsDirectionNum;
    }

    @Override
    public Directions_direction_NUM visitRight_direction_NUM(projectParser.Right_direction_NUMContext ctx) {
        System.out.println("visit RIGHT_direction_NUM");
        Directions_direction_NUM directionsDirectionNum = new Directions_direction_NUM();
        directionsDirectionNum.setType(ctx.RIGHT().toString().trim());
        directionsDirectionNum.setNUM(ctx.NUM().toString().trim());
        directionsDirectionNum.setNumline(ctx.start.getLine());
        directionsDirectionNum.setChildrenCount(ctx.getChildCount());

        createSymbolRow("Direction",directionsDirectionNum.getType().toString(),directionsDirectionNum.getNUM().toString(),ctx.start.getLine());

        return directionsDirectionNum;
    }

    @Override
    public Directions_direction_NUM visitBottom_direction_NUM(projectParser.Bottom_direction_NUMContext ctx) {
        System.out.println("visit BOTTOM _direction_NUM");
        Directions_direction_NUM directionsDirectionNum = new Directions_direction_NUM();
        directionsDirectionNum.setType(ctx.BOTTOM().toString().trim());
        directionsDirectionNum.setNUM(ctx.NUM().toString().trim());
        directionsDirectionNum.setNumline(ctx.start.getLine());
        directionsDirectionNum.setChildrenCount(ctx.getChildCount());
        createSymbolRow("Direction",directionsDirectionNum.getType().toString(),directionsDirectionNum.getNUM().toString(),ctx.start.getLine());

        return directionsDirectionNum;
    }

    @Override
    public Directions_direction_NUM visitLeft_direction_NUM(projectParser.Left_direction_NUMContext ctx) {
        System.out.println("visit LEFT _direction_NUM");
        Directions_direction_NUM directionsDirectionNum = new Directions_direction_NUM();
        directionsDirectionNum.setType(ctx.LEFT().toString().trim());
        directionsDirectionNum.setNUM(ctx.NUM().toString().trim());
        directionsDirectionNum.setNumline(ctx.start.getLine());
        directionsDirectionNum.setChildrenCount(ctx.getChildCount());

        createSymbolRow("Direction",directionsDirectionNum.getType().toString(),directionsDirectionNum.getNUM().toString(),ctx.start.getLine());

        return directionsDirectionNum;
    }

    @Override
    public Directions_direction_FLOAT visitTop_direction_FLOAT(projectParser.Top_direction_FLOATContext ctx) {
        System.out.println("visitTop_direction_FLOAT");
        Directions_direction_FLOAT directionsDirectionFloat = new Directions_direction_FLOAT();
        directionsDirectionFloat.setType(ctx.TOP().toString().trim());
        directionsDirectionFloat.setNUM_FLOAT(ctx.NUM_FLOAT().toString().trim());
        directionsDirectionFloat.setNumline(ctx.start.getLine());
        directionsDirectionFloat.setChildrenCount(ctx.getChildCount());

        createSymbolRow("Direction",directionsDirectionFloat.getType().toString(),directionsDirectionFloat.getNUM_FLOAT().toString(),ctx.start.getLine());


        return directionsDirectionFloat;
    }

    @Override
    public Directions_direction_FLOAT visitRight_direction_FLOAT(projectParser.Right_direction_FLOATContext ctx) {
        System.out.println("visit Right_direction_FLOAT");
        Directions_direction_FLOAT directionsDirectionFloat = new Directions_direction_FLOAT();
        directionsDirectionFloat.setType(ctx.RIGHT().toString().trim());
        directionsDirectionFloat.setNUM_FLOAT(ctx.NUM_FLOAT().toString().trim());
        directionsDirectionFloat.setNumline(ctx.start.getLine());
        directionsDirectionFloat.setChildrenCount(ctx.getChildCount());

        createSymbolRow("Direction",directionsDirectionFloat.getType().toString(),directionsDirectionFloat.getNUM_FLOAT().toString(),ctx.start.getLine());

        return directionsDirectionFloat;
    }

    @Override
    public Directions_direction_FLOAT visitBottom_direction_FLOAT(projectParser.Bottom_direction_FLOATContext ctx) {
        System.out.println("visit BOTTOM _direction_FLOAT");
        Directions_direction_FLOAT directionsDirectionFloat = new Directions_direction_FLOAT();
        directionsDirectionFloat.setType(ctx.BOTTOM().toString().trim());
        directionsDirectionFloat.setNUM_FLOAT(ctx.NUM_FLOAT().toString().trim());
        directionsDirectionFloat.setNumline(ctx.start.getLine());
        directionsDirectionFloat.setChildrenCount(ctx.getChildCount());
        createSymbolRow("Direction",directionsDirectionFloat.getType().toString(),directionsDirectionFloat.getNUM_FLOAT().toString(),ctx.start.getLine());


        return directionsDirectionFloat;
    }

    @Override
    public Directions_direction_FLOAT visitLeft_direction_FLOAT(projectParser.Left_direction_FLOATContext ctx) {
        System.out.println("visit LEFT_direction_FLOAT");
        Directions_direction_FLOAT directionsDirectionFloat = new Directions_direction_FLOAT();
        directionsDirectionFloat.setType(ctx.LEFT().toString().trim());
        directionsDirectionFloat.setNUM_FLOAT(ctx.NUM_FLOAT().toString().trim());
        directionsDirectionFloat.setNumline(ctx.start.getLine());
        directionsDirectionFloat.setChildrenCount(ctx.getChildCount());

        createSymbolRow("Direction",directionsDirectionFloat.getType().toString(),directionsDirectionFloat.getNUM_FLOAT().toString(),ctx.start.getLine());

        return directionsDirectionFloat;
    }

    @Override
    public Directions_direction_NUM_D visitTop_direction_NUM_D(projectParser.Top_direction_NUM_DContext ctx) {
        System.out.println("visitTop_direction_NUM_D");
        Directions_direction_NUM_D directionsDirectionNumD = new Directions_direction_NUM_D();
        directionsDirectionNumD.setType(ctx.TOP().toString().trim());
        directionsDirectionNumD.setNUM(ctx.NUM().toString().trim());
        directionsDirectionNumD.setNumline(ctx.start.getLine());
        directionsDirectionNumD.setChildrenCount(ctx.getChildCount());
        for (int i =0 ; i< ctx.direction().size() ; i++){
            if(ctx.direction(i) != null){
                directionsDirectionNumD.getDirection().add((visitDirection(ctx.direction(i))));
            }
        }
        createSymbolRow(directionsDirectionNumD.getType().toString(),directionsDirectionNumD.getDirection().toString(),directionsDirectionNumD.getNUM().toString(),ctx.start.getLine());

        return directionsDirectionNumD;
    }

    @Override
    public Directions_direction_NUM_D visitRight_direction_NUM_D(projectParser.Right_direction_NUM_DContext ctx) {
        System.out.println("visit RIGHT_direction_NUM_D");
        Directions_direction_NUM_D directionsDirectionNumD = new Directions_direction_NUM_D();
        directionsDirectionNumD.setType(ctx.RIGHT().toString().trim());
        directionsDirectionNumD.setNUM(ctx.NUM().toString().trim());
        directionsDirectionNumD.setNumline(ctx.start.getLine());
        directionsDirectionNumD.setChildrenCount(ctx.getChildCount());
        for (int i =0 ; i< ctx.direction().size() ; i++){
            if(ctx.direction(i) != null){
                directionsDirectionNumD.getDirection().add((visitDirection(ctx.direction(i))));
            }
        }
        createSymbolRow(directionsDirectionNumD.getType().toString(),directionsDirectionNumD.getDirection().toString(),directionsDirectionNumD.getNUM().toString(),ctx.start.getLine());

        return directionsDirectionNumD;
    }

    @Override
    public Directions_direction_NUM_D visitBottom_direction_NUM_D(projectParser.Bottom_direction_NUM_DContext ctx) {
        System.out.println("visit BOTTOM_direction_NUM_D");
        Directions_direction_NUM_D directionsDirectionNumD = new Directions_direction_NUM_D();
        directionsDirectionNumD.setType(ctx.BOTTOM().toString().trim());
        directionsDirectionNumD.setNUM(ctx.NUM().toString().trim());
        directionsDirectionNumD.setNumline(ctx.start.getLine());
        directionsDirectionNumD.setChildrenCount(ctx.getChildCount());
        for (int i =0 ; i< ctx.direction().size() ; i++){
            if(ctx.direction(i) != null){
                directionsDirectionNumD.getDirection().add((visitDirection(ctx.direction(i))));
            }
        }
        createSymbolRow(directionsDirectionNumD.getType().toString(),directionsDirectionNumD.getDirection().toString(),directionsDirectionNumD.getNUM().toString(),ctx.start.getLine());

        return directionsDirectionNumD;
    }

    @Override
    public Directions_direction_NUM_D visitLeft_direction_NUM_D(projectParser.Left_direction_NUM_DContext ctx) {
        System.out.println("visit LEFT_direction_NUM_D");
        Directions_direction_NUM_D directionsDirectionNumD = new Directions_direction_NUM_D();
        directionsDirectionNumD.setType(ctx.LEFT().toString().trim());
        directionsDirectionNumD.setNUM(ctx.NUM().toString().trim());
        directionsDirectionNumD.setNumline(ctx.start.getLine());
        directionsDirectionNumD.setChildrenCount(ctx.getChildCount());
        for (int i =0 ; i< ctx.direction().size() ; i++){
            if(ctx.direction(i) != null){
                directionsDirectionNumD.getDirection().add((visitDirection(ctx.direction(i))));
            }
        }
        createSymbolRow(directionsDirectionNumD.getType().toString(),directionsDirectionNumD.getDirection().toString(),directionsDirectionNumD.getNUM().toString(),ctx.start.getLine());

        return directionsDirectionNumD;
    }

    @Override
    public Directions_direction_FLOAT_D visitTop_direction_FLOAT_D(projectParser.Top_direction_FLOAT_DContext ctx) {
        System.out.println("visitTop_direction_FLOAT_D");
        Directions_direction_FLOAT_D directionsDirectionFloatD = new Directions_direction_FLOAT_D();
        directionsDirectionFloatD.setType(ctx.TOP().toString().trim());
        directionsDirectionFloatD.setNUM_FLOAT(ctx.NUM_FLOAT().toString().trim());
        directionsDirectionFloatD.setNumline(ctx.start.getLine());
        directionsDirectionFloatD.setChildrenCount(ctx.getChildCount());
        for (int i =0 ; i< ctx.direction().size() ; i++){
            if(ctx.direction(i) != null){
                directionsDirectionFloatD.getDirection().add((visitDirection(ctx.direction(i))));
            }
        }
        createSymbolRow(directionsDirectionFloatD.getType().toString(),directionsDirectionFloatD.getDirection().toString(),directionsDirectionFloatD.getNUM_FLOAT().toString(),ctx.start.getLine());

        return directionsDirectionFloatD;
    }

    @Override
    public Directions_direction_FLOAT_D visitRight_direction_FLOAT_D(projectParser.Right_direction_FLOAT_DContext ctx) {
        System.out.println("visit Right_direction_FLOAT_D");
        Directions_direction_FLOAT_D directionsDirectionFloatD = new Directions_direction_FLOAT_D();
        directionsDirectionFloatD.setType(ctx.RIGHT().toString().trim());
        directionsDirectionFloatD.setNUM_FLOAT(ctx.NUM_FLOAT().toString().trim());
        directionsDirectionFloatD.setNumline(ctx.start.getLine());
        directionsDirectionFloatD.setChildrenCount(ctx.getChildCount());
        for (int i =0 ; i< ctx.direction().size() ; i++){
            if(ctx.direction(i) != null){
                directionsDirectionFloatD.getDirection().add((visitDirection(ctx.direction(i))));
            }
        }
        createSymbolRow(directionsDirectionFloatD.getType().toString(),directionsDirectionFloatD.getDirection().toString(),directionsDirectionFloatD.getNUM_FLOAT().toString(),ctx.start.getLine());

        return directionsDirectionFloatD;
    }

    @Override
    public Directions_direction_FLOAT_D visitBottom_direction_FLOAT_D(projectParser.Bottom_direction_FLOAT_DContext ctx) {
        System.out.println("visit BOTTOM_direction_FLOAT_D");
        Directions_direction_FLOAT_D directionsDirectionFloatD = new Directions_direction_FLOAT_D();
        directionsDirectionFloatD.setType(ctx.BOTTOM().toString().trim());
        directionsDirectionFloatD.setNUM_FLOAT(ctx.NUM_FLOAT().toString().trim());
        directionsDirectionFloatD.setNumline(ctx.start.getLine());
        directionsDirectionFloatD.setChildrenCount(ctx.getChildCount());
        for (int i =0 ; i< ctx.direction().size() ; i++){
            if(ctx.direction(i) != null){
                directionsDirectionFloatD.getDirection().add((visitDirection(ctx.direction(i))));
            }
        }
        createSymbolRow(directionsDirectionFloatD.getType().toString(),directionsDirectionFloatD.getDirection().toString(),directionsDirectionFloatD.getNUM_FLOAT().toString(),ctx.start.getLine());

        return directionsDirectionFloatD;
    }

    @Override
    public Directions_direction_FLOAT_D visitLeft_direction_FLOAT_D(projectParser.Left_direction_FLOAT_DContext ctx) {
        System.out.println("visit LEFT_direction_FLOAT_D");
        Directions_direction_FLOAT_D directionsDirectionFloatD = new Directions_direction_FLOAT_D();
        directionsDirectionFloatD.setType(ctx.LEFT().toString().trim());
        directionsDirectionFloatD.setNUM_FLOAT(ctx.NUM_FLOAT().toString().trim());
        directionsDirectionFloatD.setNumline(ctx.start.getLine());
        directionsDirectionFloatD.setChildrenCount(ctx.getChildCount());
        for (int i =0 ; i< ctx.direction().size() ; i++){
            if(ctx.direction(i) != null){
                directionsDirectionFloatD.getDirection().add((visitDirection(ctx.direction(i))));
            }
        }
        createSymbolRow(directionsDirectionFloatD.getType().toString(),directionsDirectionFloatD.getDirection().toString(),directionsDirectionFloatD.getNUM_FLOAT().toString(),ctx.start.getLine());

        return directionsDirectionFloatD;
    }

    @Override
    public NameN visitNamen(projectParser.NamenContext ctx) {
        System.out.println("visitNameN");
        NameN nam = new NameN();
        nam.setNam(ctx.ID().toString().trim());
        return nam;
    }




    private SymbolRow createSymbolRow(String type,String name,String value,int numline){
        SymbolRow symbolRow = new SymbolRow();
        symbolRow.setType(type);
        symbolRow.setName(name);
        symbolRow.setValue(value);
        symbolRow.setNumline(numline);

        symbolTable.getSymbolRows().add(symbolRow);
        return symbolRow;
    }



}

