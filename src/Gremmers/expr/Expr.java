package Gremmers.expr;

import Gremmers.AST;

public class Expr extends AST {
    private Multiplication multiplication;
    private Addition addition;
    private Subtraction subtraction;
    private Division division;
    private Identifier identifier;
    private IntegerII integer;


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

    @Override
    public String toString() {
        if(this.multiplication!=null){
          return "Expr{multiplication" +multiplication+"}\n";
        }
        if(this.addition!=null){
            return "Expr{addition" +addition+"}\n";
        }
         if(this.subtraction!=null){
             return "Exp{subtraction"+subtraction+"}\n";
         }
         if(this.division!=null){
             return "Exp{division"+division +"}\n";
         }
        if(this.identifier!=null){
            return "Exp{identifier"+identifier+"}\n";
        }
        return "Exp{integer"+integer +"}\n";

    }
}
