package Gremmers.Flutter.Image;

import Gremmers.AST;

public class image_withAsset_Network_File extends AST {

    private String IMAGE;

    private String type;


    public String getIMAGE() {
        return IMAGE;
    }

    public void setIMAGE(String IMAGE) {
        this.IMAGE = IMAGE;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "image_withAsset_Network_File{" +
                "IMAGE='" + IMAGE + '\'' +
                ", TYPE ='" + type + '\'' +
                "} \n";
    }
}


