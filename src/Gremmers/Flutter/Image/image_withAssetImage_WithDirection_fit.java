package Gremmers.Flutter.Image;

import Gremmers.AST;
import Gremmers.Flutter.Image.Direction.imageDirection;

import java.util.ArrayList;
import java.util.List;

public class image_withAssetImage_WithDirection_fit extends AST {

    private String IMAGE;
    private String IMAGE_CHILD;
    private String ASSETSIMAGE;
    private String IMAGE_INPUT_ASSET;
    private List<imageDirection> attr_imageDirection = new ArrayList<imageDirection>();
    private imageFit imageFit;

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

    public List<imageDirection> getimageDirection() {
        return attr_imageDirection;
    }

    public void setimageDirection(List<imageDirection> attr_imageDirection) {
        this.attr_imageDirection = attr_imageDirection;
    }

    public imageFit getImageFit() {
        return imageFit;
    }

    public void setImageFit(imageFit imageFit) {
        this.imageFit = imageFit;
    }

    @Override
    public String toString() {
        return "image_withAssetImage_WithDirection_fit{" +
                "IMAGE='" + IMAGE + '\'' +
                ", IMAGE_CHILD='" + IMAGE_CHILD + '\'' +
                ", ASSETSIMAGE='" + ASSETSIMAGE + '\'' +
                ", IMAGE_INPUT_ASSET='" + IMAGE_INPUT_ASSET + '\'' +
                ", attr_imageDirection=" + attr_imageDirection +
                ", imageFit=" + imageFit +
                '}';
    }
}
