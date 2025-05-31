lexer grammar AngularLexer;
PUBLIC : 'public';
PRIVATE : 'private';
INT     : 'int';
// Tokens
SEMI             : ';' ;
LET              : 'let' ;
CONST            : 'const' ;
FUNCTION         : 'function' ;
CLASS            : 'class' ;
CONSTRUCTOR      : 'constructor' ;
INTERFACE        : 'interface' ;
IMPORT           : 'import' ;
FROM             : 'from' ;
EXPORT           : 'export' ;
AT               : '@' ;
TRUE             : 'true' ;
FALSE            : 'false' ;
OF               : 'of';

// Angular-specific Tokens
AT_COMPONENT      : '@Component' ;
SELECTOR          : 'selector' ;
STANDALONE        : 'standalone' ;
TEMPLATE          : 'template' ;
STYLES            : 'styles' ;
STYLE             : 'style';

DIV_TAG           : 'div';
P_TAG             : 'p';
IMG_TAG           : 'img';
H2_TAG            : 'h2';
H1_TAG            : 'h1';
H3_TAG            : 'h3';
BUTTON            : 'button';
HTML_TAG_OPEN     : '<';
HTML_TAG_CLOSE    : '>';
HTML_TAG_END      : '</';
HTML_SELF_CLOSING : '/>';



 ADD : '+';
 SUB : '-';
 MULT : '*';
 DIV : '/';

// CSS properties
COLOR        : 'color';
BACKGROUND   : 'background';
FONT_SIZE    : 'font-size';
WIDTH        : 'width';
HEIGHT       : 'height';
DISPLAY      : 'display';
POSITION     : 'position';
MARGIN       : 'margin';
PADDING      : 'padding';
BORDER       : 'border';

IMPORTS      : 'imports' ;

BINDING           : '[' Identifier ']' ;
TWO_WAY_BINDING   : '[(' Identifier ')]' ;
PROPERTY_BINDING  : '{{' .*? '}}' ;

// Attributes
Alt               : 'alt';
Src               : 'src';

// Angular Directives & Events
NG_FOR        : '*ngFor' ;
NG_IF         : '*ngIf' ;
CLICK_EVENT   : '(click)' ;

// CSS values
CSS_COLOR_HEX : '#' ([a-fA-F0-9]|[a-fA-F0-9]) ;
CSS_UNIT      : [0-9]+('px'|'em'|'rem'|'%') ;
CSS_KEYWORD   : 'auto' | 'solid' ;

// Literals
StringLiteral     : '"' (~["\\\r\n])* '"' | '\'' (~['\\\r\n])* '\'' ;
NumberLiteral     : [0-9]+ ('.' [0-9]+)? ;
BooleanLiteral    : TRUE | FALSE ;

// Identifiers and selectors
HASH_SELECTOR : '#' Identifier ;
Identifier    : [a-zA-Z_$][a-zA-Z0-9_$]* ;

// Types
STRING   : 'string';
NUMBER   : 'number';
BOOLEAN  : 'boolean';





// Symbols
DOT         : '.' ;
ARRAY_START : '[' ;
ARRAY_END   : ']' ;
LBRACE      : '{' ;
RBRACE      : '}' ;
LPAREN      : '(' ;
RPAREN      : ')' ;
COLON       : ':' ;
COMMA       : ',' ;
EQUAL       : '=' ;
BACKTICK    : '`' ;

DIRECTIVE         : '\\*[a-zA-Z][a-zA-Z0-9_]*' ;
EVENT_BINDING     : '\\([a-zA-Z][a-zA-Z0-9_]*\\)' ;

// Whitespace and Comments
WHITESPACE : [ \t\r\n]+ -> skip ;
COMMENT    : '//' ~[\r\n]* -> skip;
