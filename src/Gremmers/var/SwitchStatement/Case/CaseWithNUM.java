package Gremmers.var.SwitchStatement.Case;

import Gremmers.AST;
import Gremmers.var.Input;

import java.util.ArrayList;
import java.util.List;

public class CaseWithNUM extends AST {
    private String cass;
    private String numm;
    private List<Input> inp = new ArrayList<Input>();
    private String beakk;

    public String getCass() {
        return cass;
    }

    public void setCass(String cass) {
        this.cass = cass;
    }

    public String getNumm() {
        return numm;
    }

    public void setNumm(String numm) {
        this.numm = numm;
    }

    public List<Input> getInp() {
        return inp;
    }

    public void setInp(List<Input> inp) {
        this.inp = inp;
    }

    public String getBeakk() {
        return beakk;
    }

    public void setBeakk(String beakk) {
        this.beakk = beakk;
    }

    @Override
    public String toString() {
        return "CaseWithNUM{" +
                "cass='" + cass + '\'' +
                ", numm='" + numm + '\'' +
                ", inp=" + inp +
                ", beakk='" + beakk + '\'' +
                "\n";
    }
}
