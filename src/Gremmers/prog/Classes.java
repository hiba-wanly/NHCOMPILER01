package Gremmers.prog;
import Gremmers.AST;
import Gremmers.classes.AbstractStatment;
import Gremmers.classes.ClassStatement;
import Gremmers.classes.ExtendsClass;

public class Classes extends AST{

    private ExtendsClass extendsClass;

    private AbstractStatment abstractStatment;

    private ClassStatement classStatement;


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


    @Override
    public String toString() {
        if(this.extendsClass != null)
            return "\n Body Classes {"+ extendsClass+"}\n";
        else if (this.abstractStatment != null)
            return "\n Body Classes {"+ abstractStatment+"}\n";
//        else if (this.classStatement != null)
            return "\n Body Classes {"+ classStatement+"}\n";
//        return "Classes{" +
//                "extendsClass=" + extendsClass +
//                ", abstractStatment=" + abstractStatment +
//                ", classStatement=" + classStatement +
//                '}';
    }
}

