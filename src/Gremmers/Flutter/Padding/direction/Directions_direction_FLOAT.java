package Gremmers.Flutter.Padding.direction;

import Gremmers.AST;

public class Directions_direction_FLOAT extends AST {

    private String NUM_FLOAT;
    private String type;

    public String getNUM_FLOAT() {
        return NUM_FLOAT;
    }

    public void setNUM_FLOAT(String NUM_FLOAT) {
        this.NUM_FLOAT = NUM_FLOAT;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Directions_direction_FLOAT{" +
                "NUM_FLOAT='" + NUM_FLOAT + '\'' +
                ", type ='" + type + '\'' +
                "} \n";
    }
}
