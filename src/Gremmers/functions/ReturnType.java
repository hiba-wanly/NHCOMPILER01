package Gremmers.functions;

import Gremmers.AST;
import Gremmers.var.Initial.Rule;

import java.util.ArrayList;
import java.util.List;

public class ReturnType extends AST {
    private String returnn;
    private String idd;
    private List<Rule> rules=new ArrayList<Rule>();
    private int linenum;
    private int childrennum;

    public String getReturnn() {
        return returnn;
    }

    public void setReturnn(String returnn) {
        this.returnn = returnn;
    }

    public String getIdd() {
        return idd;
    }

    public void setIdd(String idd) {
        this.idd = idd;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules=rules;
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
        if(this.idd!=null){
            return "ReturnType{" +
                    "returnn='" + returnn + '\'' +
                    ", idd='" + idd
                    + "line:"+linenum+"children:"+childrennum
                    + "} \n" ;
        }
        return "ReturnType{" +
                "returnn='" + returnn + '\'' +
                ", rules=" + rules
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
