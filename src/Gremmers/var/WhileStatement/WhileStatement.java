package Gremmers.var.WhileStatement;

import Gremmers.AST;
import Gremmers.var.Expression.Conditions;
import Gremmers.var.IfStatement.IFIF;

import java.util.ArrayList;
import java.util.List;

public class WhileStatement extends AST {

    private String whilee;
    private List<Conditions> cond=new ArrayList<Conditions>();
    private IFIF ifif ;
    private int linenum;
    private int childrennum;

    public String getWhilee() {
        return whilee;
    }

    public void setWhilee(String whilee) {
        this.whilee = whilee;
    }

    public List<Conditions> getCond() {
        return cond;
    }

    public void setCond(List<Conditions> cond) {
        this.cond=cond;
    }

    public IFIF getIfif() {
        return ifif;
    }

    public void setIfif(IFIF ifif) {
        this.ifif = ifif;
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
        return "WhileStatement{" +
                "whilee='" + whilee + '\'' +
                ", cond=" + cond +
                ", ifif=" + ifif
                + "line:"+linenum+"children:"+childrennum
                +
                "\n";
    }
}
