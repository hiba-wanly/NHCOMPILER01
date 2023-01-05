package Gremmers.prog;
import Gremmers.AST;
import Gremmers.functions.Functions;

public class Body extends AST{
    private Classes classes;
    private Functions functions;


    public void setClasses(Classes classes){
//        System.out.println("addclass");
        this.classes = classes;
    }

    public Classes getClasses(){
        return classes;
    }

    public void setFunctions(Functions functions){
        this.functions = functions;
    }

    public Functions getFunctions(){
        return functions;
    }

    @Override
    public String toString() {
        if(this.classes != null)
            return "\n Body Classes {"+ classes+"}\n";
//        else if (this.functions != null)
        return "\n Body Classes {"+ functions+"}\n";

//        return "Body{" +
//                "classes=" + classes +
//                ", functions=" + functions +
//                '}';
    }
}
