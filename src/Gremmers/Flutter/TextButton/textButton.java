package Gremmers.Flutter.TextButton;

import Gremmers.AST;
import Gremmers.Flutter.FlutterWidget.FlutterWidget;

import java.util.ArrayList;
import java.util.List;

public class textButton extends AST {

    private String TEXTBUTTON;
    private String CHILD ;
    private List<FlutterWidget> flutterWidget = new ArrayList<FlutterWidget>();
    private String ONPRESSED;
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
    public String getTEXTBUTTON() {
        return TEXTBUTTON;
    }

    public String getCHILD() {
        return CHILD;
    }

    public List<FlutterWidget> getFlutterWidget() {
        return flutterWidget;
    }

    public String getONPRESSED() {
        return ONPRESSED;
    }

    public void setTEXTBUTTON(String TEXTBUTTON) {
        this.TEXTBUTTON = TEXTBUTTON;
    }

    public void setCHILD(String CHILD) {
        this.CHILD = CHILD;
    }

    public void setFlutterWidget( List<FlutterWidget> flutterWidget) {
        this.flutterWidget = flutterWidget;
    }

    public void setONPRESSED(String ONPRESSED) {
        this.ONPRESSED = ONPRESSED;
    }

    @Override
    public String toString() {
        return "textButton{" +
                "TEXTBUTTON='" + TEXTBUTTON + '\'' +
                ", CHILD='" + CHILD + '\'' +
                ", flutterWidget=" + flutterWidget +
                ", ONPRESSED='" + ONPRESSED + '\'' +
                ", Line number " + numline+
                ", children count = " + ChildrenCount +
                "} \n";
    }
}
