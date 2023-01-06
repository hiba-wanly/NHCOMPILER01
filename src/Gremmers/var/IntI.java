package Gremmers.var;

import Gremmers.AST;

public class IntI extends AST {
    private String intt;

    public void setIntt(String intt){
        this.intt=intt;
    }

    public String getIntt(){
        return intt;
    }

    @Override
    public String toString() {
        return "IntI{" +
                "intt='" + intt + '\'' +
                "\n";
    }
}
