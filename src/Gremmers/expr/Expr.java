package Gremmers.expr;

import Gremmers.AST;

public class Expr extends AST {
    private Multiplication multiplication;
    private Addition addition;
    private Subtraction subtraction;
    private Division division;
    private Identifier identifier;
    private IntegerII integer;
    private int linenum;
    private int childrennum;

    public void setMultiplication(Multiplication multiplication){
        this.multiplication = multiplication;
    }

    public Multiplication getMultiplication(){
        return multiplication;
    }

    public void setAddition(Addition addition){
        this.addition = addition;
    }

    public Addition getAddition(){
        return addition;
    }

    public void setSubtraction(Subtraction subtraction){
        this.subtraction = subtraction;
    }

    public Subtraction getSubtraction(){
        return subtraction;
    }

    public void setDivision(Division division){
        this.division = division;
    }

    public Division getDivision(){
        return division;
    }

    public void setIdentifier(Identifier identifier){
        this.identifier = identifier;
    }

    public Identifier getIdentifier(){
        return identifier;
    }

    public void setInteger(IntegerII integer){
        this.integer = integer;
    }

    public IntegerII getInteger(){
        return integer;
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
        if(this.multiplication!=null){
          return "Expr{multiplication" +multiplication                + "line:"+linenum+"children:"+childrennum
                  +"}\n";
        }
        if(this.addition!=null){
            return "Expr{addition"                 + "line:"+linenum+"children:"+childrennum
                    +addition+"}\n";
        }
         if(this.subtraction!=null){
             return "Exp{subtraction"                + "line:"+linenum+"children:"+childrennum
                     +subtraction+"}\n";
         }
         if(this.division!=null){
             return "Exp{division"                + "line:"+linenum+"children:"+childrennum
                     +division +"}\n";
         }
        if(this.identifier!=null){
            return "Exp{identifier"                + "line:"+linenum+"children:"+childrennum
                    +identifier+"}\n";
        }
        return "Exp{integer"+integer                 + "line:"+linenum+"children:"+childrennum
                +"}\n";

    }
}
