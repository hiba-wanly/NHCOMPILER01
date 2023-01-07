package Gremmers.functions;

import Gremmers.AST;

public class ReturnStatement extends AST {
    private ReturnType returnType;
    private int linenum;
    private int childrennum;
    public ReturnType getReturnType() {
        return returnType;
    }

    public void setReturnType(ReturnType returnType) {
        this.returnType = returnType;
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
        return "ReturnStatement{" +
                "returnType=" + returnType
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
