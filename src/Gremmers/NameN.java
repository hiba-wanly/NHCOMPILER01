package Gremmers;

public class NameN extends AST{
    private String nam ;

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    @Override
    public String toString() {
        return "NameN{" +
                "nam='" + nam + '\'' +
                "\n";
    }
}
