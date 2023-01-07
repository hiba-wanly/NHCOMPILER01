package Gremmers.Flutter.TextStatement;

import Gremmers.AST;
import Gremmers.NameN;

public class rules extends AST {

    private NameN ID;
    private String NUM;
    private int numline;
    private int ChildrenCount ;

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
    public NameN getID() {
        return ID;
    }

    public void setID(NameN ID) {
        this.ID = ID;
    }

    public String getNUM() {
        return NUM;
    }

    public void setNUM(String NUM) {
        this.NUM = NUM;
    }

    @Override
    public String toString() {
        if(this.ID!=null)
            return "rules{" +
                    "ID='" + ID + '\'' +"Line number " + numline+ "children count = " + ChildrenCount+ "} \n";
        return "rules{" +
                ", NUM='" + NUM + '\'' + "Line number " + numline+ "children count = " + ChildrenCount+
                "} \n";
    }
}
