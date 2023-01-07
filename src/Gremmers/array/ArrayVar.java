package Gremmers.array;

import Gremmers.AST;
import Gremmers.NameN;

public class ArrayVar extends AST {
    private String var;
    private NameN id;
    private ArrayBody arraybody;
    private int linenum;
    private int childrennum;
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
        return "ArrayVar{" +
                "var='" + var + '\'' +
                ", id='" + id + '\'' +
                ", arraybody=" + arraybody +
                "line:"+linenum+"children:"+childrennum+
                "} \n";
    }
}
