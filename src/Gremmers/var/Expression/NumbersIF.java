package Gremmers.var.Expression;

import Gremmers.AST;
import Gremmers.var.Float;
import Gremmers.var.IntI;

public class NumbersIF extends AST {


    private IntI ii;
    private Float ff;
    private int linenum;
    private int childrennum;
    public void setIi(IntI ii){
        this.ii = ii;
    }
    public void setFf(Float ff){
        this.ff = ff;
    }
    public IntI getInt(){
        return ii;
    }
    public Float getFf(){
        return  ff;
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
        if(this.ii!=null){
            return "NumbersIF{" +
                    "ii=" + ii
                    + "line:"+linenum+"children:"+childrennum
                    +"} \n";
        }
        return "NumbersIF{" +
                "ff=" + ff
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
