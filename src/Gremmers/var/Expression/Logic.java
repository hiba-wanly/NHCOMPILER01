package Gremmers.var.Expression;

import Gremmers.AST;

import java.util.ArrayList;

public class Logic extends AST {
    private BoolExpresions boolExpresion;
    private ArrayList<NestedLogic> nestedLogics = new ArrayList<>();
    private Logic logic;
    private ArrayList<NestedLogic2> nestedLogic2s = new ArrayList<>();
    private int linenum;
    private int childrennum;

    public BoolExpresions getBoolExpresion() {
        return boolExpresion;
    }

    public void setBoolExpresion(BoolExpresions boolExpresion) {
        this.boolExpresion = boolExpresion;
    }

    public ArrayList<NestedLogic> getNestedLogics() {
        return nestedLogics;
    }

    public void setNestedLogics(ArrayList<NestedLogic> nestedLogics) {
        this.nestedLogics = nestedLogics;
    }

    public Logic getLogic() {
        return logic;
    }

    public void setLogic(Logic logic) {
        this.logic = logic;
    }

    public ArrayList<NestedLogic2> getNestedLogic2s() {
        return nestedLogic2s;
    }

    public void setNestedLogic2s(ArrayList<NestedLogic2> nestedLogic2s) {
        this.nestedLogic2s = nestedLogic2s;
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
            return "Logic{" +
                    "boolExpresion=" + boolExpresion +
                    ", nestedLogics=" + nestedLogics
                    + "line:"+linenum+"children:"+childrennum
                    +"} \n";
        }
        return "Logic{" +
                ", logic=" + logic +
                ", nestedLogic2s=" + nestedLogic2s
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
