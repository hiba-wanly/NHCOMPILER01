package Gremmers.array;

import Gremmers.AST;
import Gremmers.NameN;

public class ArrayVar extends AST {
    private String var;
    private NameN id;
    private ArrayBody arraybody;

    public void setVar(String var){
        this.var = var;
    }
    public String getVar(){
        return var;
    }

    public void setId(NameN id){
        this.id = id;
    }
    public NameN getId(){
        return id;
    }

    public void setArraybody(ArrayBody arraybody){
        this.arraybody = arraybody;
    }
    public ArrayBody getArraybody(){
        return arraybody;
    }


    @Override
    public String toString() {
        return "ArrayVar{" +
                "var='" + var + '\'' +
                ", id='" + id + '\'' +
                ", arraybody=" + arraybody +
                '}';
    }
}
