package Gremmers.prog;
import Gremmers.AST;
import Gremmers.classes.AbstractStatment;
import Gremmers.classes.ClassStatement;
import Gremmers.classes.ExtendsClass;

public class Classes extends AST{

    private ExtendsClass extendsClass;

    private AbstractStatment abstractStatment;

    private ClassStatement classStatement;
    private int linenum;
    private int childrennum;

    public void setExtendsClass(ExtendsClass extendsClass){
        this.extendsClass = extendsClass;
    }

    public ExtendsClass getExtendsClass(){
        return extendsClass;
    }

    public void setAbstractStatment(AbstractStatment abstractStatment){
        this.abstractStatment = abstractStatment;
    }

    public AbstractStatment getAbstractStatment(){
        return abstractStatment;
    }

    public void setClassStatement(ClassStatement classStatement){
//        System.out.println("addBodysss");
        this.classStatement = classStatement;
    }

    public ClassStatement getClassStatement(){
        return classStatement;
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
        if(this.extendsClass != null)
            return "\n Body Classes {"+ extendsClass
                    + "line:"+linenum+"children:"+childrennum
                    +"}\n";
        else if (this.abstractStatment != null)
            return "\n Body Classes {"+ abstractStatment
                    + "line:"+linenum+"children:"+childrennum
                    +"}\n";
//        else if (this.classStatement != null)
            return "\n Body Classes {"+ classStatement
                    + "line:"+linenum+"children:"+childrennum
                    +"}\n";
//        return "Classes{" +
//                "extendsClass=" + extendsClass +
//                ", abstractStatment=" + abstractStatment +
//                ", classStatement=" + classStatement +
//                '}';
    }
}

