package Gremmers.Flutter.Image;

import Gremmers.AST;

public class image_withAsset_Network_File extends AST {

    private String IMAGE;
    private String Assets;
    private String NETWORK;
    private String File;

    public String getIMAGE() {
        return IMAGE;
    }

    public void setIMAGE(String IMAGE) {
        this.IMAGE = IMAGE;
    }

    public String getAssets() {
        return Assets;
    }

    public void setAssets(String assets) {
        Assets = assets;
    }

    public String getNETWORK() {
        return NETWORK;
    }

    public void setNETWORK(String NETWORK) {
        this.NETWORK = NETWORK;
    }

    public String getFile() {
        return File;
    }

    public void setFile(String file) {
        File = file;
    }

    @Override
    public String toString() {
        return "image_withAsset_Network_File{" +
                "IMAGE='" + IMAGE + '\'' +
                ", Assets='" + Assets + '\'' +
                ", NETWORK='" + NETWORK + '\'' +
                ", File='" + File + '\'' +
                '}';
    }
}


