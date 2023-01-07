package Gremmers.array;

import Gremmers.AST;

import java.util.ArrayList;
import java.util.List;

public class ArrayVarInt extends AST {
    private ArrayList<String> integers;
    private int linenum;
    private int childrennum;

    public ArrayVarInt() {
        this.integers = new ArrayList<>();
    }

    public void addChild(String elem){
        this.integers.add(elem);
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
        return "ArrayVarInt{" +
                "integers=" + integers +
                "line:"+linenum+"children:"+childrennum+
                "} \n";
    }
}
