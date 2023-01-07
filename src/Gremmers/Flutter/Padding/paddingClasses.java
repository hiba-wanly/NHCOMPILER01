package Gremmers.Flutter.Padding;

import Gremmers.AST;

public class paddingClasses extends AST {

    private padding_all attr_padding_all;
    private padding_only attr_padding_only;
    private padding_sym_horisantal_num_numFloat attr_padding_sym_horisantal_num_numFloat;
    private padding_sym_vertical_num_numFloat attr_padding_sym_vertical_num_numFloat;

    private int numline;
    private int ChildrenCount ;

    private String left;


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
    public void setpadding_all( padding_all attr_padding_all){
        this.attr_padding_all=attr_padding_all;
    }

    public padding_all getpadding_all(){
        return attr_padding_all;
    }

    public void setpadding_only( padding_only attr_padding_only ){
        this.attr_padding_only=attr_padding_only;
    }

    public padding_only getpadding_only(){
        return attr_padding_only;
    }

    public void setpadding_sym_horisantal_num_numFloat( padding_sym_horisantal_num_numFloat attr_padding_sym_horisantal_num_numFloat){
        this.attr_padding_sym_horisantal_num_numFloat=attr_padding_sym_horisantal_num_numFloat;
    }

    public padding_sym_horisantal_num_numFloat getpadding_sym_horisantal_num_numFloat(){
        return attr_padding_sym_horisantal_num_numFloat;
    }

    public void setpadding_sym_vertical_num_numFloat( padding_sym_vertical_num_numFloat attr_padding_sym_vertical_num_numFloat ){
        this.attr_padding_sym_vertical_num_numFloat= attr_padding_sym_vertical_num_numFloat;
    }

    public padding_sym_vertical_num_numFloat getpadding_sym_vertical_num_numFloat(){
        return attr_padding_sym_vertical_num_numFloat;
    }

    @Override
    public String toString() {
        if(this.attr_padding_all != null){
            return "paddingClasses{" +
                    "attr_padding_all=" + attr_padding_all +"\n"+ "Line number " + numline+"\n"+ "children count = " + ChildrenCount+"\n"+ "left child"+left+ "}\n";
        }
        if(this.attr_padding_only != null){
            return "paddingClasses{" +
                    " attr_padding_only=" + attr_padding_only +"\n"+ "Line number " + numline+"\n"+ "children count = " + ChildrenCount+"\n"+"left child"+left+ "}\n";
        }
        if(this.attr_padding_sym_horisantal_num_numFloat != null){
            return "paddingClasses{" +
                    " attr_padding_sym_horisantal_num_numFloat=" + attr_padding_sym_horisantal_num_numFloat +"\n"+ "Line number " + numline+"\n"+ "children count = " + ChildrenCount+"left child"+left+ "}\n";
        }
        return "paddingClasses{" +
                "attr_padding_sym_vertical_num_numFloat=" + attr_padding_sym_vertical_num_numFloat +"\n"+ "Line number " + numline+"\n"+ "children count = " + ChildrenCount+"left child"+left+
                "} \n";
    }
}


