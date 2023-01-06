package Gremmers.var.Initial;

import Gremmers.AST;
import Gremmers.NameN;
import Gremmers.expr.Expr;

public class varVariableExpr extends AST {
    private  String type;

    private NameN id ;

    private Expr expr;

    public void setVarVaiableType(String type){
        this.type = type;
    }

    public void setVarVaiableId(NameN id){
        this.id = id;
    }


    public void setVarVaiableExpr(Expr expr){
        this.expr = expr;
    }

    public String getVarVaiabletype(){
        return type;
    }
    public NameN getVarVaiableid(){
        return id;
    }


    public Expr getVarVaiableExpr(){
        return expr;
    }

    @Override
    public String toString() {
        return "varVariableExpr{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", expr=" + expr +
                "} \n";
    }
}
