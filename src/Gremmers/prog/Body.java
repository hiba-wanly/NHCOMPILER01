package Gremmers.prog;
import Gremmers.AST;
import Gremmers.functions.Functions;

public class Body extends AST{
    private Classes classes;
    private Functions functions;
    private int linenum;
    private int childrennum;

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
        if(this.classes != null)
            return "\n Body Classes {"+ classes                + "line:"+linenum+"children:"+childrennum
                    +"}\n";
//        else if (this.functions != null)
        return "\n Body Classes {"+ functions                + "line:"+linenum+"children:"+childrennum
                +"}\n";

//        return "Body{" +
//                "classes=" + classes +
//                ", functions=" + functions +
//                '}';
    }
}
