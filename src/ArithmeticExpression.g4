grammar ArithmeticExpression;

Operations: '+'|'-'|'*'|'/';
AtrOperator: '=';
Var: Letter(Letter|Digit)*;
Integer: Digit+;
Float:Digit+('.'Digit+);
OP: '(';
CP: ')';

fragment Letter: [a-zA-Z];
fragment Digit: [0-9];

