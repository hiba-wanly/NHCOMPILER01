package Gremmers.array;

import Gremmers.AST;
import Gremmers.NameN;

public class ArrayString extends AST {
    private String string;
    private NameN id;
    private ArrayVarString arrayVarString;

    private int linenum;
    private int childrennum;
    public void setVar(String string){
        this.string = string;
    }
    public String getVar(){
        return string;
    }

    public void setId(NameN id){
        this.id = id;
    }
    public NameN getId(){
        return id;
    }

    public void setArrayVarString(ArrayVarString arrayVarString){
        this.arrayVarString = arrayVarString;
    }
    public ArrayVarString getArrayVarString(){
        return arrayVarString;
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
        return "ArrayString{" +
                "string='" + string + '\'' +
                ", id='" + id + '\'' +
                ", arrayVarString=" + arrayVarString +
                "line:"+linenum+"children:"+childrennum+
                "} \n";
    }
}
