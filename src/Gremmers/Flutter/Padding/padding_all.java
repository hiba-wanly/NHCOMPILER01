package Gremmers.Flutter.Padding;

import Gremmers.AST;
import Gremmers.Flutter.FlutterWidget.FlutterWidget;

import java.util.ArrayList;
import java.util.List;

public class padding_all extends AST {


    private String PADDING ;
    private String PAD_ALL;
    private String NUM_FLOAT;
    private String CHILD;
    private List<FlutterWidget> flutterWidget = new ArrayList<FlutterWidget>();

    public void setPADDING(String PADDING){
        this.PADDING=PADDING;
    }

    public String getPADDING(){
        return PADDING;
    }

    public void setPAD_ALL(String PAD_ALL){
        this.PAD_ALL=PAD_ALL;
    }
    public String getPAD_ALL(){
        return PAD_ALL;
    }

    public void setNUM_FLOAT( String NUM_FLOAT ){
        this.NUM_FLOAT=NUM_FLOAT;
    }

    public String getNUM_FLOAT(){
        return NUM_FLOAT;
    }

    public void setCHILD(String CHILD){
        this.CHILD=CHILD;
    }

    public String getCHILD(){
        return CHILD;
    }

    public void setFlutterWidget( List<FlutterWidget> flutterWidget ){
        this.flutterWidget = flutterWidget;
    }

    public List<FlutterWidget> getFlutterWidget(){
        return flutterWidget;
    }

    @Override
    public String toString() {
        return "padding_all{" +
                "PADDING='" + PADDING + '\'' +
                ", PAD_ALL='" + PAD_ALL + '\'' +
                ", NUM_FLOAT='" + NUM_FLOAT + '\'' +
                ", CHILD='" + CHILD + '\'' +
                ", flutterWidget=" + flutterWidget +
                "} \n";
    }
}
