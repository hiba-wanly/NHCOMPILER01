package Gremmers.expr;
import Gremmers.AST;

public class Division extends AST{
    private String num1 ;

    private String m;
    private String num2 ;
    private int linenum;
    private int childrennum;

    public void setNum1(String num1){
        this.num1 = num1;
    }
    public String getNum1(){
        return num1;
    }
    public void setM(String m){
        this.m = m;
    }
    public String getM(){
        return m;
    }

    public void setNum2(String num2){
        this.num2 = num2;
    }
    public String getNum2(){
        return num2;
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
        return "Division{" +
                "num1='" + num1 + '\'' +
                ", m='" + m + '\'' +
                ", num2='" + num2 + '\''
                + "line:"+linenum+"children:"+childrennum

                +
                "} \n";
    }
}
