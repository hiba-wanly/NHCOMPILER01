package Gremmers.var.IfStatement;

import Gremmers.AST;
import Gremmers.var.Expression.Conditions;

import java.util.ArrayList;
import java.util.List;

public class ElseIfInput extends AST {
    private String elseif;
    private List<Conditions> cond=new ArrayList<Conditions>() ;
    private IFIF ifatr ;

    public String getElseif() {
        return elseif;
    }

    public void setElseif(String elseif) {
        this.elseif = elseif;
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

    @Override
    public String toString() {
        return "ElseIfInput{" +
                "elseif='" + elseif + '\'' +
                ", cond=" + cond +
                ", ifatr=" + ifatr +
                '}';
    }
}
