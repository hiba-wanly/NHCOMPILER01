package Gremmers.Flutter.Image;

import Gremmers.AST;

public class imageClasses extends AST {

    public image_withAsset_Network_File attr_image_withAsset_Network_File;
    public image_withAssetImage attr_image_withAssetImage;
    public image_withAssetImage_WithDirection attr_image_withAssetImage_WithDirection;
    public image_withAssetImage_WithDirection_fit attr_image_withAssetImage_WithDirection_fit;


    public void setimage_withAsset_Network_File( image_withAsset_Network_File attr_image_withAsset_Network_File ){
        this.attr_image_withAsset_Network_File = attr_image_withAsset_Network_File;
    }
    public  image_withAsset_Network_File getimage_withAsset_Network_File (){
        return attr_image_withAsset_Network_File;
    }

    public void setimage_withAssetImage ( image_withAssetImage attr_image_withAssetImage){
        this.attr_image_withAssetImage=attr_image_withAssetImage;
    }

    public image_withAssetImage getimage_withAssetImage(){
        return attr_image_withAssetImage;
    }

    public void setimage_withAssetImage_WithDirection (image_withAssetImage_WithDirection attr_image_withAssetImage_WithDirection ){
        this.attr_image_withAssetImage_WithDirection=attr_image_withAssetImage_WithDirection;
    }

    public image_withAssetImage_WithDirection getimage_withAssetImage_WithDirection(){
        return attr_image_withAssetImage_WithDirection;
    }

    public void setimage_withAssetImage_WithDirection_fit( image_withAssetImage_WithDirection_fit attr_image_withAssetImage_WithDirection_fit){
         this.attr_image_withAssetImage_WithDirection_fit=attr_image_withAssetImage_WithDirection_fit;
    }

    public image_withAssetImage_WithDirection_fit getimage_withAssetImage_WithDirection_fit(){
        return attr_image_withAssetImage_WithDirection_fit;
    }

    @Override
    public String toString() {
        if(this.attr_image_withAssetImage != null){
            return "imageClasses{" +
            " attr_image_withAssetImage=" + attr_image_withAssetImage + "}\n";
        }
        if(this.attr_image_withAsset_Network_File != null){
            return "imageClasses{" + "attr_image_withAsset_Network_File=" + attr_image_withAsset_Network_File + "}\n";
        }
        if(this.attr_image_withAssetImage_WithDirection != null){
            return "imageClasses{" + " attr_image_withAssetImage_WithDirection=" + attr_image_withAssetImage_WithDirection + "}\n";
        }
        return "imageClasses{" +
                " attr_image_withAssetImage_WithDirection_fit=" + attr_image_withAssetImage_WithDirection_fit +
                "} \n";
    }
}
