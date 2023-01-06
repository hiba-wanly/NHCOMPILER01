package Gremmers.Flutter.AppBar;

import Gremmers.AST;
import Gremmers.Flutter.TextStatement.TextClasses;

public class input_4AppBar extends AST {

    private String BACHCOLOR;
    private String COLOR;
    private Color color;
    private String TITLE;
    private TextClasses textClasses;

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
        return "input_4AppBar{" +
                "BACHCOLOR='" + BACHCOLOR + '\'' +
                ", COLOR='" + COLOR + '\'' +
                ", color=" + color +
                ", TITLE='" + TITLE + '\'' +
                ", textClasses=" + textClasses +
                "} \n";
    }
}
