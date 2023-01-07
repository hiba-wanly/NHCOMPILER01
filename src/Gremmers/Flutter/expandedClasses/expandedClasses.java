package Gremmers.Flutter.expandedClasses;

import Gremmers.AST;

public class expandedClasses extends AST {

    private expanded_withCol_withRow attr_expanded_withCol_withRow;
    private int numline;
    private int ChildrenCount ;

    private String left ;

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
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

    public expanded_withCol_withRow getAttr_expanded_withCol_withRow() {
        return attr_expanded_withCol_withRow;
    }

    public void setAttr_expanded_withCol_withRow(expanded_withCol_withRow attr_expanded_withCol_withRow) {
        this.attr_expanded_withCol_withRow = attr_expanded_withCol_withRow;
    }

    @Override
    public String toString() {
        return "expandedClasses{" + "\n" +
                "attr_expanded_withCol_withRow=" + attr_expanded_withCol_withRow + "\n" +
                "Line number " + numline+ "\n" +
                ", children count = " + ChildrenCount + "\n" +
                ", left child " + left + "\n" +
                "} \n";
    }
}
