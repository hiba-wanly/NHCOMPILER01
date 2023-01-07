package Gremmers.var.IfStatement;

import Gremmers.AST;
import Gremmers.var.Expression.Conditions;

import java.util.ArrayList;
import java.util.List;

public class IFInput extends AST {
    private String ifif;
    private List<Conditions> cond = new ArrayList<Conditions>() ;
    private IFIF ifatr ;
    private int linenum;
    private int childrennum;
    public String getIfif() {
        return ifif;
    }

    public void setIfif(String ifif) {
        this.ifif = ifif;
    }

    public List<Conditions> getCond() {
        return cond;
    }

    public void setCond(List<Conditions> cond) {
        this.cond=cond;
    }

    public IFIF getIfatr() {
        return ifatr;
    }

    public void setIfatr(IFIF ifatr) {
        this.ifatr = ifatr;
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
        return "IFInput{" +
                "ifif='" + ifif + '\'' +
                ", cond=" + cond +
                ", ifatr=" + ifatr
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
