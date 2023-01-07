package Gremmers.Flutter.AppBar;

import Gremmers.AST;
import Gremmers.Flutter.TextStatement.TextClasses;

public class input_1AppBar extends AST {

    private String TITLE ;
    private TextClasses textClasses;
    private int ChildrenCount ;

    public int getChildrenCount() {
        return ChildrenCount;
    }

    public void setChildrenCount(int childrenCount) {
        ChildrenCount = childrenCount;
    }
    private int numline;

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

    @Override
    public String toString() {
        return "input_1AppBar{" +
                "TITLE='" + TITLE + '\'' +
                ", textClasses=" + textClasses +
                " , Line number " + numline+
                ", children count = " + ChildrenCount +
                "} \n";
    }
}
