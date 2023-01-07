package Gremmers.Flutter.SizedBox;

import Gremmers.AST;

public class widthHight_SizedBox extends AST {

    private String SIZEDBOX;
    private String WIDTH;
    private String NUM_FLOAT_WIDTH;
    private String HIGHT;
    private String NUM_FLOAT_HIGHT;
    private int numline;
    private int ChildrenCount ;
    private String parent;

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
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
                "SIZEDBOX='" + SIZEDBOX + '\'' +"\n"+
                ", WIDTH='" + WIDTH + '\'' +"\n"+
                ", NUM_FLOAT_WIDTH='" + NUM_FLOAT_WIDTH + '\'' +"\n"+
                ", HIGHT='" + HIGHT + '\'' +"\n"+
                ", NUM_FLOAT_HIGHT='" + NUM_FLOAT_HIGHT + '\'' +"\n"+
                ", Line number " + numline+"\n"+
                ", children count = " + ChildrenCount +"\n"+
                ", parent node " + parent+
                "} \n";
    }
}
