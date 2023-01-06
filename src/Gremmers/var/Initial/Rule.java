package Gremmers.var.Initial;

import Gremmers.AST;

public class Rule extends AST {
    private String id;
    private String num ;

    public void setId(String id ){
        this.id = id;
    }
    public void setNum(String num){
        this.num = num;
    }

    public String getId(){
        return id;
    }
    public String getNum(){
        return num;
    }


    @Override
    public String toString() {
        if(this.id!=null){
            return "Rule{" +
                    "id='" + id + '\'' + "} \n";
        }
        return "Rule{" +
                "num='" + num + '\'' +
                "} \n";
    }
}
