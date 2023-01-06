package Gremmers.Flutter.SizedBox;

import Gremmers.AST;

public class widthHight_SizedBox extends AST {

    private String SIZEDBOX;
    private String WIDTH;
    private String NUM_FLOAT_WIDTH;
    private String HIGHT;
    public  String NUM_FLOAT_HIGHT;

    public void setSIZEDBOX(String SIZEDBOX) {
        this.SIZEDBOX = SIZEDBOX;
    }

    public void setWIDTH(String WIDTH) {
        this.WIDTH = WIDTH;
    }

    public void setNUM_FLOAT_WIDTH(String NUM_FLOAT_WIDTH) {
        this.NUM_FLOAT_WIDTH = NUM_FLOAT_WIDTH;
    }

    public void setHIGHT(String HIGHT) {
        this.HIGHT = HIGHT;
    }

    public void setNUM_FLOAT_HIGHT(String NUM_FLOAT_HIGHT) {
        this.NUM_FLOAT_HIGHT = NUM_FLOAT_HIGHT;
    }

    public String getSIZEDBOX() {
        return SIZEDBOX;
    }

    public String getWIDTH() {
        return WIDTH;
    }

    public String getNUM_FLOAT_WIDTH() {
        return NUM_FLOAT_WIDTH;
    }

    public String getHIGHT() {
        return HIGHT;
    }

    public String getNUM_FLOAT_HIGHT() {
        return NUM_FLOAT_HIGHT;
    }

    @Override
    public String toString() {
        return "widthHight_SizedBox{" +
                "SIZEDBOX='" + SIZEDBOX + '\'' +
                ", WIDTH='" + WIDTH + '\'' +
                ", NUM_FLOAT_WIDTH='" + NUM_FLOAT_WIDTH + '\'' +
                ", HIGHT='" + HIGHT + '\'' +
                ", NUM_FLOAT_HIGHT='" + NUM_FLOAT_HIGHT + '\'' +
                '}';
    }
}
