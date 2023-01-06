package Gremmers.Flutter.TextStatement;

import Gremmers.AST;

public class text_INPUT_D_Q_N extends AST {

    private String TEXT;
    private String INPUT_D_Q_N;

    public String getTEXT() {
        return TEXT;
    }

    public void setTEXT(String TEXT) {
        this.TEXT = TEXT;
    }

    public String getINPUT_D_Q_N() {
        return INPUT_D_Q_N;
    }

    public void setINPUT_D_Q_N(String INPUT_D_Q_N) {
        this.INPUT_D_Q_N = INPUT_D_Q_N;
    }

    @Override
    public String toString() {
        return "text_INPUT_D_Q_N{" +
                "TEXT='" + TEXT + '\'' +
                ", INPUT_D_Q_N='" + INPUT_D_Q_N + '\'' +
                "} \n";
    }
}
