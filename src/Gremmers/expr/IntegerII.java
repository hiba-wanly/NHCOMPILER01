package Gremmers.expr;

import Gremmers.AST;

public class IntegerII extends AST {
    private String num ;

    public void setIntegerII(String num){
        this.num = num;
    }

    public String getIntegerII(){
        return this.num;
    }

    @Override
    public String toString() {
        return "Integer{" +
                "num=" + num +
                "} \n";
    }
}
