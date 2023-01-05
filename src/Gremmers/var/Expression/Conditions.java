package Gremmers.var.Expression;

import Gremmers.AST;

public class Conditions extends AST {
    private BoolExpresions boolExpresion;
    private Logic logic;


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

    @Override
    public String toString() {
        if(this.boolExpresion!=null){
            return "Conditions{" +
                    "boolExpresion=" + boolExpresion +'}';
        }
        return "Conditions{" +
                ", logic=" + logic +
                '}';
    }
}
