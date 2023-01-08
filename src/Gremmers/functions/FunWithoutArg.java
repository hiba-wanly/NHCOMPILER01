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
    private int linenum;
    private int childrennum;
    private String parentt;

    private String left;
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
        return "FunWithoutArg{" +
                "type='" + type + '\'' +
                ", name=" + name +
                ", inputs=" + inputs +
                ", returnStatement=" + returnStatement
                + "line:"+linenum+"children:"+childrennum
                +"pareent" +parentt+
                "left:"+left+
                "} \n";
    }
}
