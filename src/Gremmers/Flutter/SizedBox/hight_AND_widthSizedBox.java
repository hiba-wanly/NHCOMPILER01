package Gremmers.Flutter.SizedBox;

import Gremmers.AST;

public class hight_AND_widthSizedBox extends AST {

    private String SIZEDBOX;
    private String HIGHT ;
    private String NUM_FLOAT;
    private String WIDTH;

    public String getSIZEDBOX() {
        return SIZEDBOX;
    }

    public String getHIGHT() {
        return HIGHT;
    }

    public String getNUM_FLOAT() {
        return NUM_FLOAT;
    }

    public String getWIDTH() {
        return WIDTH;
    }

    public void setSIZEDBOX(String SIZEDBOX) {
        this.SIZEDBOX = SIZEDBOX;
    }

    public void setHIGHT(String HIGHT) {
        this.HIGHT = HIGHT;
    }

    public void setNUM_FLOAT(String NUM_FLOAT) {
        this.NUM_FLOAT = NUM_FLOAT;
    }

    public void setWIDTH(String WIDTH) {
        this.WIDTH = WIDTH;
    }

    @Override
    public String toString() {
        return "hight_AND_widthSizedBox{" +
                "SIZEDBOX='" + SIZEDBOX + '\'' +
                ", HIGHT='" + HIGHT + '\'' +
                ", NUM_FLOAT='" + NUM_FLOAT + '\'' +
                ", WIDTH='" + WIDTH + '\'' +
                '}';
    }
}
