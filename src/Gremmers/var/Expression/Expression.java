package Gremmers.var.Expression;

import Gremmers.AST;

public class Expression extends AST {
    private NumbersIF numbers;
    private booleanP boolean_p;
    private Var var;
    private Expression expression;
    private Math math;

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


    @Override
    public String toString() {
        if(this.numbers!=null){
            return "Expression{" +
                    "numbers=" + numbers +"} \n";
        }
        if(this.var!=null){
            return "Expression{" +
                    "var=" + var +'}';
        }
        if(this.boolean_p!=null){
            return "Expression{" +
                    "boolean_p=" + boolean_p+"} \n";
        }
        if(this.math!=null){
            return "Expression{" +
                    "math=" + math+"} \n";
        }

        return "Expression{" +
                "expression=" + expression +
                "} \n";
    }
}
