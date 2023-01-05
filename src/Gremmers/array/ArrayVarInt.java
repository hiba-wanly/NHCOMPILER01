package Gremmers.array;

import Gremmers.AST;

import java.util.ArrayList;
import java.util.List;

public class ArrayVarInt extends AST {
    private ArrayList<String> integers;

    public ArrayVarInt() {
        this.integers = new ArrayList<>();
    }

    public void addChild(String elem){
        this.integers.add(elem);
    }


    @Override
    public String toString() {
        return "ArrayVarInt{" +
                "integers=" + integers +
                '}';
    }
}
