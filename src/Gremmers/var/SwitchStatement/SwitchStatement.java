package Gremmers.var.SwitchStatement;

import Gremmers.AST;

public class SwitchStatement extends AST {
    private SwitchWithID switchid;
    private SwitchWithNUM switchnum;

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

    @Override
    public String toString() {
        if(this.switchid!=null){
            return "SwitchStatement{" +
                    "switchid=" + switchid +   '}';
        }
        return "SwitchStatement{" +
                ", switchnum=" + switchnum +
                '}';
    }
}
