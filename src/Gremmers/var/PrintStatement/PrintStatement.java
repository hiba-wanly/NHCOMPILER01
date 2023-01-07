package Gremmers.var.PrintStatement;

import Gremmers.AST;

public class PrintStatement extends AST {
    private PrintIdNum prindidnum;
    private PrintText printtext;
    private int linenum;
    private int childrennum;
    public void setPrindidnum(PrintIdNum prindidnum){
        this.prindidnum = prindidnum;
    }
    public void setPrindText(PrintText printtext){
        this.printtext = printtext;
    }
    public PrintIdNum getPrindidnum(){
       return prindidnum;
    }
    public PrintText getPrindText(){
        return printtext;
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
        if(this.prindidnum!=null){
            return "PrintStatement{" +
                    "prindidnum=" + prindidnum
                    + "line:"+linenum+"children:"+childrennum
                    + "} \n";
        }
        return "PrintStatement{" +
                ", printtext=" + printtext
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
