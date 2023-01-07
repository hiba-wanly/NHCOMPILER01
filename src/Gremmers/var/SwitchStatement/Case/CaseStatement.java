package Gremmers.var.SwitchStatement.Case;

import Gremmers.AST;

public class CaseStatement extends AST {
    private CaseWithID caseid;
    private CaseWithNUM casenum;
    private int linenum;
    private int childrennum;

    public CaseWithID getCaseid() {
        return caseid;
    }

    public void setCaseid(CaseWithID caseid) {
        this.caseid = caseid;
    }

    public CaseWithNUM getCasenum() {
        return casenum;
    }

    public void setCasenum(CaseWithNUM casenum) {
        this.casenum = casenum;
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
        if(this.caseid!=null){
            return "CaseStatement{" +
                    "caseid=" + caseid
                    + "line:"+linenum+"children:"+childrennum
                    +  "} \n";
        }
        return "CaseStatement{" +
                ", casenum=" + casenum
                + "line:"+linenum+"children:"+childrennum
                +
                "} \n";
    }
}
