package Gremmers.classes;

import Gremmers.AST;
import Gremmers.NameN;
import Gremmers.var.InputClasses;

import java.util.ArrayList;
import java.util.List;

public class ClassStatement extends AST {
    private String clas ;
    private NameN id ;
    private List<InputClasses> inputclasses = new ArrayList<InputClasses>();

    public void setClas(String clas ){
        this.clas = clas;
    }
    public String getClas(){
        return clas;
    }

    public void setId(NameN id ){
        this.id = id;
    }
    public NameN getId(){
        return id;
    }

    public void setInputclasses(List<InputClasses> inputclasses){
        this.inputclasses = inputclasses;
    }
    public List<InputClasses> getInputclasses(){
//        System.out.println("addinput");
        return inputclasses;
    }

    @Override
    public String toString() {
        return "ClassStatement{" +
                "clas='" + clas + '\'' +
                ", id='" + id + '\'' +
                ", inputclasses=" + inputclasses +
                '}';
    }
}
