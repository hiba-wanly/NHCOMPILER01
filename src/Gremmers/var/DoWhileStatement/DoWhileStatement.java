package Gremmers.var.DoWhileStatement;

import Gremmers.AST;
import Gremmers.var.Input;
import Gremmers.var.WhileStatement.WhileStatement;

import java.util.ArrayList;
import java.util.List;

public class DoWhileStatement extends AST {
    private String doo;
    private List<Input> inn =new ArrayList<Input>();
    private WhileStatement whileStatement;
    private int linenum;
    private int childrennum;
    public String getDoo() {
        return doo;
    }

    public void setDoo(String doo) {
        this.doo = doo;
    }

    public List<Input> getInn() {
        return inn;
    }

    public void setInn(List<Input> inn) {
        this.inn=inn;
    }

    public WhileStatement getWhileStatement() {
        return whileStatement;
    }

    public void setWhileStatement(WhileStatement whileStatement) {
        this.whileStatement = whileStatement;
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
        return "DoWhileStatement{" +
                "doo='" + doo + '\'' +
                ", inn=" + inn +
                ", whileStatement=" + whileStatement
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
