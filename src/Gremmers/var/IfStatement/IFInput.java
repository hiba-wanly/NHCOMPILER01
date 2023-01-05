package Gremmers.var.IfStatement;

import Gremmers.AST;
import Gremmers.var.Expression.Conditions;

import java.util.ArrayList;
import java.util.List;

public class IFInput extends AST {
    private String ifif;
    private List<Conditions> cond = new ArrayList<Conditions>() ;
    private IFIF ifatr ;

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

    @Override
    public String toString() {
        return "IFInput{" +
                "ifif='" + ifif + '\'' +
                ", cond=" + cond +
                ", ifatr=" + ifatr +
                '}';
    }
}
