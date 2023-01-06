package Gremmers.Flutter.Image.Direction;

import Gremmers.AST;

public class imageHight_AND_Width_DF extends AST {
    private String HIGHT ;
    private String WIDTH;
    private String NUM_FLOAT;

    public String getHIGHT() {
        return HIGHT;
    }

    public void setHIGHT(String HIGHT) {
        this.HIGHT = HIGHT;
    }

    public String getWIDTH() {
        return WIDTH;
    }

    public void setWIDTH(String WIDTH) {
        this.WIDTH = WIDTH;
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
                "HIGHT='" + HIGHT + '\'' +
                ", WIDTH='" + WIDTH + '\'' +
                ", NUM_FLOAT='" + NUM_FLOAT + '\'' +
                '}';
    }
}
