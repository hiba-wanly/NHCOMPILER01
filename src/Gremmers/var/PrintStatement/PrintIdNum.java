package Gremmers.var.PrintStatement;

import Gremmers.AST;

public class PrintIdNum extends AST {
    private String prin;
    private String world;

    public void setPrin(String prin){
        this.prin = prin;
    }
    public void setWorld(String world){
        this.world = world;
    }

    public String  getPrin(){
        return prin;
    }
    public String getWorld(){
        return world;
    }

    @Override
    public String toString() {
        return "PrintIdNum{" +
                "prin='" + prin + '\'' +
                ", world='" + world + '\'' +
                "} \n";
    }
}
