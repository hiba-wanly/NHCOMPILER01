package Gremmers.Flutter.Padding;

import Gremmers.AST;
import Gremmers.Flutter.FlutterWidget.FlutterWidget;

import java.util.ArrayList;
import java.util.List;

public class padding_sym_vertical_num_numFloat extends AST {

    private String PADDING;
    private String PAD_SYM;
    private String VERTICAL;
    private String NUM;
    private String CHILD;
    private List<FlutterWidget> flutterWidget = new ArrayList<FlutterWidget>() ;
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
    public void setPADDING( String PADDING ){
        this.PADDING=PADDING;
    }

    public String getPADDING(){
        return PADDING;
    }
    public void setPAD_SYM( String PAD_SYM){
        this.PAD_SYM=PAD_SYM;
    }
    public String getPAD_SYM(){
        return PAD_SYM;
    }

    public void setVERTICAL( String VERTICAL){
        this.VERTICAL=VERTICAL;
    }
    public String getVERTICAL(){
        return VERTICAL;
    }
    public void setNUM( String NUM){
        this.NUM=NUM;
    }
    public String getNUM(){
        return NUM;
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
        return "padding_sym_vertical_num_numFloat{" +
                "PADDING='" + PADDING + '\'' +"\n"+
                ", PAD_SYM='" + PAD_SYM + '\'' +"\n"+
                ", VERTICAL='" + VERTICAL + '\'' +"\n"+
                ", NUM='" + NUM + '\'' +"\n"+
                ", CHILD='" + CHILD + '\'' +"\n"+
                ", flutterWidget=" + flutterWidget +"\n"+
                ", Line number " + numline+"\n"+
                ", children count = " + ChildrenCount +"\n"+
                ", parent node"+parent+
                "} \n";
    }
}
