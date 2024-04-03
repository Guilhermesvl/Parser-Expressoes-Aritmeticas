# Generated from LexerLinguagem.g4 by ANTLR 4.13.1
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,9,52,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,
        6,7,6,2,7,7,7,2,8,7,8,1,0,4,0,21,8,0,11,0,12,0,22,1,0,4,0,26,8,0,
        11,0,12,0,27,3,0,30,8,0,1,1,1,1,1,2,1,2,1,3,1,3,1,4,1,4,1,5,1,5,
        1,6,1,6,1,7,1,7,1,8,4,8,47,8,8,11,8,12,8,48,1,8,1,8,0,0,9,1,1,3,
        2,5,3,7,4,9,5,11,6,13,7,15,8,17,9,1,0,3,2,0,65,90,97,122,1,0,48,
        57,3,0,9,10,13,13,32,32,55,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,
        7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,0,17,
        1,0,0,0,1,29,1,0,0,0,3,31,1,0,0,0,5,33,1,0,0,0,7,35,1,0,0,0,9,37,
        1,0,0,0,11,39,1,0,0,0,13,41,1,0,0,0,15,43,1,0,0,0,17,46,1,0,0,0,
        19,21,7,0,0,0,20,19,1,0,0,0,21,22,1,0,0,0,22,20,1,0,0,0,22,23,1,
        0,0,0,23,30,1,0,0,0,24,26,7,1,0,0,25,24,1,0,0,0,26,27,1,0,0,0,27,
        25,1,0,0,0,27,28,1,0,0,0,28,30,1,0,0,0,29,20,1,0,0,0,29,25,1,0,0,
        0,30,2,1,0,0,0,31,32,5,61,0,0,32,4,1,0,0,0,33,34,5,43,0,0,34,6,1,
        0,0,0,35,36,5,45,0,0,36,8,1,0,0,0,37,38,5,42,0,0,38,10,1,0,0,0,39,
        40,5,47,0,0,40,12,1,0,0,0,41,42,5,40,0,0,42,14,1,0,0,0,43,44,5,41,
        0,0,44,16,1,0,0,0,45,47,7,2,0,0,46,45,1,0,0,0,47,48,1,0,0,0,48,46,
        1,0,0,0,48,49,1,0,0,0,49,50,1,0,0,0,50,51,6,8,0,0,51,18,1,0,0,0,
        5,0,22,27,29,48,1,6,0,0
    ]

class LexerLinguagem(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    IDENTIFICADOR = 1
    IGUAL = 2
    MAIS = 3
    MENOS = 4
    MULTIPLICACAO = 5
    DIVISAO = 6
    ABRE_PARENTESES = 7
    FECHA_PARENTESES = 8
    ESPACO = 9

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'" ]

    symbolicNames = [ "<INVALID>",
            "IDENTIFICADOR", "IGUAL", "MAIS", "MENOS", "MULTIPLICACAO", 
            "DIVISAO", "ABRE_PARENTESES", "FECHA_PARENTESES", "ESPACO" ]

    ruleNames = [ "IDENTIFICADOR", "IGUAL", "MAIS", "MENOS", "MULTIPLICACAO", 
                  "DIVISAO", "ABRE_PARENTESES", "FECHA_PARENTESES", "ESPACO" ]

    grammarFileName = "LexerLinguagem.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None

