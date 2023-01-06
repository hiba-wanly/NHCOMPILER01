package Gremmers.var.Initial;

import Gremmers.AST;
import Gremmers.NameN;

public class varVariable extends AST {

    private  String type;

    private  NameN id ;
    private  String value ;


    public void setVarVaiableType(String type){
//        System.out.println("addnummm");
        this.type = type;
//        System.out.println(this.type);
    }

    public void setVarVaiableId(NameN id){
        this.id = id;
//        System.out.println(this.id);
    }

    public void setVarVaiableValue(String value){
        this.value = value;
//        System.out.println(this.value);
    }


    public String getVarVaiabletype(){
        return type;
    }
    public NameN getVarVaiableid(){
        return id;
    }
    public String getVarVaiablevalue(){
        return value;
    }

    @Override
    public String toString() {
        return "varVariable{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", value='" + value + '\'' +
                "} \n";
    }
}
