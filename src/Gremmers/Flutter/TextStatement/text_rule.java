package Gremmers.Flutter.TextStatement;

import Gremmers.AST;
import Gremmers.var.Initial.Rule;

import java.util.ArrayList;
import java.util.List;

public class text_rule extends AST {

    private String TEXT;
    private List<Rule> rules = new ArrayList<Rule>();
    private int numline;
    private int ChildrenCount ;

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

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules( List<Rule> rules) {
        this.rules = rules;
    }

    @Override
    public String toString() {
        return "text_rule{" +
                "TEXT='" + TEXT + '\'' +
                ", rules=" + rules +
                ", Line number " + numline+
                ", children count = " + ChildrenCount +
                "} \n";
    }
}
