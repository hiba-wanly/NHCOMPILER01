package Gremmers.prog;
import Gremmers.AST;

public class Element extends AST{
    private Body body;

    public Body getBody(){
        return body;
    }

    public void setBody(Body body){
//        System.out.println("addBody");
        this.body = body;
    }

    @Override
    public String toString() {
        return "Element{" +
                "body=" + body +
                '}';
    }

}
