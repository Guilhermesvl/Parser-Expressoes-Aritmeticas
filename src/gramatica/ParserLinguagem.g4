parser grammar ParserLinguagem;

options { tokenVocab=LexerLinguagem; }

//Regras de produção
atribuicao : IDENTIFICADOR IGUAL expressao ;

expressao : expressao MAIS termo
          | expressao MENOS termo
          | termo ;

termo : termo MULTIPLICACAO fator
      | termo DIVISAO fator
      | fator ;

fator : ABRE_PARENTESES expressao FECHA_PARENTESES
      | IDENTIFICADOR;


