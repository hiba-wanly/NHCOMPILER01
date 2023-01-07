package Gremmers.Flutter.AppBar;

import Gremmers.AST;
import Gremmers.Flutter.TextStatement.TextClasses;

public class input_3AppBar extends AST {

    private String TITLE;
    private TextClasses textClasses;
    private String BACHCOLOR ;
    private String COLOR;
    private Color color;
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

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public TextClasses getTextClasses() {
        return textClasses;
    }

    public void setTextClasses(TextClasses textClasses) {
        this.textClasses = textClasses;
    }

    public String getBACHCOLOR() {
        return BACHCOLOR;
    }

    public void setBACHCOLOR(String BACHCOLOR) {
        this.BACHCOLOR = BACHCOLOR;
    }

    public String getCOLOR() {
        return COLOR;
    }

    public void setCOLOR(String COLOR) {
        this.COLOR = COLOR;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "input_3AppBar{" +
                "TITLE='" + TITLE + '\'' +"\n"+
                ", textClasses=" + textClasses +"\n"+
                ", BACHCOLOR='" + BACHCOLOR + '\'' +"\n"+
                ", COLOR='" + COLOR + '\'' +"\n"+
                ", color=" + color +"\n"+
                ", Line number " + numline+"\n"+
                ", children count = " + ChildrenCount +"\n"+
                ", parent node"+parent+
                "} \n";
    }
}
