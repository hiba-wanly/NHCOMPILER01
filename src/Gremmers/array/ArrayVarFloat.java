package Gremmers.array;

import Gremmers.AST;

import java.util.ArrayList;

public class ArrayVarFloat extends AST {
    private ArrayList<String> FLOAT;

    public ArrayVarFloat() {
        this.FLOAT = new ArrayList<>();
    }

    public void addChild(String elem){
        this.FLOAT.add(elem);
    }

    @Override
    public String toString() {
        return "ArrayVarFloat{" +
                "FLOAT=" + FLOAT +
                "} \n";
    }
}
