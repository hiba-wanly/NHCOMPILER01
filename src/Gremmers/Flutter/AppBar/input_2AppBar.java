package Gremmers.Flutter.AppBar;

import Gremmers.AST;

public class input_2AppBar extends AST {

     private String BACHCOLOR;
     private String COLOR;
     private Color color;

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
          return "input_2AppBar{" +
                  "BACHCOLOR='" + BACHCOLOR + '\'' +
                  ", COLOR='" + COLOR + '\'' +
                  ", color=" + color +
                  "} \n";
     }
}
