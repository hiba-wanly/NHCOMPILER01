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
    private int linenum;
    private int childrennum;
    private String left;
private String parentt;
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

    public String getParentt() {
        return parentt;
    }

    public void setParentt(String parentt) {
        this.parentt = parentt;
    }

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    @Override
    public String toString() {
        return "VoidWithoutArg{" +
                "viodd='" + viodd + '\'' +
                ", namee=" + namee +
                ", inp=" + inp
                + "line:"+linenum+"children:"+childrennum
                +"parent:"+parentt+
                "left:" +left
                +"} \n";
    }
}
