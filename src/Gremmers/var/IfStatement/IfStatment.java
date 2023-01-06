package Gremmers.var.IfStatement;

import Gremmers.AST;

import java.util.ArrayList;
import java.util.List;

public class IfStatment extends AST {
    private IFInput ifin;
    private List<ElseIfInput> elseifin = new ArrayList<ElseIfInput>();
    private ElseInput elsein;

    public IFInput getIfin() {
        return ifin;
    }

    public void setIfin(IFInput ifin) {
        this.ifin = ifin;
    }

    public List<ElseIfInput> getElseifin() {
        return elseifin;
    }

    public void setElseifin(List<ElseIfInput> elseifin) {
        this.elseifin =elseifin;
    }

    public ElseInput getElsein() {
        return elsein;
    }

    public void setElsein(ElseInput elsein) {
        this.elsein = elsein;
    }

    @Override
    public String toString() {
        if(this.ifin!=null && this.elseifin!=null && this.elsein!=null){
           return "IfStatment{" +
                "ifin=" + ifin +
                ", elseifin=" + elseifin +
                ", elsein=" + elsein +
                   "} \n";
           }
        if(this.ifin!=null && this.elseifin !=null){
            return "IfStatment{" +
                    "ifin=" + ifin +
                    ", elseifin=" + elseifin +
                    "} \n";
        }
//        if(this.ifin!=null && this.elsein!=null){
//
//        }
        return "IfStatment{" +
                "ifin=" + ifin +
                ", elsein=" + elsein +
                "} \n";
    }
}
