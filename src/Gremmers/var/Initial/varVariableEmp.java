package Gremmers.var.Initial;

import Gremmers.AST;
import Gremmers.NameN;

public class varVariableEmp extends AST {
    private  String type;

    private  NameN id ;
    private int linenum;
    private int childrennum;

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
        return "varVariableEmp{" +
                "type='" + type + '\'' +
                ", id='" + id + '\''
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
