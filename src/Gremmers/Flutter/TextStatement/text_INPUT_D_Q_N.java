package Gremmers.Flutter.TextStatement;

import Gremmers.AST;

public class text_INPUT_D_Q_N extends AST {

    private String TEXT;
    private String INPUT_D_Q_N;
    private int numline;
    private int ChildrenCount ;
    private String parent;
    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
    public int getChildrenCount() {
        return ChildrenCount;
    }

    public void setChildrenCount(int childrenCount) {
        ChildrenCount = childrenCount;
    }
    public int getNumline() {
        return numline;
    }

    public void setNumline(int numline) {
        this.numline = numline;
    }
    public String getTEXT() {
        return TEXT;
    }

    public void setTEXT(String TEXT) {
        this.TEXT = TEXT;
    }

    public String getINPUT_D_Q_N() {
        return INPUT_D_Q_N;
    }

    public void setINPUT_D_Q_N(String INPUT_D_Q_N) {
        this.INPUT_D_Q_N = INPUT_D_Q_N;
    }

    @Override
    public String toString() {
        return "text_INPUT_D_Q_N{" +"\n"+
                "TEXT='" + TEXT + '\'' +"\n"+
                ", INPUT_D_Q_N='" + INPUT_D_Q_N + '\'' +"\n"+
                ", Line number " + numline+"\n"+
                ", children count = " + ChildrenCount +"\n"+
                ", parent node =" + parent +"\n"+
                "} \n";
    }
}
