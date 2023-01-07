package Gremmers.array;

import Gremmers.AST;

import java.util.ArrayList;

public class ArrayVarFloat extends AST {
    private ArrayList<String> FLOAT;
    private int linenum;
    private int childrennum;
    public ArrayVarFloat() {
        this.FLOAT = new ArrayList<>();
    }

    public void addChild(String elem){
        this.FLOAT.add(elem);
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
        return "ArrayVarFloat{" +
                "FLOAT=" + FLOAT +
                "line:"+linenum+"children:"+childrennum+
                "} \n";
    }
}
