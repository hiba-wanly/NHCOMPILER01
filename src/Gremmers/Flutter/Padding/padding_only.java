package Gremmers.Flutter.Padding;

import Gremmers.AST;
import Gremmers.Flutter.FlutterWidget.FlutterWidget;
import Gremmers.Flutter.Padding.direction.direction;

import java.util.ArrayList;
import java.util.List;

public class padding_only extends AST {

    private String PADDING;
    private String PAD_ON;

    private List<direction> attr_direction = new ArrayList<direction>();
    private String CHILD ;
    private List<FlutterWidget> flutterWidget = new ArrayList<FlutterWidget>();

    public List<direction> getdirection() {
        return attr_direction;
    }

    public void setdirection(ArrayList<direction> attr_direction) {
        this.attr_direction = attr_direction;
    }

    public void setPADDING(String PADDING){
        this.PADDING=PADDING;
    }

    public String getPADDING(){
        return PADDING;
    }

    public void setPAD_ON(String PAD_ON){
        this.PAD_ON=PAD_ON;
    }
    public String getPAD_ON(){
        return PAD_ON;
    }

    public void setCHILD( String CHILD){
        this.CHILD=CHILD;
    }
    public String getCHILD(){
        return CHILD;
    }

    public void setFlutterWidget( List<FlutterWidget> flutterWidget){
        this.flutterWidget= flutterWidget;
    }
    public List<FlutterWidget> getFlutterWidget(){
        return flutterWidget;
    }

    @Override
    public String toString() {
        return "padding_only{" +
                "PADDING='" + PADDING + '\'' +
                ", PAD_ON='" + PAD_ON + '\'' +
                ", attr_direction=" + attr_direction +
                ", CHILD='" + CHILD + '\'' +
                ", flutterWidget=" + flutterWidget +
                '}';
    }
}
