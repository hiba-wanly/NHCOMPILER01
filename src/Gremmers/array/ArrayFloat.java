package Gremmers.array;

import Gremmers.AST;
import Gremmers.NameN;

public class ArrayFloat extends AST {
    private String flot;
    private NameN id;
    private ArrayVarFloat arrayVarFloat;

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

    @Override
    public String toString() {
        return "ArrayFloat{" +
                "flot='" + flot + '\'' +
                ", id=" + id +
                ", arrayVarFloat=" + arrayVarFloat +
                "}\n";
    }
}
