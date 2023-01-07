package Gremmers.var.Expression;

import Gremmers.AST;

public class NestedLogic extends AST {
    private String LOGIC_SIGNS;
    private BoolExpresions boolExpresion;
    private int linenum;
    private int childrennum;
    public String getLOGIC_SIGNS() {
        return LOGIC_SIGNS;
    }

    public void setLOGIC_SIGNS(String LOGIC_SIGNS) {
        this.LOGIC_SIGNS = LOGIC_SIGNS;
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
        return "NestedLogic{" +
                "LOGIC_SIGNS='" + LOGIC_SIGNS + '\'' +
                ", boolExpresion=" + boolExpresion
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
