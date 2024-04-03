from antlr4 import *
from LexerLinguagem import LexerLinguagem
from  ParserLinguagem import ParserLinguagem

input_text = "x = 5 + 3 * (8 - 6)"

lexer = LexerLinguagem(InputStream(input_text))
stream = CommonTokenStream(lexer)
parser = ParserLinguagem(stream)



tree = parser.atribuicao()