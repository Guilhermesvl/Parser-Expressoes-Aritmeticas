// Generated from /home/guilherme/Parser-Expressoes-Aritmeticas/src/gramatica/ParserLinguagem.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserLinguagem}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserLinguagemVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserLinguagem#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(ParserLinguagem.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLinguagem#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(ParserLinguagem.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLinguagem#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(ParserLinguagem.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLinguagem#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(ParserLinguagem.FatorContext ctx);
}