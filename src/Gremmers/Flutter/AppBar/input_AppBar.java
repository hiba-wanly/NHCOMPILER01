package Gremmers.Flutter.AppBar;

import Gremmers.AST;

public class input_AppBar extends AST {

    private input_1AppBar attr_input_1AppBar;
    private input_2AppBar attr_input_2AppBar;
    private input_3AppBar attr_input_3AppBar;
    private input_4AppBar attr_input_4AppBar;
    private int numline;
    private int ChildrenCount ;

    private String left ;
    private String sibling;

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

    public input_1AppBar getinput_1AppBar() {
        return attr_input_1AppBar;
    }

    public void setinput_1AppBar(input_1AppBar attr_input_1AppBar) {
        this.attr_input_1AppBar = attr_input_1AppBar;
    }

    public input_2AppBar getinput_2AppBar() {
        return attr_input_2AppBar;
    }

    public void setinput_2AppBar(input_2AppBar attr_input_2AppBar) {
        this.attr_input_2AppBar = attr_input_2AppBar;
    }

    public input_3AppBar getinput_3AppBar() {
        return attr_input_3AppBar;
    }

    public void setinput_3AppBar(input_3AppBar attr_input_3AppBar) {
        this.attr_input_3AppBar = attr_input_3AppBar;
    }

    public input_4AppBar getinput_4AppBar() {
        return attr_input_4AppBar;
    }

    public void setinput_4AppBar(input_4AppBar attr_input_4AppBar) {
        this.attr_input_4AppBar = attr_input_4AppBar;
    }


    public String getSibling() {
        return sibling;
    }

    public void setSibling(String sibling) {
        this.sibling = sibling;
    }

    @Override
    public String toString() {
        if(this.attr_input_1AppBar!=null)
            return "input_AppBar{" +
                    "attr_input_1AppBar=" + attr_input_1AppBar +"\n"+ "Line number " + numline+ "\n"+"children count = " + ChildrenCount +"\n"+ "left child " + left+ "sibling"+sibling+"} \n";
        if(this.attr_input_2AppBar!=null)
            return "input_AppBar{" +
                    ", attr_input_2AppBar=" + attr_input_2AppBar +"\n"+ "Line number " + numline+ "\n"+"children count = " + ChildrenCount + "\n"+ "left child " + left+"sibling"+sibling+"} \n";

       if(this.attr_input_3AppBar!=null)
           return "input_AppBar{" +
                   ", attr_input_3AppBar=" + attr_input_3AppBar + "\n"+ "Line number " + numline+ "\n"+"children count = " + ChildrenCount+ "\n"+"left child " + left+"sibling"+sibling+ "} \n";
        return "input_AppBar{" +
                ", attr_input_4AppBar=" + attr_input_4AppBar +
                "Line number " + numline+ "children count = " + ChildrenCount+ "left child " + left+"sibling"+sibling+
                "} \n";
    }
}
