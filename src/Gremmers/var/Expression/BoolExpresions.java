package Gremmers.var.Expression;

import Gremmers.AST;

public class BoolExpresions extends AST {
    private Expression expression1;
    private String BOOLEAN_SIGNS;
    private Expression expression2;
    private BoolExpresions boolExpresion;
    private int linenum;
    private int childrennum;

    public Expression getExpression1() {
        return expression1;
    }

    public void setExpression1(Expression expression1) {
        this.expression1 = expression1;
    }

    public String getBOOLEAN_SIGNS() {
        return BOOLEAN_SIGNS;
    }

    public void setBOOLEAN_SIGNS(String BOOLEAN_SIGNS) {
        this.BOOLEAN_SIGNS = BOOLEAN_SIGNS;
    }

    public Expression getExpression2() {
        return expression2;
    }

    public void setExpression2(Expression expression2) {
        this.expression2 = expression2;
    }

    public BoolExpresions getBoolExpresion() {
        return boolExpresion;
    }

    public void setBoolExpresion(BoolExpresions boolExpresion) {
        this.boolExpresion = boolExpresion;
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
        if(this.boolExpresion!=null){
            return "BoolExpresions{boolExpresion" +boolExpresion
                    + "line:"+linenum+"children:"+childrennum
                    +"} \n";
        }
        return "BoolExpresions{" +
                "expression1=" + expression1 +
                ", BOOLEAN_SIGNS='" + BOOLEAN_SIGNS + '\'' +
                ", expression2=" + expression2
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
