# Generated from ParserLinguagem.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,9,48,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,1,0,1,0,1,0,1,0,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,1,5,1,22,8,1,10,1,12,1,25,9,1,1,2,1,2,
        1,2,1,2,1,2,1,2,1,2,1,2,1,2,5,2,36,8,2,10,2,12,2,39,9,2,1,3,1,3,
        1,3,1,3,1,3,3,3,46,8,3,1,3,0,2,2,4,4,0,2,4,6,0,0,48,0,8,1,0,0,0,
        2,12,1,0,0,0,4,26,1,0,0,0,6,45,1,0,0,0,8,9,5,1,0,0,9,10,5,2,0,0,
        10,11,3,2,1,0,11,1,1,0,0,0,12,13,6,1,-1,0,13,14,3,4,2,0,14,23,1,
        0,0,0,15,16,10,3,0,0,16,17,5,3,0,0,17,22,3,4,2,0,18,19,10,2,0,0,
        19,20,5,4,0,0,20,22,3,4,2,0,21,15,1,0,0,0,21,18,1,0,0,0,22,25,1,
        0,0,0,23,21,1,0,0,0,23,24,1,0,0,0,24,3,1,0,0,0,25,23,1,0,0,0,26,
        27,6,2,-1,0,27,28,3,6,3,0,28,37,1,0,0,0,29,30,10,3,0,0,30,31,5,5,
        0,0,31,36,3,6,3,0,32,33,10,2,0,0,33,34,5,6,0,0,34,36,3,6,3,0,35,
        29,1,0,0,0,35,32,1,0,0,0,36,39,1,0,0,0,37,35,1,0,0,0,37,38,1,0,0,
        0,38,5,1,0,0,0,39,37,1,0,0,0,40,41,5,7,0,0,41,42,3,2,1,0,42,43,5,
        8,0,0,43,46,1,0,0,0,44,46,5,1,0,0,45,40,1,0,0,0,45,44,1,0,0,0,46,
        7,1,0,0,0,5,21,23,35,37,45
    ]

