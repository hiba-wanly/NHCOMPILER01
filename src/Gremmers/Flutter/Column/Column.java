package Gremmers.Flutter.Column;

import Gremmers.AST;
import Gremmers.Flutter.FlutterWidget.FlutterWidget;

import java.util.ArrayList;
import java.util.List;

public class Column extends AST {

    private String COLUMN;
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

    public void setCOLUMN(String COLUMN ){
        this.COLUMN=COLUMN;
    }

    public String getCOLUMN (){
        return COLUMN;
    }

    public void setCHILDREN( String CHILDREN ){
        this.CHILDREN=CHILDREN;
    }

    public String getCHILDREN(){
        return CHILDREN;
    }

    public void setFlutterWidget( List<FlutterWidget> flutterWidget ){
        this.flutterWidget= flutterWidget;

    }

    public List<FlutterWidget> getFlutterWidget(){
        return flutterWidget;
    }

    @Override
    public String toString() {
        return "Column{" +
                "COLUMN='" + COLUMN + '\'' +
                ", CHILDREN='" + CHILDREN + '\'' +
                ", flutterWidget=" + flutterWidget +
                "Line number " + numline+
                ", children count = " + ChildrenCount +
                "} \n";
    }
}
