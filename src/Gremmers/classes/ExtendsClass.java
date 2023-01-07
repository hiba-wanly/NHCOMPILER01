package Gremmers.classes;

import Gremmers.Flutter.extendClasses.extendClasses.extends_ClassStateFull_AND_Less;
import Gremmers.AST;
import Gremmers.Flutter.extendClasses.extendClasses.*;

public class ExtendsClass extends AST {

    private extends_ClassStateFull_AND_Less attr_extends_ClassStateFull_AND_Less;
    private extends_ClassStateFull_AND_Less_WithAppBar attr_extends_ClassStateFull_AND_Less_WithAppBar;
    private extends_ClassStateFull_AND_Less_withinput attr_extends_ClassStateFull_AND_Less_withinput;
    private extends_ClassStateFull_AND_Less_withinput_appBar attr_extends_ClassStateFull_AND_Less_withinput_appBar;
    private extends_ClassStatment_Withinput attr_extends_ClassStatment_Withinput;
    private extends_ClassStatment_Withoutinput attr_extends_ClassStatment_Withoutinput;
    private int linenum;
    private int childrennum;
    public extends_ClassStateFull_AND_Less getAttr_extends_ClassStateFull_AND_Less() {
        return attr_extends_ClassStateFull_AND_Less;
    }

    public void setAttr_extends_ClassStateFull_AND_Less(extends_ClassStateFull_AND_Less attr_extends_ClassStateFull_AND_Less) {
        this.attr_extends_ClassStateFull_AND_Less = attr_extends_ClassStateFull_AND_Less;
    }

    public extends_ClassStateFull_AND_Less_WithAppBar getAttr_extends_ClassStateFull_AND_Less_WithAppBar() {
        return attr_extends_ClassStateFull_AND_Less_WithAppBar;
    }

    public void setAttr_extends_ClassStateFull_AND_Less_WithAppBar(extends_ClassStateFull_AND_Less_WithAppBar attr_extends_ClassStateFull_AND_Less_WithAppBar) {
        this.attr_extends_ClassStateFull_AND_Less_WithAppBar = attr_extends_ClassStateFull_AND_Less_WithAppBar;
    }

    public extends_ClassStateFull_AND_Less_withinput getAttr_extends_ClassStateFull_AND_Less_withinput() {
        return attr_extends_ClassStateFull_AND_Less_withinput;
    }

    public void setAttr_extends_ClassStateFull_AND_Less_withinput(extends_ClassStateFull_AND_Less_withinput attr_extends_ClassStateFull_AND_Less_withinput) {
        this.attr_extends_ClassStateFull_AND_Less_withinput = attr_extends_ClassStateFull_AND_Less_withinput;
    }

    public extends_ClassStateFull_AND_Less_withinput_appBar getAttr_extends_ClassStateFull_AND_Less_withinput_appBar() {
        return attr_extends_ClassStateFull_AND_Less_withinput_appBar;
    }

    public void setAttr_extends_ClassStateFull_AND_Less_withinput_appBar(extends_ClassStateFull_AND_Less_withinput_appBar attr_extends_ClassStateFull_AND_Less_withinput_appBar) {
        this.attr_extends_ClassStateFull_AND_Less_withinput_appBar = attr_extends_ClassStateFull_AND_Less_withinput_appBar;
    }

    public extends_ClassStatment_Withinput getAttr_extends_ClassStatment_Withinput() {
        return attr_extends_ClassStatment_Withinput;
    }

    public void setAttr_extends_ClassStatment_Withinput(extends_ClassStatment_Withinput attr_extends_ClassStatment_Withinput) {
        this.attr_extends_ClassStatment_Withinput = attr_extends_ClassStatment_Withinput;
    }

    public extends_ClassStatment_Withoutinput getAttr_extends_ClassStatment_Withoutinput() {
        return attr_extends_ClassStatment_Withoutinput;
    }

    public void setAttr_extends_ClassStatment_Withoutinput(extends_ClassStatment_Withoutinput attr_extends_ClassStatment_Withoutinput) {
        this.attr_extends_ClassStatment_Withoutinput = attr_extends_ClassStatment_Withoutinput;
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
        if(this.attr_extends_ClassStateFull_AND_Less!=null)
           return "ExtendsClass{attr_extends_ClassStateFull_AND_Less:" +attr_extends_ClassStateFull_AND_Less+ "line:"+linenum+"children:"+childrennum+"}\n";

        if(this.attr_extends_ClassStateFull_AND_Less_WithAppBar!=null)
            return "ExtendsClass{attr_extends_ClassStateFull_AND_Less_WithAppBar:" +attr_extends_ClassStateFull_AND_Less_WithAppBar+ "line:"+linenum+"children:"+childrennum+"}\n";
        if(this.attr_extends_ClassStateFull_AND_Less_withinput!=null)
            return "ExtendsClass{attr_extends_ClassStateFull_AND_Less_withinput:" +attr_extends_ClassStateFull_AND_Less_withinput+ "line:"+linenum+"children:"+childrennum+"}\n";
        if(this.attr_extends_ClassStateFull_AND_Less_withinput_appBar!=null)
            return "ExtendsClass{attr_extends_ClassStateFull_AND_Less_withinput_appBar:" +attr_extends_ClassStateFull_AND_Less_withinput_appBar+ "line:"+linenum+"children:"+childrennum+"}\n";
        if(this.attr_extends_ClassStatment_Withinput!=null)
            return "ExtendsClass{attr_extends_ClassStatment_Withinput:" +attr_extends_ClassStatment_Withinput+ "line:"+linenum+"children:"+childrennum+"}\n";
        return "ExtendsClass{ attr_extends_ClassStatment_Withoutinput=" + attr_extends_ClassStatment_Withoutinput + "line:"+linenum+"children:"+childrennum+"}\n";

    }
}
