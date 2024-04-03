# Generated from ParserLinguagem.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .ParserLinguagem import ParserLinguagem
else:
    from ParserLinguagem import ParserLinguagem

# This class defines a complete listener for a parse tree produced by ParserLinguagem.
class ParserLinguagemListener(ParseTreeListener):

    # Enter a parse tree produced by ParserLinguagem#atribuicao.
    def enterAtribuicao(self, ctx:ParserLinguagem.AtribuicaoContext):
        pass

    # Exit a parse tree produced by ParserLinguagem#atribuicao.
    def exitAtribuicao(self, ctx:ParserLinguagem.AtribuicaoContext):
        pass


    # Enter a parse tree produced by ParserLinguagem#expressao.
    def enterExpressao(self, ctx:ParserLinguagem.ExpressaoContext):
        pass

    # Exit a parse tree produced by ParserLinguagem#expressao.
    def exitExpressao(self, ctx:ParserLinguagem.ExpressaoContext):
        pass


    # Enter a parse tree produced by ParserLinguagem#termo.
    def enterTermo(self, ctx:ParserLinguagem.TermoContext):
        pass

    # Exit a parse tree produced by ParserLinguagem#termo.
    def exitTermo(self, ctx:ParserLinguagem.TermoContext):
        pass


    # Enter a parse tree produced by ParserLinguagem#fator.
    def enterFator(self, ctx:ParserLinguagem.FatorContext):
        pass

    # Exit a parse tree produced by ParserLinguagem#fator.
    def exitFator(self, ctx:ParserLinguagem.FatorContext):
        pass



del ParserLinguagem