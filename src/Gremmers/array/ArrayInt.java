package Gremmers.array;

import Gremmers.AST;
import Gremmers.NameN;

public class ArrayInt extends AST {

    private String intt;
    private NameN id;
    private ArrayVarInt arrayVarInt;
    private int linenum;
    private int childrennum;
    public void setVar(String intt){
        this.intt = intt;
    }
    public String getVar(){
        return intt;
    }

    public void setId(NameN id){
        this.id = id;
    }
    public NameN getId(){
        return id;
    }

    public void setArrayVarInt(ArrayVarInt arrayVarInt){
        this.arrayVarInt = arrayVarInt;
    }
    public ArrayVarInt getArrayVarInt(){
        return arrayVarInt;
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
        return "ArrayInt{" +
                "intt='" + intt + '\'' +
                ", id='" + id + '\'' +
                ", arrayVarInt=" + arrayVarInt +
                "line:"+linenum+"children:"+childrennum+
                "} \n";
    }
}
