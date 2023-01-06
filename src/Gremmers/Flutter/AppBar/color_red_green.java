package Gremmers.Flutter.AppBar;

import Gremmers.AST;

public class color_red_green extends AST {


    private String RED;
    private String GREEN;

    public String getRED() {
        return RED;
    }

    public void setRED(String RED) {
        this.RED = RED;
    }

    public String getGREEN() {
        return GREEN;
    }

    public void setGREEN(String GREEN) {
        this.GREEN = GREEN;
    }


    @Override
    public String toString() {
        if(this.RED!=null)
            return "color_red_green{" +
                    "RED='" + RED + '\'' +'}';
        return "color_red_green{" +
                ", GREEN='" + GREEN + '\'' +
                '}';
    }
}
