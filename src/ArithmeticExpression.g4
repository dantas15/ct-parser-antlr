grammar ArithmeticExpression;

/*
- A → V = E
*/
start: Letter AtrOperator sumSubExpr; // EOF is not defined but it represents the end of file

/*
- E → E + T
- E → E - T
- E → T

removing the left sided recursivity (recursivity ends in `digitExpr`)
*/
sumSubExpr: multDivExpr (SumOperators multDivExpr)*;

/*
- T → T * F
- T → T / F
- T → F

removing the left sided recursivity (recursivity ends in `digitExpr`)
*/
multDivExpr: finalExpr (MultOperators finalExpr)*;

/*
- F → (E)
- F → N
- F → V
*/
finalExpr: digitExpr | Letter | OP sumSubExpr CP;

/*
- N → ND

removing the recursivity
*/
digitExpr: (Digit)+;

/*
- F → (E)
- F → N
- F → V
*/
SumOperators: '+' | '-';
MultOperators: '*' | '/';
AtrOperator: '=';
OP: '(';
CP: ')';
Letter: [a-zA-Z];
Digit: [0-9];

WS: [' '\n\t\r]+ -> skip;
