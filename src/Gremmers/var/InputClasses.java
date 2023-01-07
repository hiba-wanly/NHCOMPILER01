package Gremmers.var;

import Gremmers.AST;
import Gremmers.functions.Functions;
import Gremmers.var.Initial.Initial;

public class InputClasses extends AST {

    private Initial initial;
    private Functions fun;

    private int linenum;
    private int childrennum;




    public void setInitial(Initial initial){
//        System.out.println("addiniti");
        this.initial = initial;
    }
    public Initial getInitial(){
        return initial;
    }

    public void setFun(Functions fun){
        this.fun = fun;
    }
    public Functions getFun(){
        return fun;
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
        if (this.initial != null)
            return "\n Body Classes {"+ initial
                    + "line:"+linenum+"children:"+childrennum
                    +"\n";


        return "\n Body Classes {"+ fun
                + "line:"+linenum+"children:"+childrennum
                +"\n";

    }
}

