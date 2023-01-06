package Gremmers.var.Expression;

import Gremmers.AST;

public class NestedLogic2 extends AST {
    private String LOGIC_SIGNS;
    private Logic  logic;

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

    @Override
    public String toString() {
        return "NestedLogic2{" +
                "LOGIC_SIGNS='" + LOGIC_SIGNS + '\'' +
                ", logic=" + logic +
                "} \n";
    }
}
