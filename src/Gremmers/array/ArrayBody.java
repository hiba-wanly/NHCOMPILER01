package Gremmers.array;

import Gremmers.AST;

public class ArrayBody extends AST {
    private ArrayVarInt arrayVarInt;
    private ArrayVarFloat arrayVarFloat;
    private ArrayVarString arrayVarString;

    private int linenum;
    private int childrennum;


    public void setArrayVarInt(ArrayVarInt arrayVarInt){
        this.arrayVarInt = arrayVarInt;
    }
    public ArrayVarInt getArrayVarInt(){
        return arrayVarInt;
    }
    public void setArrayVarFloat(ArrayVarFloat arrayVarFloat){
        this.arrayVarFloat = arrayVarFloat;
    }
    public ArrayVarFloat getArrayVarFloat(){
        return arrayVarFloat;
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
        if(this.arrayVarString != null){
            return "\n ArrayBody{"+arrayVarString +"line:"+linenum+"children:"+childrennum+ " } \n";
        } else if (this.arrayVarFloat != null) {
            return "\n ArrayBody{" +arrayVarFloat +"line:"+linenum+"children:"+childrennum+"} \n";
        }
        return "\n ArrayBody{" + arrayVarInt
                + "line:"+linenum+"children:"+childrennum
                +"} \n";
//        return "ArrayBody{" +
//                "arrayVarInt=" + arrayVarInt +
//                ", arrayVarFloat=" + arrayVarFloat +
//                ", arrayVarString=" + arrayVarString +
//                '}';
    }
}
