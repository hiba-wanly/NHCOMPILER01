package Gremmers.var.IfStatement;

import Gremmers.AST;

public class ElseInput extends AST {
    private String elsee;
    private IFIF ifif ;
    private int linenum;
    private int childrennum;
    public String getElsee() {
        return elsee;
    }

    public void setElsee(String elsee) {
        this.elsee = elsee;
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
        return "ElseInput{" +
                "elsee='" + elsee + '\'' +
                ", ifif=" + ifif
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
