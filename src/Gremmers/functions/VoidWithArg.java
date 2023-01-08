package Gremmers.functions;

import Gremmers.AST;
import Gremmers.NameN;
import Gremmers.var.Input;

import java.util.ArrayList;
import java.util.List;

public class VoidWithArg extends AST {
    private String voidd;
    private NameN namee;
    private List<ArgumentFunctionType> argumentFunctionTypes = new ArrayList<ArgumentFunctionType>();
    private List<Input> inputs =new ArrayList<Input>();
    private int linenum;
    private int childrennum;
    private String parentt;

    private String left;
    public String getVoidd() {
        return voidd;
    }

    public void setVoidd(String voidd) {
        this.voidd = voidd;
    }

    public NameN getNamee() {
        return namee;
    }

    public void setNamee(NameN namee) {
        this.namee = namee;
    }

    public List<ArgumentFunctionType> getArgumentFunctionTypes() {
        return argumentFunctionTypes;
    }

    public void setArgumentFunctionTypes(List<ArgumentFunctionType> argumentFunctionTypes) {
        this.argumentFunctionTypes=argumentFunctionTypes;
    }

    public List<Input> getInputs() {
        return inputs;
    }

    public void setInputs(List<Input> inputs) {
        this.inputs=inputs;
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
        return "VoidWithArg{" +
                "voidd='" + voidd + '\'' +
                ", namee=" + namee +
                ", argumentFunctionTypes=" + argumentFunctionTypes +
                ", inputs=" + inputs
                + "line:"+linenum+"children:"+childrennum
                +"parent:" + parentt+
                "left:"+left+
                "} \n";
    }
}
