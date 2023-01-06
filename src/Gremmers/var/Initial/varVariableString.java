package Gremmers.var.Initial;

import Gremmers.AST;
import Gremmers.NameN;

import java.util.ArrayList;
import java.util.List;

public class varVariableString extends AST {

    private  String type;

    private  NameN id ;

    private List<Rule> rule = new ArrayList<Rule>();

    public void setVarVaiableType(String type){
        this.type = type;
    }

    public void setVarVaiableId(NameN id){
        this.id = id;
    }


    public void setVarVaiableRule(List<Rule> rule){
        this.rule = rule;
    }

    public String getVarVaiabletype(){
        return type;
    }
    public NameN getVarVaiableid(){
        return id;
    }


    public List<Rule> getVarVaiablerule(){
        return rule;
    }

    @Override
    public String toString() {
        return "varVariableString{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", rule=" + rule +
                "} \n";
    }
}
