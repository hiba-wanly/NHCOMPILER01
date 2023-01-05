package Gremmers.array;

import Gremmers.AST;
import Gremmers.NameN;

public class ArrayInt extends AST {

    private String intt;
    private NameN id;
    private ArrayVarInt arrayVarInt;

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

    @Override
    public String toString() {
        return "ArrayInt{" +
                "intt='" + intt + '\'' +
                ", id='" + id + '\'' +
                ", arrayVarInt=" + arrayVarInt +
                '}';
    }
}
