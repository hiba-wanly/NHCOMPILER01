package Gremmers.var.Expression;

import Gremmers.AST;

public class Var extends AST {
    private String VARNAME;

    private int linenum;
    private int childrennum;
    public String getVARNAME() {
        return VARNAME;
    }

    public void setVARNAME(String VARNAME) {
        this.VARNAME = VARNAME;
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
        return "Var{" +
                "VARNAME='" + VARNAME
                + "line:"+linenum+"children:"+childrennum
                + '\'' +
                "} \n";
    }
}
