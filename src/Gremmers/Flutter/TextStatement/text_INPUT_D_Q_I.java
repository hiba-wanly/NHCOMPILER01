package Gremmers.Flutter.TextStatement;

import Gremmers.AST;

public class text_INPUT_D_Q_I extends AST {

    private String TEXT;
    private String INPUT_D_Q_I ;

    public String getTEXT() {
        return TEXT;
    }

    public void setTEXT(String TEXT) {
        this.TEXT = TEXT;
    }

    public String getINPUT_D_Q_I() {
        return INPUT_D_Q_I;
    }

    public void setINPUT_D_Q_I(String INPUT_D_Q_I) {
        this.INPUT_D_Q_I = INPUT_D_Q_I;
    }

    @Override
    public String toString() {
        return "text_INPUT_D_Q_I{" +
                "TEXT='" + TEXT + '\'' +
                ", INPUT_D_Q_I='" + INPUT_D_Q_I + '\'' +
                "} \n";
    }
}
