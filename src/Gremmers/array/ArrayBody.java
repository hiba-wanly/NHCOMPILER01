package Gremmers.array;

import Gremmers.AST;

public class ArrayBody extends AST {
    private ArrayVarInt arrayVarInt;
    private ArrayVarFloat arrayVarFloat;
    private ArrayVarString arrayVarString;

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

    @Override
    public String toString() {
        if(this.arrayVarString != null){
            return "\n ArrayBody{"+arrayVarString + " } \n";
        } else if (this.arrayVarFloat != null) {
            return "\n ArrayBody{" +arrayVarFloat +"} \n";
        }
        return "\n ArrayBody{" + arrayVarInt+"} \n";
//        return "ArrayBody{" +
//                "arrayVarInt=" + arrayVarInt +
//                ", arrayVarFloat=" + arrayVarFloat +
//                ", arrayVarString=" + arrayVarString +
//                '}';
    }
}
