package Gremmers.Flutter.Image.Direction;

import Gremmers.AST;

public class imageDirection extends AST {
     private imageHight_AND_Width_DF attr_imageHight_AND_Width_DF;
     private imageHightWidth_Reverse_DF attr_imageHightWidth_Reverse_DF;
     private imageHightWidth_Reverse_DN attr_imageHightWidth_Reverse_DN;
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

    public imageHight_AND_Width_DF getimageHight_AND_Width_DF() {
        return attr_imageHight_AND_Width_DF;
    }

    public void setimageHight_AND_Width_DF(imageHight_AND_Width_DF attr_imageHight_AND_Width_DF) {
        this.attr_imageHight_AND_Width_DF = attr_imageHight_AND_Width_DF;
    }

    public imageHightWidth_Reverse_DF getimageHightWidth_Reverse_DF() {
        return attr_imageHightWidth_Reverse_DF;
    }

    public void setimageHightWidth_Reverse_DF(imageHightWidth_Reverse_DF attr_imageHightWidth_Reverse_DF) {
        this.attr_imageHightWidth_Reverse_DF = attr_imageHightWidth_Reverse_DF;
    }

    public imageHightWidth_Reverse_DN getimageHightWidth_Reverse_DN() {
        return attr_imageHightWidth_Reverse_DN;
    }

    public void setimageHightWidth_Reverse_DN(imageHightWidth_Reverse_DN attr_imageHightWidth_Reverse_DN) {
        this.attr_imageHightWidth_Reverse_DN = attr_imageHightWidth_Reverse_DN;
    }

    @Override
    public String toString() {
        if(this.attr_imageHight_AND_Width_DF != null){
            return "imageDirection{" +
                    "attr_imageHight_AND_Width_DF=" + attr_imageHight_AND_Width_DF + "Line number " + numline+"children count = " + ChildrenCount+"}\n";
        }
        if(this.attr_imageHightWidth_Reverse_DN != null){
            return "imageDirection{" +
                    " attr_imageHightWidth_Reverse_DN=" + attr_imageHightWidth_Reverse_DN +"Line number " + numline+ "children count = " + ChildrenCount+ "}\n";
        }
        return "imageDirection{" +
                "attr_imageHightWidth_Reverse_DN=" + attr_imageHightWidth_Reverse_DF +"Line number " + numline+ "children count = " + ChildrenCount+
                "} \n";
    }
}
