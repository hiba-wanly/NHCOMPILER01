package Gremmers.array;

import Gremmers.AST;

import java.util.ArrayList;

public class ArrayVarString extends AST {
    private ArrayList<String> STRINGS;

    public ArrayVarString() {
        this.STRINGS = new ArrayList<>();
    }

    public void addChild(String elem){
        this.STRINGS.add(elem);
    }

    @Override
    public String toString() {
        return "ArrayVarString{" +
                "STRINGS=" + STRINGS +
                '}';
    }
}
