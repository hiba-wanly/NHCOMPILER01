package Gremmers.var.Expression;

import Gremmers.AST;

public class Math extends AST {
    private Var var1;
    private Var var2;
    private Operations operation;
    private NumbersIF numbers1;
    private NumbersIF numbers2;
    private int linenum;
    private int childrennum;

    public Var getVar1() {
        return var1;
    }

    public void setVar1(Var var1) {
        this.var1 = var1;
    }

    public Var getVar2() {
        return var2;
    }

    public void setVar2(Var var2) {
        this.var2 = var2;
    }

    public Operations getOperation() {
        return operation;
    }

    public void setOperation(Operations operation) {
        this.operation = operation;
    }

    public NumbersIF getNumbers1() {
        return numbers1;
    }

    public void setNumbers1(NumbersIF numbers1) {
        this.numbers1 = numbers1;
    }

    public NumbersIF getNumbers2() {
        return numbers2;
    }

    public void setNumbers2(NumbersIF numbers2) {
        this.numbers2 = numbers2;
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
        if(this.var1!=null && this.var2!=null){
            return "Math{" +
                    "var1=" + var1 +
                    ", operation=" + operation +
                    ", var2=" + var2
                    + "line:"+linenum+"children:"+childrennum
                    +
                    "} \n";
        }
        if(this.numbers1!=null && this.numbers2!=null){
            return "Math{" +
                    "numbers1=" + numbers1 +
                    ", operation=" + operation +
                    ", numbers2=" + numbers2
                    + "line:"+linenum+"children:"+childrennum
                    +
                    "} \n";
        }
        if(this.var1!=null && this.numbers2!=null){
            return "Math{" +
                    "var1=" + var1 +
                    ", operation=" + operation +
                    ", numbers2=" + numbers2
                    + "line:"+linenum+"children:"+childrennum
                    +
                    "} \n";
        }
        return "Math{" +
                ", numbers1=" + numbers1 +
                ", operation=" + operation +
                ", var2=" + var2
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
