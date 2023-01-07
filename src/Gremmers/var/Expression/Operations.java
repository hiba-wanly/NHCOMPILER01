package Gremmers.var.Expression;

import Gremmers.AST;

public class Operations extends AST {
    private String PLUS;
    private String MINUS;
    private String MULTI;
    private String DIVIDE;
    private int linenum;
    private int childrennum;
    public String getPLUS() {
        return PLUS;
    }

    public void setPLUS(String PLUS) {
        this.PLUS = PLUS;
    }

    public String getMINUS() {
        return MINUS;
    }

    public void setMINUS(String MINUS) {
        this.MINUS = MINUS;
    }

    public String getMULTI() {
        return MULTI;
    }

    public void setMULTI(String MULTI) {
        this.MULTI = MULTI;
    }

    public String getDIVIDE() {
        return DIVIDE;
    }

    public void setDIVIDE(String DIVIDE) {
        this.DIVIDE = DIVIDE;
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
        if(this.PLUS!=null){
            return "Operations{" +
                    "PLUS='" + PLUS + '\''
                    + "line:"+linenum+"children:"+childrennum
                    +"} \n";
        }
        if(this.MINUS!=null){
            return "Operations{" +
                    "MINUS='" + MINUS + '\''
                    + "line:"+linenum+"children:"+childrennum
                    +"} \n";
        }
        if(this.MULTI!=null){
            return "Operations{" +
                    ", MULTI='" + MULTI + '\''
                    + "line:"+linenum+"children:"+childrennum
                    +"} \n";
        }
        return "Operations{" +
                ", DIVIDE='" + DIVIDE
                + "line:"+linenum+"children:"+childrennum
                + '\'' +
                "} \n";
    }
}
