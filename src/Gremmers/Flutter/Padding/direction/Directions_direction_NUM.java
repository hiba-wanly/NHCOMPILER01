package Gremmers.Flutter.Padding.direction;

import Gremmers.AST;

public class Directions_direction_NUM extends AST {

    private String NUM;
    private String type;

    public String getNUM() {
        return NUM;
    }

    public void setNUM(String NUM) {
        this.NUM = NUM;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Directions_direction_NUM{" +
                "NUM='" + NUM + '\'' +
                ", type ='" + type + '\'' +
                "} \n";
    }
}
