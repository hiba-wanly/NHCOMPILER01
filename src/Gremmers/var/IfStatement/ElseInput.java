package Gremmers.var.IfStatement;

import Gremmers.AST;

public class ElseInput extends AST {
    private String elsee;
    private IFIF ifif ;

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

    @Override
    public String toString() {
        return "ElseInput{" +
                "elsee='" + elsee + '\'' +
                ", ifif=" + ifif +
                '}';
    }
}
