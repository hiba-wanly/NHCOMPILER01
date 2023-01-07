package Gremmers.Flutter.Padding.direction;

import Gremmers.AST;

import java.util.ArrayList;
import java.util.List;

public class Directions_direction_FLOAT_D extends AST {

    private String type;
    private String NUM_FLOAT;
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
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getNUM_FLOAT() {
        return NUM_FLOAT;
    }

    public void setNUM_FLOAT(String NUM_FLOAT) {
        this.NUM_FLOAT = NUM_FLOAT;
    }

    public List<direction> getDirection() {
        return direction;
    }

    public void setDirection(List<direction> direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Directions_direction_FLOAT_D{" +
                "type=" + type + '\'' +
                "NUM_FLOAT='" + NUM_FLOAT + '\'' +
                ", direction=" + direction +
                ", Line number " + numline+
                ", children count = " + ChildrenCount +
                "} \n";
    }
}
