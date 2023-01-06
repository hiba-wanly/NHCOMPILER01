package Gremmers.Flutter.Padding.direction;

import Gremmers.AST;

public class Directions_direction_NUM extends AST {

    private String NUM;
    private String TOP;
    private String RIGHT;
    private String BOTTOM;
    private String LEFT;

    public String getNUM() {
        return NUM;
    }

    public void setNUM(String NUM) {
        this.NUM = NUM;
    }

    public String getTOP() {
        return TOP;
    }

    public void setTOP(String TOP) {
        this.TOP = TOP;
    }

    public String getRIGHT() {
        return RIGHT;
    }

    public void setRIGHT(String RIGHT) {
        this.RIGHT = RIGHT;
    }

    public String getBOTTOM() {
        return BOTTOM;
    }

    public void setBOTTOM(String BOTTOM) {
        this.BOTTOM = BOTTOM;
    }

    public String getLEFT() {
        return LEFT;
    }

    public void setLEFT(String LEFT) {
        this.LEFT = LEFT;
    }

    @Override
    public String toString() {
        return "Directions_direction_NUM{" +
                "NUM='" + NUM + '\'' +
                ", TOP='" + TOP + '\'' +
                ", RIGHT='" + RIGHT + '\'' +
                ", BOTTOM='" + BOTTOM + '\'' +
                ", LEFT='" + LEFT + '\'' +
                '}';
    }
}
