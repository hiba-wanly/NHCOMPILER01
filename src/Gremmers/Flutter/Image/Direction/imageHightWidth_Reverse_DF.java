package Gremmers.Flutter.Image.Direction;

import Gremmers.AST;

public class imageHightWidth_Reverse_DF extends AST {

    private String HIGHT ;
    private String WIDTH;
    private String NUM_FLOAT_HIGHT;
    private String NUM_FLOAT_WIDTH;
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

    public String getNUM_FLOAT_HIGHT() {
        return NUM_FLOAT_HIGHT;
    }

    public void setNUM_FLOAT_HIGHT(String NUM_FLOAT_HIGHT) {
        this.NUM_FLOAT_HIGHT = NUM_FLOAT_HIGHT;
    }

    public String getNUM_FLOAT_WIDTH() {
        return NUM_FLOAT_WIDTH;
    }

    public void setNUM_FLOAT_WIDTH(String NUM_FLOAT_WIDTH) {
        this.NUM_FLOAT_WIDTH = NUM_FLOAT_WIDTH;
    }

    @Override
    public String toString() {
        return "imageHightWidth_Reverse_DF{" +
                "HIGHT='" + HIGHT + '\'' +
                ", WIDTH='" + WIDTH + '\'' +
                ", NUM_FLOAT_HIGHT='" + NUM_FLOAT_HIGHT + '\'' +
                ", NUM_FLOAT_WIDTH='" + NUM_FLOAT_WIDTH + '\'' +
                ", Line number " + numline+
                ", children count = " + ChildrenCount +
                "} \n";
    }
}
