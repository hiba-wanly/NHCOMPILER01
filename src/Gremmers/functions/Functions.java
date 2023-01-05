package Gremmers.functions;

import Gremmers.AST;

public class Functions extends AST {

    private FunWithArg funWithArg;
    private FunWithoutArg funWithoutArg;
    private VoidWithArg voidWithArg;
    private VoidWithoutArg voidWithoutArg;

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


    @Override
    public String toString() {
        if(this.funWithArg!=null){
            return "Functions{" +
                    "funWithArg=" + funWithArg +'}';
        }
        if(this.funWithoutArg!=null){
            return "Functions{" +
                    ", funWithoutArg=" + funWithoutArg +'}';
        }
        if(this.voidWithArg!=null){
            return "Functions{" +
                    "voidWithArg=" + voidWithArg +'}';
        }
        return "Functions{" +
                ", voidWithoutArg=" + voidWithoutArg +
                '}';
    }
}
