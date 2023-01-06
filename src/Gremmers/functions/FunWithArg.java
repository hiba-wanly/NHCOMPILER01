package Gremmers.functions;

import Gremmers.AST;
import Gremmers.NameN;
import Gremmers.var.Input;

import java.util.ArrayList;
import java.util.List;

public class FunWithArg extends AST {
    private String type ;
    private NameN name ;
    private List<ArgumentFunctionType> argumentFunctionTypes =new ArrayList<ArgumentFunctionType>();
    private List<Input> inputs =new ArrayList<Input>();
    private ReturnStatement returnStatement;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NameN getName() {
        return name;
    }

    public void setName(NameN name) {
        this.name = name;
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

    public ReturnStatement getReturnStatement() {
        return returnStatement;
    }

    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    @Override
    public String toString() {
        return "FunWithArg{" +
                "type='" + type + '\'' +
                ", name=" + name +
                ", argumentFunctionTypes=" + argumentFunctionTypes +
                ", inputs=" + inputs +
                ", returnStatement=" + returnStatement +
                "} \n";
    }
}
