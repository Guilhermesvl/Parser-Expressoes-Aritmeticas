lexer grammar LexerLinguagem;

// Definição os tokens
IDENTIFICADOR : [a-zA-Z]+ | [0-9]+ ; 
IGUAL : '=' ;
MAIS : '+' ;
MENOS : '-' ;
MULTIPLICACAO : '*' ;
DIVISAO : '/' ;
ABRE_PARENTESES : '(' ;
FECHA_PARENTESES : ')' ;


ESPACO : [ \t\r\n]+ -> skip ; // Ignora os espaços em branco