package Gremmers.Flutter.Row;

import Gremmers.AST;
import Gremmers.Flutter.FlutterWidget.FlutterWidget;

import java.util.ArrayList;
import java.util.List;

public class Row extends AST {

    private String ROW;
    private String CHILDREN;
    private List<FlutterWidget> flutterWidget = new ArrayList<FlutterWidget>();
    private int numline;
    private int ChildrenCount ;

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
    public String getROW() {
        return ROW;
    }

    public void setROW(String ROW) {
        this.ROW = ROW;
    }

    public String getCHILDREN() {
        return CHILDREN;
    }

    public void setCHILDREN(String CHILDREN) {
        this.CHILDREN = CHILDREN;
    }

    public List<FlutterWidget> getFlutterWidget() {
        return flutterWidget;
    }

    public void setFlutterWidget(List<FlutterWidget> flutterWidget) {
        this.flutterWidget = flutterWidget;
    }

    @Override
    public String toString() {
        return "Row{" +
                "ROW='" + ROW + '\'' +
                ", CHILDREN='" + CHILDREN + '\'' +
                ", flutterWidget=" + flutterWidget +
                ", Line number " + numline+
                ", children count = " + ChildrenCount +
                "} \n";
    }
}
