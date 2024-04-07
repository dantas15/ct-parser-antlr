import Parser.ArithmeticExpressionLexer;
import Parser.ArithmeticExpressionParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filename = System.getProperty("user.dir") + "/src/token_example.txt";
        System.out.println(filename);
        try {
            CharStream input = CharStreams.fromFileName(filename);
            ArithmeticExpressionLexer lexer = new ArithmeticExpressionLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ArithmeticExpressionParser parser = new ArithmeticExpressionParser(tokens);

            ParseTree ast = parser.start();

            System.out.println(ast.toStringTree());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}