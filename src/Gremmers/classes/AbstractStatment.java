package Gremmers.classes;

import Gremmers.AST;
import Gremmers.NameN;

public class AbstractStatment extends AST {
    private String abstr;
    private String clas;

    private NameN id;

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

    @Override
    public String toString() {
        return "AbstractStatment{" +
                "abstr='" + abstr + '\'' +
                ", clas='" + clas + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
