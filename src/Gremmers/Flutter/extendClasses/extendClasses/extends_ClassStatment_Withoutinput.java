package Gremmers.Flutter.extendClasses.extendClasses;

import Gremmers.AST;
import Gremmers.NameN;

public class extends_ClassStatment_Withoutinput extends AST {


    private String CLASS ;
    private NameN ID ;
    private String EXTENDS;
    private String ID_ID;
    private int numline;
    private int ChildrenCount ;
    private String parent;
    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
    public int getChildrenCount() {
        return ChildrenCount;
    }

    public void setChildrenCount(int childrenCount) {
        ChildrenCount = childrenCount;
    }
    public int getNumline() {
        return numline;
    }

    public void setNumline(int numline) {
        this.numline = numline;
    }

    public String getCLASS() {
        return CLASS;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    public NameN getID() {
        return ID;
    }

    public void setID(NameN ID) {
        this.ID = ID;
    }

    public String getEXTENDS() {
        return EXTENDS;
    }

    public void setEXTENDS(String EXTENDS) {
        this.EXTENDS = EXTENDS;
    }

    public String getID_ID() {
        return ID_ID;
    }

    public void setID_ID(String ID_ID) {
        this.ID_ID = ID_ID;
    }

    @Override
    public String toString() {
        return "extends_ClassStatment_Withoutinput{" +
                "CLASS='" + CLASS + '\'' +"\n"+
                ", ID='" + ID + '\'' +"\n"+
                ", extends " + EXTENDS + '\'' +"\n"+
                ", ID_ID='" + ID_ID + '\'' +"\n"+
                ", Line number " + numline+"\n"+
                ", children count = " + ChildrenCount +"\n"+
                ", parent node =" + parent +"\n"+
                "} \n";
    }
}
