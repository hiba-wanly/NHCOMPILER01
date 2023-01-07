package Gremmers.var.Initial;

import Gremmers.AST;
import Gremmers.NameN;
import Gremmers.expr.Expr;

public class varVariableExpr extends AST {
    private  String type;

    private NameN id ;

    private Expr expr;
    private int linenum;
    private int childrennum;
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
        return "varVariableExpr{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", expr=" + expr
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
