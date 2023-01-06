package Gremmers.Flutter.extendClasses.extendClasses;

import Gremmers.AST;
import Gremmers.Flutter.AppBar.input_AppBar;
import Gremmers.Flutter.FlutterWidget.FlutterWidget;
import Gremmers.NameN;
import Gremmers.var.InputClasses;

import java.util.ArrayList;
import java.util.List;

public class extends_ClassStateFull_AND_Less_withinput_appBar extends AST {
    private String CLASS ;
    private NameN ID ;
    private String STATEFULLWIDGET;
    private String STATELESSWIDGET ;
    private List<InputClasses> inputClasses = new ArrayList<InputClasses>();
    private String OVERRIDE;
    private String BUILD_WIDGET;
    private String RETURN;
    private String SCAFFOLD;
    private String APPBAR;
    private String APPBAR_CHILD;
    private List<input_AppBar> attr_input_AppBar = new ArrayList<input_AppBar>();
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

    public String getSTATEFULLWIDGET() {
        return STATEFULLWIDGET;
    }

    public void setSTATEFULLWIDGET(String STATEFULLWIDGET) {
        this.STATEFULLWIDGET = STATEFULLWIDGET;
    }

    public String getSTATELESSWIDGET() {
        return STATELESSWIDGET;
    }

    public void setSTATELESSWIDGET(String STATELESSWIDGET) {
        this.STATELESSWIDGET = STATELESSWIDGET;
    }

    public List<InputClasses> getInputClasses() {
        return inputClasses;
    }

    public void setInputClasses(List<InputClasses> inputClasses) {
        this.inputClasses = inputClasses;
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

    public String getAPPBAR() {
        return APPBAR;
    }

    public void setAPPBAR(String APPBAR) {
        this.APPBAR = APPBAR;
    }

    public String getAPPBAR_CHILD() {
        return APPBAR_CHILD;
    }

    public void setAPPBAR_CHILD(String APPBAR_CHILD) {
        this.APPBAR_CHILD = APPBAR_CHILD;
    }

    public List<input_AppBar> getAttr_input_AppBar() {
        return attr_input_AppBar;
    }

    public void setAttr_input_AppBar(List<input_AppBar> attr_input_AppBar) {
        this.attr_input_AppBar = attr_input_AppBar;
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
        return "extends_ClassStateFull_AND_Less_withinput_appBar{" +
                "CLASS='" + CLASS + '\'' +
                ", ID='" + ID + '\'' +
                ", STATEFULLWIDGET='" + STATEFULLWIDGET + '\'' +
                ", STATELESSWIDGET='" + STATELESSWIDGET + '\'' +
                ", inputClasses=" + inputClasses +
                ", OVERRIDE='" + OVERRIDE + '\'' +
                ", BUILD_WIDGET='" + BUILD_WIDGET + '\'' +
                ", RETURN='" + RETURN + '\'' +
                ", SCAFFOLD='" + SCAFFOLD + '\'' +
                ", APPBAR='" + APPBAR + '\'' +
                ", APPBAR_CHILD='" + APPBAR_CHILD + '\'' +
                ", attr_input_AppBar=" + attr_input_AppBar +
                ", BODY='" + BODY + '\'' +
                ", flutterWidget=" + flutterWidget +
                '}';
    }
}
