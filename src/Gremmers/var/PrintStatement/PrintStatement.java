package Gremmers.var.PrintStatement;

import Gremmers.AST;

public class PrintStatement extends AST {
    private PrintIdNum prindidnum;
    private PrintText printtext;

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

    @Override
    public String toString() {
        if(this.prindidnum!=null){
            return "PrintStatement{" +
                    "prindidnum=" + prindidnum + '}';
        }
        return "PrintStatement{" +
                ", printtext=" + printtext +
                '}';
    }
}
