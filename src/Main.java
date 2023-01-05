import Gremmers.visitor.AntlrToAST;
import Gremmers.prog.Prog;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import syntax.projectLexer;
import syntax.projectParser;

import java.io.IOException;



public class Main {
    public static void main(String[] args) {
        try {
            String source = "folders/test4";
            CharStream input = CharStreams.fromFileName(source);
            projectLexer lexer = new projectLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            projectParser parser = new projectParser(tokens);
            ParseTree dartAST = parser.prog();
            AntlrToAST programVisitor = new AntlrToAST();
            Prog prog = (Prog) programVisitor.visit(dartAST);

//            Prog prog = (Prog) new AntlrToAST().visit(dartAST);
            System.out.println(prog);
//            System.out.println("hiiii");
//            System.out.println("hii");

        } catch (IOException e) {
            e.printStackTrace();
//            throw new RuntimeException(e);
        }

        System.out.println("Hello world!");
    }
}