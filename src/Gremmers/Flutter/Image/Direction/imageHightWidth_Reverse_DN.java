package Gremmers.Flutter.Image.Direction;

import Gremmers.AST;

public class imageHightWidth_Reverse_DN extends AST {

    private String HIGHT ;
    private String WIDTH;
    private String NUM_HIGHT;
    private String NUM_WIDTH;
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

    public String getNUM_HIGHT() {
        return NUM_HIGHT;
    }

    public void setNUM_HIGHT(String NUM_HIGHT) {
        this.NUM_HIGHT = NUM_HIGHT;
    }

    public String getNUM_WIDTH() {
        return NUM_WIDTH;
    }

    public void setNUM_WIDTH(String NUM_WIDTH) {
        this.NUM_WIDTH = NUM_WIDTH;
    }

    @Override
    public String toString() {
        return "imageHightWidth_Reverse_DN{" +
                "HIGHT='" + HIGHT + '\'' +
                ", WIDTH='" + WIDTH + '\'' +
                ", NUM_HIGHT='" + NUM_HIGHT + '\'' +
                ", NUM_WIDTH='" + NUM_WIDTH + '\'' +
                ", Line number " + numline+
                ", children count = " + ChildrenCount +
                "} \n";
    }
}
