# Implementação de um Parser para Expressões Aritméticas com Atribuição

## Sobre o Projeto

Este é um projeto idealizado pelo Professor Rafael Durelli, docente da disciplina de Teoria da Computação da Universidade Federal de Lavras (UFLA), que aborda os seguintes requisitos:

#### Objetivo

O objetivo deste trabalho prático é implementar um parser que seja capaz de analisar e interpretar expressões aritméticas com atribuição de acordo com a gramática livre de contexto fornecida.


#### Descrição do Problema 

Neste trabalho prático, os alunos devem implementar um parser capaz de analisar expressões aritméticas com atribuição e interpretá-las de acordo com as especificações fornecidas na gramática livre de contexto.


**Elementos do Parser:**

1. **Gramática Livre de Contexto (GLC):**

   - Conjunto de Símbolos Não-Terminais: {A, E, T, F, V, N, D}

   - Conjunto de Símbolos Terminais: {a, b, c, ..., z, 0, 1, 2, ..., 9, =, +, -, *, /, (, )}

   - Conjunto de Regras de Produção P:

     - A → V = E

     - E → E + T

     - E → E - T

     - E → T

     - T → T * F

     - T → T / F

     - T → F

     - F → (E)

     - F → N

     - F → V

     - N → ND

     - D → 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9

     - V → a | b | c | ... | z


#### Implementação do Parser

Os alunos devem implementar um parser capaz de analisar uma sequência de tokens representando uma expressão aritmética com atribuição e interpretá-la de acordo com a gramática livre de contexto fornecida. O parser deve ser capaz de:

- Receber uma sequência de tokens como entrada.

- Verificar se a sequência de tokens está de acordo com a gramática definida.

- Interpretar a expressão aritmética com atribuição e calcular o valor resultante.


#### Exemplo de Uso:

Os alunos devem fornecer um exemplo de uso do parser, demonstrando a definição da gramática livre de contexto, dos tokens e das regras de produção, bem como o processamento de uma sequência de tokens para interpretar uma expressão aritmética com atribuição.


