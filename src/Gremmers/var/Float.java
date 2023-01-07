package Gremmers.var;
import Gremmers.AST;

public class Float extends AST{
    private String FLOAT;
    private int linenum;
    private int childrennum;

    public void setFLOAT(String FLOAT){
        this.FLOAT=FLOAT;
    }

    public String getFLOAT(){
        return FLOAT;
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
        return "Float{" +
                "FLOAT='" + FLOAT + '\''
                + "line:"+linenum+"children:"+childrennum
                +
                "\n";
    }
}
