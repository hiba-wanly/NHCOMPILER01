package Gremmers.Flutter.Padding.direction;

import Gremmers.AST;

import java.util.ArrayList;
import java.util.List;

public class Directions_direction_NUM_D extends AST {


    private String NUM;
    private String type;
    private List<direction> direction = new ArrayList<direction>();
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

    public List<direction> getDirection() {
        return direction;
    }

    public void setDirection(List<direction> direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Directions_direction_NUM_D{" +
                "type=" + type + '\'' +
                "NUM='" + NUM + '\'' +
                ", direction=" + direction +
                ", Line number " + numline+
                ", children count = " + ChildrenCount +
                "} \n";
    }
}
