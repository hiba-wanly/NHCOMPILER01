package Gremmers.var.Initial;

import Gremmers.AST;
import Gremmers.NameN;

public class varVariable extends AST {

    private  String type;

    private  NameN id ;
    private  String value ;
    private int linenum;
    private int childrennum;

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
        return "varVariable{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", value='" + value + '\''
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
