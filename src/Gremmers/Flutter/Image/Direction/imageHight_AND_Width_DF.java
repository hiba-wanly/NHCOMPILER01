package Gremmers.Flutter.Image.Direction;

import Gremmers.AST;

public class imageHight_AND_Width_DF extends AST {

    private String type ;
    private String NUM_FLOAT;

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

    @Override
    public String toString() {
        return "imageHight_AND_Width_DF{" +
                "type='" + type + '\'' +
                ", NUM_FLOAT='" + NUM_FLOAT + '\'' +
                "} \n";
    }
}
