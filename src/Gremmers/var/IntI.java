package Gremmers.var;

import Gremmers.AST;

public class IntI extends AST {
    private String intt;
    private int linenum;
    private int childrennum;

    public void setIntt(String intt){
        this.intt=intt;
    }

    public String getIntt(){
        return intt;
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
        return "IntI{" +
                "intt='" + intt + '\''
                + "line:"+linenum+"children:"+childrennum
                +
                "\n";
    }
}
