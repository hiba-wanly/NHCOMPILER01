package Gremmers.Flutter.SizedBox;

import Gremmers.AST;

public class hight_AND_widthSizedBox extends AST {

    private String SIZEDBOX;

    private String type;
    private String NUM_FLOAT;

    public String getSIZEDBOX() {
        return SIZEDBOX;
    }

    public String getNUM_FLOAT() {
        return NUM_FLOAT;
    }

    public void setSIZEDBOX(String SIZEDBOX) {
        this.SIZEDBOX = SIZEDBOX;
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
        return "hight_AND_widthSizedBox{" +
                "SIZEDBOX='" + SIZEDBOX + '\'' +
                ", type ='" + type + '\'' +
                ", NUM_FLOAT='" + NUM_FLOAT + '\'' +
                '}';
    }
}
