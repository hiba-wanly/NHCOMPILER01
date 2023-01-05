package Gremmers.functions;

import Gremmers.AST;
import Gremmers.NameN;
import Gremmers.var.Input;

import java.util.ArrayList;
import java.util.List;

public class FunWithoutArg extends AST {
    private String type ;
    private NameN name ;
    private List<Input> inputs = new ArrayList<Input>();
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



    public void setInputs(List<Input> inputs) {
        this.inputs=inputs;
    }
    public List<Input> getInputs(){
        return inputs;
    }

    public ReturnStatement getReturnStatement() {
        return returnStatement;
    }

    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    @Override
    public String toString() {
        return "FunWithoutArg{" +
                "type='" + type + '\'' +
                ", name=" + name +
                ", inputs=" + inputs +
                ", returnStatement=" + returnStatement +
                '}';
    }
}
