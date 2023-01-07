package Gremmers.array;

import Gremmers.AST;

public class ArrayType extends AST {

    private ArrayVar arrayvar;

    private ArrayInt arrayint ;

    private ArrayString arraystring;

    private ArrayFloat arrayfloat;
    private int linenum;
    private int childrennum;
    public void setArrayVar(ArrayVar arrayvar){
        this.arrayvar = arrayvar;
    }

    public ArrayVar getArrayVar(){
        return arrayvar;
    }

    public void setArrayInt(ArrayInt arrayvar){
        this.arrayint = arrayint;
    }

    public ArrayInt getArrayInt(){
        return arrayint;
    }

    public void setArrayString(ArrayString arraystring){
        this.arraystring = arraystring;
    }

    public ArrayString getArrayString(){
        return arraystring;
    }

    public void setArrayfloat(ArrayFloat arrayfloat){
        this.arrayfloat = arrayfloat;
    }

    public ArrayFloat getArrayFloat(){
        return arrayfloat;
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
        if (this.arrayint!=null) {
            return "\n ArrayVar{"+arrayint+"line:"+linenum+"children:"+childrennum+ "} \n";
        }
        if(this.arrayvar!=null)
            return "\n ArrayVar{"+arrayvar+"line:"+linenum+"children:"+childrennum+ "} \n";

        if (this.arraystring!=null) {
            return "\n ArrayVar{"+arraystring+"line:"+linenum+"children:"+childrennum+ "} \n";
        }
        return "\n ArrayVar{"+arrayfloat+"line:"+linenum+"children:"+childrennum+ "} \n";
//        return "ArrayType{" +
//                "arrayvar=" + arrayvar +
//                ", arrayint=" + arrayint +
//                ", arraystring=" + arraystring +
//                ", arrayfloat=" + arrayfloat +
//                '}';
    }
}
