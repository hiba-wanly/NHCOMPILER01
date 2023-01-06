package Gremmers.var;

import Gremmers.AST;
import Gremmers.var.DoWhileStatement.DoWhileStatement;
import Gremmers.var.IfStatement.IfStatment;
import Gremmers.var.Initial.Initial;
import Gremmers.var.Loop.Loop;
import Gremmers.var.PrintStatement.PrintStatement;
import Gremmers.var.SwitchStatement.SwitchStatement;
import Gremmers.var.TryCatchStatement.TryCatchStatement;
import Gremmers.var.WhileStatement.WhileStatement;

public class Input extends AST {
    private Initial initial;
    private IfStatment ifStatment;
    private Loop loop;
    private DoWhileStatement doWhileStatement;
    private WhileStatement whileStatement;
    private PrintStatement printStatement;
    private SwitchStatement switchStatement;
    private TryCatchStatement tryCatchStatement;

    public void setInitial(Initial initial){
        this.initial = initial;
    }
    public Initial getInitial(){
        return initial;
    }
    public void setIfStatment(IfStatment ifStatment){
        this.ifStatment = ifStatment;
    }
    public IfStatment getIfStatment(){
        return ifStatment;
    }
    public void setLoop(Loop loop){
        this.loop = loop;
    }
    public Loop getLoop(){
        return loop;
    }
    public void setDoWhileStatement(DoWhileStatement doWhileStatement){
        this.doWhileStatement = doWhileStatement;
    }
    public DoWhileStatement getDoWhileStatement(){
        return doWhileStatement;
    }
    public void setWhileStatement(WhileStatement whileStatement){
        this.whileStatement = whileStatement;
    }
    public WhileStatement getWhileStatement(){
        return whileStatement;
    }
    public void setPrintStatement(PrintStatement printStatement){
        this.printStatement = printStatement;
    }
    public PrintStatement getPrintStatement(){
        return printStatement;
    }
    public void setSwitchStatement(SwitchStatement switchStatement){
        this.switchStatement = switchStatement;
    }
    public SwitchStatement getSwitchStatement(){
        return switchStatement;
    }
    public void setTryCatchStatement(TryCatchStatement tryCatchStatement){
        this.tryCatchStatement = tryCatchStatement;
    }
    public TryCatchStatement getTryCatchStatement(){
        return tryCatchStatement;
    }

    @Override
    public String toString() {
        if(this.initial!=null){
            return "Input{" +
                    "initial=" + initial + "\n";
        }
        if(this.ifStatment!=null){
            return "Input{" +
                    ", ifStatment=" + ifStatment + "\n";
        }
        if(this.loop!=null){
            return "Input{" +
                    ", loop=" + loop + "\n";
        }
        if(this.doWhileStatement!=null){
            return "Input{" +
                    ", doWhileStatement=" + doWhileStatement + "\n";
        }
        if(this.whileStatement!=null){
            return "Input{" +
                    ", whileStatement=" + whileStatement + "\n";
        }
        if(this.printStatement!=null){
            return "Input{" +
                    ", printStatement=" + printStatement + "\n";
        }
        if(this.switchStatement!=null){
            return "Input{" +
                    ", switchStatement=" + switchStatement + "\n";
        }
        return "Input{" +
                "initial=" + initial +
                ", tryCatchStatement=" + tryCatchStatement +
                "\n";
    }
}
