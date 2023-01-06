package Gremmers.var.SwitchStatement;

import Gremmers.AST;
import Gremmers.var.SwitchStatement.Case.CaseStatement;

import java.util.ArrayList;
import java.util.List;

public class SwitchWithID extends AST {
    private String switchh;
    private String id;
    private List<CaseStatement> casestat = new ArrayList<CaseStatement>();
    private DefaultStatement def;

    public String getSwitchh() {
        return switchh;
    }

    public void setSwitchh(String switchh) {
        this.switchh = switchh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "SwitchWithID{" +
                "switchh='" + switchh + '\'' +
                ", id='" + id + '\'' +
                ", casestat=" + casestat +
                ", def=" + def +
                "\n";
    }
}
