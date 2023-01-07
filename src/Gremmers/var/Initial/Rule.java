package Gremmers.var.Initial;

import Gremmers.AST;

public class Rule extends AST {
    private String id;
    private String num ;
    private int linenum;
    private int childrennum;
    public void setId(String id ){
        this.id = id;
    }
    public void setNum(String num){
        this.num = num;
    }

    public String getId(){
        return id;
    }
    public String getNum(){
        return num;
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
        if(this.id!=null){
            return "Rule{" +
                    "id='" + id + '\''
                    + "line:"+linenum+"children:"+childrennum
                    + "} \n";
        }
        return "Rule{" +
                "num='" + num
                + "line:"+linenum+"children:"+childrennum
                + '\'' +
                "} \n";
    }
}
