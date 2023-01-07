package Gremmers.var.SwitchStatement;

import Gremmers.AST;
import Gremmers.var.SwitchStatement.Case.CaseStatement;

import java.util.ArrayList;
import java.util.List;

public class SwitchWithNUM extends AST {
    private String switchh;
    private String numm;
    private List<CaseStatement> casestat = new ArrayList<CaseStatement>();
    private DefaultStatement def;
    private int linenum;
    private int childrennum;

    public String getSwitchh() {
        return switchh;
    }

    public void setSwitchh(String switchh) {
        this.switchh = switchh;
    }

    public String getNumm() {
        return numm;
    }

    public void setNumm(String numm) {
        this.numm = numm;
    }

    public List<CaseStatement> getCasestat() {
        return casestat;
    }

    public void setCasestat(List<CaseStatement> casestat) {
        this.casestat=casestat;
    }

    public DefaultStatement getDef() {
        return def;
    }

    public void setDef(DefaultStatement def) {
        this.def = def;
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
        return "SwitchWithNUM{" +
                "switchh='" + switchh + '\'' +
                ", numm='" + numm + '\'' +
                ", casestat=" + casestat +
                ", def=" + def
                + "line:"+linenum+"children:"+childrennum
                +
                "\n";
    }
}
