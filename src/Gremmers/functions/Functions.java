package Gremmers.functions;

import Gremmers.AST;

public class Functions extends AST {

    private FunWithArg funWithArg;
    private FunWithoutArg funWithoutArg;
    private VoidWithArg voidWithArg;
    private VoidWithoutArg voidWithoutArg;

    private int linenum;
    private int childrennum;
    public FunWithArg getFunWithArg() {
        return funWithArg;
    }

    public void setFunWithArg(FunWithArg funWithArg) {
        this.funWithArg = funWithArg;
    }

    public FunWithoutArg getFunWithoutArg() {
        return funWithoutArg;
    }

    public void setFunWithoutArg(FunWithoutArg funWithoutArg) {
        this.funWithoutArg = funWithoutArg;
    }

    public VoidWithArg getVoidWithArg() {
        return voidWithArg;
    }

    public void setVoidWithArg(VoidWithArg voidWithArg) {
        this.voidWithArg = voidWithArg;
    }

    public VoidWithoutArg getVoidWithoutArg() {
        return voidWithoutArg;
    }

    public void setVoidWithoutArg(VoidWithoutArg voidWithoutArg) {
        this.voidWithoutArg = voidWithoutArg;
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
        if(this.funWithArg!=null){
            return "Functions{" +
                    "funWithArg=" + funWithArg
                    + "line:"+linenum+"children:"+childrennum
                    +"} \n";
        }
        if(this.funWithoutArg!=null){
            return "Functions{" +
                    ", funWithoutArg="
                    + "line:"+linenum+"children:"+childrennum
                    + funWithoutArg +"} \n";
        }
        if(this.voidWithArg!=null){
            return "Functions{" +
                    "voidWithArg="
                    + "line:"+linenum+"children:"+childrennum
                    + voidWithArg +"} \n";
        }
        return "Functions{" +
                ", voidWithoutArg="
                + "line:"+linenum+"children:"+childrennum
                + voidWithoutArg +
                "} \n";
    }
}
