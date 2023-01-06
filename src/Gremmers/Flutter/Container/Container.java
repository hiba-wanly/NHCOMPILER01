package Gremmers.Flutter.Container;

import Gremmers.AST;
import Gremmers.Flutter.FlutterWidget.FlutterWidget;

import java.util.ArrayList;
import java.util.List;

public class Container extends AST {

    private String  CONTAINER ;
    private String CHILD;
    private List<FlutterWidget> flutterWidget = new ArrayList<FlutterWidget>();

    public String getCONTAINER() {
        return CONTAINER;
    }

    public void setCONTAINER(String CONTAINER) {
        this.CONTAINER = CONTAINER;
    }

    public String getCHILD() {
        return CHILD;
    }

    public void setCHILD(String CHILD) {
        this.CHILD = CHILD;
    }

    public List<FlutterWidget> getFlutterWidget() {
        return flutterWidget;
    }

    public void setFlutterWidget(List<FlutterWidget> flutterWidget) {
        this.flutterWidget = flutterWidget;
    }

    @Override
    public String toString() {
        return "Container{" +
                "CONTAINER='" + CONTAINER + '\'' +
                ", CHILD='" + CHILD + '\'' +
                ", flutterWidget=" + flutterWidget +
                '}';
    }
}
