package Gremmers.array;

import Gremmers.AST;
import Gremmers.NameN;

public class ArrayString extends AST {
    private String string;
    private NameN id;
    private ArrayVarString arrayVarString;

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

    @Override
    public String toString() {
        return "ArrayString{" +
                "string='" + string + '\'' +
                ", id='" + id + '\'' +
                ", arrayVarString=" + arrayVarString +
                '}';
    }
}
