package Gremmers.var.Expression;

import Gremmers.AST;
import Gremmers.var.Float;
import Gremmers.var.IntI;

public class NumbersIF extends AST {


    private IntI ii;
    private Float ff;

    public void setIi(IntI ii){
        this.ii = ii;
    }
    public void setFf(Float ff){
        this.ff = ff;
    }
    public IntI getInt(){
        return ii;
    }
    public Float fetFf(){
        return  ff;
    }

    @Override
    public String toString() {
        if(this.ii!=null){
            return "NumbersIF{" +
                    "ii=" + ii +"} \n";
        }
        return "NumbersIF{" +
                "ff=" + ff +
                "} \n";
    }
}
