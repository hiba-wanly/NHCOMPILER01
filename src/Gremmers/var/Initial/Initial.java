package Gremmers.var.Initial;

import Gremmers.AST;
import Gremmers.array.ArrayType;

public class Initial extends AST {
    private varVariable varvariable;
    private varVariableExpr varvariableexpr;
    private varVariableEmp varvariableemp;

    private varVariableString varvariableString;

    private ArrayType arrayType;
    private int linenum;
    private int childrennum;
    public void setVarvariable(varVariable varvariable){
//        System.out.println("addvarr");
        this.varvariable = varvariable;
    }
    public varVariable getVarvariable(){
        return varvariable;
    }
    public void setVarvariableexpr(varVariableExpr varvariableexpr){
        this.varvariableexpr = varvariableexpr;
    }
    public varVariableExpr getVarvariableexpr(){
        return varvariableexpr;
    }
    public void setVarvariableemp(varVariableEmp varvariableemp){
        this.varvariableemp = varvariableemp;
    }
    public varVariableEmp getVarvariableemp(){
        return varvariableemp;
    }

    public void setVarvariableString(varVariableString varvariableString){
        this.varvariableString = varvariableString;
    }
    public varVariableString getVarvariableString(){
        return varvariableString;
    }

    public void setArrayType(ArrayType arrayType){
        this.arrayType = arrayType;
    }
    public ArrayType getArrayType(){
        return arrayType;
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
         if (this.varvariable != null)
            return "\n Body Classes {"+ varvariable
                    + "line:"+linenum+"children:"+childrennum
                    +"\n";
         else if (this.varvariableemp != null)
             return "\n Body Classes {"+ varvariableemp
                     + "line:"+linenum+"children:"+childrennum
                     +"\n";
         else if (this.varvariableexpr != null)
             return "\n Body Classes {"+ varvariableexpr
                     + "line:"+linenum+"children:"+childrennum
                     +"\n";
//          if (this.varvariableString != null)
          else if (this.varvariableString!=null)
              return "\n Body Classes {"+ varvariableString
                      + "line:"+linenum+"children:"+childrennum
                      +"\n";
          return "\n Body Classes{"+arrayType
                  + "line:"+linenum+"children:"+childrennum
                  +"\n";
//        return "Initial{" +
//                "varvariable=" + varvariable +
//                ", varvariableexpr=" + varvariableexpr +
//                ", varvariableemp=" + varvariableemp +
//                ", varvariableString=" + varvariableString +
//                ", arrayType=" + arrayType +
//                '}';
    }
}
