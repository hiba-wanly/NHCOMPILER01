package Gremmers.var.SwitchStatement.Case;

import Gremmers.AST;
import Gremmers.var.Input;

import java.util.ArrayList;
import java.util.List;

public class CaseWithID extends AST {
    private String casee;
    private String inputt;
    private List<Input> inp = new ArrayList<Input>();
    private String breakk;

    public String getCasee() {
        return casee;
    }

    public void setCasee(String casee) {
        this.casee = casee;
    }

    public String getInputt() {
        return inputt;
    }

    public void setInputt(String inputt) {
        this.inputt = inputt;
    }

    public List<Input> getInp() {
        return inp;
    }

    public void setInp(List<Input> inp) {
        this.inp = inp;
    }

    public String getBreakk() {
        return breakk;
    }

    public void setBreakk(String breakk) {
        this.breakk = breakk;
    }

    @Override
    public String toString() {
        return "CaseWithID{" +
                "casee='" + casee + '\'' +
                ", inputt='" + inputt + '\'' +
                ", inp=" + inp +
                ", breakk='" + breakk + '\'' +
                "\n";
    }
}
