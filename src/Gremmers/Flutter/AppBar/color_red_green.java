package Gremmers.Flutter.AppBar;

import Gremmers.AST;

public class color_red_green extends AST {

    private String color_type;

    public String getColor_type() {
        return color_type;
    }

    public void setColor_type(String color_type) {
        this.color_type = color_type;
    }

    @Override
    public String toString() {
        return "color_red_green{" +
                ", color name='" + color_type + '\'' +
                '}';
    }
}
