package Gremmers.array;

import Gremmers.AST;

import java.util.ArrayList;

public class ArrayVarString extends AST {
    private ArrayList<String> STRINGS;
    private int linenum;
    private int childrennum;
    public ArrayVarString() {
        this.STRINGS = new ArrayList<>();
    }

    public void addChild(String elem){
        this.STRINGS.add(elem);
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
        return "ArrayVarString{" +
                "STRINGS=" + STRINGS
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
