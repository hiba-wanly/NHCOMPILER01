package Gremmers.var.Expression;

import Gremmers.AST;

public class Expression extends AST {
    private NumbersIF numbers;
    private booleanP boolean_p;
    private Var var;
    private Expression expression;
    private Math math;
    private int linenum;
    private int childrennum;
    public Math getMath() {
        return math;
    }

    public void setMath(Math math) {
        this.math = math;
    }

    public NumbersIF getNumbers() {
        return numbers;
    }

    public void setNumbers(NumbersIF numbers) {
        this.numbers = numbers;
    }

    public booleanP getBoolean_p() {
        return boolean_p;
    }

    public void setBoolean_p(booleanP boolean_p) {
        this.boolean_p = boolean_p;
    }

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
    public int getLinenum() {
        return linenum;
    }

    public void setLinenum(int linenum) {
        this.linenum = linenum;
    }

    public int getChildrennum() {
        return childrennum;
    }

    public void setChildrennum(int childrennum) {
        this.childrennum = childrennum;
    }

    @Override
    public String toString() {
        if(this.numbers!=null){
            return "Expression{" +
                    "numbers=" + numbers
                    + "line:"+linenum+"children:"+childrennum
                    +"} \n";
        }
        if(this.var!=null){
            return "Expression{" +
                    "var=" + var
                    + "line:"+linenum+"children:"+childrennum
                    +'}';
        }
        if(this.boolean_p!=null){
            return "Expression{" +
                    "boolean_p=" + boolean_p
                    + "line:"+linenum+"children:"+childrennum
                    +"} \n";
        }
        if(this.math!=null){
            return "Expression{" +
                    "math=" + math
                    + "line:"+linenum+"children:"+childrennum
                    +"} \n";
        }

        return "Expression{" +
                "expression=" + expression
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
