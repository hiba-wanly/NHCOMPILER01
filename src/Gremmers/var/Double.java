package Gremmers.var;

import Gremmers.AST;

public class Double extends AST {
    private String dou;
    private int linenum;
    private int childrennum;
//    public Double(String dou){
//        this.dou=dou;
//    }
    public void setDouble(String dou){
        this.dou=dou;
    }

    public String getDouble(){
        return dou;
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
        return "Double{" +
                "dou='" + dou + '\''
                + "line:"+linenum+"children:"+childrennum
                +
                "\n";
    }
}
