package Gremmers.var.TryCatchStatement;

import Gremmers.AST;
import Gremmers.var.Input;

import java.util.ArrayList;
import java.util.List;

public class TryCatchStatement extends AST {
    private String tryy;
    private List<Input> inp = new ArrayList<Input>();
    private String catchh;
    private String idd;
    private ArrayList<Input> inp2;
    private int linenum;
    private int childrennum;

    public String getTryy() {
        return tryy;
    }

    public void setTryy(String tryy) {
        this.tryy = tryy;
    }

    public List<Input> getInp() {
        return inp;
    }

    public void setInp(List<Input> inp) {
        this.inp=inp;
    }

    public String getCatchh() {
        return catchh;
    }

    public void setCatchh(String catchh) {
        this.catchh = catchh;
    }

    public String getIdd() {
        return idd;
    }

    public void setIdd(String idd) {
        this.idd = idd;
    }

    public ArrayList<Input> getInp2() {
        return inp2;
    }

    public void setInp2(ArrayList<Input> inp2) {
        this.inp2 = inp2;
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
        return "TryCatchStatement{" +
                "tryy='" + tryy + '\'' +
                ", inp=" + inp +
                ", catchh='" + catchh + '\'' +
                ", idd='" + idd + '\'' +
                ", inp2=" + inp2
                + "line:"+linenum+"children:"+childrennum
                +
                "\n";
    }
}
