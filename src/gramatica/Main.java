import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) {
        String inputText = "x = 5 + 3 * (8 - 6)";

        LexerLinguagem lexer = new LexerLinguagem(CharStreams.fromString(inputText));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ParserLinguagem parser = new ParserLinguagem(tokens);

        ParserLinguagem.AtribuicaoContext tree = parser.atribuicao();

        System.out.println(tree.toStringTree(parser));
    }
}
