grammar hdl;

// Context-free grammar for parser
start: '.hardware' name_of_file=IDENTIFIER '.inputs' ins=IDENTIFIER+ '.outputs' outs=IDENTIFIER+ '.latches' lats=latchSection '.update' upds=updateSection '.simulate' sim=simulateSection EOF;

latchSection: latches+; 
latches: 	id1=IDENTIFIER '->' id2=IDENTIFIER;

updateSection: updates+; 
updates: id=IDENTIFIER '=' e=expr;


simulateSection : id=IDENTIFIER '=' e=expr;


expr: 
      id = IDENTIFIER          #Var
    | n = NUMERIC              #Num
    | op='!'e=expr             #Not
    | e1=expr op='&&' e2=expr  #And
    | e1=expr op='||' e2=expr  #Or
    | '(' e=expr ')'           #Paren
    ;

// Grammar for lexer
IDENTIFIER : [A-Za-z][A-Za-z0-9]*;
NUMERIC : [0-1]+;
WS : [ \t\r\n]+ -> skip; // ignore whitespace
LINECOMMENT : '//' ~[\r\n]* -> skip; // look for // and then other characters that are not a line break 
BLOCKCOMMENT : '/*' .*? '*/' -> skip; // look for the opening of a comment block '/*' then greedily try to match as many characters, but add ? to make it a 'lazy match' so that it stops at the close '*/' and doesn't consume more than one block of comments







