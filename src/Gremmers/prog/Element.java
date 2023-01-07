package Gremmers.prog;
import Gremmers.AST;

public class Element extends AST{
    private Body body;
    private int linenum;
    private int childrennum;
    public Body getBody(){
        return body;
    }

    public void setBody(Body body){
//        System.out.println("addBody");
        this.body = body;
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
        return "Element{" +
                "body=" + body
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }

}
