// Generated from C:/Users/Anwar AL-Oklah/IdeaProjects/Compiler2/src/AngularParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AngularParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AngularParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AngularParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AngularParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importClause}.
	 * @param ctx the parse tree
	 */
	void enterImportClause(AngularParser.ImportClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importClause}.
	 * @param ctx the parse tree
	 */
	void exitImportClause(AngularParser.ImportClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterImportSpecifier(AngularParser.ImportSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitImportSpecifier(AngularParser.ImportSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentDefinition}.
	 * @param ctx the parse tree
	 */
	void enterComponentDefinition(AngularParser.ComponentDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentDefinition}.
	 * @param ctx the parse tree
	 */
	void exitComponentDefinition(AngularParser.ComponentDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentPropertyList}.
	 * @param ctx the parse tree
	 */
	void enterComponentPropertyList(AngularParser.ComponentPropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentPropertyList}.
	 * @param ctx the parse tree
	 */
	void exitComponentPropertyList(AngularParser.ComponentPropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterComponentProperty(AngularParser.ComponentPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitComponentProperty(AngularParser.ComponentPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#styles}.
	 * @param ctx the parse tree
	 */
	void enterStyles(AngularParser.StylesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#styles}.
	 * @param ctx the parse tree
	 */
	void exitStyles(AngularParser.StylesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#styleRule}.
	 * @param ctx the parse tree
	 */
	void enterStyleRule(AngularParser.StyleRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#styleRule}.
	 * @param ctx the parse tree
	 */
	void exitStyleRule(AngularParser.StyleRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssSelector(AngularParser.CssSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssSelector(AngularParser.CssSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclaration(AngularParser.CssDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclaration(AngularParser.CssDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterCssProperty(AngularParser.CssPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitCssProperty(AngularParser.CssPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValue(AngularParser.CssValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValue(AngularParser.CssValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(AngularParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(AngularParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#divElement}.
	 * @param ctx the parse tree
	 */
	void enterDivElement(AngularParser.DivElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#divElement}.
	 * @param ctx the parse tree
	 */
	void exitDivElement(AngularParser.DivElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#pElement}.
	 * @param ctx the parse tree
	 */
	void enterPElement(AngularParser.PElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#pElement}.
	 * @param ctx the parse tree
	 */
	void exitPElement(AngularParser.PElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#h2Element}.
	 * @param ctx the parse tree
	 */
	void enterH2Element(AngularParser.H2ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#h2Element}.
	 * @param ctx the parse tree
	 */
	void exitH2Element(AngularParser.H2ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#imgElement}.
	 * @param ctx the parse tree
	 */
	void enterImgElement(AngularParser.ImgElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#imgElement}.
	 * @param ctx the parse tree
	 */
	void exitImgElement(AngularParser.ImgElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlAttributes}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributes(AngularParser.HtmlAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlAttributes}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributes(AngularParser.HtmlAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#angularDirective}.
	 * @param ctx the parse tree
	 */
	void enterAngularDirective(AngularParser.AngularDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#angularDirective}.
	 * @param ctx the parse tree
	 */
	void exitAngularDirective(AngularParser.AngularDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#angularEvent}.
	 * @param ctx the parse tree
	 */
	void enterAngularEvent(AngularParser.AngularEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#angularEvent}.
	 * @param ctx the parse tree
	 */
	void exitAngularEvent(AngularParser.AngularEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#angularBinding}.
	 * @param ctx the parse tree
	 */
	void enterAngularBinding(AngularParser.AngularBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#angularBinding}.
	 * @param ctx the parse tree
	 */
	void exitAngularBinding(AngularParser.AngularBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#styleAttribute}.
	 * @param ctx the parse tree
	 */
	void enterStyleAttribute(AngularParser.StyleAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#styleAttribute}.
	 * @param ctx the parse tree
	 */
	void exitStyleAttribute(AngularParser.StyleAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#srcAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSrcAttribute(AngularParser.SrcAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#srcAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSrcAttribute(AngularParser.SrcAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#altAttribute}.
	 * @param ctx the parse tree
	 */
	void enterAltAttribute(AngularParser.AltAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#altAttribute}.
	 * @param ctx the parse tree
	 */
	void exitAltAttribute(AngularParser.AltAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(AngularParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(AngularParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayy}.
	 * @param ctx the parse tree
	 */
	void enterArrayy(AngularParser.ArrayyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayy}.
	 * @param ctx the parse tree
	 */
	void exitArrayy(AngularParser.ArrayyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(AngularParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(AngularParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayElements}.
	 * @param ctx the parse tree
	 */
	void enterArrayElements(AngularParser.ArrayElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayElements}.
	 * @param ctx the parse tree
	 */
	void exitArrayElements(AngularParser.ArrayElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(AngularParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(AngularParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(AngularParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(AngularParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(AngularParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(AngularParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(AngularParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(AngularParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AngularParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AngularParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(AngularParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(AngularParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(AngularParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(AngularParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(AngularParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(AngularParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyBindingExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPropertyBindingExpression(AngularParser.PropertyBindingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyBindingExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPropertyBindingExpression(AngularParser.PropertyBindingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(AngularParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(AngularParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TwoWayBindingExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTwoWayBindingExpression(AngularParser.TwoWayBindingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TwoWayBindingExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTwoWayBindingExpression(AngularParser.TwoWayBindingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditionSubtractionExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionSubtractionExpression(AngularParser.AdditionSubtractionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditionSubtractionExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionSubtractionExpression(AngularParser.AdditionSubtractionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicationDivisionExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationDivisionExpression(AngularParser.MultiplicationDivisionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicationDivisionExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationDivisionExpression(AngularParser.MultiplicationDivisionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NgDirectiveExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNgDirectiveExpression(AngularParser.NgDirectiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NgDirectiveExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNgDirectiveExpression(AngularParser.NgDirectiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(AngularParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(AngularParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyBinding}.
	 * @param ctx the parse tree
	 */
	void enterPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyBinding}.
	 * @param ctx the parse tree
	 */
	void exitPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#twoWayBinding}.
	 * @param ctx the parse tree
	 */
	void enterTwoWayBinding(AngularParser.TwoWayBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#twoWayBinding}.
	 * @param ctx the parse tree
	 */
	void exitTwoWayBinding(AngularParser.TwoWayBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngDirective}.
	 * @param ctx the parse tree
	 */
	void enterNgDirective(AngularParser.NgDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngDirective}.
	 * @param ctx the parse tree
	 */
	void exitNgDirective(AngularParser.NgDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AngularParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AngularParser.BlockContext ctx);
}