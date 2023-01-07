package Gremmers.var.Initial;

import Gremmers.AST;
import Gremmers.NameN;

import java.util.ArrayList;
import java.util.List;

public class varVariableString extends AST {

    private  String type;

    private  NameN id ;

    private List<Rule> rule = new ArrayList<Rule>();
    private int linenum;
    private int childrennum;
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
    public int getLinenum() {
        return linenum;
    }

    public void setLinenum(int linenum) {
        this.linenum = linenum;
    }

    public int getChildrennum() {
        return childrennum;
    }

    public void setChildrennum(int childrennum) {
        this.childrennum = childrennum;
    }
    @Override
    public String toString() {
        return "varVariableString{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", rule=" + rule
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
