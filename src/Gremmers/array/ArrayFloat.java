package Gremmers.array;

import Gremmers.AST;
import Gremmers.NameN;

public class ArrayFloat extends AST {
    private String flot;
    private NameN id;
    private ArrayVarFloat arrayVarFloat;
    private int linenum;
    private int childrennum;
    public void setVar(String flot){
        this.flot = flot;
    }
    public String getVar(){
        return flot;
    }

    public void setId(NameN id){
        this.id = id;
    }
    public NameN getId(){
        return id;
    }

    public void setArrayVarFloat(ArrayVarFloat arrayVarFloat){
        this.arrayVarFloat = arrayVarFloat;
    }
    public ArrayVarFloat getArrayVarFloat(){
        return arrayVarFloat;
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
        return "ArrayFloat{" +
                "flot='" + flot + '\'' +
                ", id=" + id +
                ", arrayVarFloat=" + arrayVarFloat +
                "line:"+linenum+"children:"+childrennum+
                "}\n";
    }
}
