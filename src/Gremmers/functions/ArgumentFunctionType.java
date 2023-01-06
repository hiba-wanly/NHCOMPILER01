package Gremmers.functions;

import Gremmers.AST;
import Gremmers.NameN;

public class ArgumentFunctionType extends AST {
    private String typee;
    private NameN namee;

    public String getTypee() {
        return typee;
    }

    public void setTypee(String typee) {
        this.typee = typee;
    }

    public NameN getNamee() {
        return namee;
    }

    public void setNamee(NameN namee) {
        this.namee = namee;
    }

    @Override
    public String toString() {
        return "ArgumentFunctionType{" +
                "typee='" + typee + '\'' +
                ", namee=" + namee +
                "} \n";
    }
}
