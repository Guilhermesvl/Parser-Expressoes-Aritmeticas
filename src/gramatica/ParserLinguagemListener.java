// Generated from ParserLinguagem.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserLinguagem}.
 */
public interface ParserLinguagemListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserLinguagem#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(ParserLinguagem.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLinguagem#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(ParserLinguagem.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLinguagem#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(ParserLinguagem.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLinguagem#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(ParserLinguagem.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLinguagem#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(ParserLinguagem.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLinguagem#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(ParserLinguagem.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLinguagem#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(ParserLinguagem.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLinguagem#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(ParserLinguagem.FatorContext ctx);
}