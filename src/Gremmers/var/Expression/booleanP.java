package Gremmers.var.Expression;

import Gremmers.AST;

public class booleanP extends AST {

    private String TRUE;

    private String FALSE;
    private int linenum;
    private int childrennum;
    public String getTRUE() {
        return TRUE;
    }

    public void setTRUE(String TRUE) {
        this.TRUE = TRUE;
    }

    public String getFALSE() {
        return FALSE;
    }

    public void setFALSE(String FALSE) {
        this.FALSE = FALSE;
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
        if(this.TRUE!=null){
            return "booleanP{" +
                    "TRUE='" + TRUE + '\'' +  "line:"+linenum+"children:"+childrennum+
            "} \n";
        }
        return "booleanP{" +
                ", FALSE='" + FALSE
                + "line:"+linenum+"children:"+childrennum
                + '\'' +
                "} \n";
    }
}
