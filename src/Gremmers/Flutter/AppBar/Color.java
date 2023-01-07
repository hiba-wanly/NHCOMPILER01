package Gremmers.Flutter.AppBar;

import Gremmers.AST;

public class Color extends AST {

    private  color_red_green attr_color_red_green;
    private int numline;

    private int ChildrenCount ;

    public int getChildrenCount() {
        return ChildrenCount;
    }

    public void setChildrenCount(int childrenCount) {
        ChildrenCount = childrenCount;
    }

    public int getNumline() {
        return numline;
    }

    public void setNumline(int numline) {
        this.numline = numline;
    }

    public color_red_green getAttr_color_red_green() {
        return attr_color_red_green;
    }

    public void setAttr_color_red_green(color_red_green attr_color_red_green) {
        this.attr_color_red_green = attr_color_red_green;
    }

    @Override
    public String toString() {
        return "Color{" +
                "attr_color_red_green=" + attr_color_red_green +
                "Line number " + numline+
                "children count = " + ChildrenCount +
                "} \n";
    }
}
