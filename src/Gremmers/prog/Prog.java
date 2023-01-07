package Gremmers.prog;
import Gremmers.AST;

import java.util.ArrayList;
import java.util.List;

public class Prog extends AST{
    private List<Element> elements = new ArrayList<Element>();
    private int linenum;
    private int childrennum;
    public List<Element> getElements(){
//        System.out.println("add1");
        return elements;
    }

    public void setElements(List<Element> elements){
        this.elements = elements;
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
        return "Prog{" +
                "elements=" + elements
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
