package Gremmers.Flutter.extendClasses.extendClasses;

import Gremmers.AST;
import Gremmers.Flutter.FlutterWidget.FlutterWidget;
import Gremmers.NameN;

import java.util.ArrayList;
import java.util.List;

public class extends_ClassStateFull_AND_Less extends AST {

    private String CLASS ;
    private NameN ID ;
    private String EXTENDS;
    private String type;
    private String OVERRIDE;
    private String BUILD_WIDGET;
    private String RETURN;
    private String SCAFFOLD;
    private String BODY;
    private List<FlutterWidget> flutterWidget = new ArrayList<FlutterWidget>();

    public String getCLASS() {
        return CLASS;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    public NameN getID() {
        return ID;
    }

    public void setID(NameN ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEXTENDS() {
        return EXTENDS;
    }

    public void setEXTENDS(String EXTENDS) {
        this.EXTENDS = EXTENDS;
    }

    public String getOVERRIDE() {
        return OVERRIDE;
    }

    public void setOVERRIDE(String OVERRIDE) {
        this.OVERRIDE = OVERRIDE;
    }

    public String getBUILD_WIDGET() {
        return BUILD_WIDGET;
    }

    public void setBUILD_WIDGET(String BUILD_WIDGET) {
        this.BUILD_WIDGET = BUILD_WIDGET;
    }

    public String getRETURN() {
        return RETURN;
    }

    public void setRETURN(String RETURN) {
        this.RETURN = RETURN;
    }

    public String getSCAFFOLD() {
        return SCAFFOLD;
    }

    public void setSCAFFOLD(String SCAFFOLD) {
        this.SCAFFOLD = SCAFFOLD;
    }

    public String getBODY() {
        return BODY;
    }

    public void setBODY(String BODY) {
        this.BODY = BODY;
    }

    public List<FlutterWidget> getFlutterWidget() {
        return flutterWidget;
    }

    public void setFlutterWidget(List<FlutterWidget> flutterWidget) {
        this.flutterWidget = flutterWidget;
    }

    @Override
    public String toString() {
        return "extends_ClassStateFull_AND_Less{" +
                "CLASS='" + CLASS + '\'' +
                ", ID='" + ID + '\'' +
                ", extends " + EXTENDS + '\'' +
                ", type ='" + type + '\'' +
                ", OVERRIDE='" + OVERRIDE + '\'' +
                ", BUILD_WIDGET='" + BUILD_WIDGET + '\'' +
                ", RETURN='" + RETURN + '\'' +
                ", SCAFFOLD='" + SCAFFOLD + '\'' +
                ", BODY='" + BODY + '\'' +
                ", flutterWidget=" + flutterWidget +
                '}';
    }
}
