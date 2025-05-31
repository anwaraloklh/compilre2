parser grammar AngularParser;

options { tokenVocab=AngularLexer; }

// Parser Rules
program
    : statement+ EOF
    ;

statement
    : importStatement
    | decorator
    | componentDefinition
    | classDeclaration
    | variableStatement
    | functionDeclaration
    | interfaceDeclaration
    | exportStatement
    | assignment SEMI
    ;

assignment : Identifier DOT Identifier EQUAL expression ;

importStatement
    : IMPORT (importClause FROM StringLiteral)? SEMI
    ;


importClause
    : (LBRACE importSpecifier (COMMA importSpecifier)* RBRACE | Identifier)
    ;


importSpecifier
    : Identifier
    ;

 componentDefinition
        : decorator block
        ;

decorator
    : AT_COMPONENT LPAREN LBRACE componentPropertyList? RBRACE RPAREN
    ;


componentPropertyList
    : componentProperty (COMMA componentProperty)* COMMA?  // Allows for an optional trailing comma
    ;

componentProperty
    : SELECTOR COLON StringLiteral
    | TEMPLATE COLON template
    |STYLES COLON ARRAY_START styles ARRAY_END
    | STANDALONE COLON TRUE
    | IMPORTS COLON array
    ;

styles:
    BACKTICK  styleRule (COMMA styleRule)* COMMA?  BACKTICK
;
styleRule
    : cssSelector LBRACE cssDeclaration+ RBRACE
    ;

cssSelector
    : Identifier
    | DOT Identifier
    | HASH_SELECTOR Identifier
    | DIV_TAG
    | P_TAG
    | IMG_TAG
    | H2_TAG
    ;


cssDeclaration
    : cssProperty COLON cssValue (COMMA cssValue)* SEMI
    ;

cssProperty
    : COLOR
    | BACKGROUND
    | FONT_SIZE
    | WIDTH
    | HEIGHT
    | DISPLAY
    | POSITION
    | MARGIN
    | PADDING
    | BORDER
    ;

cssValue
    : CSS_UNIT
    | CSS_COLOR_HEX
    | CSS_KEYWORD
    | CSS_VALUE_STRING?
    | NumberLiteral
    | Identifier
    ;



template
    : BACKTICK htmlContent? BACKTICK
    ;
htmlContent
    : (htmlElement | interpolation | Identifier)*
    ;

interpolation
    : PROPERTY_BINDING
    ;

htmlElement
    : divElement
    | pElement
    | h2Element
    | imgElement


    ;


divElement
    : HTML_TAG_OPEN  DIV_TAG htmlAttributes? HTML_TAG_CLOSE htmlContent? HTML_TAG_END DIV_TAG HTML_TAG_CLOSE
    ;


pElement
    : HTML_TAG_OPEN P_TAG htmlAttributes? HTML_TAG_CLOSE htmlContent? HTML_TAG_END P_TAG HTML_TAG_CLOSE
    ;

h2Element
    : HTML_TAG_OPEN H2_TAG htmlAttributes? HTML_TAG_CLOSE htmlContent? HTML_TAG_END H2_TAG HTML_TAG_CLOSE
    ;

imgElement
      : HTML_TAG_OPEN IMG_TAG htmlAttributes? HTML_SELF_CLOSING
               ;

  htmlAttributes
      : (angularDirective | angularEvent | angularBinding | styleAttribute | srcAttribute | altAttribute | StringLiteral)*
      ;

    angularDirective
        : NG_FOR EQUAL StringLiteral
        | NG_IF EQUAL StringLiteral
        ;


        angularEvent
            : CLICK_EVENT EQUAL StringLiteral
            ;



        angularBinding
            : BINDING EQUAL (assignment | StringLiteral)
            ;


          styleAttribute
              : STYLE EQUAL StringLiteral
              ;


          srcAttribute
              : Src EQUAL assignment
              ;

          altAttribute
              : Alt EQUAL assignment
              ;






variableStatement
    : (PUBLIC | PRIVATE)? Identifier (COLON type)? EQUAL (value | array | object) SEMI
    | INT  Identifier (COLON type)? EQUAL (expression) SEMI
    |  (PUBLIC | PRIVATE)? CONST Identifier (COLON type)? (EQUAL (value | array | object))? SEMI
    |  (PUBLIC | PRIVATE)? LET Identifier (COLON type)? (EQUAL (value | array | object))? SEMI
    ;


arrayy: ARRAY_START (StringLiteral (COMMA StringLiteral)*)? ARRAY_END;

array
    : ARRAY_START arrayElements? ARRAY_END
    ;
arrayElements
    : arrayElement (COMMA arrayElement)*
    ;

arrayElement
    : object
    | value  // To handle identifiers, literals, and nested arrays
    ;
object
    : LBRACE (property (COMMA property)*)? RBRACE
    ;

property
    : (Identifier | StringLiteral) COLON value
    ;

value
    : StringLiteral
    | NumberLiteral
    | BooleanLiteral
    | object
    | array
    | Identifier
    ;
type
    : Identifier ( Identifier (COMMA Identifier)* )?
    ;


functionDeclaration
    : Identifier LPAREN parameterList? RPAREN block
    ;








classDeclaration
    : CLASS Identifier LBRACE classBody* RBRACE
    ;




classBody
    : variableStatement
    | functionDeclaration
    | constructorDeclaration
    ;

constructorDeclaration
    : CONSTRUCTOR LPAREN parameterList? RPAREN block
    ;


interfaceDeclaration
    : INTERFACE Identifier LBRACE interfaceBody* RBRACE
    ;



interfaceBody
    : Identifier COLON type SEMI
    ;





exportStatement
    : EXPORT (variableStatement | functionDeclaration | classDeclaration)
    ;



expression
    : expression MULT expression # MultiplicationDivisionExpression
    | expression DIV expression  # MultiplicationDivisionExpression
    | expression ADD expression  # AdditionSubtractionExpression
    | expression SUB expression  # AdditionSubtractionExpression
    | literal                    # LiteralExpression
    | Identifier                 # IdentifierExpression
    | propertyBinding            # PropertyBindingExpression
    | twoWayBinding              # TwoWayBindingExpression
    | ngDirective                # NgDirectiveExpression
    | LPAREN expression RPAREN   # ParenthesizedExpression
    ;
literal
    : StringLiteral
    | NumberLiteral
    | BooleanLiteral
    ;

propertyBinding
    : BINDING EQUAL StringLiteral
    ;



twoWayBinding
    : TWO_WAY_BINDING EQUAL StringLiteral
    ;



ngDirective
    : DIRECTIVE EQUAL StringLiteral
    ;



parameterList
    : Identifier COLON Identifier (COMMA parameterList)*
    ;




//expressionList
//    : expression (COMMA expression)*
//    ;


block
    : LBRACE statement* RBRACE
    ;