class ParserLinguagem ( Parser ):

    grammarFileName = "ParserLinguagem.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "'='", "'+'", "'-'", "'*'", 
                     "'/'", "'('", "')'" ]

    symbolicNames = [ "<INVALID>", "IDENTIFICADOR", "IGUAL", "MAIS", "MENOS", 
                      "MULTIPLICACAO", "DIVISAO", "ABRE_PARENTESES", "FECHA_PARENTESES", 
                      "ESPACO" ]

    RULE_atribuicao = 0
    RULE_expressao = 1
    RULE_termo = 2
    RULE_fator = 3

    ruleNames =  [ "atribuicao", "expressao", "termo", "fator" ]

    EOF = Token.EOF
    IDENTIFICADOR=1
    IGUAL=2
    MAIS=3
    MENOS=4
    MULTIPLICACAO=5
    DIVISAO=6
    ABRE_PARENTESES=7
    FECHA_PARENTESES=8
    ESPACO=9

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class AtribuicaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENTIFICADOR(self):
            return self.getToken(ParserLinguagem.IDENTIFICADOR, 0)

        def IGUAL(self):
            return self.getToken(ParserLinguagem.IGUAL, 0)

        def expressao(self):
            return self.getTypedRuleContext(ParserLinguagem.ExpressaoContext,0)


        def getRuleIndex(self):
            return ParserLinguagem.RULE_atribuicao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAtribuicao" ):
                listener.enterAtribuicao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAtribuicao" ):
                listener.exitAtribuicao(self)




    def atribuicao(self):

        localctx = ParserLinguagem.AtribuicaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_atribuicao)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 8
            self.match(ParserLinguagem.IDENTIFICADOR)
            self.state = 9
            self.match(ParserLinguagem.IGUAL)
            self.state = 10
            self.expressao(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def termo(self):
            return self.getTypedRuleContext(ParserLinguagem.TermoContext,0)


        def expressao(self):
            return self.getTypedRuleContext(ParserLinguagem.ExpressaoContext,0)


        def MAIS(self):
            return self.getToken(ParserLinguagem.MAIS, 0)

        def MENOS(self):
            return self.getToken(ParserLinguagem.MENOS, 0)

        def getRuleIndex(self):
            return ParserLinguagem.RULE_expressao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressao" ):
                listener.enterExpressao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressao" ):
                listener.exitExpressao(self)



    def expressao(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = ParserLinguagem.ExpressaoContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 2
        self.enterRecursionRule(localctx, 2, self.RULE_expressao, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 13
            self.termo(0)
            self._ctx.stop = self._input.LT(-1)
            self.state = 23
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,1,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 21
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,0,self._ctx)
                    if la_ == 1:
                        localctx = ParserLinguagem.ExpressaoContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expressao)
                        self.state = 15
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 16
                        self.match(ParserLinguagem.MAIS)
                        self.state = 17
                        self.termo(0)
                        pass

                    elif la_ == 2:
                        localctx = ParserLinguagem.ExpressaoContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expressao)
                        self.state = 18
                        if not self.precpred(self._ctx, 2):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                        self.state = 19
                        self.match(ParserLinguagem.MENOS)
                        self.state = 20
                        self.termo(0)
                        pass

             
                self.state = 25
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,1,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class TermoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def fator(self):
            return self.getTypedRuleContext(ParserLinguagem.FatorContext,0)


        def termo(self):
            return self.getTypedRuleContext(ParserLinguagem.TermoContext,0)


        def MULTIPLICACAO(self):
            return self.getToken(ParserLinguagem.MULTIPLICACAO, 0)

        def DIVISAO(self):
            return self.getToken(ParserLinguagem.DIVISAO, 0)

        def getRuleIndex(self):
            return ParserLinguagem.RULE_termo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTermo" ):
                listener.enterTermo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTermo" ):
                listener.exitTermo(self)



    def termo(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = ParserLinguagem.TermoContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 4
        self.enterRecursionRule(localctx, 4, self.RULE_termo, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 27
            self.fator()
            self._ctx.stop = self._input.LT(-1)
            self.state = 37
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,3,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 35
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
                    if la_ == 1:
                        localctx = ParserLinguagem.TermoContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_termo)
                        self.state = 29
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 30
                        self.match(ParserLinguagem.MULTIPLICACAO)
                        self.state = 31
                        self.fator()
                        pass

                    elif la_ == 2:
                        localctx = ParserLinguagem.TermoContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_termo)
                        self.state = 32
                        if not self.precpred(self._ctx, 2):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                        self.state = 33
                        self.match(ParserLinguagem.DIVISAO)
                        self.state = 34
                        self.fator()
                        pass

             
                self.state = 39
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,3,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class FatorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ABRE_PARENTESES(self):
            return self.getToken(ParserLinguagem.ABRE_PARENTESES, 0)

        def expressao(self):
            return self.getTypedRuleContext(ParserLinguagem.ExpressaoContext,0)


        def FECHA_PARENTESES(self):
            return self.getToken(ParserLinguagem.FECHA_PARENTESES, 0)

        def IDENTIFICADOR(self):
            return self.getToken(ParserLinguagem.IDENTIFICADOR, 0)

        def getRuleIndex(self):
            return ParserLinguagem.RULE_fator

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFator" ):
                listener.enterFator(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFator" ):
                listener.exitFator(self)




    def fator(self):

        localctx = ParserLinguagem.FatorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_fator)
        try:
            self.state = 45
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [7]:
                self.enterOuterAlt(localctx, 1)
                self.state = 40
                self.match(ParserLinguagem.ABRE_PARENTESES)
                self.state = 41
                self.expressao(0)
                self.state = 42
                self.match(ParserLinguagem.FECHA_PARENTESES)
                pass
            elif token in [1]:
                self.enterOuterAlt(localctx, 2)
                self.state = 44
                self.match(ParserLinguagem.IDENTIFICADOR)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[1] = self.expressao_sempred
        self._predicates[2] = self.termo_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expressao_sempred(self, localctx:ExpressaoContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 3)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 2)
         

    def termo_sempred(self, localctx:TermoContext, predIndex:int):
            if predIndex == 2:
                return self.precpred(self._ctx, 3)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 2)
         




