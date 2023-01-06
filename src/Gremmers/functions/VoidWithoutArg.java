package Gremmers.functions;

import Gremmers.AST;
import Gremmers.NameN;
import Gremmers.var.Input;

import java.util.ArrayList;
import java.util.List;

public class VoidWithoutArg extends AST {

    private String viodd;
    private NameN namee;
    private List<Input> inp = new ArrayList<Input>();

    public String getViodd() {
        return viodd;
    }

    public void setViodd(String viodd) {
        this.viodd = viodd;
    }

    public NameN getNamee() {
        return namee;
    }

    public void setNamee(NameN namee) {
        this.namee = namee;
    }

    public List<Input> getInp() {
        return inp;
    }

    public void setInp(List<Input> inp) {
        this.inp = inp;
    }

    @Override
    public String toString() {
        return "VoidWithoutArg{" +
                "viodd='" + viodd + '\'' +
                ", namee=" + namee +
                ", inp=" + inp +
                "} \n";
    }
}
