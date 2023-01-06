package Gremmers.Flutter.expandedClasses;

import Gremmers.AST;
import Gremmers.Flutter.Column.Column;
import Gremmers.Flutter.Row.Row;

public class expanded_withCol_withRow extends AST {

    private String EXPANDED;
    private String CHILD ;
    private Column column ;
    private Row row ;

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
                    "} \n";
        return "expanded_withCol_withRow{" +
                "EXPANDED='" + EXPANDED + '\'' +
                ", CHILD='" + CHILD + '\'' +
                ", row=" + row +
                "} \n";
    }
}

