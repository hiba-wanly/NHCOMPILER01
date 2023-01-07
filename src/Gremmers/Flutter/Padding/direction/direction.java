package Gremmers.Flutter.Padding.direction;

import Gremmers.AST;

public class direction extends AST {

    private  Directions_direction_FLOAT directions_direction_FLOAT;
    private  Directions_direction_FLOAT_D directions_direction_FLOAT_D;
    private  Directions_direction_NUM directions_direction_NUM;
    private  Directions_direction_NUM_D directions_direction_NUM_D;
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
    public Directions_direction_FLOAT getDirections_direction_FLOAT() {
        return directions_direction_FLOAT;
    }

    public void setDirections_direction_FLOAT(Directions_direction_FLOAT directions_direction_FLOAT) {
        this.directions_direction_FLOAT = directions_direction_FLOAT;
    }

    public Directions_direction_FLOAT_D getDirections_direction_FLOAT_D() {
        return directions_direction_FLOAT_D;
    }

    public void setDirections_direction_FLOAT_D(Directions_direction_FLOAT_D directions_direction_FLOAT_D) {
        this.directions_direction_FLOAT_D = directions_direction_FLOAT_D;
    }

    public Directions_direction_NUM getDirections_direction_NUM() {
        return directions_direction_NUM;
    }

    public void setDirections_direction_NUM(Directions_direction_NUM directions_direction_NUM) {
        this.directions_direction_NUM = directions_direction_NUM;
    }

    public Directions_direction_NUM_D getDirections_direction_NUM_D() {
        return directions_direction_NUM_D;
    }

    public void setDirections_direction_NUM_D(Directions_direction_NUM_D directions_direction_NUM_D) {
        this.directions_direction_NUM_D = directions_direction_NUM_D;
    }

    @Override
    public String toString() {
        if(this.directions_direction_FLOAT!=null)
            return "direction{" +
                    "directions_direction_FLOAT=" + directions_direction_FLOAT + "Line number " + numline+ "children count = " + ChildrenCount+
                    "} \n";
        if(this.directions_direction_NUM!=null)
            return "direction{" +
                    ", directions_direction_NUM=" + directions_direction_NUM +"Line number " + numline+ "children count = " + ChildrenCount+
                    "} \n";
        if(this.directions_direction_FLOAT_D!=null)
            return "direction{" +
                    ", directions_direction_FLOAT_D=" + directions_direction_FLOAT_D+ "Line number " + numline+ "children count = " + ChildrenCount+
                    "} \n";
        return "direction{" +

                ", directions_direction_NUM_D=" + directions_direction_NUM_D + "Line number " + numline+ "children count = " + ChildrenCount+
                "} \n";
    }
}
