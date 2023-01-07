package Gremmers.var.IfStatement;

import Gremmers.AST;

import java.util.ArrayList;
import java.util.List;

public class IfStatment extends AST {
    private IFInput ifin;
    private List<ElseIfInput> elseifin = new ArrayList<ElseIfInput>();
    private ElseInput elsein;
    private int linenum;
    private int childrennum;
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
        if(this.ifin!=null && this.elseifin!=null && this.elsein!=null){
           return "IfStatment{" +
                "ifin=" + ifin +
                ", elseifin=" + elseifin +
                ", elsein=" + elsein
                   + "line:"+linenum+"children:"+childrennum
                   +
                   "} \n";
           }
        if(this.ifin!=null && this.elseifin !=null){
            return "IfStatment{" +
                    "ifin=" + ifin +
                    ", elseifin=" + elseifin
                    + "line:"+linenum+"children:"+childrennum
                    +
                    "} \n";
        }
//        if(this.ifin!=null && this.elsein!=null){
//
//        }
        return "IfStatment{" +
                "ifin=" + ifin +
                ", elsein=" + elsein
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
