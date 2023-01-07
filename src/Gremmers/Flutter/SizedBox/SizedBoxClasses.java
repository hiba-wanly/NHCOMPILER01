package Gremmers.Flutter.SizedBox;

import Gremmers.AST;

public class SizedBoxClasses extends AST {

    private hight_AND_widthSizedBox attr_hight_AND_widthSizedBox;
    private widthHight_SizedBox attr_widthHight_SizedBox;
    private int numline;
    private int ChildrenCount ;
    private String left;


    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
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
    public hight_AND_widthSizedBox gethight_AND_widthSizedBox() {
        return attr_hight_AND_widthSizedBox;
    }

    public void sethight_AND_widthSizedBox(hight_AND_widthSizedBox attr_hight_AND_widthSizedBox) {
        this.attr_hight_AND_widthSizedBox = attr_hight_AND_widthSizedBox;
    }

    public widthHight_SizedBox getwidthHight_SizedBox() {
        return attr_widthHight_SizedBox;
    }

    public void setwidthHight_SizedBox(widthHight_SizedBox attr_widthHight_SizedBox) {
        this.attr_widthHight_SizedBox = attr_widthHight_SizedBox;
    }

    @Override
    public String toString() {
        if(this.attr_widthHight_SizedBox != null){
            return "SizedBoxClasses{" +
                    "attr_widthHight_SizedBox=" + attr_widthHight_SizedBox +"\n"+ "Line number " + numline+"\n"+ "children count = " + ChildrenCount+ "\n"+ "left child"+left+"}\n";
        }
        return "SizedBoxClasses{" +
                "attr_hight_AND_widthSizedBox=" + attr_hight_AND_widthSizedBox +"\n"+ "Line number " + numline+"\n"+ "children count = " + ChildrenCount+ "\n"+ "left child"+left+
                "} \n";
    }
}
