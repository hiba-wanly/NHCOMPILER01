package Gremmers.var.Expression;

import Gremmers.AST;

public class Var extends AST {
    private String VARNAME;


    public String getVARNAME() {
        return VARNAME;
    }

    public void setVARNAME(String VARNAME) {
        this.VARNAME = VARNAME;
    }

    @Override
    public String toString() {
        return "Var{" +
                "VARNAME='" + VARNAME + '\'' +
                "} \n";
    }
}
