package Gremmers.var.SwitchStatement;

import Gremmers.AST;

public class SwitchStatement extends AST {
    private SwitchWithID switchid;
    private SwitchWithNUM switchnum;
    private int linenum;
    private int childrennum;

    public SwitchWithID getSwitchid() {
        return switchid;
    }

    public void setSwitchid(SwitchWithID switchid) {
        this.switchid = switchid;
    }

    public SwitchWithNUM getSwitchnum() {
        return switchnum;
    }

    public void setSwitchnum(SwitchWithNUM switchnum) {
        this.switchnum = switchnum;
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
        if(this.switchid!=null){
            return "SwitchStatement{" +
                    "switchid=" + switchid
                    + "line:"+linenum+"children:"+childrennum
                    +   "\n";
        }
        return "SwitchStatement{" +
                ", switchnum=" + switchnum
                + "line:"+linenum+"children:"+childrennum
                +
                "\n";
    }
}
