// Generated from C:/Users/Anwar AL-Oklah/IdeaProjects/Compiler2/src/AngularParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUBLIC=1, PRIVATE=2, INT=3, SEMI=4, LET=5, CONST=6, FUNCTION=7, CLASS=8, 
		CONSTRUCTOR=9, INTERFACE=10, IMPORT=11, FROM=12, EXPORT=13, AT=14, TRUE=15, 
		FALSE=16, OF=17, ANY=18, THIS=19, AT_COMPONENT=20, SELECTOR=21, STANDALONE=22, 
		TEMPLATE=23, STYLES=24, STYLE=25, DIV_TAG=26, P_TAG=27, IMG_TAG=28, H2_TAG=29, 
		H1_TAG=30, H3_TAG=31, BUTTON=32, NAV=33, FORM=34, INPUT=35, TEXTAREA=36, 
		HTML_TAG_OPEN=37, HTML_TAG_CLOSE=38, HTML_TAG_END=39, HTML_SELF_CLOSING=40, 
		ADD=41, SUB=42, MULT=43, DIV=44, PIPE=45, DOT=46, ARRAY_START=47, ARRAY_END=48, 
		LBRACE=49, RBRACE=50, LPAREN=51, RPAREN=52, COLON=53, COMMA=54, EQUAL=55, 
		EQUALD=56, BACKTICK=57, COLOR=58, BACKGROUND=59, FONT_SIZE=60, FONT_WEIGHT=61, 
		WIDTH=62, HEIGHT=63, DISPLAY=64, POSITION=65, MARGIN=66, PADDING=67, BORDER=68, 
		BORDER_RADIUS=69, BOX_SHADOW=70, CURSOR=71, OBJECT_FIT=72, TRANSITION=73, 
		TRANSFORM=74, OUTLINE=75, TEXT_ALIGN=76, FLEX_WRAP=77, GAP=78, CSS_UNIT=79, 
		CSS_COLOR_HEX=80, CSS_KEYWORD=81, LINEAR_GRADIENT=82, ALL=83, FOCUS=84, 
		HOVER=85, SUBMIT=86, LBRACKET=87, RBRACKET=88, ASTERISK=89, COLON_SELECTOR=90, 
		IMPORTS=91, TYPE=92, PLACEHOLDER=93, ROWS=94, REQUIRED_ATTR=95, BINDING=96, 
		TWO_WAY_BINDING=97, PROPERTY_BINDING=98, Alt=99, Src=100, STYLE_ATTR=101, 
		NG_FOR=102, NG_IF=103, CLICK_EVENT=104, NG_SUBMIT_EVENT=105, StringLiteral=106, 
		NumberLiteral=107, BooleanLiteral=108, HASH_SELECTOR=109, Identifier=110, 
		TO=111, STRING=112, NUMBER=113, BOOLEAN=114, WS=115, COMMENT=116, LINE_COMMENT=117, 
		HTML_COMMENT=118, DOT_DOT=119, NULL=120, DIRECTIVE=121;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assignment = 2, RULE_importStatement = 3, 
		RULE_importClause = 4, RULE_importSpecifier = 5, RULE_componentDefinition = 6, 
		RULE_decorator = 7, RULE_componentPropertyList = 8, RULE_componentProperty = 9, 
		RULE_styles = 10, RULE_styleRule = 11, RULE_cssSelector = 12, RULE_cssDeclaration = 13, 
		RULE_cssProperty = 14, RULE_cssValue = 15, RULE_template = 16, RULE_htmlContent = 17, 
		RULE_interpolation = 18, RULE_htmlElement = 19, RULE_formElement = 20, 
		RULE_divElement = 21, RULE_buttonElement = 22, RULE_navElement = 23, RULE_pElement = 24, 
		RULE_h2Element = 25, RULE_imgElement = 26, RULE_inputElement = 27, RULE_textareaElement = 28, 
		RULE_htmlAttributes = 29, RULE_angularDirective = 30, RULE_angularEvent = 31, 
		RULE_angularBinding = 32, RULE_styleAttribute = 33, RULE_srcAttribute = 34, 
		RULE_altAttribute = 35, RULE_formAttribute = 36, RULE_variableStatement = 37, 
		RULE_array = 38, RULE_arrayElements = 39, RULE_arrayElement = 40, RULE_object = 41, 
		RULE_property = 42, RULE_value = 43, RULE_type = 44, RULE_classDeclaration = 45, 
		RULE_classBody = 46, RULE_functionDeclaration = 47, RULE_constructorDeclaration = 48, 
		RULE_interfaceDeclaration = 49, RULE_interfaceBody = 50, RULE_exportStatement = 51, 
		RULE_expressionList = 52, RULE_expression = 53, RULE_literal = 54, RULE_propertyBinding = 55, 
		RULE_twoWayBinding = 56, RULE_ngDirective = 57, RULE_parameterList = 58, 
		RULE_block = 59;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assignment", "importStatement", "importClause", 
			"importSpecifier", "componentDefinition", "decorator", "componentPropertyList", 
			"componentProperty", "styles", "styleRule", "cssSelector", "cssDeclaration", 
			"cssProperty", "cssValue", "template", "htmlContent", "interpolation", 
			"htmlElement", "formElement", "divElement", "buttonElement", "navElement", 
			"pElement", "h2Element", "imgElement", "inputElement", "textareaElement", 
			"htmlAttributes", "angularDirective", "angularEvent", "angularBinding", 
			"styleAttribute", "srcAttribute", "altAttribute", "formAttribute", "variableStatement", 
			"array", "arrayElements", "arrayElement", "object", "property", "value", 
			"type", "classDeclaration", "classBody", "functionDeclaration", "constructorDeclaration", 
			"interfaceDeclaration", "interfaceBody", "exportStatement", "expressionList", 
			"expression", "literal", "propertyBinding", "twoWayBinding", "ngDirective", 
			"parameterList", "block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'private'", "'int'", "';'", "'let'", "'const'", "'function'", 
			"'class'", "'constructor'", "'interface'", "'import'", "'from'", "'export'", 
			"'@'", "'true'", "'false'", "'of'", "'any'", "'this'", "'@Component'", 
			"'selector'", "'standalone'", "'template'", "'styles'", null, "'div'", 
			"'p'", "'img'", "'h2'", "'h1'", "'h3'", "'button'", "'nav'", "'form'", 
			"'input'", "'textarea'", "'<'", "'>'", "'</'", "'/>'", "'+'", "'-'", 
			null, "'/'", "'|'", "'.'", null, null, "'{'", "'}'", "'('", "')'", null, 
			"','", "'='", "'==='", "'`'", "'color'", "'background'", "'font-size'", 
			"'font-weight'", "'width'", "'height'", "'display'", "'position'", "'margin'", 
			"'padding'", "'border'", "'border-radius'", "'box-shadow'", "'cursor'", 
			"'object-fit'", "'transition'", "'transform'", "'outline'", "'text-align'", 
			"'flex-wrap'", "'gap'", null, null, null, "'linear-gradient'", "'all'", 
			"'focus'", "'hover'", "'submit'", null, null, null, null, "'imports'", 
			"'type'", "'placeholder'", "'rows'", "'required'", null, null, null, 
			"'alt'", "'src'", null, "'*ngFor'", "'*ngIf'", "'(click)'", null, null, 
			null, null, null, null, "'to'", "'string'", "'number'", "'boolean'", 
			null, null, null, null, "'..'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUBLIC", "PRIVATE", "INT", "SEMI", "LET", "CONST", "FUNCTION", 
			"CLASS", "CONSTRUCTOR", "INTERFACE", "IMPORT", "FROM", "EXPORT", "AT", 
			"TRUE", "FALSE", "OF", "ANY", "THIS", "AT_COMPONENT", "SELECTOR", "STANDALONE", 
			"TEMPLATE", "STYLES", "STYLE", "DIV_TAG", "P_TAG", "IMG_TAG", "H2_TAG", 
			"H1_TAG", "H3_TAG", "BUTTON", "NAV", "FORM", "INPUT", "TEXTAREA", "HTML_TAG_OPEN", 
			"HTML_TAG_CLOSE", "HTML_TAG_END", "HTML_SELF_CLOSING", "ADD", "SUB", 
			"MULT", "DIV", "PIPE", "DOT", "ARRAY_START", "ARRAY_END", "LBRACE", "RBRACE", 
			"LPAREN", "RPAREN", "COLON", "COMMA", "EQUAL", "EQUALD", "BACKTICK", 
			"COLOR", "BACKGROUND", "FONT_SIZE", "FONT_WEIGHT", "WIDTH", "HEIGHT", 
			"DISPLAY", "POSITION", "MARGIN", "PADDING", "BORDER", "BORDER_RADIUS", 
			"BOX_SHADOW", "CURSOR", "OBJECT_FIT", "TRANSITION", "TRANSFORM", "OUTLINE", 
			"TEXT_ALIGN", "FLEX_WRAP", "GAP", "CSS_UNIT", "CSS_COLOR_HEX", "CSS_KEYWORD", 
			"LINEAR_GRADIENT", "ALL", "FOCUS", "HOVER", "SUBMIT", "LBRACKET", "RBRACKET", 
			"ASTERISK", "COLON_SELECTOR", "IMPORTS", "TYPE", "PLACEHOLDER", "ROWS", 
			"REQUIRED_ATTR", "BINDING", "TWO_WAY_BINDING", "PROPERTY_BINDING", "Alt", 
			"Src", "STYLE_ATTR", "NG_FOR", "NG_IF", "CLICK_EVENT", "NG_SUBMIT_EVENT", 
			"StringLiteral", "NumberLiteral", "BooleanLiteral", "HASH_SELECTOR", 
			"Identifier", "TO", "STRING", "NUMBER", "BOOLEAN", "WS", "COMMENT", "LINE_COMMENT", 
			"HTML_COMMENT", "DOT_DOT", "NULL", "DIRECTIVE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				statement();
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2814749768691054L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 50355203L) != 0) );
			setState(125);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public ComponentDefinitionContext componentDefinition() {
			return getRuleContext(ComponentDefinitionContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				importStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				decorator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				componentDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				variableStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				functionDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(133);
				interfaceDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(134);
				exportStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(135);
				assignment();
				setState(136);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(138);
				expression(0);
				setState(139);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(Identifier);
			setState(144);
			match(DOT);
			setState(145);
			match(Identifier);
			setState(146);
			match(EQUAL);
			setState(147);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ImportClauseContext importClause() {
			return getRuleContext(ImportClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(IMPORT);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE || _la==Identifier) {
				{
				setState(150);
				importClause();
				setState(151);
				match(FROM);
				setState(152);
				match(StringLiteral);
				}
			}

			setState(156);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportClauseContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public List<ImportSpecifierContext> importSpecifier() {
			return getRuleContexts(ImportSpecifierContext.class);
		}
		public ImportSpecifierContext importSpecifier(int i) {
			return getRuleContext(ImportSpecifierContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ImportClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportClauseContext importClause() throws RecognitionException {
		ImportClauseContext _localctx = new ImportClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(158);
				match(LBRACE);
				setState(159);
				importSpecifier();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(160);
					match(COMMA);
					setState(161);
					importSpecifier();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167);
				match(RBRACE);
				}
				break;
			case Identifier:
				{
				setState(169);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportSpecifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public ImportSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecifierContext importSpecifier() throws RecognitionException {
		ImportSpecifierContext _localctx = new ImportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDefinitionContext extends ParserRuleContext {
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ComponentDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDefinitionContext componentDefinition() throws RecognitionException {
		ComponentDefinitionContext _localctx = new ComponentDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_componentDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			decorator();
			setState(175);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode AT_COMPONENT() { return getToken(AngularParser.AT_COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ComponentPropertyListContext componentPropertyList() {
			return getRuleContext(ComponentPropertyListContext.class,0);
		}
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(AT_COMPONENT);
			setState(178);
			match(LPAREN);
			setState(179);
			match(LBRACE);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31457280L) != 0) || _la==IMPORTS) {
				{
				setState(180);
				componentPropertyList();
				}
			}

			setState(183);
			match(RBRACE);
			setState(184);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentPropertyListContext extends ParserRuleContext {
		public List<ComponentPropertyContext> componentProperty() {
			return getRuleContexts(ComponentPropertyContext.class);
		}
		public ComponentPropertyContext componentProperty(int i) {
			return getRuleContext(ComponentPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ComponentPropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentPropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentPropertyListContext componentPropertyList() throws RecognitionException {
		ComponentPropertyListContext _localctx = new ComponentPropertyListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_componentPropertyList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			componentProperty();
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(187);
					match(COMMA);
					setState(188);
					componentProperty();
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(194);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentPropertyContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(AngularParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode TEMPLATE() { return getToken(AngularParser.TEMPLATE, 0); }
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public TerminalNode STYLES() { return getToken(AngularParser.STYLES, 0); }
		public TerminalNode ARRAY_START() { return getToken(AngularParser.ARRAY_START, 0); }
		public StylesContext styles() {
			return getRuleContext(StylesContext.class,0);
		}
		public TerminalNode ARRAY_END() { return getToken(AngularParser.ARRAY_END, 0); }
		public TerminalNode STANDALONE() { return getToken(AngularParser.STANDALONE, 0); }
		public TerminalNode TRUE() { return getToken(AngularParser.TRUE, 0); }
		public TerminalNode IMPORTS() { return getToken(AngularParser.IMPORTS, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ComponentPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentPropertyContext componentProperty() throws RecognitionException {
		ComponentPropertyContext _localctx = new ComponentPropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_componentProperty);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(SELECTOR);
				setState(198);
				match(COLON);
				setState(199);
				match(StringLiteral);
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(TEMPLATE);
				setState(201);
				match(COLON);
				setState(202);
				template();
				}
				break;
			case STYLES:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(STYLES);
				setState(204);
				match(COLON);
				setState(205);
				match(ARRAY_START);
				setState(206);
				styles();
				setState(207);
				match(ARRAY_END);
				}
				break;
			case STANDALONE:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				match(STANDALONE);
				setState(210);
				match(COLON);
				setState(211);
				match(TRUE);
				}
				break;
			case IMPORTS:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				match(IMPORTS);
				setState(213);
				match(COLON);
				setState(214);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesContext extends ParserRuleContext {
		public List<TerminalNode> BACKTICK() { return getTokens(AngularParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(AngularParser.BACKTICK, i);
		}
		public List<StyleRuleContext> styleRule() {
			return getRuleContexts(StyleRuleContext.class);
		}
		public StyleRuleContext styleRule(int i) {
			return getRuleContext(StyleRuleContext.class,i);
		}
		public StylesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesContext styles() throws RecognitionException {
		StylesContext _localctx = new StylesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_styles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(BACKTICK);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70506116022272L) != 0) || _la==HASH_SELECTOR || _la==Identifier) {
				{
				{
				setState(218);
				styleRule();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			match(BACKTICK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleRuleContext extends ParserRuleContext {
		public CssSelectorContext cssSelector() {
			return getRuleContext(CssSelectorContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public TerminalNode COLON_SELECTOR() { return getToken(AngularParser.COLON_SELECTOR, 0); }
		public List<CssDeclarationContext> cssDeclaration() {
			return getRuleContexts(CssDeclarationContext.class);
		}
		public CssDeclarationContext cssDeclaration(int i) {
			return getRuleContext(CssDeclarationContext.class,i);
		}
		public StyleRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleRuleContext styleRule() throws RecognitionException {
		StyleRuleContext _localctx = new StyleRuleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_styleRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			cssSelector();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON_SELECTOR) {
				{
				setState(227);
				match(COLON_SELECTOR);
				}
			}

			setState(230);
			match(LBRACE);
			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(231);
				cssDeclaration();
				}
				}
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 2097151L) != 0) );
			setState(236);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode HASH_SELECTOR() { return getToken(AngularParser.HASH_SELECTOR, 0); }
		public TerminalNode DIV_TAG() { return getToken(AngularParser.DIV_TAG, 0); }
		public TerminalNode P_TAG() { return getToken(AngularParser.P_TAG, 0); }
		public TerminalNode IMG_TAG() { return getToken(AngularParser.IMG_TAG, 0); }
		public TerminalNode H1_TAG() { return getToken(AngularParser.H1_TAG, 0); }
		public TerminalNode H2_TAG() { return getToken(AngularParser.H2_TAG, 0); }
		public TerminalNode H3_TAG() { return getToken(AngularParser.H3_TAG, 0); }
		public TerminalNode BUTTON() { return getToken(AngularParser.BUTTON, 0); }
		public TerminalNode FORM() { return getToken(AngularParser.FORM, 0); }
		public TerminalNode NAV() { return getToken(AngularParser.NAV, 0); }
		public TerminalNode INPUT() { return getToken(AngularParser.INPUT, 0); }
		public TerminalNode TEXTAREA() { return getToken(AngularParser.TEXTAREA, 0); }
		public CssSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorContext cssSelector() throws RecognitionException {
		CssSelectorContext _localctx = new CssSelectorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cssSelector);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(Identifier);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(DOT);
				setState(240);
				match(Identifier);
				}
				break;
			case HASH_SELECTOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(HASH_SELECTOR);
				setState(242);
				match(Identifier);
				}
				break;
			case DIV_TAG:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				match(DIV_TAG);
				}
				break;
			case P_TAG:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				match(P_TAG);
				}
				break;
			case IMG_TAG:
				enterOuterAlt(_localctx, 6);
				{
				setState(245);
				match(IMG_TAG);
				}
				break;
			case H1_TAG:
				enterOuterAlt(_localctx, 7);
				{
				setState(246);
				match(H1_TAG);
				}
				break;
			case H2_TAG:
				enterOuterAlt(_localctx, 8);
				{
				setState(247);
				match(H2_TAG);
				}
				break;
			case H3_TAG:
				enterOuterAlt(_localctx, 9);
				{
				setState(248);
				match(H3_TAG);
				}
				break;
			case BUTTON:
				enterOuterAlt(_localctx, 10);
				{
				setState(249);
				match(BUTTON);
				}
				break;
			case FORM:
				enterOuterAlt(_localctx, 11);
				{
				setState(250);
				match(FORM);
				}
				break;
			case NAV:
				enterOuterAlt(_localctx, 12);
				{
				setState(251);
				match(NAV);
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 13);
				{
				setState(252);
				match(INPUT);
				}
				break;
			case TEXTAREA:
				enterOuterAlt(_localctx, 14);
				{
				setState(253);
				match(TEXTAREA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssDeclarationContext extends ParserRuleContext {
		public CssPropertyContext cssProperty() {
			return getRuleContext(CssPropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<CssValueContext> cssValue() {
			return getRuleContexts(CssValueContext.class);
		}
		public CssValueContext cssValue(int i) {
			return getRuleContext(CssValueContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public CssDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationContext cssDeclaration() throws RecognitionException {
		CssDeclarationContext _localctx = new CssDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cssDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			cssProperty();
			setState(257);
			match(COLON);
			setState(258);
			cssValue();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(259);
				match(COMMA);
				setState(260);
				cssValue();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssPropertyContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(AngularParser.COLOR, 0); }
		public TerminalNode BACKGROUND() { return getToken(AngularParser.BACKGROUND, 0); }
		public TerminalNode FONT_SIZE() { return getToken(AngularParser.FONT_SIZE, 0); }
		public TerminalNode FONT_WEIGHT() { return getToken(AngularParser.FONT_WEIGHT, 0); }
		public TerminalNode WIDTH() { return getToken(AngularParser.WIDTH, 0); }
		public TerminalNode HEIGHT() { return getToken(AngularParser.HEIGHT, 0); }
		public TerminalNode DISPLAY() { return getToken(AngularParser.DISPLAY, 0); }
		public TerminalNode POSITION() { return getToken(AngularParser.POSITION, 0); }
		public TerminalNode MARGIN() { return getToken(AngularParser.MARGIN, 0); }
		public TerminalNode PADDING() { return getToken(AngularParser.PADDING, 0); }
		public TerminalNode BORDER() { return getToken(AngularParser.BORDER, 0); }
		public TerminalNode BORDER_RADIUS() { return getToken(AngularParser.BORDER_RADIUS, 0); }
		public TerminalNode BOX_SHADOW() { return getToken(AngularParser.BOX_SHADOW, 0); }
		public TerminalNode CURSOR() { return getToken(AngularParser.CURSOR, 0); }
		public TerminalNode OBJECT_FIT() { return getToken(AngularParser.OBJECT_FIT, 0); }
		public TerminalNode TRANSITION() { return getToken(AngularParser.TRANSITION, 0); }
		public TerminalNode TRANSFORM() { return getToken(AngularParser.TRANSFORM, 0); }
		public TerminalNode OUTLINE() { return getToken(AngularParser.OUTLINE, 0); }
		public TerminalNode TEXT_ALIGN() { return getToken(AngularParser.TEXT_ALIGN, 0); }
		public TerminalNode FLEX_WRAP() { return getToken(AngularParser.FLEX_WRAP, 0); }
		public TerminalNode GAP() { return getToken(AngularParser.GAP, 0); }
		public CssPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssPropertyContext cssProperty() throws RecognitionException {
		CssPropertyContext _localctx = new CssPropertyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cssProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 2097151L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssValueContext extends ParserRuleContext {
		public TerminalNode CSS_UNIT() { return getToken(AngularParser.CSS_UNIT, 0); }
		public TerminalNode CSS_COLOR_HEX() { return getToken(AngularParser.CSS_COLOR_HEX, 0); }
		public TerminalNode CSS_KEYWORD() { return getToken(AngularParser.CSS_KEYWORD, 0); }
		public TerminalNode LINEAR_GRADIENT() { return getToken(AngularParser.LINEAR_GRADIENT, 0); }
		public TerminalNode NumberLiteral() { return getToken(AngularParser.NumberLiteral, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cssValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 2415919119L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContext extends ParserRuleContext {
		public List<TerminalNode> BACKTICK() { return getTokens(AngularParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(AngularParser.BACKTICK, i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_template);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(BACKTICK);
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(273);
				htmlContent();
				}
				break;
			}
			setState(276);
			match(BACKTICK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<InterpolationContext> interpolation() {
			return getRuleContexts(InterpolationContext.class);
		}
		public InterpolationContext interpolation(int i) {
			return getRuleContext(InterpolationContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_htmlContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HTML_TAG_OPEN || _la==PROPERTY_BINDING || _la==Identifier) {
				{
				setState(281);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HTML_TAG_OPEN:
					{
					setState(278);
					htmlElement();
					}
					break;
				case PROPERTY_BINDING:
					{
					setState(279);
					interpolation();
					}
					break;
				case Identifier:
					{
					setState(280);
					match(Identifier);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationContext extends ParserRuleContext {
		public TerminalNode PROPERTY_BINDING() { return getToken(AngularParser.PROPERTY_BINDING, 0); }
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(PROPERTY_BINDING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public DivElementContext divElement() {
			return getRuleContext(DivElementContext.class,0);
		}
		public PElementContext pElement() {
			return getRuleContext(PElementContext.class,0);
		}
		public H2ElementContext h2Element() {
			return getRuleContext(H2ElementContext.class,0);
		}
		public ImgElementContext imgElement() {
			return getRuleContext(ImgElementContext.class,0);
		}
		public ButtonElementContext buttonElement() {
			return getRuleContext(ButtonElementContext.class,0);
		}
		public NavElementContext navElement() {
			return getRuleContext(NavElementContext.class,0);
		}
		public FormElementContext formElement() {
			return getRuleContext(FormElementContext.class,0);
		}
		public InputElementContext inputElement() {
			return getRuleContext(InputElementContext.class,0);
		}
		public TextareaElementContext textareaElement() {
			return getRuleContext(TextareaElementContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_htmlElement);
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				divElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				pElement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				h2Element();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				imgElement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(292);
				buttonElement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(293);
				navElement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(294);
				formElement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(295);
				inputElement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(296);
				textareaElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(AngularParser.HTML_TAG_OPEN, 0); }
		public List<TerminalNode> FORM() { return getTokens(AngularParser.FORM); }
		public TerminalNode FORM(int i) {
			return getToken(AngularParser.FORM, i);
		}
		public List<TerminalNode> HTML_TAG_CLOSE() { return getTokens(AngularParser.HTML_TAG_CLOSE); }
		public TerminalNode HTML_TAG_CLOSE(int i) {
			return getToken(AngularParser.HTML_TAG_CLOSE, i);
		}
		public TerminalNode HTML_TAG_END() { return getToken(AngularParser.HTML_TAG_END, 0); }
		public HtmlAttributesContext htmlAttributes() {
			return getRuleContext(HtmlAttributesContext.class,0);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public FormElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFormElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFormElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFormElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormElementContext formElement() throws RecognitionException {
		FormElementContext _localctx = new FormElementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_formElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(HTML_TAG_OPEN);
			setState(300);
			match(FORM);
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(301);
				htmlAttributes();
				}
				break;
			}
			setState(304);
			match(HTML_TAG_CLOSE);
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(305);
				htmlContent();
				}
				break;
			}
			setState(308);
			match(HTML_TAG_END);
			setState(309);
			match(FORM);
			setState(310);
			match(HTML_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DivElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(AngularParser.HTML_TAG_OPEN, 0); }
		public List<TerminalNode> DIV_TAG() { return getTokens(AngularParser.DIV_TAG); }
		public TerminalNode DIV_TAG(int i) {
			return getToken(AngularParser.DIV_TAG, i);
		}
		public List<TerminalNode> HTML_TAG_CLOSE() { return getTokens(AngularParser.HTML_TAG_CLOSE); }
		public TerminalNode HTML_TAG_CLOSE(int i) {
			return getToken(AngularParser.HTML_TAG_CLOSE, i);
		}
		public TerminalNode HTML_TAG_END() { return getToken(AngularParser.HTML_TAG_END, 0); }
		public HtmlAttributesContext htmlAttributes() {
			return getRuleContext(HtmlAttributesContext.class,0);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public DivElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDivElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDivElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDivElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivElementContext divElement() throws RecognitionException {
		DivElementContext _localctx = new DivElementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_divElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(HTML_TAG_OPEN);
			setState(313);
			match(DIV_TAG);
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(314);
				htmlAttributes();
				}
				break;
			}
			setState(317);
			match(HTML_TAG_CLOSE);
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(318);
				htmlContent();
				}
				break;
			}
			setState(321);
			match(HTML_TAG_END);
			setState(322);
			match(DIV_TAG);
			setState(323);
			match(HTML_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ButtonElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(AngularParser.HTML_TAG_OPEN, 0); }
		public List<TerminalNode> BUTTON() { return getTokens(AngularParser.BUTTON); }
		public TerminalNode BUTTON(int i) {
			return getToken(AngularParser.BUTTON, i);
		}
		public List<TerminalNode> HTML_TAG_CLOSE() { return getTokens(AngularParser.HTML_TAG_CLOSE); }
		public TerminalNode HTML_TAG_CLOSE(int i) {
			return getToken(AngularParser.HTML_TAG_CLOSE, i);
		}
		public TerminalNode HTML_TAG_END() { return getToken(AngularParser.HTML_TAG_END, 0); }
		public HtmlAttributesContext htmlAttributes() {
			return getRuleContext(HtmlAttributesContext.class,0);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public ButtonElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttonElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterButtonElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitButtonElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitButtonElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonElementContext buttonElement() throws RecognitionException {
		ButtonElementContext _localctx = new ButtonElementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_buttonElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(HTML_TAG_OPEN);
			setState(326);
			match(BUTTON);
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(327);
				htmlAttributes();
				}
				break;
			}
			setState(330);
			match(HTML_TAG_CLOSE);
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(331);
				htmlContent();
				}
				break;
			}
			setState(334);
			match(HTML_TAG_END);
			setState(335);
			match(BUTTON);
			setState(336);
			match(HTML_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NavElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(AngularParser.HTML_TAG_OPEN, 0); }
		public List<TerminalNode> NAV() { return getTokens(AngularParser.NAV); }
		public TerminalNode NAV(int i) {
			return getToken(AngularParser.NAV, i);
		}
		public List<TerminalNode> HTML_TAG_CLOSE() { return getTokens(AngularParser.HTML_TAG_CLOSE); }
		public TerminalNode HTML_TAG_CLOSE(int i) {
			return getToken(AngularParser.HTML_TAG_CLOSE, i);
		}
		public TerminalNode HTML_TAG_END() { return getToken(AngularParser.HTML_TAG_END, 0); }
		public HtmlAttributesContext htmlAttributes() {
			return getRuleContext(HtmlAttributesContext.class,0);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public NavElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNavElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNavElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNavElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavElementContext navElement() throws RecognitionException {
		NavElementContext _localctx = new NavElementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_navElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(HTML_TAG_OPEN);
			setState(339);
			match(NAV);
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(340);
				htmlAttributes();
				}
				break;
			}
			setState(343);
			match(HTML_TAG_CLOSE);
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(344);
				htmlContent();
				}
				break;
			}
			setState(347);
			match(HTML_TAG_END);
			setState(348);
			match(NAV);
			setState(349);
			match(HTML_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(AngularParser.HTML_TAG_OPEN, 0); }
		public List<TerminalNode> P_TAG() { return getTokens(AngularParser.P_TAG); }
		public TerminalNode P_TAG(int i) {
			return getToken(AngularParser.P_TAG, i);
		}
		public List<TerminalNode> HTML_TAG_CLOSE() { return getTokens(AngularParser.HTML_TAG_CLOSE); }
		public TerminalNode HTML_TAG_CLOSE(int i) {
			return getToken(AngularParser.HTML_TAG_CLOSE, i);
		}
		public TerminalNode HTML_TAG_END() { return getToken(AngularParser.HTML_TAG_END, 0); }
		public HtmlAttributesContext htmlAttributes() {
			return getRuleContext(HtmlAttributesContext.class,0);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public PElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PElementContext pElement() throws RecognitionException {
		PElementContext _localctx = new PElementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(HTML_TAG_OPEN);
			setState(352);
			match(P_TAG);
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(353);
				htmlAttributes();
				}
				break;
			}
			setState(356);
			match(HTML_TAG_CLOSE);
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(357);
				htmlContent();
				}
				break;
			}
			setState(360);
			match(HTML_TAG_END);
			setState(361);
			match(P_TAG);
			setState(362);
			match(HTML_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class H2ElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(AngularParser.HTML_TAG_OPEN, 0); }
		public List<TerminalNode> H2_TAG() { return getTokens(AngularParser.H2_TAG); }
		public TerminalNode H2_TAG(int i) {
			return getToken(AngularParser.H2_TAG, i);
		}
		public List<TerminalNode> HTML_TAG_CLOSE() { return getTokens(AngularParser.HTML_TAG_CLOSE); }
		public TerminalNode HTML_TAG_CLOSE(int i) {
			return getToken(AngularParser.HTML_TAG_CLOSE, i);
		}
		public TerminalNode HTML_TAG_END() { return getToken(AngularParser.HTML_TAG_END, 0); }
		public HtmlAttributesContext htmlAttributes() {
			return getRuleContext(HtmlAttributesContext.class,0);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public H2ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h2Element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterH2Element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitH2Element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitH2Element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final H2ElementContext h2Element() throws RecognitionException {
		H2ElementContext _localctx = new H2ElementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_h2Element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(HTML_TAG_OPEN);
			setState(365);
			match(H2_TAG);
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(366);
				htmlAttributes();
				}
				break;
			}
			setState(369);
			match(HTML_TAG_CLOSE);
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(370);
				htmlContent();
				}
				break;
			}
			setState(373);
			match(HTML_TAG_END);
			setState(374);
			match(H2_TAG);
			setState(375);
			match(HTML_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImgElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(AngularParser.HTML_TAG_OPEN, 0); }
		public TerminalNode IMG_TAG() { return getToken(AngularParser.IMG_TAG, 0); }
		public TerminalNode HTML_SELF_CLOSING() { return getToken(AngularParser.HTML_SELF_CLOSING, 0); }
		public HtmlAttributesContext htmlAttributes() {
			return getRuleContext(HtmlAttributesContext.class,0);
		}
		public ImgElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imgElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImgElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImgElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImgElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgElementContext imgElement() throws RecognitionException {
		ImgElementContext _localctx = new ImgElementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_imgElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(HTML_TAG_OPEN);
			setState(378);
			match(IMG_TAG);
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(379);
				htmlAttributes();
				}
				break;
			}
			setState(382);
			match(HTML_SELF_CLOSING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(AngularParser.HTML_TAG_OPEN, 0); }
		public TerminalNode INPUT() { return getToken(AngularParser.INPUT, 0); }
		public TerminalNode HTML_SELF_CLOSING() { return getToken(AngularParser.HTML_SELF_CLOSING, 0); }
		public HtmlAttributesContext htmlAttributes() {
			return getRuleContext(HtmlAttributesContext.class,0);
		}
		public InputElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInputElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInputElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInputElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputElementContext inputElement() throws RecognitionException {
		InputElementContext _localctx = new InputElementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_inputElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(HTML_TAG_OPEN);
			setState(385);
			match(INPUT);
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(386);
				htmlAttributes();
				}
				break;
			}
			setState(389);
			match(HTML_SELF_CLOSING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextareaElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(AngularParser.HTML_TAG_OPEN, 0); }
		public List<TerminalNode> TEXTAREA() { return getTokens(AngularParser.TEXTAREA); }
		public TerminalNode TEXTAREA(int i) {
			return getToken(AngularParser.TEXTAREA, i);
		}
		public List<TerminalNode> HTML_TAG_CLOSE() { return getTokens(AngularParser.HTML_TAG_CLOSE); }
		public TerminalNode HTML_TAG_CLOSE(int i) {
			return getToken(AngularParser.HTML_TAG_CLOSE, i);
		}
		public TerminalNode HTML_TAG_END() { return getToken(AngularParser.HTML_TAG_END, 0); }
		public HtmlAttributesContext htmlAttributes() {
			return getRuleContext(HtmlAttributesContext.class,0);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TextareaElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textareaElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTextareaElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTextareaElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTextareaElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextareaElementContext textareaElement() throws RecognitionException {
		TextareaElementContext _localctx = new TextareaElementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_textareaElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(HTML_TAG_OPEN);
			setState(392);
			match(TEXTAREA);
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(393);
				htmlAttributes();
				}
				break;
			}
			setState(396);
			match(HTML_TAG_CLOSE);
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(397);
				htmlContent();
				}
				break;
			}
			setState(400);
			match(HTML_TAG_END);
			setState(401);
			match(TEXTAREA);
			setState(402);
			match(HTML_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributesContext extends ParserRuleContext {
		public List<AngularDirectiveContext> angularDirective() {
			return getRuleContexts(AngularDirectiveContext.class);
		}
		public AngularDirectiveContext angularDirective(int i) {
			return getRuleContext(AngularDirectiveContext.class,i);
		}
		public List<AngularEventContext> angularEvent() {
			return getRuleContexts(AngularEventContext.class);
		}
		public AngularEventContext angularEvent(int i) {
			return getRuleContext(AngularEventContext.class,i);
		}
		public List<AngularBindingContext> angularBinding() {
			return getRuleContexts(AngularBindingContext.class);
		}
		public AngularBindingContext angularBinding(int i) {
			return getRuleContext(AngularBindingContext.class,i);
		}
		public List<StyleAttributeContext> styleAttribute() {
			return getRuleContexts(StyleAttributeContext.class);
		}
		public StyleAttributeContext styleAttribute(int i) {
			return getRuleContext(StyleAttributeContext.class,i);
		}
		public List<SrcAttributeContext> srcAttribute() {
			return getRuleContexts(SrcAttributeContext.class);
		}
		public SrcAttributeContext srcAttribute(int i) {
			return getRuleContext(SrcAttributeContext.class,i);
		}
		public List<FormAttributeContext> formAttribute() {
			return getRuleContexts(FormAttributeContext.class);
		}
		public FormAttributeContext formAttribute(int i) {
			return getRuleContext(FormAttributeContext.class,i);
		}
		public List<AltAttributeContext> altAttribute() {
			return getRuleContexts(AltAttributeContext.class);
		}
		public AltAttributeContext altAttribute(int i) {
			return getRuleContext(AltAttributeContext.class,i);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(AngularParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(AngularParser.StringLiteral, i);
		}
		public HtmlAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributesContext htmlAttributes() throws RecognitionException {
		HtmlAttributesContext _localctx = new HtmlAttributesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_htmlAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 32191L) != 0)) {
				{
				setState(412);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NG_FOR:
				case NG_IF:
					{
					setState(404);
					angularDirective();
					}
					break;
				case CLICK_EVENT:
				case NG_SUBMIT_EVENT:
					{
					setState(405);
					angularEvent();
					}
					break;
				case BINDING:
				case TWO_WAY_BINDING:
					{
					setState(406);
					angularBinding();
					}
					break;
				case STYLE:
					{
					setState(407);
					styleAttribute();
					}
					break;
				case Src:
					{
					setState(408);
					srcAttribute();
					}
					break;
				case TYPE:
				case PLACEHOLDER:
				case ROWS:
				case REQUIRED_ATTR:
					{
					setState(409);
					formAttribute();
					}
					break;
				case Alt:
					{
					setState(410);
					altAttribute();
					}
					break;
				case StringLiteral:
					{
					setState(411);
					match(StringLiteral);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AngularDirectiveContext extends ParserRuleContext {
		public TerminalNode NG_FOR() { return getToken(AngularParser.NG_FOR, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode NG_IF() { return getToken(AngularParser.NG_IF, 0); }
		public AngularDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularDirectiveContext angularDirective() throws RecognitionException {
		AngularDirectiveContext _localctx = new AngularDirectiveContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_angularDirective);
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NG_FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(NG_FOR);
				setState(418);
				match(EQUAL);
				setState(419);
				match(StringLiteral);
				}
				break;
			case NG_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				match(NG_IF);
				setState(421);
				match(EQUAL);
				setState(422);
				match(StringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AngularEventContext extends ParserRuleContext {
		public TerminalNode CLICK_EVENT() { return getToken(AngularParser.CLICK_EVENT, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode NG_SUBMIT_EVENT() { return getToken(AngularParser.NG_SUBMIT_EVENT, 0); }
		public AngularEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularEventContext angularEvent() throws RecognitionException {
		AngularEventContext _localctx = new AngularEventContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_angularEvent);
		try {
			setState(431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLICK_EVENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(CLICK_EVENT);
				setState(426);
				match(EQUAL);
				setState(427);
				match(StringLiteral);
				}
				break;
			case NG_SUBMIT_EVENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				match(NG_SUBMIT_EVENT);
				setState(429);
				match(EQUAL);
				setState(430);
				match(StringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AngularBindingContext extends ParserRuleContext {
		public TerminalNode BINDING() { return getToken(AngularParser.BINDING, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode TWO_WAY_BINDING() { return getToken(AngularParser.TWO_WAY_BINDING, 0); }
		public AngularBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularBindingContext angularBinding() throws RecognitionException {
		AngularBindingContext _localctx = new AngularBindingContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_angularBinding);
		try {
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINDING:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(BINDING);
				setState(434);
				match(EQUAL);
				setState(437);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(435);
					assignment();
					}
					break;
				case StringLiteral:
					{
					setState(436);
					match(StringLiteral);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case TWO_WAY_BINDING:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				match(TWO_WAY_BINDING);
				setState(440);
				match(EQUAL);
				setState(441);
				match(StringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleAttributeContext extends ParserRuleContext {
		public TerminalNode STYLE() { return getToken(AngularParser.STYLE, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public StyleAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleAttributeContext styleAttribute() throws RecognitionException {
		StyleAttributeContext _localctx = new StyleAttributeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_styleAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(STYLE);
			setState(445);
			match(EQUAL);
			setState(446);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SrcAttributeContext extends ParserRuleContext {
		public TerminalNode Src() { return getToken(AngularParser.Src, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public SrcAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_srcAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSrcAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSrcAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSrcAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SrcAttributeContext srcAttribute() throws RecognitionException {
		SrcAttributeContext _localctx = new SrcAttributeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_srcAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(Src);
			setState(449);
			match(EQUAL);
			setState(450);
			assignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AltAttributeContext extends ParserRuleContext {
		public TerminalNode Alt() { return getToken(AngularParser.Alt, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AltAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAltAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAltAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAltAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AltAttributeContext altAttribute() throws RecognitionException {
		AltAttributeContext _localctx = new AltAttributeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_altAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(Alt);
			setState(453);
			match(EQUAL);
			setState(454);
			assignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormAttributeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(AngularParser.TYPE, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode PLACEHOLDER() { return getToken(AngularParser.PLACEHOLDER, 0); }
		public TerminalNode ROWS() { return getToken(AngularParser.ROWS, 0); }
		public TerminalNode REQUIRED_ATTR() { return getToken(AngularParser.REQUIRED_ATTR, 0); }
		public FormAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFormAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFormAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFormAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormAttributeContext formAttribute() throws RecognitionException {
		FormAttributeContext _localctx = new FormAttributeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_formAttribute);
		try {
			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				match(TYPE);
				setState(457);
				match(EQUAL);
				setState(458);
				match(StringLiteral);
				}
				break;
			case PLACEHOLDER:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				match(PLACEHOLDER);
				setState(460);
				match(EQUAL);
				setState(461);
				match(StringLiteral);
				}
				break;
			case ROWS:
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				match(ROWS);
				setState(463);
				match(EQUAL);
				setState(464);
				match(StringLiteral);
				}
				break;
			case REQUIRED_ATTR:
				enterOuterAlt(_localctx, 4);
				{
				setState(465);
				match(REQUIRED_ATTR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(AngularParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(AngularParser.PRIVATE, 0); }
		public TerminalNode INT() { return getToken(AngularParser.INT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableStatement);
		int _la;
		try {
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUBLIC || _la==PRIVATE) {
					{
					setState(468);
					_la = _input.LA(1);
					if ( !(_la==PUBLIC || _la==PRIVATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(471);
				match(Identifier);
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(472);
					match(COLON);
					setState(473);
					type();
					}
				}

				setState(476);
				match(EQUAL);
				setState(480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(477);
					value();
					}
					break;
				case 2:
					{
					setState(478);
					array();
					}
					break;
				case 3:
					{
					setState(479);
					object();
					}
					break;
				}
				setState(482);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				match(INT);
				setState(485);
				match(Identifier);
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(486);
					match(COLON);
					setState(487);
					type();
					}
				}

				setState(490);
				match(EQUAL);
				{
				setState(491);
				expression(0);
				}
				setState(492);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUBLIC || _la==PRIVATE) {
					{
					setState(494);
					_la = _input.LA(1);
					if ( !(_la==PUBLIC || _la==PRIVATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(497);
				match(CONST);
				setState(498);
				match(Identifier);
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(499);
					match(COLON);
					setState(500);
					type();
					}
				}

				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(503);
					match(EQUAL);
					setState(507);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(504);
						value();
						}
						break;
					case 2:
						{
						setState(505);
						array();
						}
						break;
					case 3:
						{
						setState(506);
						object();
						}
						break;
					}
					}
				}

				setState(511);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUBLIC || _la==PRIVATE) {
					{
					setState(512);
					_la = _input.LA(1);
					if ( !(_la==PUBLIC || _la==PRIVATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(515);
				match(LET);
				setState(516);
				match(Identifier);
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(517);
					match(COLON);
					setState(518);
					type();
					}
				}

				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(521);
					match(EQUAL);
					setState(525);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(522);
						value();
						}
						break;
					case 2:
						{
						setState(523);
						array();
						}
						break;
					case 3:
						{
						setState(524);
						object();
						}
						break;
					}
					}
				}

				setState(529);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ARRAY_START() { return getToken(AngularParser.ARRAY_START, 0); }
		public TerminalNode ARRAY_END() { return getToken(AngularParser.ARRAY_END, 0); }
		public ArrayElementsContext arrayElements() {
			return getRuleContext(ArrayElementsContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(ARRAY_START);
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2955487255986176L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 50355203L) != 0)) {
				{
				setState(533);
				arrayElements();
				}
			}

			setState(536);
			match(ARRAY_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayElementsContext extends ParserRuleContext {
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementsContext arrayElements() throws RecognitionException {
		ArrayElementsContext _localctx = new ArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_arrayElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			arrayElement();
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(539);
				match(COMMA);
				setState(540);
				arrayElement();
				}
				}
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayElementContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_arrayElement);
		try {
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				object();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(LBRACE);
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral || _la==Identifier) {
				{
				setState(551);
				property();
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(552);
					match(COMMA);
					setState(553);
					property();
					}
					}
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(561);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(564);
			match(COLON);
			setState(565);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode NumberLiteral() { return getToken(AngularParser.NumberLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(AngularParser.BooleanLiteral, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_value);
		try {
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				match(StringLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				match(NumberLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(569);
				match(BooleanLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(570);
				object();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(571);
				array();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(572);
				match(Identifier);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(573);
				match(THIS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(574);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(AngularParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(AngularParser.StringLiteral, i);
		}
		public List<TerminalNode> PIPE() { return getTokens(AngularParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(AngularParser.PIPE, i);
		}
		public TerminalNode ANY() { return getToken(AngularParser.ANY, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_type);
		int _la;
		try {
			int _alt;
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				match(Identifier);
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(578);
					match(Identifier);
					setState(583);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(579);
							match(COMMA);
							setState(580);
							match(Identifier);
							}
							} 
						}
						setState(585);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
					}
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				_la = _input.LA(1);
				if ( !(_la==StringLiteral || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PIPE) {
					{
					{
					setState(589);
					match(PIPE);
					setState(590);
					_la = _input.LA(1);
					if ( !(_la==StringLiteral || _la==Identifier) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(595);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(596);
				match(ANY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<ClassBodyContext> classBody() {
			return getRuleContexts(ClassBodyContext.class);
		}
		public ClassBodyContext classBody(int i) {
			return getRuleContext(ClassBodyContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(CLASS);
			setState(600);
			match(Identifier);
			setState(601);
			match(LBRACE);
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 622L) != 0) || _la==Identifier) {
				{
				{
				setState(602);
				classBody();
				}
				}
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(608);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_classBody);
		try {
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				variableStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
				constructorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(Identifier);
			setState(616);
			match(LPAREN);
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(617);
				parameterList();
				}
			}

			setState(620);
			match(RPAREN);
			setState(621);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(AngularParser.CONSTRUCTOR, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(CONSTRUCTOR);
			setState(624);
			match(LPAREN);
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(625);
				parameterList();
				}
			}

			setState(628);
			match(RPAREN);
			setState(629);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(AngularParser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<InterfaceBodyContext> interfaceBody() {
			return getRuleContexts(InterfaceBodyContext.class);
		}
		public InterfaceBodyContext interfaceBody(int i) {
			return getRuleContext(InterfaceBodyContext.class,i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(INTERFACE);
			setState(632);
			match(Identifier);
			setState(633);
			match(LBRACE);
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(634);
				interfaceBody();
				}
				}
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(640);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_interfaceBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(Identifier);
			setState(643);
			match(COLON);
			setState(644);
			type();
			setState(645);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_exportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(EXPORT);
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(648);
				variableStatement();
				}
				break;
			case 2:
				{
				setState(649);
				functionDeclaration();
				}
				break;
			case 3:
				{
				setState(650);
				classDeclaration();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			expression(0);
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(654);
				match(COMMA);
				setState(655);
				expression(0);
				}
				}
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public PropertyBindingContext propertyBinding() {
			return getRuleContext(PropertyBindingContext.class,0);
		}
		public TwoWayBindingContext twoWayBinding() {
			return getRuleContext(TwoWayBindingContext.class,0);
		}
		public NgDirectiveContext ngDirective() {
			return getRuleContext(NgDirectiveContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(662);
				match(Identifier);
				setState(663);
				match(LPAREN);
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2814749767630848L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 50355203L) != 0)) {
					{
					setState(664);
					expressionList();
					}
				}

				setState(667);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(668);
				literal();
				}
				break;
			case 3:
				{
				setState(669);
				object();
				}
				break;
			case 4:
				{
				setState(670);
				match(Identifier);
				}
				break;
			case 5:
				{
				setState(671);
				propertyBinding();
				}
				break;
			case 6:
				{
				setState(672);
				twoWayBinding();
				}
				break;
			case 7:
				{
				setState(673);
				ngDirective();
				}
				break;
			case 8:
				{
				setState(674);
				match(LPAREN);
				setState(675);
				expression(0);
				setState(676);
				match(RPAREN);
				}
				break;
			case 9:
				{
				setState(678);
				match(THIS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(697);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(695);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(681);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(682);
						match(EQUAL);
						setState(683);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(684);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(685);
						match(DOT);
						setState(686);
						match(Identifier);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(687);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(688);
						match(DOT);
						setState(689);
						match(Identifier);
						setState(690);
						match(LPAREN);
						setState(692);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2814749767630848L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 50355203L) != 0)) {
							{
							setState(691);
							expressionList();
							}
						}

						setState(694);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(699);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode NumberLiteral() { return getToken(AngularParser.NumberLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(AngularParser.BooleanLiteral, 0); }
		public TerminalNode NULL() { return getToken(AngularParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			_la = _input.LA(1);
			if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & 16391L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyBindingContext extends ParserRuleContext {
		public TerminalNode BINDING() { return getToken(AngularParser.BINDING, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public PropertyBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyBindingContext propertyBinding() throws RecognitionException {
		PropertyBindingContext _localctx = new PropertyBindingContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_propertyBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(BINDING);
			setState(703);
			match(EQUAL);
			setState(704);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TwoWayBindingContext extends ParserRuleContext {
		public TerminalNode TWO_WAY_BINDING() { return getToken(AngularParser.TWO_WAY_BINDING, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TwoWayBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twoWayBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTwoWayBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTwoWayBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTwoWayBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TwoWayBindingContext twoWayBinding() throws RecognitionException {
		TwoWayBindingContext _localctx = new TwoWayBindingContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_twoWayBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(TWO_WAY_BINDING);
			setState(707);
			match(EQUAL);
			setState(708);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NgDirectiveContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE() { return getToken(AngularParser.DIRECTIVE, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public NgDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgDirectiveContext ngDirective() throws RecognitionException {
		NgDirectiveContext _localctx = new NgDirectiveContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_ngDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(DIRECTIVE);
			setState(711);
			match(EQUAL);
			setState(712);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_parameterList);
		try {
			int _alt;
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				match(Identifier);
				setState(715);
				match(COLON);
				setState(716);
				match(Identifier);
				setState(721);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(717);
						match(COMMA);
						setState(718);
						parameterList();
						}
						} 
					}
					setState(723);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(724);
				match(Identifier);
				setState(725);
				match(COLON);
				setState(726);
				type();
				setState(733);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(727);
						match(COMMA);
						setState(728);
						match(Identifier);
						setState(729);
						match(COLON);
						setState(730);
						type();
						}
						} 
					}
					setState(735);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(LBRACE);
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2814749768691054L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 50355203L) != 0)) {
				{
				{
				setState(739);
				statement();
				}
				}
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(745);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 53:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001y\u02ec\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0001"+
		"\u0000\u0004\u0000z\b\u0000\u000b\u0000\f\u0000{\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u008e\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u009b\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u00a3\b\u0004\n\u0004\f\u0004\u00a6\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00ab\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00b6\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u00be\b\b\n\b\f\b\u00c1\t\b\u0001\b\u0003\b\u00c4\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00d8\b\t\u0001\n\u0001\n\u0005\n\u00dc\b\n\n\n\f\n\u00df\t"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u00e5\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0004\u000b\u00e9\b\u000b\u000b\u000b\f\u000b\u00ea"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00ff\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u0106\b\r\n\r\f\r\u0109\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u0113\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u011a\b\u0011\n\u0011\f\u0011\u011d\t\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u012a\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u012f\b\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0133\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u013c\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0140\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0149\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u014d\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0156"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u015a\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0163\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0167\b"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0170\b\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0174\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u017d\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0184\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u018b"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u018f\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u019d\b\u001d\n\u001d\f\u001d\u01a0\t\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01a8\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u01b0\b\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u01b6\b \u0001"+
		" \u0001 \u0001 \u0003 \u01bb\b \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u01d3\b$\u0001%\u0003"+
		"%\u01d6\b%\u0001%\u0001%\u0001%\u0003%\u01db\b%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u01e1\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01e9"+
		"\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01f0\b%\u0001%\u0001%\u0001"+
		"%\u0001%\u0003%\u01f6\b%\u0001%\u0001%\u0001%\u0001%\u0003%\u01fc\b%\u0003"+
		"%\u01fe\b%\u0001%\u0001%\u0003%\u0202\b%\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u0208\b%\u0001%\u0001%\u0001%\u0001%\u0003%\u020e\b%\u0003%\u0210\b"+
		"%\u0001%\u0003%\u0213\b%\u0001&\u0001&\u0003&\u0217\b&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0005\'\u021e\b\'\n\'\f\'\u0221\t\'\u0001(\u0001(\u0003"+
		"(\u0225\b(\u0001)\u0001)\u0001)\u0001)\u0005)\u022b\b)\n)\f)\u022e\t)"+
		"\u0003)\u0230\b)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u0240\b+\u0001,\u0001"+
		",\u0001,\u0001,\u0005,\u0246\b,\n,\f,\u0249\t,\u0003,\u024b\b,\u0001,"+
		"\u0001,\u0001,\u0005,\u0250\b,\n,\f,\u0253\t,\u0001,\u0003,\u0256\b,\u0001"+
		"-\u0001-\u0001-\u0001-\u0005-\u025c\b-\n-\f-\u025f\t-\u0001-\u0001-\u0001"+
		".\u0001.\u0001.\u0003.\u0266\b.\u0001/\u0001/\u0001/\u0003/\u026b\b/\u0001"+
		"/\u0001/\u0001/\u00010\u00010\u00010\u00030\u0273\b0\u00010\u00010\u0001"+
		"0\u00011\u00011\u00011\u00011\u00051\u027c\b1\n1\f1\u027f\t1\u00011\u0001"+
		"1\u00012\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u0003"+
		"3\u028c\b3\u00014\u00014\u00014\u00054\u0291\b4\n4\f4\u0294\t4\u00015"+
		"\u00015\u00015\u00015\u00035\u029a\b5\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00035\u02a8\b5\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00035\u02b5\b5\u00015\u00055\u02b8\b5\n5\f5\u02bb\t5\u00016\u00016"+
		"\u00017\u00017\u00017\u00017\u00018\u00018\u00018\u00018\u00019\u0001"+
		"9\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0005:\u02d0\b:\n:"+
		"\f:\u02d3\t:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0005:\u02dc"+
		"\b:\n:\f:\u02df\t:\u0003:\u02e1\b:\u0001;\u0001;\u0005;\u02e5\b;\n;\f"+
		";\u02e8\t;\u0001;\u0001;\u0001;\u0000\u0001j<\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\u0000\u0005\u0001\u0000:N\u0003"+
		"\u0000ORkknn\u0001\u0000\u0001\u0002\u0002\u0000jjnn\u0002\u0000jlxx\u033c"+
		"\u0000y\u0001\u0000\u0000\u0000\u0002\u008d\u0001\u0000\u0000\u0000\u0004"+
		"\u008f\u0001\u0000\u0000\u0000\u0006\u0095\u0001\u0000\u0000\u0000\b\u00aa"+
		"\u0001\u0000\u0000\u0000\n\u00ac\u0001\u0000\u0000\u0000\f\u00ae\u0001"+
		"\u0000\u0000\u0000\u000e\u00b1\u0001\u0000\u0000\u0000\u0010\u00ba\u0001"+
		"\u0000\u0000\u0000\u0012\u00d7\u0001\u0000\u0000\u0000\u0014\u00d9\u0001"+
		"\u0000\u0000\u0000\u0016\u00e2\u0001\u0000\u0000\u0000\u0018\u00fe\u0001"+
		"\u0000\u0000\u0000\u001a\u0100\u0001\u0000\u0000\u0000\u001c\u010c\u0001"+
		"\u0000\u0000\u0000\u001e\u010e\u0001\u0000\u0000\u0000 \u0110\u0001\u0000"+
		"\u0000\u0000\"\u011b\u0001\u0000\u0000\u0000$\u011e\u0001\u0000\u0000"+
		"\u0000&\u0129\u0001\u0000\u0000\u0000(\u012b\u0001\u0000\u0000\u0000*"+
		"\u0138\u0001\u0000\u0000\u0000,\u0145\u0001\u0000\u0000\u0000.\u0152\u0001"+
		"\u0000\u0000\u00000\u015f\u0001\u0000\u0000\u00002\u016c\u0001\u0000\u0000"+
		"\u00004\u0179\u0001\u0000\u0000\u00006\u0180\u0001\u0000\u0000\u00008"+
		"\u0187\u0001\u0000\u0000\u0000:\u019e\u0001\u0000\u0000\u0000<\u01a7\u0001"+
		"\u0000\u0000\u0000>\u01af\u0001\u0000\u0000\u0000@\u01ba\u0001\u0000\u0000"+
		"\u0000B\u01bc\u0001\u0000\u0000\u0000D\u01c0\u0001\u0000\u0000\u0000F"+
		"\u01c4\u0001\u0000\u0000\u0000H\u01d2\u0001\u0000\u0000\u0000J\u0212\u0001"+
		"\u0000\u0000\u0000L\u0214\u0001\u0000\u0000\u0000N\u021a\u0001\u0000\u0000"+
		"\u0000P\u0224\u0001\u0000\u0000\u0000R\u0226\u0001\u0000\u0000\u0000T"+
		"\u0233\u0001\u0000\u0000\u0000V\u023f\u0001\u0000\u0000\u0000X\u0255\u0001"+
		"\u0000\u0000\u0000Z\u0257\u0001\u0000\u0000\u0000\\\u0265\u0001\u0000"+
		"\u0000\u0000^\u0267\u0001\u0000\u0000\u0000`\u026f\u0001\u0000\u0000\u0000"+
		"b\u0277\u0001\u0000\u0000\u0000d\u0282\u0001\u0000\u0000\u0000f\u0287"+
		"\u0001\u0000\u0000\u0000h\u028d\u0001\u0000\u0000\u0000j\u02a7\u0001\u0000"+
		"\u0000\u0000l\u02bc\u0001\u0000\u0000\u0000n\u02be\u0001\u0000\u0000\u0000"+
		"p\u02c2\u0001\u0000\u0000\u0000r\u02c6\u0001\u0000\u0000\u0000t\u02e0"+
		"\u0001\u0000\u0000\u0000v\u02e2\u0001\u0000\u0000\u0000xz\u0003\u0002"+
		"\u0001\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}~\u0005\u0000\u0000\u0001~\u0001\u0001\u0000\u0000\u0000\u007f\u008e"+
		"\u0003\u0006\u0003\u0000\u0080\u008e\u0003\u000e\u0007\u0000\u0081\u008e"+
		"\u0003\f\u0006\u0000\u0082\u008e\u0003Z-\u0000\u0083\u008e\u0003J%\u0000"+
		"\u0084\u008e\u0003^/\u0000\u0085\u008e\u0003b1\u0000\u0086\u008e\u0003"+
		"f3\u0000\u0087\u0088\u0003\u0004\u0002\u0000\u0088\u0089\u0005\u0004\u0000"+
		"\u0000\u0089\u008e\u0001\u0000\u0000\u0000\u008a\u008b\u0003j5\u0000\u008b"+
		"\u008c\u0005\u0004\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d"+
		"\u007f\u0001\u0000\u0000\u0000\u008d\u0080\u0001\u0000\u0000\u0000\u008d"+
		"\u0081\u0001\u0000\u0000\u0000\u008d\u0082\u0001\u0000\u0000\u0000\u008d"+
		"\u0083\u0001\u0000\u0000\u0000\u008d\u0084\u0001\u0000\u0000\u0000\u008d"+
		"\u0085\u0001\u0000\u0000\u0000\u008d\u0086\u0001\u0000\u0000\u0000\u008d"+
		"\u0087\u0001\u0000\u0000\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008e"+
		"\u0003\u0001\u0000\u0000\u0000\u008f\u0090\u0005n\u0000\u0000\u0090\u0091"+
		"\u0005.\u0000\u0000\u0091\u0092\u0005n\u0000\u0000\u0092\u0093\u00057"+
		"\u0000\u0000\u0093\u0094\u0003j5\u0000\u0094\u0005\u0001\u0000\u0000\u0000"+
		"\u0095\u009a\u0005\u000b\u0000\u0000\u0096\u0097\u0003\b\u0004\u0000\u0097"+
		"\u0098\u0005\f\u0000\u0000\u0098\u0099\u0005j\u0000\u0000\u0099\u009b"+
		"\u0001\u0000\u0000\u0000\u009a\u0096\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0005\u0004\u0000\u0000\u009d\u0007\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u00051\u0000\u0000\u009f\u00a4\u0003\n\u0005\u0000\u00a0\u00a1\u0005"+
		"6\u0000\u0000\u00a1\u00a3\u0003\n\u0005\u0000\u00a2\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a8\u00052\u0000"+
		"\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00ab\u0005n\u0000\u0000"+
		"\u00aa\u009e\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ab\t\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005n\u0000\u0000\u00ad"+
		"\u000b\u0001\u0000\u0000\u0000\u00ae\u00af\u0003\u000e\u0007\u0000\u00af"+
		"\u00b0\u0003v;\u0000\u00b0\r\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005"+
		"\u0014\u0000\u0000\u00b2\u00b3\u00053\u0000\u0000\u00b3\u00b5\u00051\u0000"+
		"\u0000\u00b4\u00b6\u0003\u0010\b\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u00052\u0000\u0000\u00b8\u00b9\u00054\u0000\u0000\u00b9\u000f"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bf\u0003\u0012\t\u0000\u00bb\u00bc\u0005"+
		"6\u0000\u0000\u00bc\u00be\u0003\u0012\t\u0000\u00bd\u00bb\u0001\u0000"+
		"\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c4\u00056\u0000"+
		"\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u0011\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0015\u0000"+
		"\u0000\u00c6\u00c7\u00055\u0000\u0000\u00c7\u00d8\u0005j\u0000\u0000\u00c8"+
		"\u00c9\u0005\u0017\u0000\u0000\u00c9\u00ca\u00055\u0000\u0000\u00ca\u00d8"+
		"\u0003 \u0010\u0000\u00cb\u00cc\u0005\u0018\u0000\u0000\u00cc\u00cd\u0005"+
		"5\u0000\u0000\u00cd\u00ce\u0005/\u0000\u0000\u00ce\u00cf\u0003\u0014\n"+
		"\u0000\u00cf\u00d0\u00050\u0000\u0000\u00d0\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0005\u0016\u0000\u0000\u00d2\u00d3\u00055\u0000\u0000\u00d3"+
		"\u00d8\u0005\u000f\u0000\u0000\u00d4\u00d5\u0005[\u0000\u0000\u00d5\u00d6"+
		"\u00055\u0000\u0000\u00d6\u00d8\u0003L&\u0000\u00d7\u00c5\u0001\u0000"+
		"\u0000\u0000\u00d7\u00c8\u0001\u0000\u0000\u0000\u00d7\u00cb\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d1\u0001\u0000\u0000\u0000\u00d7\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d8\u0013\u0001\u0000\u0000\u0000\u00d9\u00dd\u00059\u0000"+
		"\u0000\u00da\u00dc\u0003\u0016\u000b\u0000\u00db\u00da\u0001\u0000\u0000"+
		"\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e0\u0001\u0000\u0000"+
		"\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e1\u00059\u0000\u0000"+
		"\u00e1\u0015\u0001\u0000\u0000\u0000\u00e2\u00e4\u0003\u0018\f\u0000\u00e3"+
		"\u00e5\u0005Z\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8"+
		"\u00051\u0000\u0000\u00e7\u00e9\u0003\u001a\r\u0000\u00e8\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u00052\u0000\u0000\u00ed\u0017\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ff\u0005n\u0000\u0000\u00ef\u00f0\u0005.\u0000\u0000"+
		"\u00f0\u00ff\u0005n\u0000\u0000\u00f1\u00f2\u0005m\u0000\u0000\u00f2\u00ff"+
		"\u0005n\u0000\u0000\u00f3\u00ff\u0005\u001a\u0000\u0000\u00f4\u00ff\u0005"+
		"\u001b\u0000\u0000\u00f5\u00ff\u0005\u001c\u0000\u0000\u00f6\u00ff\u0005"+
		"\u001e\u0000\u0000\u00f7\u00ff\u0005\u001d\u0000\u0000\u00f8\u00ff\u0005"+
		"\u001f\u0000\u0000\u00f9\u00ff\u0005 \u0000\u0000\u00fa\u00ff\u0005\""+
		"\u0000\u0000\u00fb\u00ff\u0005!\u0000\u0000\u00fc\u00ff\u0005#\u0000\u0000"+
		"\u00fd\u00ff\u0005$\u0000\u0000\u00fe\u00ee\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ef\u0001\u0000\u0000\u0000\u00fe\u00f1\u0001\u0000\u0000\u0000\u00fe"+
		"\u00f3\u0001\u0000\u0000\u0000\u00fe\u00f4\u0001\u0000\u0000\u0000\u00fe"+
		"\u00f5\u0001\u0000\u0000\u0000\u00fe\u00f6\u0001\u0000\u0000\u0000\u00fe"+
		"\u00f7\u0001\u0000\u0000\u0000\u00fe\u00f8\u0001\u0000\u0000\u0000\u00fe"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fe\u00fa\u0001\u0000\u0000\u0000\u00fe"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe"+
		"\u00fd\u0001\u0000\u0000\u0000\u00ff\u0019\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0003\u001c\u000e\u0000\u0101\u0102\u00055\u0000\u0000\u0102\u0107"+
		"\u0003\u001e\u000f\u0000\u0103\u0104\u00056\u0000\u0000\u0104\u0106\u0003"+
		"\u001e\u000f\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0109\u0001"+
		"\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001"+
		"\u0000\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u0107\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0005\u0004\u0000\u0000\u010b\u001b\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\u0007\u0000\u0000\u0000\u010d\u001d\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0007\u0001\u0000\u0000\u010f\u001f\u0001"+
		"\u0000\u0000\u0000\u0110\u0112\u00059\u0000\u0000\u0111\u0113\u0003\""+
		"\u0011\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0115\u00059\u0000"+
		"\u0000\u0115!\u0001\u0000\u0000\u0000\u0116\u011a\u0003&\u0013\u0000\u0117"+
		"\u011a\u0003$\u0012\u0000\u0118\u011a\u0005n\u0000\u0000\u0119\u0116\u0001"+
		"\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u0118\u0001"+
		"\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u0119\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c#\u0001\u0000"+
		"\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u011f\u0005b\u0000"+
		"\u0000\u011f%\u0001\u0000\u0000\u0000\u0120\u012a\u0003*\u0015\u0000\u0121"+
		"\u012a\u00030\u0018\u0000\u0122\u012a\u00032\u0019\u0000\u0123\u012a\u0003"+
		"4\u001a\u0000\u0124\u012a\u0003,\u0016\u0000\u0125\u012a\u0003.\u0017"+
		"\u0000\u0126\u012a\u0003(\u0014\u0000\u0127\u012a\u00036\u001b\u0000\u0128"+
		"\u012a\u00038\u001c\u0000\u0129\u0120\u0001\u0000\u0000\u0000\u0129\u0121"+
		"\u0001\u0000\u0000\u0000\u0129\u0122\u0001\u0000\u0000\u0000\u0129\u0123"+
		"\u0001\u0000\u0000\u0000\u0129\u0124\u0001\u0000\u0000\u0000\u0129\u0125"+
		"\u0001\u0000\u0000\u0000\u0129\u0126\u0001\u0000\u0000\u0000\u0129\u0127"+
		"\u0001\u0000\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u012a\'\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0005%\u0000\u0000\u012c\u012e\u0005\""+
		"\u0000\u0000\u012d\u012f\u0003:\u001d\u0000\u012e\u012d\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000"+
		"\u0000\u0130\u0132\u0005&\u0000\u0000\u0131\u0133\u0003\"\u0011\u0000"+
		"\u0132\u0131\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0005\'\u0000\u0000\u0135"+
		"\u0136\u0005\"\u0000\u0000\u0136\u0137\u0005&\u0000\u0000\u0137)\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0005%\u0000\u0000\u0139\u013b\u0005\u001a"+
		"\u0000\u0000\u013a\u013c\u0003:\u001d\u0000\u013b\u013a\u0001\u0000\u0000"+
		"\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000"+
		"\u0000\u013d\u013f\u0005&\u0000\u0000\u013e\u0140\u0003\"\u0011\u0000"+
		"\u013f\u013e\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000"+
		"\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0005\'\u0000\u0000\u0142"+
		"\u0143\u0005\u001a\u0000\u0000\u0143\u0144\u0005&\u0000\u0000\u0144+\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0005%\u0000\u0000\u0146\u0148\u0005 \u0000"+
		"\u0000\u0147\u0149\u0003:\u001d\u0000\u0148\u0147\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000"+
		"\u014a\u014c\u0005&\u0000\u0000\u014b\u014d\u0003\"\u0011\u0000\u014c"+
		"\u014b\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u0005\'\u0000\u0000\u014f\u0150"+
		"\u0005 \u0000\u0000\u0150\u0151\u0005&\u0000\u0000\u0151-\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0005%\u0000\u0000\u0153\u0155\u0005!\u0000\u0000"+
		"\u0154\u0156\u0003:\u001d\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0155"+
		"\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157"+
		"\u0159\u0005&\u0000\u0000\u0158\u015a\u0003\"\u0011\u0000\u0159\u0158"+
		"\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015b"+
		"\u0001\u0000\u0000\u0000\u015b\u015c\u0005\'\u0000\u0000\u015c\u015d\u0005"+
		"!\u0000\u0000\u015d\u015e\u0005&\u0000\u0000\u015e/\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0005%\u0000\u0000\u0160\u0162\u0005\u001b\u0000\u0000"+
		"\u0161\u0163\u0003:\u001d\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0162"+
		"\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164"+
		"\u0166\u0005&\u0000\u0000\u0165\u0167\u0003\"\u0011\u0000\u0166\u0165"+
		"\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0168"+
		"\u0001\u0000\u0000\u0000\u0168\u0169\u0005\'\u0000\u0000\u0169\u016a\u0005"+
		"\u001b\u0000\u0000\u016a\u016b\u0005&\u0000\u0000\u016b1\u0001\u0000\u0000"+
		"\u0000\u016c\u016d\u0005%\u0000\u0000\u016d\u016f\u0005\u001d\u0000\u0000"+
		"\u016e\u0170\u0003:\u001d\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u016f"+
		"\u0170\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171"+
		"\u0173\u0005&\u0000\u0000\u0172\u0174\u0003\"\u0011\u0000\u0173\u0172"+
		"\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0175"+
		"\u0001\u0000\u0000\u0000\u0175\u0176\u0005\'\u0000\u0000\u0176\u0177\u0005"+
		"\u001d\u0000\u0000\u0177\u0178\u0005&\u0000\u0000\u01783\u0001\u0000\u0000"+
		"\u0000\u0179\u017a\u0005%\u0000\u0000\u017a\u017c\u0005\u001c\u0000\u0000"+
		"\u017b\u017d\u0003:\u001d\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0005(\u0000\u0000\u017f5\u0001\u0000\u0000\u0000\u0180\u0181\u0005"+
		"%\u0000\u0000\u0181\u0183\u0005#\u0000\u0000\u0182\u0184\u0003:\u001d"+
		"\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000"+
		"\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0005(\u0000\u0000"+
		"\u01867\u0001\u0000\u0000\u0000\u0187\u0188\u0005%\u0000\u0000\u0188\u018a"+
		"\u0005$\u0000\u0000\u0189\u018b\u0003:\u001d\u0000\u018a\u0189\u0001\u0000"+
		"\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000"+
		"\u0000\u0000\u018c\u018e\u0005&\u0000\u0000\u018d\u018f\u0003\"\u0011"+
		"\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000"+
		"\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0191\u0005\'\u0000\u0000"+
		"\u0191\u0192\u0005$\u0000\u0000\u0192\u0193\u0005&\u0000\u0000\u01939"+
		"\u0001\u0000\u0000\u0000\u0194\u019d\u0003<\u001e\u0000\u0195\u019d\u0003"+
		">\u001f\u0000\u0196\u019d\u0003@ \u0000\u0197\u019d\u0003B!\u0000\u0198"+
		"\u019d\u0003D\"\u0000\u0199\u019d\u0003H$\u0000\u019a\u019d\u0003F#\u0000"+
		"\u019b\u019d\u0005j\u0000\u0000\u019c\u0194\u0001\u0000\u0000\u0000\u019c"+
		"\u0195\u0001\u0000\u0000\u0000\u019c\u0196\u0001\u0000\u0000\u0000\u019c"+
		"\u0197\u0001\u0000\u0000\u0000\u019c\u0198\u0001\u0000\u0000\u0000\u019c"+
		"\u0199\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c"+
		"\u019b\u0001\u0000\u0000\u0000\u019d\u01a0\u0001\u0000\u0000\u0000\u019e"+
		"\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f"+
		";\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1\u01a2"+
		"\u0005f\u0000\u0000\u01a2\u01a3\u00057\u0000\u0000\u01a3\u01a8\u0005j"+
		"\u0000\u0000\u01a4\u01a5\u0005g\u0000\u0000\u01a5\u01a6\u00057\u0000\u0000"+
		"\u01a6\u01a8\u0005j\u0000\u0000\u01a7\u01a1\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a8=\u0001\u0000\u0000\u0000\u01a9\u01aa"+
		"\u0005h\u0000\u0000\u01aa\u01ab\u00057\u0000\u0000\u01ab\u01b0\u0005j"+
		"\u0000\u0000\u01ac\u01ad\u0005i\u0000\u0000\u01ad\u01ae\u00057\u0000\u0000"+
		"\u01ae\u01b0\u0005j\u0000\u0000\u01af\u01a9\u0001\u0000\u0000\u0000\u01af"+
		"\u01ac\u0001\u0000\u0000\u0000\u01b0?\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u0005`\u0000\u0000\u01b2\u01b5\u00057\u0000\u0000\u01b3\u01b6\u0003\u0004"+
		"\u0002\u0000\u01b4\u01b6\u0005j\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b6\u01bb\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b8\u0005a\u0000\u0000\u01b8\u01b9\u00057\u0000\u0000\u01b9"+
		"\u01bb\u0005j\u0000\u0000\u01ba\u01b1\u0001\u0000\u0000\u0000\u01ba\u01b7"+
		"\u0001\u0000\u0000\u0000\u01bbA\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005"+
		"\u0019\u0000\u0000\u01bd\u01be\u00057\u0000\u0000\u01be\u01bf\u0005j\u0000"+
		"\u0000\u01bfC\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005d\u0000\u0000\u01c1"+
		"\u01c2\u00057\u0000\u0000\u01c2\u01c3\u0003\u0004\u0002\u0000\u01c3E\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c5\u0005c\u0000\u0000\u01c5\u01c6\u00057\u0000"+
		"\u0000\u01c6\u01c7\u0003\u0004\u0002\u0000\u01c7G\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c9\u0005\\\u0000\u0000\u01c9\u01ca\u00057\u0000\u0000\u01ca"+
		"\u01d3\u0005j\u0000\u0000\u01cb\u01cc\u0005]\u0000\u0000\u01cc\u01cd\u0005"+
		"7\u0000\u0000\u01cd\u01d3\u0005j\u0000\u0000\u01ce\u01cf\u0005^\u0000"+
		"\u0000\u01cf\u01d0\u00057\u0000\u0000\u01d0\u01d3\u0005j\u0000\u0000\u01d1"+
		"\u01d3\u0005_\u0000\u0000\u01d2\u01c8\u0001\u0000\u0000\u0000\u01d2\u01cb"+
		"\u0001\u0000\u0000\u0000\u01d2\u01ce\u0001\u0000\u0000\u0000\u01d2\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d3I\u0001\u0000\u0000\u0000\u01d4\u01d6\u0007"+
		"\u0002\u0000\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01da\u0005"+
		"n\u0000\u0000\u01d8\u01d9\u00055\u0000\u0000\u01d9\u01db\u0003X,\u0000"+
		"\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000"+
		"\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01e0\u00057\u0000\u0000\u01dd"+
		"\u01e1\u0003V+\u0000\u01de\u01e1\u0003L&\u0000\u01df\u01e1\u0003R)\u0000"+
		"\u01e0\u01dd\u0001\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000"+
		"\u01e0\u01df\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e3\u0005\u0004\u0000\u0000\u01e3\u0213\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e5\u0005\u0003\u0000\u0000\u01e5\u01e8\u0005n\u0000\u0000\u01e6"+
		"\u01e7\u00055\u0000\u0000\u01e7\u01e9\u0003X,\u0000\u01e8\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001"+
		"\u0000\u0000\u0000\u01ea\u01eb\u00057\u0000\u0000\u01eb\u01ec\u0003j5"+
		"\u0000\u01ec\u01ed\u0005\u0004\u0000\u0000\u01ed\u0213\u0001\u0000\u0000"+
		"\u0000\u01ee\u01f0\u0007\u0002\u0000\u0000\u01ef\u01ee\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f2\u0005\u0006\u0000\u0000\u01f2\u01f5\u0005n\u0000\u0000"+
		"\u01f3\u01f4\u00055\u0000\u0000\u01f4\u01f6\u0003X,\u0000\u01f5\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01fd"+
		"\u0001\u0000\u0000\u0000\u01f7\u01fb\u00057\u0000\u0000\u01f8\u01fc\u0003"+
		"V+\u0000\u01f9\u01fc\u0003L&\u0000\u01fa\u01fc\u0003R)\u0000\u01fb\u01f8"+
		"\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fa"+
		"\u0001\u0000\u0000\u0000\u01fc\u01fe\u0001\u0000\u0000\u0000\u01fd\u01f7"+
		"\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u01ff"+
		"\u0001\u0000\u0000\u0000\u01ff\u0213\u0005\u0004\u0000\u0000\u0200\u0202"+
		"\u0007\u0002\u0000\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0201\u0202"+
		"\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0204"+
		"\u0005\u0005\u0000\u0000\u0204\u0207\u0005n\u0000\u0000\u0205\u0206\u0005"+
		"5\u0000\u0000\u0206\u0208\u0003X,\u0000\u0207\u0205\u0001\u0000\u0000"+
		"\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u020f\u0001\u0000\u0000"+
		"\u0000\u0209\u020d\u00057\u0000\u0000\u020a\u020e\u0003V+\u0000\u020b"+
		"\u020e\u0003L&\u0000\u020c\u020e\u0003R)\u0000\u020d\u020a\u0001\u0000"+
		"\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020d\u020c\u0001\u0000"+
		"\u0000\u0000\u020e\u0210\u0001\u0000\u0000\u0000\u020f\u0209\u0001\u0000"+
		"\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000"+
		"\u0000\u0000\u0211\u0213\u0005\u0004\u0000\u0000\u0212\u01d5\u0001\u0000"+
		"\u0000\u0000\u0212\u01e4\u0001\u0000\u0000\u0000\u0212\u01ef\u0001\u0000"+
		"\u0000\u0000\u0212\u0201\u0001\u0000\u0000\u0000\u0213K\u0001\u0000\u0000"+
		"\u0000\u0214\u0216\u0005/\u0000\u0000\u0215\u0217\u0003N\'\u0000\u0216"+
		"\u0215\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217"+
		"\u0218\u0001\u0000\u0000\u0000\u0218\u0219\u00050\u0000\u0000\u0219M\u0001"+
		"\u0000\u0000\u0000\u021a\u021f\u0003P(\u0000\u021b\u021c\u00056\u0000"+
		"\u0000\u021c\u021e\u0003P(\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021e"+
		"\u0221\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u021f"+
		"\u0220\u0001\u0000\u0000\u0000\u0220O\u0001\u0000\u0000\u0000\u0221\u021f"+
		"\u0001\u0000\u0000\u0000\u0222\u0225\u0003R)\u0000\u0223\u0225\u0003V"+
		"+\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0224\u0223\u0001\u0000\u0000"+
		"\u0000\u0225Q\u0001\u0000\u0000\u0000\u0226\u022f\u00051\u0000\u0000\u0227"+
		"\u022c\u0003T*\u0000\u0228\u0229\u00056\u0000\u0000\u0229\u022b\u0003"+
		"T*\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022b\u022e\u0001\u0000\u0000"+
		"\u0000\u022c\u022a\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000"+
		"\u0000\u022d\u0230\u0001\u0000\u0000\u0000\u022e\u022c\u0001\u0000\u0000"+
		"\u0000\u022f\u0227\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000"+
		"\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0232\u00052\u0000\u0000"+
		"\u0232S\u0001\u0000\u0000\u0000\u0233\u0234\u0007\u0003\u0000\u0000\u0234"+
		"\u0235\u00055\u0000\u0000\u0235\u0236\u0003j5\u0000\u0236U\u0001\u0000"+
		"\u0000\u0000\u0237\u0240\u0005j\u0000\u0000\u0238\u0240\u0005k\u0000\u0000"+
		"\u0239\u0240\u0005l\u0000\u0000\u023a\u0240\u0003R)\u0000\u023b\u0240"+
		"\u0003L&\u0000\u023c\u0240\u0005n\u0000\u0000\u023d\u0240\u0005\u0013"+
		"\u0000\u0000\u023e\u0240\u0003j5\u0000\u023f\u0237\u0001\u0000\u0000\u0000"+
		"\u023f\u0238\u0001\u0000\u0000\u0000\u023f\u0239\u0001\u0000\u0000\u0000"+
		"\u023f\u023a\u0001\u0000\u0000\u0000\u023f\u023b\u0001\u0000\u0000\u0000"+
		"\u023f\u023c\u0001\u0000\u0000\u0000\u023f\u023d\u0001\u0000\u0000\u0000"+
		"\u023f\u023e\u0001\u0000\u0000\u0000\u0240W\u0001\u0000\u0000\u0000\u0241"+
		"\u024a\u0005n\u0000\u0000\u0242\u0247\u0005n\u0000\u0000\u0243\u0244\u0005"+
		"6\u0000\u0000\u0244\u0246\u0005n\u0000\u0000\u0245\u0243\u0001\u0000\u0000"+
		"\u0000\u0246\u0249\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000"+
		"\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u024b\u0001\u0000\u0000"+
		"\u0000\u0249\u0247\u0001\u0000\u0000\u0000\u024a\u0242\u0001\u0000\u0000"+
		"\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u0256\u0001\u0000\u0000"+
		"\u0000\u024c\u0251\u0007\u0003\u0000\u0000\u024d\u024e\u0005-\u0000\u0000"+
		"\u024e\u0250\u0007\u0003\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000"+
		"\u0250\u0253\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000\u0000\u0000"+
		"\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u0256\u0001\u0000\u0000\u0000"+
		"\u0253\u0251\u0001\u0000\u0000\u0000\u0254\u0256\u0005\u0012\u0000\u0000"+
		"\u0255\u0241\u0001\u0000\u0000\u0000\u0255\u024c\u0001\u0000\u0000\u0000"+
		"\u0255\u0254\u0001\u0000\u0000\u0000\u0256Y\u0001\u0000\u0000\u0000\u0257"+
		"\u0258\u0005\b\u0000\u0000\u0258\u0259\u0005n\u0000\u0000\u0259\u025d"+
		"\u00051\u0000\u0000\u025a\u025c\u0003\\.\u0000\u025b\u025a\u0001\u0000"+
		"\u0000\u0000\u025c\u025f\u0001\u0000\u0000\u0000\u025d\u025b\u0001\u0000"+
		"\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u0260\u0001\u0000"+
		"\u0000\u0000\u025f\u025d\u0001\u0000\u0000\u0000\u0260\u0261\u00052\u0000"+
		"\u0000\u0261[\u0001\u0000\u0000\u0000\u0262\u0266\u0003J%\u0000\u0263"+
		"\u0266\u0003^/\u0000\u0264\u0266\u0003`0\u0000\u0265\u0262\u0001\u0000"+
		"\u0000\u0000\u0265\u0263\u0001\u0000\u0000\u0000\u0265\u0264\u0001\u0000"+
		"\u0000\u0000\u0266]\u0001\u0000\u0000\u0000\u0267\u0268\u0005n\u0000\u0000"+
		"\u0268\u026a\u00053\u0000\u0000\u0269\u026b\u0003t:\u0000\u026a\u0269"+
		"\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026c"+
		"\u0001\u0000\u0000\u0000\u026c\u026d\u00054\u0000\u0000\u026d\u026e\u0003"+
		"v;\u0000\u026e_\u0001\u0000\u0000\u0000\u026f\u0270\u0005\t\u0000\u0000"+
		"\u0270\u0272\u00053\u0000\u0000\u0271\u0273\u0003t:\u0000\u0272\u0271"+
		"\u0001\u0000\u0000\u0000\u0272\u0273\u0001\u0000\u0000\u0000\u0273\u0274"+
		"\u0001\u0000\u0000\u0000\u0274\u0275\u00054\u0000\u0000\u0275\u0276\u0003"+
		"v;\u0000\u0276a\u0001\u0000\u0000\u0000\u0277\u0278\u0005\n\u0000\u0000"+
		"\u0278\u0279\u0005n\u0000\u0000\u0279\u027d\u00051\u0000\u0000\u027a\u027c"+
		"\u0003d2\u0000\u027b\u027a\u0001\u0000\u0000\u0000\u027c\u027f\u0001\u0000"+
		"\u0000\u0000\u027d\u027b\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000"+
		"\u0000\u0000\u027e\u0280\u0001\u0000\u0000\u0000\u027f\u027d\u0001\u0000"+
		"\u0000\u0000\u0280\u0281\u00052\u0000\u0000\u0281c\u0001\u0000\u0000\u0000"+
		"\u0282\u0283\u0005n\u0000\u0000\u0283\u0284\u00055\u0000\u0000\u0284\u0285"+
		"\u0003X,\u0000\u0285\u0286\u0005\u0004\u0000\u0000\u0286e\u0001\u0000"+
		"\u0000\u0000\u0287\u028b\u0005\r\u0000\u0000\u0288\u028c\u0003J%\u0000"+
		"\u0289\u028c\u0003^/\u0000\u028a\u028c\u0003Z-\u0000\u028b\u0288\u0001"+
		"\u0000\u0000\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028b\u028a\u0001"+
		"\u0000\u0000\u0000\u028cg\u0001\u0000\u0000\u0000\u028d\u0292\u0003j5"+
		"\u0000\u028e\u028f\u00056\u0000\u0000\u028f\u0291\u0003j5\u0000\u0290"+
		"\u028e\u0001\u0000\u0000\u0000\u0291\u0294\u0001\u0000\u0000\u0000\u0292"+
		"\u0290\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293"+
		"i\u0001\u0000\u0000\u0000\u0294\u0292\u0001\u0000\u0000\u0000\u0295\u0296"+
		"\u00065\uffff\uffff\u0000\u0296\u0297\u0005n\u0000\u0000\u0297\u0299\u0005"+
		"3\u0000\u0000\u0298\u029a\u0003h4\u0000\u0299\u0298\u0001\u0000\u0000"+
		"\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000"+
		"\u0000\u029b\u02a8\u00054\u0000\u0000\u029c\u02a8\u0003l6\u0000\u029d"+
		"\u02a8\u0003R)\u0000\u029e\u02a8\u0005n\u0000\u0000\u029f\u02a8\u0003"+
		"n7\u0000\u02a0\u02a8\u0003p8\u0000\u02a1\u02a8\u0003r9\u0000\u02a2\u02a3"+
		"\u00053\u0000\u0000\u02a3\u02a4\u0003j5\u0000\u02a4\u02a5\u00054\u0000"+
		"\u0000\u02a5\u02a8\u0001\u0000\u0000\u0000\u02a6\u02a8\u0005\u0013\u0000"+
		"\u0000\u02a7\u0295\u0001\u0000\u0000\u0000\u02a7\u029c\u0001\u0000\u0000"+
		"\u0000\u02a7\u029d\u0001\u0000\u0000\u0000\u02a7\u029e\u0001\u0000\u0000"+
		"\u0000\u02a7\u029f\u0001\u0000\u0000\u0000\u02a7\u02a0\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a1\u0001\u0000\u0000\u0000\u02a7\u02a2\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a6\u0001\u0000\u0000\u0000\u02a8\u02b9\u0001\u0000\u0000"+
		"\u0000\u02a9\u02aa\n\f\u0000\u0000\u02aa\u02ab\u00057\u0000\u0000\u02ab"+
		"\u02b8\u0003j5\r\u02ac\u02ad\n\u000b\u0000\u0000\u02ad\u02ae\u0005.\u0000"+
		"\u0000\u02ae\u02b8\u0005n\u0000\u0000\u02af\u02b0\n\n\u0000\u0000\u02b0"+
		"\u02b1\u0005.\u0000\u0000\u02b1\u02b2\u0005n\u0000\u0000\u02b2\u02b4\u0005"+
		"3\u0000\u0000\u02b3\u02b5\u0003h4\u0000\u02b4\u02b3\u0001\u0000\u0000"+
		"\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000"+
		"\u0000\u02b6\u02b8\u00054\u0000\u0000\u02b7\u02a9\u0001\u0000\u0000\u0000"+
		"\u02b7\u02ac\u0001\u0000\u0000\u0000\u02b7\u02af\u0001\u0000\u0000\u0000"+
		"\u02b8\u02bb\u0001\u0000\u0000\u0000\u02b9\u02b7\u0001\u0000\u0000\u0000"+
		"\u02b9\u02ba\u0001\u0000\u0000\u0000\u02bak\u0001\u0000\u0000\u0000\u02bb"+
		"\u02b9\u0001\u0000\u0000\u0000\u02bc\u02bd\u0007\u0004\u0000\u0000\u02bd"+
		"m\u0001\u0000\u0000\u0000\u02be\u02bf\u0005`\u0000\u0000\u02bf\u02c0\u0005"+
		"7\u0000\u0000\u02c0\u02c1\u0005j\u0000\u0000\u02c1o\u0001\u0000\u0000"+
		"\u0000\u02c2\u02c3\u0005a\u0000\u0000\u02c3\u02c4\u00057\u0000\u0000\u02c4"+
		"\u02c5\u0005j\u0000\u0000\u02c5q\u0001\u0000\u0000\u0000\u02c6\u02c7\u0005"+
		"y\u0000\u0000\u02c7\u02c8\u00057\u0000\u0000\u02c8\u02c9\u0005j\u0000"+
		"\u0000\u02c9s\u0001\u0000\u0000\u0000\u02ca\u02cb\u0005n\u0000\u0000\u02cb"+
		"\u02cc\u00055\u0000\u0000\u02cc\u02d1\u0005n\u0000\u0000\u02cd\u02ce\u0005"+
		"6\u0000\u0000\u02ce\u02d0\u0003t:\u0000\u02cf\u02cd\u0001\u0000\u0000"+
		"\u0000\u02d0\u02d3\u0001\u0000\u0000\u0000\u02d1\u02cf\u0001\u0000\u0000"+
		"\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u02e1\u0001\u0000\u0000"+
		"\u0000\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d4\u02d5\u0005n\u0000\u0000"+
		"\u02d5\u02d6\u00055\u0000\u0000\u02d6\u02dd\u0003X,\u0000\u02d7\u02d8"+
		"\u00056\u0000\u0000\u02d8\u02d9\u0005n\u0000\u0000\u02d9\u02da\u00055"+
		"\u0000\u0000\u02da\u02dc\u0003X,\u0000\u02db\u02d7\u0001\u0000\u0000\u0000"+
		"\u02dc\u02df\u0001\u0000\u0000\u0000\u02dd\u02db\u0001\u0000\u0000\u0000"+
		"\u02dd\u02de\u0001\u0000\u0000\u0000\u02de\u02e1\u0001\u0000\u0000\u0000"+
		"\u02df\u02dd\u0001\u0000\u0000\u0000\u02e0\u02ca\u0001\u0000\u0000\u0000"+
		"\u02e0\u02d4\u0001\u0000\u0000\u0000\u02e1u\u0001\u0000\u0000\u0000\u02e2"+
		"\u02e6\u00051\u0000\u0000\u02e3\u02e5\u0003\u0002\u0001\u0000\u02e4\u02e3"+
		"\u0001\u0000\u0000\u0000\u02e5\u02e8\u0001\u0000\u0000\u0000\u02e6\u02e4"+
		"\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7\u02e9"+
		"\u0001\u0000\u0000\u0000\u02e8\u02e6\u0001\u0000\u0000\u0000\u02e9\u02ea"+
		"\u00052\u0000\u0000\u02eaw\u0001\u0000\u0000\u0000P{\u008d\u009a\u00a4"+
		"\u00aa\u00b5\u00bf\u00c3\u00d7\u00dd\u00e4\u00ea\u00fe\u0107\u0112\u0119"+
		"\u011b\u0129\u012e\u0132\u013b\u013f\u0148\u014c\u0155\u0159\u0162\u0166"+
		"\u016f\u0173\u017c\u0183\u018a\u018e\u019c\u019e\u01a7\u01af\u01b5\u01ba"+
		"\u01d2\u01d5\u01da\u01e0\u01e8\u01ef\u01f5\u01fb\u01fd\u0201\u0207\u020d"+
		"\u020f\u0212\u0216\u021f\u0224\u022c\u022f\u023f\u0247\u024a\u0251\u0255"+
		"\u025d\u0265\u026a\u0272\u027d\u028b\u0292\u0299\u02a7\u02b4\u02b7\u02b9"+
		"\u02d1\u02dd\u02e0\u02e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}