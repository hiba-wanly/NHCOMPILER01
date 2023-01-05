package Gremmers.var.SwitchStatement;

import Gremmers.AST;
import Gremmers.var.Input;

import java.util.ArrayList;
import java.util.List;

public class DefaultStatement extends AST {
    private String def;
    private List<Input> inp = new ArrayList<Input>();
    private String breakk;

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
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
        return "DefaultStatement{" +
                "def='" + def + '\'' +
                ", inp=" + inp +
                ", breakk='" + breakk + '\'' +
                '}';
    }
}
