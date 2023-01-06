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

    @Override
    public String toString() {
        return "WhileStatement{" +
                "whilee='" + whilee + '\'' +
                ", cond=" + cond +
                ", ifif=" + ifif +
                "\n";
    }
}
