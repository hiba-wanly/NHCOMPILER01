package Gremmers;

public class NameN extends AST{
    private String nam ;
    private int linenum;
    private int childrennum;

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public int getLinenum() {
        return linenum;
    }

    public void setLinenum(int linenum) {
        this.linenum = linenum;
    }

    public int getChildrennum() {
        return childrennum;
    }

    public void setChildrennum(int childrennum) {
        this.childrennum = childrennum;
    }

    @Override
    public String toString() {
        return "NameN{" +
                "nam='" + nam + '\''
                + "line:"+linenum+"children:"+childrennum
                +
                "\n";
    }
}
