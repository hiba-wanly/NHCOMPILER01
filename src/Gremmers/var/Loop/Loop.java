package Gremmers.var.Loop;

import Gremmers.AST;

public class Loop extends AST {
    private ForLoop forloop;
    private int linenum;
    private int childrennum;
    public void setForloop(ForLoop forloop){
        this.forloop = forloop;
    }
    public ForLoop getForloop(){
        return forloop;
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
        return "Loop{" +
                "forloop=" + forloop
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
