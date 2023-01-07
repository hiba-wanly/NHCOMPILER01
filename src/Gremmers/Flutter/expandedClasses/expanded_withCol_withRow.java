package Gremmers.Flutter.expandedClasses;

import Gremmers.AST;
import Gremmers.Flutter.Column.Column;
import Gremmers.Flutter.Row.Row;

public class expanded_withCol_withRow extends AST {

    private String EXPANDED;
    private String CHILD ;
    private Column column ;
    private Row row ;
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

    public String getEXPANDED() {
        return EXPANDED;
    }

    public void setEXPANDED(String EXPANDED) {
        this.EXPANDED = EXPANDED;
    }

    public String getCHILD() {
        return CHILD;
    }

    public void setCHILD(String CHILD) {
        this.CHILD = CHILD;
    }

    public Column getColumn() {
        return column;
    }

    public void setColumn(Column column) {
        this.column = column;
    }

    public Row getRow() {
        return row;
    }

    public void setRow(Row row) {
        this.row = row;
    }

    @Override
    public String toString() {
        if(this.column!=null)
            return "expanded_withCol_withRow{" +
                 "EXPANDED='" + EXPANDED + '\'' +
                 ", CHILD='" + CHILD + '\'' +
                 ", column=" + column +
                    " , Line number " + numline+
                    ", children count = " + ChildrenCount +
                    "} \n";
        return "expanded_withCol_withRow{" +
                "EXPANDED='" + EXPANDED + '\'' +
                ", CHILD='" + CHILD + '\'' +
                ", row=" + row +
                " , Line number " + numline+
                ", children count = " + ChildrenCount +
                "} \n";
    }
}

