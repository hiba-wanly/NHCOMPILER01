package Gremmers.Flutter.AppBar;

import Gremmers.AST;

public class input_2AppBar extends AST {

     private String BACHCOLOR;
     private String COLOR;
     private Color color;
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
                  ", Line number " + numline+
                  ", children count = " + ChildrenCount +
                  "} \n";
     }
}
