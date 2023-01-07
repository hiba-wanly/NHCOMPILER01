package Gremmers.var.PrintStatement;

import Gremmers.AST;

public class PrintIdNum extends AST {
    private String prin;
    private String world;
    private int linenum;
    private int childrennum;
    public void setPrin(String prin){
        this.prin = prin;
    }
    public void setWorld(String world){
        this.world = world;
    }

    public String  getPrin(){
        return prin;
    }
    public String getWorld(){
        return world;
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
        return "PrintIdNum{" +
                "prin='" + prin + '\'' +
                ", world='" + world + '\''
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
