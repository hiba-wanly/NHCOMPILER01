package Gremmers.array;

import Gremmers.AST;

public class ArrayType extends AST {

    private ArrayVar arrayvar;

    private ArrayInt arrayint ;

    private ArrayString arraystring;

    private ArrayFloat arrayfloat;

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

    @Override
    public String toString() {
        if(this.arrayvar!=null)
            return "\n ArrayVar{"+arrayvar+"} \n";
        else if (this.arrayint!=null) {
            return "\n ArrayVar{"+arrayint+"} \n";
        } else if (this.arraystring!=null) {
            return "\n ArrayVar{"+arraystring+"} \n";
        }
        return "\n ArrayVar{"+arrayfloat+"} \n";
//        return "ArrayType{" +
//                "arrayvar=" + arrayvar +
//                ", arrayint=" + arrayint +
//                ", arraystring=" + arraystring +
//                ", arrayfloat=" + arrayfloat +
//                '}';
    }
}
