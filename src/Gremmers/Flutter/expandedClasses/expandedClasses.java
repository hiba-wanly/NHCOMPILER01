package Gremmers.Flutter.expandedClasses;

import Gremmers.AST;

public class expandedClasses extends AST {

    private expanded_withCol_withRow attr_expanded_withCol_withRow;

    public expanded_withCol_withRow getAttr_expanded_withCol_withRow() {
        return attr_expanded_withCol_withRow;
    }

    public void setAttr_expanded_withCol_withRow(expanded_withCol_withRow attr_expanded_withCol_withRow) {
        this.attr_expanded_withCol_withRow = attr_expanded_withCol_withRow;
    }

    @Override
    public String toString() {
        return "expandedClasses{" +
                "attr_expanded_withCol_withRow=" + attr_expanded_withCol_withRow +
                '}';
    }
}
