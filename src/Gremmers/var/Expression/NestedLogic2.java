package Gremmers.var.Expression;

import Gremmers.AST;

public class NestedLogic2 extends AST {
    private String LOGIC_SIGNS;
    private Logic  logic;
    private int linenum;
    private int childrennum;
    public String getLOGIC_SIGNS() {
        return LOGIC_SIGNS;
    }

    public void setLOGIC_SIGNS(String LOGIC_SIGNS) {
        this.LOGIC_SIGNS = LOGIC_SIGNS;
    }

    public Logic getLogic() {
        return logic;
    }

    public void setLogic(Logic logic) {
        this.logic = logic;
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
        return "NestedLogic2{" +
                "LOGIC_SIGNS='" + LOGIC_SIGNS + '\'' +
                ", logic=" + logic
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
