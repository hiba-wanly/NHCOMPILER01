package Gremmers.Flutter.Padding.direction;

import Gremmers.AST;

import java.util.ArrayList;
import java.util.List;

public class Directions_direction_NUM_D extends AST {


    private String NUM;
    private String TOP;
    private String RIGHT;
    private String BOTTOM;
    private String LEFT;
    private List<direction> direction = new ArrayList<direction>();

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

    public List<direction> getDirection() {
        return direction;
    }

    public void setDirection(List<direction> direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Directions_direction_NUM_D{" +
                "NUM='" + NUM + '\'' +
                ", TOP='" + TOP + '\'' +
                ", RIGHT='" + RIGHT + '\'' +
                ", BOTTOM='" + BOTTOM + '\'' +
                ", LEFT='" + LEFT + '\'' +
                ", direction=" + direction +
                '}';
    }
}
