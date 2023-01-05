package Gremmers.var.Expression;

import Gremmers.AST;

public class NestedLogic extends AST {
    private String LOGIC_SIGNS;
    private BoolExpresions boolExpresion;

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

    @Override
    public String toString() {
        return "NestedLogic{" +
                "LOGIC_SIGNS='" + LOGIC_SIGNS + '\'' +
                ", boolExpresion=" + boolExpresion +
                '}';
    }
}
