package Gremmers.var.Initial;

import Gremmers.AST;
import Gremmers.NameN;

public class varVariableEmp extends AST {
    private  String type;

    private  NameN id ;


    public void setVarVaiableType(String type){
        this.type = type;
    }

    public void setVarVaiableId(NameN id){
        this.id = id;
    }

    public String getVarVaiabletype(){
        return type;
    }
    public NameN getVarVaiableid(){
        return id;
    }


    @Override
    public String toString() {
        return "varVariableEmp{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
