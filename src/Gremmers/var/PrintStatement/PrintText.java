package Gremmers.var.PrintStatement;

import Gremmers.AST;
import Gremmers.var.Initial.Rule;

import java.util.ArrayList;
import java.util.List;

public class PrintText extends AST {
    private String prin;
    private List<Rule> rules = new ArrayList<Rule>();
    private int linenum;
    private int childrennum;
    public void setPrin(String prin){
        this.prin = prin;
    }
    public void setRules(List<Rule> world){
        this.rules =world;
    }

    public String  getPrin(){
        return prin;
    }
    public List<Rule> getRules(){
        return rules;
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
        return "PrintText{" +
                "prin='" + prin + '\'' +
                ", rules=" + rules
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
