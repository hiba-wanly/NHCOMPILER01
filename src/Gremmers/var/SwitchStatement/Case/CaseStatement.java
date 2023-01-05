package Gremmers.var.SwitchStatement.Case;

import Gremmers.AST;

public class CaseStatement extends AST {
    private CaseWithID caseid;
    private CaseWithNUM casenum;

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

    @Override
    public String toString() {
        if(this.caseid!=null){
            return "CaseStatement{" +
                    "caseid=" + caseid +  '}';
        }
        return "CaseStatement{" +
                ", casenum=" + casenum +
                '}';
    }
}
