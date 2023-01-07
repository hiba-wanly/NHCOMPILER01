package Gremmers.functions;

import Gremmers.AST;
import Gremmers.NameN;

public class ArgumentFunctionType extends AST {
    private String typee;
    private NameN namee;

    private int linenum;
    private int childrennum;

    public String getTypee() {
        return typee;
    }

    public void setTypee(String typee) {
        this.typee = typee;
    }

    public NameN getNamee() {
        return namee;
    }

    public void setNamee(NameN namee) {
        this.namee = namee;
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
        return "ArgumentFunctionType{" +
                "typee='" + typee + '\'' +
                ", namee=" + namee
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
