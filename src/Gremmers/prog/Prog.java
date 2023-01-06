package Gremmers.prog;
import Gremmers.AST;

import java.util.ArrayList;
import java.util.List;

public class Prog extends AST{
    private List<Element> elements = new ArrayList<Element>();

    public List<Element> getElements(){
//        System.out.println("add1");
        return elements;
    }

    public void setElements(List<Element> elements){
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "Prog{" +
                "elements=" + elements +
                "} \n";
    }
}
