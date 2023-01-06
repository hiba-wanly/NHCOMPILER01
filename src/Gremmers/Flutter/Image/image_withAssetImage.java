package Gremmers.Flutter.Image;

import Gremmers.AST;

public class image_withAssetImage extends AST {

    private String IMAGE;
    private String IMAGE_CHILD;
    private String ASSETSIMAGE;
    private String IMAGE_INPUT_ASSET;

    public String getIMAGE() {
        return IMAGE;
    }

    public void setIMAGE(String IMAGE) {
        this.IMAGE = IMAGE;
    }

    public String getIMAGE_CHILD() {
        return IMAGE_CHILD;
    }

    public void setIMAGE_CHILD(String IMAGE_CHILD) {
        this.IMAGE_CHILD = IMAGE_CHILD;
    }

    public String getASSETSIMAGE() {
        return ASSETSIMAGE;
    }

    public void setASSETSIMAGE(String ASSETSIMAGE) {
        this.ASSETSIMAGE = ASSETSIMAGE;
    }

    public String getIMAGE_INPUT_ASSET() {
        return IMAGE_INPUT_ASSET;
    }

    public void setIMAGE_INPUT_ASSET(String IMAGE_INPUT_ASSET) {
        this.IMAGE_INPUT_ASSET = IMAGE_INPUT_ASSET;
    }

    @Override
    public String toString() {
        return "image_withAssetImage{" +
                "IMAGE='" + IMAGE + '\'' +
                ", IMAGE_CHILD='" + IMAGE_CHILD + '\'' +
                ", ASSETSIMAGE='" + ASSETSIMAGE + '\'' +
                ", IMAGE_INPUT_ASSET='" + IMAGE_INPUT_ASSET + '\'' +
                "} \n";
    }
}
