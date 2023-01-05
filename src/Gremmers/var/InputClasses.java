package Gremmers.var;

import Gremmers.AST;
import Gremmers.functions.Functions;
import Gremmers.var.Initial.Initial;

public class InputClasses extends AST {

    private Initial initial;
    private Functions fun;





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

    @Override
    public String toString() {
        if (this.initial != null)
            return "\n Body Classes {"+ initial+"\n";


        return "\n Body Classes {"+ fun+"\n";

    }
}

