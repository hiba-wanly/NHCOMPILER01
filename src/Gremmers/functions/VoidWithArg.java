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

    @Override
    public String toString() {
        return "VoidWithArg{" +
                "voidd='" + voidd + '\'' +
                ", namee=" + namee +
                ", argumentFunctionTypes=" + argumentFunctionTypes +
                ", inputs=" + inputs +
                '}';
    }
}
