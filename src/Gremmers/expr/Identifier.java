package Gremmers.expr;

import Gremmers.AST;

public class Identifier extends AST {
    private String id ;

    public void setIdentifier(String id){
        this.id = id;
    }

    public String getIdentifier(){
        return id;
    }


    @Override
    public String toString() {
        return "Identifier{" +
                "id='" + id + '\'' +
                "} \n";
    }
}
