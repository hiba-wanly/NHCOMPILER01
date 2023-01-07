package Gremmers.var.Expression;

import Gremmers.AST;

public class Conditions extends AST {
    private BoolExpresions boolExpresion;
    private Logic logic;
    private int linenum;
    private int childrennum;

    public BoolExpresions getBoolExpresion() {
        return boolExpresion;
    }

    public void setBoolExpresion(BoolExpresions boolExpresion) {
        this.boolExpresion = boolExpresion;
    }

    public Logic getLogic() {
        return logic;
    }

    public void setLogic(Logic logic) {
        this.logic = logic;
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
            return "Conditions{" +
                    "boolExpresion=" + boolExpresion
                    + "line:"+linenum+"children:"+childrennum
                    +"} \n";
        }
        return "Conditions{" +
                ", logic=" + logic
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
