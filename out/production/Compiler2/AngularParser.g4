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
    | expression SEMI
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
    : componentProperty (COMMA componentProperty)* COMMA?
    ;

componentProperty
    : SELECTOR COLON StringLiteral
    | TEMPLATE COLON template
    |STYLES COLON ARRAY_START styles ARRAY_END
    | STANDALONE COLON TRUE
    | IMPORTS COLON array
    ;

styles
    : BACKTICK styleRule* BACKTICK
    ;


styleRule
    : cssSelector (COLON_SELECTOR )? LBRACE cssDeclaration+ RBRACE
    ;

cssSelector
    : Identifier
    | DOT Identifier
    | HASH_SELECTOR Identifier
    | DIV_TAG
    | P_TAG
    | IMG_TAG
    | H1_TAG
    | H2_TAG
    | H3_TAG
    | BUTTON
    | FORM
    | NAV
    | INPUT
    | TEXTAREA
    ;


cssDeclaration
    : cssProperty COLON cssValue (COMMA cssValue)* SEMI
    ;



cssProperty
    : COLOR
    | BACKGROUND
    | FONT_SIZE
    | FONT_WEIGHT
    | WIDTH
    | HEIGHT
    | DISPLAY
    | POSITION
    | MARGIN
    | PADDING
    | BORDER
    | BORDER_RADIUS
    | BOX_SHADOW
    | CURSOR
    | OBJECT_FIT
    | TRANSITION
    | TRANSFORM
    | OUTLINE
    | TEXT_ALIGN
    | FLEX_WRAP
    | GAP
    ;

cssValue
    : CSS_UNIT
    | CSS_COLOR_HEX
    | CSS_KEYWORD
    | LINEAR_GRADIENT
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
    |buttonElement
    |navElement
    |formElement
    |inputElement
    |textareaElement

    ;

formElement
    : HTML_TAG_OPEN  FORM htmlAttributes? HTML_TAG_CLOSE htmlContent? HTML_TAG_END FORM HTML_TAG_CLOSE
    ;
divElement
    : HTML_TAG_OPEN  DIV_TAG htmlAttributes? HTML_TAG_CLOSE htmlContent? HTML_TAG_END DIV_TAG HTML_TAG_CLOSE
    ;
buttonElement
    : HTML_TAG_OPEN  BUTTON htmlAttributes? HTML_TAG_CLOSE htmlContent? HTML_TAG_END BUTTON HTML_TAG_CLOSE
    ;
navElement
        : HTML_TAG_OPEN  NAV htmlAttributes? HTML_TAG_CLOSE htmlContent? HTML_TAG_END NAV HTML_TAG_CLOSE
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

inputElement
         : HTML_TAG_OPEN  INPUT htmlAttributes? HTML_SELF_CLOSING


        ;
 textareaElement
            : HTML_TAG_OPEN  TEXTAREA  htmlAttributes? HTML_TAG_CLOSE htmlContent? HTML_TAG_END TEXTAREA HTML_TAG_CLOSE
            ;

  htmlAttributes
      : (angularDirective | angularEvent | angularBinding | styleAttribute | srcAttribute |formAttribute| altAttribute | StringLiteral)*
      ;

    angularDirective
        : NG_FOR EQUAL StringLiteral
        | NG_IF EQUAL StringLiteral
        ;


        angularEvent
            : CLICK_EVENT EQUAL StringLiteral
             | NG_SUBMIT_EVENT EQUAL StringLiteral
              ;



        angularBinding
            : BINDING EQUAL (assignment | StringLiteral)
           | TWO_WAY_BINDING EQUAL StringLiteral
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

        formAttribute
              : TYPE EQUAL StringLiteral
               | PLACEHOLDER EQUAL StringLiteral
               | ROWS EQUAL StringLiteral
               | REQUIRED_ATTR
                 ;




variableStatement
    : (PUBLIC | PRIVATE)? Identifier (COLON type)? EQUAL (value | array | object) SEMI
    | INT  Identifier (COLON type)? EQUAL (expression) SEMI
    |  (PUBLIC | PRIVATE)? CONST Identifier (COLON type)? (EQUAL (value | array | object))? SEMI
    |  (PUBLIC | PRIVATE)? LET Identifier (COLON type)? (EQUAL (value | array | object))? SEMI

    ;




array
    : ARRAY_START arrayElements? ARRAY_END
    ;


arrayElements
    : arrayElement (COMMA arrayElement)*
    ;



arrayElement
    : object
    | value
    ;


object

    : LBRACE (property (COMMA property)*)? RBRACE
    ;



property
    : (Identifier | StringLiteral) COLON expression
    ;


value
    : StringLiteral
    | NumberLiteral
    | BooleanLiteral
    | object
    | array
    | Identifier
    | THIS
    | expression
    ;


type
    : Identifier ( Identifier (COMMA Identifier)* )?
    |(Identifier | StringLiteral) (PIPE (Identifier | StringLiteral))*
    | ANY

    ;



classDeclaration
    : CLASS Identifier LBRACE classBody* RBRACE
    ;




classBody
    : variableStatement
    | functionDeclaration
    | constructorDeclaration

    ;



functionDeclaration
    : Identifier LPAREN parameterList? RPAREN block
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


expressionList
    : expression (COMMA expression)*
    ;

expression
    : expression EQUAL expression
    | expression DOT Identifier
    | expression DOT Identifier LPAREN expressionList? RPAREN
    | Identifier LPAREN expressionList? RPAREN
    | literal
    | object
    | Identifier
    | propertyBinding
    | twoWayBinding
    | ngDirective
    | LPAREN expression RPAREN
    | THIS
    ;


literal
    : StringLiteral
    | NumberLiteral
    | BooleanLiteral
    | NULL

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
    |Identifier COLON type (COMMA Identifier COLON type)*
    ;
//expressionList
//    : expression (COMMA expression)*
//    ;

block
    : LBRACE statement* RBRACE
    ;
