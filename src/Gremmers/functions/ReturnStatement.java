package Gremmers.functions;

import Gremmers.AST;

public class ReturnStatement extends AST {
    private ReturnType returnType;

    public ReturnType getReturnType() {
        return returnType;
    }

    public void setReturnType(ReturnType returnType) {
        this.returnType = returnType;
    }

    @Override
    public String toString() {
        return "ReturnStatement{" +
                "returnType=" + returnType +
                "} \n";
    }
}
