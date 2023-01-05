package Gremmers.var.Loop;

import Gremmers.AST;

public class Loop extends AST {
    private ForLoop forloop;

    public void setForloop(ForLoop forloop){
        this.forloop = forloop;
    }
    public ForLoop getForloop(){
        return forloop;
    }

    @Override
    public String toString() {
        return "Loop{" +
                "forloop=" + forloop +
                '}';
    }
}
