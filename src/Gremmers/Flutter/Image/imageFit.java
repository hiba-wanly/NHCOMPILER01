package Gremmers.Flutter.Image;

import Gremmers.AST;

public class imageFit extends AST {

    private String FIT;
    private String BOXFIT;
    private String FILL;
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
    public String getFIT() {
        return FIT;
    }

    public void setFIT(String FIT) {
        this.FIT = FIT;
    }

    public String getBOXFIT() {
        return BOXFIT;
    }

    public void setBOXFIT(String BOXFIT) {
        this.BOXFIT = BOXFIT;
    }

    public String getFILL() {
        return FILL;
    }

    public void setFILL(String FILL) {
        this.FILL = FILL;
    }

    @Override
    public String toString() {
        return "imageFit{" +
                "FIT='" + FIT + '\'' +
                ", BOXFIT='" + BOXFIT + '\'' +
                ", FILL='" + FILL + '\'' +
                ", Line number " + numline+
                ", children count = " + ChildrenCount +
                "} \n";
    }
}
