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
ANY              :'any';
THIS             : 'this';

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
NAV               :'nav';
FORM               :'form';
INPUT              :'input';
TEXTAREA          :'textarea';
HTML_TAG_OPEN     : '<';
HTML_TAG_CLOSE    : '>';
HTML_TAG_END      : '</';
HTML_SELF_CLOSING : '/>';


// Operators and Symbols
ADD : '+';
SUB : '-';
MULT : '*';
DIV : '/';
PIPE : '|';
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
EQUALD      :'===';
BACKTICK    : '`' ;


// CSS properties
COLOR         : 'color';
BACKGROUND    : 'background';
FONT_SIZE     : 'font-size';
FONT_WEIGHT   : 'font-weight';
WIDTH         : 'width';
HEIGHT        : 'height';
DISPLAY       : 'display';
POSITION      : 'position';
MARGIN        : 'margin';
PADDING       : 'padding';
BORDER        : 'border';
BORDER_RADIUS : 'border-radius';
BOX_SHADOW    : 'box-shadow';
CURSOR        : 'cursor';
OBJECT_FIT    : 'object-fit';
TRANSITION    : 'transition';
TRANSFORM     : 'transform';
OUTLINE       : 'outline';
TEXT_ALIGN    : 'text-align';
FLEX_WRAP     : 'flex-wrap';
GAP           : 'gap';
// CSS values and keywords
CSS_UNIT        : [0-9]+('px'|'em'|'rem'|'%') | '0';
CSS_COLOR_HEX   : '#' ([a-fA-F0-9])+;
CSS_KEYWORD     : 'auto' | 'solid' | 'pointer' | 'cover' | 'white' | 'none' | 'flex' | 'block' | 'center' | 'ease-in-out' | 'to right';
LINEAR_GRADIENT : 'linear-gradient';
ALL             : 'all';

// Selectors and Pseudo-classes
FOCUS           : 'focus';
HOVER           : 'hover';
SUBMIT          : 'submit';
LBRACKET        : '[';
RBRACKET        : ']';
ASTERISK        : '*';
COLON_SELECTOR  : ':';


IMPORTS          : 'imports' ;
TYPE             : 'type';
PLACEHOLDER      : 'placeholder';
ROWS             : 'rows';
REQUIRED_ATTR    : 'required';

BINDING           : '[' Identifier ']' ;
TWO_WAY_BINDING   : '[(' Identifier ')]' ;
PROPERTY_BINDING  : '{{' .*? '}}' ;

// Attributes
Alt               : 'alt';
Src               : 'src';
STYLE_ATTR        : 'style';

// Angular Directives & Events
NG_FOR        : '*ngFor' ;
NG_IF         : '*ngIf' ;
CLICK_EVENT   : '(click)' ;
NG_SUBMIT_EVENT:'('Identifier')';



// Literals
StringLiteral     : '"' (~["\\\r\n])* '"' | '\'' (~['\\\r\n])* '\'' ;
NumberLiteral     : [0-9]+ ('.' [0-9]+)? ;
BooleanLiteral    : TRUE | FALSE ;

// Identifiers and selectors
HASH_SELECTOR : '#' Identifier ;
Identifier    : [a-zA-Z_$][a-zA-Z0-9_$]* ;
TO           :'to';
// Types
STRING   : 'string';
NUMBER   : 'number';
BOOLEAN  : 'boolean';

// Whitespace and Comments
WS              : [ \t\r\n]+ -> skip;
COMMENT    : '//' ~[\r\n]* -> skip;
LINE_COMMENT : '//' .*? '\n' -> skip;
HTML_COMMENT: '<!--' .*? '-->' -> skip;

// Special cases
DOT_DOT : '..';