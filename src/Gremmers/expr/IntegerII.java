package Gremmers.expr;

import Gremmers.AST;

public class IntegerII extends AST {
    private String num ;
    private int linenum;
    private int childrennum;
    public void setIntegerII(String num){
        this.num = num;
    }

    public String getIntegerII(){
        return this.num;
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
        return "Integer{" +
                "num=" + num
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
