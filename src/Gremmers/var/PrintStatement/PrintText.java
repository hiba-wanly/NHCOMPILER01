package Gremmers.var.PrintStatement;

import Gremmers.AST;
import Gremmers.var.Initial.Rule;

import java.util.ArrayList;
import java.util.List;

public class PrintText extends AST {
    private String prin;
    private List<Rule> rules = new ArrayList<Rule>();

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

    @Override
    public String toString() {
        return "PrintText{" +
                "prin='" + prin + '\'' +
                ", rules=" + rules +
                '}';
    }
}
