package Gremmers.Flutter.extendClasses.extendClasses;

import Gremmers.AST;
import Gremmers.Flutter.AppBar.input_AppBar;
import Gremmers.Flutter.FlutterWidget.FlutterWidget;
import Gremmers.NameN;

import java.util.ArrayList;
import java.util.List;

public class extends_ClassStateFull_AND_Less_WithAppBar extends AST {
    private String CLASS ;
    private NameN ID ;
    private String EXTENDS;
    private String type;
    private String OVERRIDE;
    private String BUILD_WIDGET;
    private String RETURN;
    private String SCAFFOLD;
    private String APPBAR;
    private String APPBAR_CHILD;
    private List<input_AppBar> attr_input_AppBar = new ArrayList<input_AppBar>();
    private String BODY;
    private List<FlutterWidget> flutterWidget = new ArrayList<FlutterWidget>();
    private int numline;
    private int ChildrenCount ;
    private String parent;
    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
    public int getChildrenCount() {
        return ChildrenCount;
    }

    public void setChildrenCount(int childrenCount) {
        ChildrenCount = childrenCount;
    }
    public int getNumline() {
        return numline;
    }

    public void setNumline(int numline) {
        this.numline = numline;
    }

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

    public String getEXTENDS() {
        return EXTENDS;
    }

    public void setEXTENDS(String EXTENDS) {
        this.EXTENDS = EXTENDS;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return "extends_ClassStateFull_AND_Less_WithAppBar{" +
                "CLASS='" + CLASS + '\'' +"\n"+
                ", ID='" + ID + '\'' +"\n"+
                ", extends " + EXTENDS + '\'' +"\n"+
                ", type='" + type + '\'' +"\n"+
                ", OVERRIDE='" + OVERRIDE + '\'' +"\n"+
                ", BUILD_WIDGET='" + BUILD_WIDGET + '\'' +"\n"+
                ", RETURN='" + RETURN + '\'' +"\n"+
                ", SCAFFOLD='" + SCAFFOLD + '\'' +"\n"+
                ", APPBAR='" + APPBAR + '\'' +"\n"+
                ", APPBAR_CHILD='" + APPBAR_CHILD + '\'' +"\n"+
                ", attr_input_AppBar=" + attr_input_AppBar +"\n"+
                ", BODY='" + BODY + '\'' +"\n"+
                ", flutterWidget=" + flutterWidget +"\n"+
                ", Line number " + numline+"\n"+
                ", children count = " + ChildrenCount +"\n"+
                ", parent node =" + parent +"\n"+
                "} \n";
    }
}
