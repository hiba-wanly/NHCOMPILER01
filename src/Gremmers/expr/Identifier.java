package Gremmers.expr;

import Gremmers.AST;

public class Identifier extends AST {
    private String id ;
    private int linenum;
    private int childrennum;
    public void setIdentifier(String id){
        this.id = id;
    }

    public String getIdentifier(){
        return id;
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
        return "Identifier{" +
                "id='" + id + '\''                 + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
