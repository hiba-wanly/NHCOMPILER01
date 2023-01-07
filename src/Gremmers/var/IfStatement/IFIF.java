package Gremmers.var.IfStatement;

import Gremmers.AST;
import Gremmers.var.Input;

import java.util.ArrayList;
import java.util.List;

public class IFIF extends AST {
    private List<Input> inp =new ArrayList<Input>();
    private String brek;
    private String cont;
    private int linenum;
    private int childrennum;
    public List<Input> getInp() {
        return inp;
    }

    public void setInp(List<Input> inp) {
        this.inp=inp;
    }

    public String getBrek() {
        return brek;
    }

    public void setBrek(String brek) {
        this.brek = brek;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
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
        return "IFIF{" +
                "inp=" + inp +
                ", brek='" + brek + '\'' +
                ", cont='" + cont + '\''
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
