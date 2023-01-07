package Gremmers.classes;

import Gremmers.AST;
import Gremmers.NameN;

public class AbstractStatment extends AST {
    private String abstr;
    private String clas;

    private NameN id;
    private int linenum;
    private int childrennum;

    public void setAbstr(String abstr){
        this.abstr = abstr;
    }
    public String getAbstr(){
        return abstr;
    }
    public void setClas(String clas){
        this.clas = clas;
    }
    public String getClas(){
        return clas;
    }
    public void setId(NameN id){
        this.id = id;
    }
    public NameN getId(){
        return id;
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
        return "AbstractStatment{" +
                "abstr='" + abstr + '\'' +
                ", clas='" + clas + '\'' +
                ", id='" + id + '\''
                + "line:"+linenum+"children:"+childrennum+
                "} \n";
    }
}
