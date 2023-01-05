package Gremmers.array;

import Gremmers.AST;

import java.util.ArrayList;

public class ArrayVarInt extends AST {
    private ArrayList<Integer> integers;

    public ArrayVarInt() {
        this.integers = new ArrayList<>();
    }

    public void addChild(int elem){
        this.integers.add(elem);
    }

    @Override
    public String toString() {
        return "ArrayVarInt{" +
                "integers=" + integers +
                '}';
    }
}
