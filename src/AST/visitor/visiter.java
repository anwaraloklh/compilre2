package AST.visitor;


import AST.node.Css.CSSProperty;
import AST.node.Css.CSSValue;
import AST.node.Css.CssSelector;
import AST.node.Expression.*;
import AST.node.Html.*;
import AST.node.MethodCallNode;
import AST.node.Html.ParenthesizedExpressionNode;
import AST.node.ThisKeywordNode;
import CodeGeneration.CodeGeneration;
import SymbolTablee.Row;
import SymbolTablee.SymbolTabol;
import gen.AngularParser;
import gen.AngularParserBaseVisitor;
import AST.node.*;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import semantic.SemanticErrorReporter;
import semantic.SemanticErrorType;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class visiter extends AngularParserBaseVisitor {

    private StringBuilder jsBuffer = new StringBuilder();



    public void clearJsBuffer() {
        jsBuffer.setLength(0);
    }

    public String getJsBufferContent() {
        return jsBuffer.toString();
    }
    private FileWriter file;
    private boolean visit = false;
    private SymbolTabol symboltabel;
    private SemanticErrorReporter errorReporter;
    private Set<String> importedModules = new HashSet<>();
    private Set<String> cssPropertiesInRule = new HashSet<>();
    private String currentImportSource = "";
    private final String filePath;

    private String mainComponentName = "app-root";
    private String mainTemplate = "";

    public visiter(SymbolTabol symbolTable, SemanticErrorReporter errorReporter, String filePath) {
        this.symboltabel = symbolTable;
        this.errorReporter = errorReporter;
        this.filePath = filePath;

        try {
            this.file = new FileWriter(filePath, false); // false = overwrite
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object visitProgram(AngularParser.ProgramContext ctx) {
        ProgramNode pro = new ProgramNode();


        writeToFile(CodeGeneration.HTMLGenerate.openDocument());


        writeToFile(CodeGeneration.HTMLGenerate.generateListPage());
        writeToFile(CodeGeneration.HTMLGenerate.generateAddPage());
        writeToFile(CodeGeneration.HTMLGenerate.generateDetailsPage());


        if (ctx.statement() != null) {
            for (int i = 0; i < ctx.statement().size(); i++) {
                this.visitStatement(ctx.statement(i));
            }
        }


        writeToFile(CodeGeneration.JSGenerate.openScript());
        writeToFile(CodeGeneration.JSGenerate.generateScript());
        writeToFile(jsBuffer.toString());
        writeToFile(CodeGeneration.JSGenerate.closeScript());

        writeToFile(CodeGeneration.HTMLGenerate.closeDocument());

        return pro;
    }





    @Override
    public StatementNode visitStatement(AngularParser.StatementContext ctx) {

        if(ctx.importStatement() != null){
            this.visitImportStatement(ctx.importStatement());
        }
        else if (ctx.componentDefinition() !=null) {
            this.visitComponentDefinition(ctx.componentDefinition());
        }
       else if (ctx.decorator() !=null) {
        this.visitDecorator(ctx.decorator());
    }

       else if(ctx.variableStatement() !=null){
           this.visitVariableStatement(ctx.variableStatement());
        }
        else if (ctx.functionDeclaration() !=null) {
            this.visitFunctionDeclaration(ctx.functionDeclaration());
        }
        else if (ctx.classDeclaration() !=null) {
            this.visitClassDeclaration(ctx.classDeclaration());
        }
        else if (ctx.exportStatement() !=null) {
            this.visitExportStatement(ctx.exportStatement());
        }
        else if (ctx.assignment() !=null) {
            this.visitAssignment(ctx.assignment());
        }
        else if (ctx.interfaceDeclaration() !=null) {
            this.visitInterfaceDeclaration(ctx.interfaceDeclaration());
        }
       else if (ctx.expression() != null) {
            this.visit(ctx.expression());

        }

        else if (ctx.assignment() != null) {
            this.visit(ctx.assignment());

        }
        return null;
    }

    @Override
    public Assignment visitAssignment(AngularParser.AssignmentContext ctx) {
        Assignment as =new Assignment();
        if (ctx.Identifier(0)!=null) {
            as.setLeft(ctx.Identifier(0).toString());
            as.print(0);
            Row row = new Row();
            row.setLine(ctx.getStart().getLine());
            row.setName(ctx.Identifier(1).getText());
            row.setType("Assignment");
            row.setScope(symboltabel.getCurrentScope());
            row.setValue(ctx.expression().getText());
            symboltabel.addRow(row);
        }
        System.out.print(".");
        if (ctx.Identifier(1)!=null) {
            as.setLeft(ctx.Identifier(1).toString());
            as.print(0);
            Row row = new Row();
            row.setLine(ctx.Identifier(1).getSymbol().getLine());
            row.setType("Assignment");
            row.setName(ctx.Identifier(1).getText());
            row.setValue(as.getLeft());
            symboltabel.getRows().add(row);
        }



        System.out.print("=");
//        if (ctx.expression() != null) {
//           this.visit(ctx.expression());
//
//        }
        System.out.println(";");
        return as;
    }

    @Override
    public Object visitImportStatement(AngularParser.ImportStatementContext ctx) {
        ImportStatement imp = new ImportStatement();
// symboltabel.enterScope();
        if (ctx.IMPORT() != null) {
            imp.setImport0(ctx.IMPORT().toString());
            imp.print(0);
        }

        if (ctx.StringLiteral() != null) {

            currentImportSource = ctx.StringLiteral().getText().replace("'", "").replace("\"", "");
            imp.setSource(ctx.StringLiteral().toString());
        }

        if (ctx.importClause() != null) {
            this.visitImportClause(ctx.importClause());
            if (ctx.FROM() != null) {
                imp.setFrom(ctx.FROM().toString());
            }
            imp.print(1);
        }
        System.out.println(";");

        currentImportSource = "";

        return imp;
    }

    @Override
    public Object visitImportClause(AngularParser.ImportClauseContext ctx) {
        System.out.print("{ ");

        if (ctx.importSpecifier() != null && !ctx.importSpecifier().isEmpty()) {
            this.visitImportSpecifier(ctx.importSpecifier(0));
            for (int i = 1; i < ctx.importSpecifier().size(); i++) {
                System.out.print(" , ");
                this.visitImportSpecifier(ctx.importSpecifier(i));
            }
        }
        System.out.print(" }");
        return null;
    }

    @Override
    public Object visitImportSpecifier(AngularParser.ImportSpecifierContext ctx) {
        ImportSpecifier imp = new ImportSpecifier();
        if (ctx.Identifier() != null) {
            String identifierName = ctx.Identifier().getText();
            imp.setIdentifier(identifierName);
            imp.print();

            Row row = new Row();
            row.setLine(ctx.getStart().getLine());
            row.setName(identifierName);
            row.setType("ImportPackage");
            row.setValue(currentImportSource);
            row.setScope("imports");
            List<Row> problematicRows = new ArrayList<>();
            problematicRows.add(row);
            if (identifierName.equalsIgnoreCase("ngmodule") && currentImportSource.equals("@angular/core")) {
                errorReporter.reportError(
                        SemanticErrorType.TYPO_IMPORT,
                        "Typo: '" + identifierName + "' should likely be 'NgModule' when importing from '@angular/core'.",
                        ctx.getStart().getLine(),
                        this.symboltabel,
                        problematicRows

                );

            }

            symboltabel.addRow(row);
        }
        return imp;
    }


    @Override
    public Object visitComponentDefinition(AngularParser.ComponentDefinitionContext ctx) {
        ComponentDefinition comD =new ComponentDefinition();


        if (ctx.decorator() != null) {

            this.visitDecorator(ctx.decorator());


        }


        if (ctx.block() != null) {

            this.visitBlock(ctx.block());


        }

        return comD ;
    }

    @Override
    public Object visitDecorator(AngularParser.DecoratorContext ctx) {
        Decorator doc =new Decorator();
        symboltabel.enterScope("Component");
        if (ctx.AT_COMPONENT() != null) {

            boolean hasTemplate = false;
            boolean hasStyle = false;

            for (var child : ctx.children) {
                String text = child.getText();
                if (text.contains("template") || text.contains("templateUrl")) {
                    hasTemplate = true;
                }
                if (text.contains("styles") || text.contains("styleUrls")) {
                    hasStyle = true;
                }
            }

            if (!hasTemplate && !hasStyle) {
                Row row = new Row();
                row.setLine(ctx.getStart().getLine());
                row.setName("@Component");
                row.setType("Decorator");
                row.setValue("Missing both template and styles");

                symboltabel.addRow(row);

                List<Row> snapshot = new ArrayList<>();
                snapshot.add(row);

                errorReporter.reportError(
                        SemanticErrorType.MISSING_TEMPLATE_OR_STYLE,
                        "@Component must have at least a template or styles defined.",
                        ctx.getStart().getLine(),
                        symboltabel,
                        snapshot
                );
            }
        }




        System.out.println("({");
        if(ctx.componentPropertyList() !=null) {


            this.visitComponentPropertyList(ctx.componentPropertyList());

        }
        System.out.println(")}");
        symboltabel.exitScope();
        return doc;
    }

    @Override
    public Object visitComponentPropertyList(AngularParser.ComponentPropertyListContext ctx) {
        for (var property : ctx.componentProperty()) {
            this.visitComponentProperty(property);

            System.out.println(",");
        }
        return null;
    }

    @Override
    public Object visitComponentProperty(AngularParser.ComponentPropertyContext ctx) {
        ComponentProperty com =new ComponentProperty();
        Row row = new Row();
        row.setLine(ctx.getStart().getLine());
        if (ctx.SELECTOR()!=null) {
            com.setKey(ctx.SELECTOR().toString() + ": ");
            com.setValue(ctx.StringLiteral().toString());
            com.print();
            row.setName("selector:");
            row.setType("String");
            row.setValue(ctx.StringLiteral().getText());
            mainComponentName = ctx.StringLiteral().getText().replace("'", "").replace("\"", "");

            symboltabel.getRows().add(row);
        }
        if (ctx.STANDALONE()!=null) {
            com.setKey(ctx.STANDALONE().toString()+": ");
            com.setValue(ctx.TRUE().toString());
            com.print();
            row.setName("standalone:");
            row.setType("boolean");
            row.setValue("true");

            symboltabel.getRows().add(row);
        }
        if (ctx.IMPORTS()!=null) {
            String importName = ctx.IMPORTS().getText();

            com.setKey(ctx.IMPORTS().toString()+": ");

            com.print();
            this.visitArray(ctx.array());

            row.setName("imports:");
            row.setType("Array");
            row.setValue(ctx.array().getText());;
        }
        if (ctx.TEMPLATE()!=null) {
            symboltabel.enterScope("template");
            com.setKey(ctx.TEMPLATE().toString()+": " );
            com.print();
            this.visitTemplate(ctx.template());

            row.setName("template:");
            row.setType("HTML");
            row.setValue(ctx.template().getText());
        }

        if (ctx.STYLES()!=null){
            symboltabel.enterScope("styles");
            com.setKey(ctx.STYLES().toString()+": " );
            com.print();
            System.out.print("[");
            this.visitStyles(ctx.styles());
            System.out.print("]");




            row.setName("styles");
            row.setType("SCC");
            row.setValue(ctx.STYLES().getText());
        }


        symboltabel.addRow(row);
        return com;
    }

    @Override
    public Object visitStyles(AngularParser.StylesContext ctx) {
        for (int i = 0; i < ctx.styleRule().size(); i++) {
            this.visitStyleRule(ctx.styleRule(i));

            System.out.println();
        }

        return null;
    }

    @Override
    public Object visitStyleRule(AngularParser.StyleRuleContext ctx) {

        String cssScopeName = "css";
        symboltabel.enterScope(cssScopeName);
        cssPropertiesInRule.clear();

        if (ctx.cssSelector() != null) {
            this.visitCssSelector(ctx.cssSelector());
        }

        if (ctx.cssDeclaration() != null) {

            System.out.print(" {");

            for (AngularParser.CssDeclarationContext declaration : ctx.cssDeclaration()) {
                this.visitCssDeclaration(declaration);

            }

            System.out.println(" }");
        }

        symboltabel.exitScope();
        return null;
    }

    @Override
    public Object visitCssSelector(AngularParser.CssSelectorContext ctx) {
        CssSelector selector = null;

        if (ctx.DOT() != null) {
            selector = new CssSelector(CssSelector.Type.DOT, ctx.Identifier().getText());
        } else if (ctx.HASH_SELECTOR() != null) {
            selector = new CssSelector(CssSelector.Type.HASH, ctx.Identifier().getText());
        } else if (ctx.Identifier() != null) {
            selector = new CssSelector(CssSelector.Type.IDENTIFIER, ctx.Identifier().getText());
        } else if (ctx.DIV_TAG() != null) {
            selector = new CssSelector(CssSelector.Type.TAG, "div");
        } else if (ctx.P_TAG() != null) {
            selector = new CssSelector(CssSelector.Type.TAG, "p");
        } else if (ctx.IMG_TAG() != null) {
            selector = new CssSelector(CssSelector.Type.TAG, "img");
        } else if (ctx.H2_TAG() != null) {
            selector = new CssSelector(CssSelector.Type.TAG, "h2");
        }


            if (selector != null) {
                selector.print(0);
            }

        return null;
    }

    @Override
    public Object visitCssDeclaration(AngularParser.CssDeclarationContext ctx) {


        String propertyName = null;
        if (ctx.cssProperty() != null) {
            propertyName = ctx.cssProperty().getText();
        }

        String propertyValue = "";
        for (var valueCtx : ctx.cssValue()) {
            String valueText = (String) this.visitCssValue(valueCtx);
            if (valueText != null && !valueText.isEmpty()) {
                propertyValue += valueText + " ";
            }
        }
        propertyValue = propertyValue.trim();

        // Print the declaration in a single line
        if (propertyName != null && !propertyName.isEmpty()) {
            System.out.print("  " + propertyName + ": " + propertyValue + ";");
        }

        // Existing semantic and symbol table logic remains unchanged below
        if (propertyName != null && !propertyName.isEmpty()) {
            Row propertyRow = new Row();
            propertyRow.setLine(ctx.getStart().getLine());
            propertyRow.setName(propertyName);
            propertyRow.setType("CSS Property");
            propertyRow.setValue(propertyValue);

            if (cssPropertiesInRule.contains(propertyName)) {
                List<Row> problematicRows = new ArrayList<>();
                problematicRows.add(propertyRow);
                Row originalPropertyRow = symboltabel.findCurrentScopeEntry(propertyName);
                if (originalPropertyRow != null) {
                    problematicRows.add(originalPropertyRow);
                }
                errorReporter.reportError(
                        SemanticErrorType.DUPLICATE_CSS_PROPERTY,
                        "Duplicate CSS property '" + propertyName + "' in the same style rule.",
                        ctx.getStart().getLine(),
                        this.symboltabel,
                        problematicRows
                );
            } else {
                cssPropertiesInRule.add(propertyName);
            }
            symboltabel.addRow(propertyRow);
        }
        return null;
    }


    @Override
    public Object visitCssProperty(AngularParser.CssPropertyContext ctx) {
        CSSProperty css = new CSSProperty();
        String propertyTokenText = null;

        if (ctx.COLOR() != null) { propertyTokenText = ctx.COLOR().getText(); }
        else if (ctx.BACKGROUND() != null) { propertyTokenText = ctx.BACKGROUND().getText(); }
        else if (ctx.FONT_SIZE() != null) { propertyTokenText = ctx.FONT_SIZE().getText(); }
        else if (ctx.WIDTH() != null) { propertyTokenText = ctx.WIDTH().getText(); }
        else if (ctx.HEIGHT() != null) { propertyTokenText = ctx.HEIGHT().getText(); }
        else if (ctx.DISPLAY() != null) { propertyTokenText = ctx.DISPLAY().getText(); }
        else if (ctx.POSITION() != null) { propertyTokenText = ctx.POSITION().getText(); }
        else if (ctx.MARGIN() != null) { propertyTokenText = ctx.MARGIN().getText(); }
        else if (ctx.PADDING() != null) { propertyTokenText = ctx.PADDING().getText(); }
        else if (ctx.BORDER() != null) { propertyTokenText = ctx.BORDER().getText(); }

        if (propertyTokenText != null) {
            css.setName(propertyTokenText + ": ");
            css.print(0);
        }
        return ctx.getText();
    }

    @Override
    public Object visitCssValue(AngularParser.CssValueContext ctx) {
        CSSValue value = new CSSValue();
        String valText = null;

        if (ctx.CSS_UNIT() != null) {
            valText = ctx.CSS_UNIT().getText();
            value.setValue(valText);
            value.print(0);
        }
        else if (ctx.CSS_COLOR_HEX() != null) {
            valText = ctx.CSS_COLOR_HEX().getText();
            value.setValue(valText);
            value.print(0);
        }
        else if (ctx.CSS_KEYWORD() != null) {
            valText = ctx.CSS_KEYWORD().getText();
            value.setValue(valText);
        }

        else if (ctx.NumberLiteral() != null) {
            valText = ctx.NumberLiteral().getText();
            value.setValue(valText);
            value.print(0);
        }
        else if (ctx.Identifier() != null) {
            valText = ctx.Identifier().getText();
            value.setValue(valText);
            value.print(0);
        }
        return valText;
    }
    @Override
    public Object visitTemplate(AngularParser.TemplateContext ctx) {
        TemplateNode tem =new TemplateNode();
        System.out.println("  `");
        if(ctx.htmlContent()!=null){
            this.visitHtmlContent(ctx.htmlContent());
        }

        System.out.println("  `");
        return tem;
    }


    @Override
    public Object visitHtmlContent(AngularParser.HtmlContentContext ctx) {

        for (int i = 0; i < ctx.htmlElement().size(); i++) {
            if (ctx.htmlElement(i) != null) {
                this.visitHtmlElement(ctx.htmlElement(i));
            }
        }


        for (int i = 0; i < ctx.interpolation().size(); i++) {
            if (ctx.interpolation(i) != null) {
                this.visitInterpolation(ctx.interpolation(i));
            }
        }


        for (int i = 0; i < ctx.Identifier().size(); i++) {
            String text = ctx.Identifier(i).getText();
            HtmlIdentifierNode idNode = new HtmlIdentifierNode(text);
            idNode.setName(text);
            idNode.print(0);
            Row row = new Row();
            row.setName(text);
            row.setType("Identifier");
            row.setValue("text node in HTML");
            row.setLine(ctx.start.getLine());
            symboltabel.addRow(row);



        }

        return null;
    }


    @Override
    public Object visitInterpolation(AngularParser.InterpolationContext ctx) {


        String expr = ctx.PROPERTY_BINDING().getText();


        InterpolationNode node = new InterpolationNode(expr);
        node.setExpression(ctx.PROPERTY_BINDING().getText());
         node.print(0);

        Row row = new Row();
        row.setName("Interpolation");
        row.setType("Interpolation");
        row.setValue( expr );
        row.setLine(ctx.start.getLine());
        symboltabel.addRow(row);



        return node;


    }

    @Override
    public Object visitHtmlElement(AngularParser.HtmlElementContext ctx) {

        if (ctx.divElement() != null) {
            return this.visitDivElement(ctx.divElement());
        } else if (ctx.pElement() != null) {
            return this.visitPElement(ctx.pElement());
        } else if (ctx.imgElement() != null) {
            return this.visitImgElement(ctx.imgElement());
        } else if (ctx.h2Element() != null) {
            return this.visitH2Element(ctx.h2Element());
        }
        else if (ctx.formElement() != null) {
            return this.visitFormElement(ctx.formElement());
        }

      else if (ctx.buttonElement() != null) {
        return this.visitButtonElement(ctx.buttonElement());
    }
        else if (ctx.navElement() != null) {
            return this.visitNavElement(ctx.navElement());
        }
        else if (ctx.inputElement() != null) {
            return this.visitInputElement(ctx.inputElement());
        }
        else if (ctx.textareaElement() != null) {
            return this.visitTextareaElement(ctx.textareaElement());
        }




        return null;
    }

    @Override
    public Object visitDivElement(AngularParser.DivElementContext ctx) {
        DivElementNode div =new DivElementNode();
        symboltabel.enterScope("div");


        Row row = new Row();
        row.setName("div");
        row.setType("HTMLElement");
        row.setValue("div element in template");
        row.setLine(ctx.start.getLine());
        symboltabel.addRow(row);
        System.out.print(ctx.HTML_TAG_OPEN() + ctx.DIV_TAG(0).getText());
        if (ctx.htmlAttributes() != null) {
            this.visitHtmlAttributes(ctx.htmlAttributes());
        }
        System.out.println(">");
        if (ctx.htmlContent() != null) {
            this.visitHtmlContent(ctx.htmlContent());
        }
        System.out.println("</" + ctx.DIV_TAG(0).getText() + ">");
        symboltabel.exitScope();

        return div;
    }

    @Override
    public Object visitPElement(AngularParser.PElementContext ctx) {
        PElementNode p =new PElementNode();
        symboltabel.enterScope("p");


        Row row = new Row();
        row.setName("p");
        row.setType("HTMLElement");
        row.setValue("p element in template");
        row.setLine(ctx.start.getLine());
        symboltabel.addRow(row);
        System.out.print(ctx.HTML_TAG_OPEN() + ctx.P_TAG(0).getText());
        if (ctx.htmlAttributes() != null) {
            this.visitHtmlAttributes(ctx.htmlAttributes());
        }
        System.out.println(">");
        if (ctx.htmlContent() != null) {
            this.visitHtmlContent(ctx.htmlContent());
        }
        System.out.println("</" + ctx.P_TAG(0).getText() + ">");
        symboltabel.exitScope();


        return p;
    }

    @Override
    public Object visitH2Element(AngularParser.H2ElementContext ctx) {
        H2Element H2 =new H2Element();
        symboltabel.enterScope("H2");


        Row row = new Row();
        row.setName("H2");
        row.setType("HTMLElement");
        row.setValue("H2 element in template");
        row.setLine(ctx.start.getLine());
        symboltabel.addRow(row);
        System.out.print(ctx.HTML_TAG_OPEN() + ctx.H2_TAG(0).getText());
        if (ctx.htmlAttributes() != null) {
            this.visitHtmlAttributes(ctx.htmlAttributes());
        }
        System.out.println(">");
        if (ctx.htmlContent() != null) {
            this.visitHtmlContent(ctx.htmlContent());
        }
        System.out.println("</" + ctx.H2_TAG(0).getText() + ">");
        symboltabel.exitScope();
        return H2;
    }

    @Override
    public Object visitImgElement(AngularParser.ImgElementContext ctx) {
        symboltabel.enterScope("img");

        Row row = new Row();
        row.setName("img");
        row.setType("HTMLElement");
        row.setValue("img element in template");
        row.setLine(ctx.start.getLine());
        symboltabel.addRow(row);

        System.out.print(ctx.HTML_TAG_OPEN() + ctx.IMG_TAG().getText());

        boolean hasSrc = false;
        boolean hasAlt = false;

        if (ctx.htmlAttributes() != null) {
            for (AngularParser.AngularBindingContext bindingCtx : ctx.htmlAttributes().angularBinding()) {
                String bindingName = bindingCtx.BINDING().getText();
                if (bindingName.equals("[src]")) {
                    hasSrc = true;
                } else if (bindingName.equals("[alt]")) {
                    hasAlt = true;
                }
            }
        }

        if (!hasSrc || !hasAlt) {
            Row errorRow = new Row();
            errorRow.setLine(ctx.getStart().getLine());
            errorRow.setName("img");
            errorRow.setType("HTMLElement");
            errorRow.setValue("Missing required attribute: " + (!hasSrc ? "src" : "alt"));

            List<Row> snapshot = new ArrayList<>();
            snapshot.add(errorRow);

            errorReporter.reportError(
                    SemanticErrorType.HTML_SEMANTIC_ERROR,
                    "<img> tag missing required '" + (!hasSrc ? "src" : "alt") + "' attribute.",
                    ctx.getStart().getLine(),
                    symboltabel,
                    snapshot
            );
        }

        if (ctx.htmlAttributes() != null) {
            this.visitHtmlAttributes(ctx.htmlAttributes());
        }

        System.out.println("/>");
        symboltabel.exitScope();

        return null;

    }


    @Override
    public Object visitFormElement(AngularParser.FormElementContext ctx) {
        FormElement form =new FormElement();
        symboltabel.enterScope("form");


        Row row = new Row();
        row.setName("form");
        row.setType("HTMLElement");
        row.setValue("form element in template");
        row.setLine(ctx.start.getLine());
        symboltabel.addRow(row);
        System.out.print(ctx.HTML_TAG_OPEN() + ctx.FORM(0).getText());
        if (ctx.htmlAttributes() != null) {
            this.visitHtmlAttributes(ctx.htmlAttributes());
        }
        System.out.println(">");
        if (ctx.htmlContent() != null) {
            this.visitHtmlContent(ctx.htmlContent());
        }
        System.out.println("</" + ctx.FORM(0).getText() + ">");
        symboltabel.exitScope();
        return form;
    }

    @Override
    public Object visitButtonElement(AngularParser.ButtonElementContext ctx) {
        buttonElement button =new buttonElement();
        symboltabel.enterScope("button");


        Row row = new Row();
        row.setName("button");
        row.setType("HTMLElement");
        row.setValue("button element in template");
        row.setLine(ctx.start.getLine());
        symboltabel.addRow(row);
        System.out.print(ctx.HTML_TAG_OPEN() + ctx.BUTTON(0).getText());
        if (ctx.htmlAttributes() != null) {
            this.visitHtmlAttributes(ctx.htmlAttributes());
        }
        System.out.println(">");
        if (ctx.htmlContent() != null) {
            this.visitHtmlContent(ctx.htmlContent());
        }
        System.out.println("</" + ctx.BUTTON(0).getText() + ">");
        symboltabel.exitScope();

        return button;
    }

    @Override
    public Object visitNavElement(AngularParser.NavElementContext ctx) {
        NavElement  nav =new NavElement();
        symboltabel.enterScope("nav");


        Row row = new Row();
        row.setName("nav");
        row.setType("HTMLElement");
        row.setValue("nav element in template");
        row.setLine(ctx.start.getLine());
        symboltabel.addRow(row);
        System.out.print(ctx.HTML_TAG_OPEN() + ctx.NAV(0).getText());
        if (ctx.htmlAttributes() != null) {
            this.visitHtmlAttributes(ctx.htmlAttributes());
        }
        System.out.println(">");
        if (ctx.htmlContent() != null) {
            this.visitHtmlContent(ctx.htmlContent());
        }
        System.out.println("</" + ctx.NAV(0).getText() + ">");
        symboltabel.exitScope();

        return nav;
    }

    private void writeToFile(String code) {
        if (code != null && !code.isEmpty()) {
            try {

                file.write(code);
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public Object visitInputElement(AngularParser.InputElementContext ctx) {
        InputElement  input =new InputElement();
        symboltabel.enterScope("input");

        Row row = new Row();
        row.setName("input");
        row.setType("HTMLElement");
        row.setValue("input element in template");
        row.setLine(ctx.start.getLine());
        symboltabel.addRow(row);

        System.out.print(ctx.HTML_TAG_OPEN() + ctx.INPUT().getText());
        if (ctx.htmlAttributes() != null) {
            this.visitHtmlAttributes(ctx.htmlAttributes());
        }

        System.out.println("/>");
        symboltabel.exitScope();

        return input;
    }


    @Override
    public Object visitTextareaElement(AngularParser.TextareaElementContext ctx) {
        TextareaElement  textarea =new TextareaElement();
        symboltabel.enterScope("textarea");


        Row row = new Row();
        row.setName("textarea");
        row.setType("HTMLElement");
        row.setValue("textarea element in template");
        row.setLine(ctx.start.getLine());
        symboltabel.addRow(row);
        System.out.print(ctx.HTML_TAG_OPEN() + ctx.TEXTAREA(0).getText());
        if (ctx.htmlAttributes() != null) {
            this.visitHtmlAttributes(ctx.htmlAttributes());
        }
        System.out.println(">");
        if (ctx.htmlContent() != null) {
            this.visitHtmlContent(ctx.htmlContent());
        }
        System.out.println("</" + ctx.TEXTAREA(0).getText() + ">");
        symboltabel.exitScope();
        return textarea;
    }
        @Override
    public Object visitHtmlAttributes(AngularParser.HtmlAttributesContext ctx) {
        AttributeNode attr =new AttributeNode();


        for (int i=0 ;i<ctx.angularDirective().size();i++){

            if (ctx.angularDirective()!=null){
                this.visitAngularDirective(ctx.angularDirective(i));
            }

        }



        for (int i=0 ;i<ctx.angularEvent().size();i++){
            if (ctx.angularEvent()!=null){
                this.visitAngularEvent(ctx.angularEvent(i));
            }

        }


        for (int i=0 ;i<ctx.angularBinding().size();i++){
            if (ctx.angularBinding()!=null){
                this.visitAngularBinding(ctx.angularBinding(i));
            }

        }

        for (int i=0 ;i<ctx.styleAttribute().size();i++) {

            if (ctx.styleAttribute() != null) {
                this.visitStyleAttribute(ctx.styleAttribute(i));
            }
        }

            for (int i=0 ;i<ctx.formAttribute().size();i++){
                if (ctx.srcAttribute()!=null){
                    this.visitFormAttribute(ctx.formAttribute(i));
                }

            }


        for (int i=0 ;i<ctx.srcAttribute().size();i++){
            if (ctx.srcAttribute()!=null){
                this.visitSrcAttribute(ctx.srcAttribute(i));
            }

        }
        for (int i=0 ;i<ctx.altAttribute().size();i++){
            if (ctx.altAttribute()!=null){
                this.visitAltAttribute(ctx.altAttribute(i));
            }

        }

        for (int i=0 ;i<ctx.StringLiteral().size();i++){
            if (ctx.StringLiteral()!=null){
                attr.setName(ctx.StringLiteral().toString());
                attr.print(0);
            }

        }

        return attr;
    }

    @Override
    public Object visitFormAttribute(AngularParser.FormAttributeContext ctx) {
        String name = null;
        String value = null;

        if (ctx.TYPE() != null) {
            name = "type";
            value = ctx.StringLiteral().getText().replace("\"", "").replace("'", "");
            System.out.print(" " + name + "=\"" + value + "\"");
        } else if (ctx.PLACEHOLDER() != null) {
            name = "placeholder";
            value = ctx.StringLiteral().getText().replace("\"", "").replace("'", "");
            System.out.print(" " + name + "=\"" + value + "\"");
        } else if (ctx.ROWS() != null) {
            name = "rows";
            value = ctx.StringLiteral().getText().replace("\"", "").replace("'", "");
            System.out.print(" " + name + "=\"" + value + "\"");
        } else if (ctx.REQUIRED_ATTR() != null) {
            name = "required";
            value = null;
            System.out.print(" " + name);
        }
        // ...
        return new FormAttributeNode(name, value);
    }

    @Override
    public Object visitAngularDirective(AngularParser.AngularDirectiveContext ctx) {
        AngularDirective angD = new AngularDirective();


        Row row = new Row();
        row.setName("Directive");
        row.setType("Directive");
        row.setValue(ctx.getText());
        row.setLine(ctx.start.getLine());
        symboltabel.addRow(row);
        if (ctx.NG_FOR() != null) {
            String attrName = ctx.NG_FOR().getText();
            String attrValue = ctx.StringLiteral() != null ? ctx.StringLiteral().getText().trim() : null;

            if ((attrName.equals("*ngIf") || attrName.equals("[(ngModel)]")) && (attrValue == null || attrValue.isEmpty())) {
                Row errorRow = new Row();
                errorRow.setLine(ctx.getStart().getLine());
                errorRow.setName(attrName);
                errorRow.setType("Directive");
                errorRow.setValue("Missing binding");

                List<Row> snapshot = new ArrayList<>();
                snapshot.add(errorRow);

                errorReporter.reportError(
                        SemanticErrorType.MISSING_REQUIRED_DIRECTIVE_BINDING,
                        "Directive '" + attrName + "' is missing its required binding value.",
                        ctx.getStart().getLine(),
                        symboltabel,
                        snapshot
                );
            }
            angD.setString(ctx.NG_FOR().getText());
            angD.print(0);
            System.out.print("=");
            angD.setString(ctx.StringLiteral().getText());
            angD.print(0);
        } else if (ctx.NG_IF() != null) {
            String attrName = ctx.NG_IF().getText();
            String attrValue = ctx.StringLiteral() != null ? ctx.StringLiteral().getText().trim() : null;

            if ((attrName.equals("*ngIf") || attrName.equals("[(ngModel)]")) && (attrValue == null || attrValue.isEmpty())) {
                Row errorRow = new Row();
                errorRow.setLine(ctx.getStart().getLine());
                errorRow.setName(attrName);
                errorRow.setType("Directive");
                errorRow.setValue("Missing binding");

                List<Row> snapshot = new ArrayList<>();
                snapshot.add(errorRow);

                errorReporter.reportError(
                        SemanticErrorType.MISSING_REQUIRED_DIRECTIVE_BINDING,
                        "Directive '" + attrName + "' is missing its required binding value.",
                        ctx.getStart().getLine(),
                        symboltabel,
                        snapshot
                );
            }

            angD.setId(ctx.NG_IF().getText());
            angD.setString(ctx.StringLiteral().getText());
            angD.print(0);
        }



        String navCode = CodeGeneration.HTMLGenerate.openSection(angD);
        writeToFile(navCode);


        return angD;
    }

    @Override
    public Object visitAngularEvent(AngularParser.AngularEventContext ctx) {
     AngularEventNode Ang =   new AngularEventNode();
        String eventName = null;

            String value = ctx.StringLiteral().getText()
                    .replace("\"", "")
                    .replace("'", "");
            Ang.setValue(ctx.StringLiteral().getText());

        if (ctx.CLICK_EVENT() != null) {
            eventName = ctx.CLICK_EVENT().getText();
            Ang.setName(ctx.CLICK_EVENT().getText());
            Ang.print(0);
        } else if (ctx.NG_SUBMIT_EVENT() != null) {
            eventName = ctx.NG_SUBMIT_EVENT().getText();
            Ang.setName(ctx.NG_SUBMIT_EVENT().getText());
            Ang.print(0);
        }



        String attr = CodeGeneration.HTMLGenerate.generateAngularEvent(eventName, value);
        writeToFile(attr);


        return Ang ;
    }


    @Override
    public Object visitAngularBinding(AngularParser.AngularBindingContext ctx) {
        Binding bin = new Binding();
        Row row = new Row();
        row.setType("Binding");
        row.setLine(ctx.start.getLine());


        String rawBinding = ctx.getChild(0).getText();
        String rawValue = ctx.getChild(2).getText();


        String variableName;


        if (rawBinding.equals("[(ngModel)]")) {

            variableName = rawValue.replaceAll("[\"']", "");
            bin.setElementType("input");
        }

        else if (rawBinding.equals("[src]") || rawBinding.equals("[alt]")) {

            variableName = rawBinding.replaceAll("[\\[\\]]", "");
            bin.setElementType("img");
        }

        else if (rawBinding.startsWith("(click)")) {

            variableName = "button";
            bin.setElementType("button");
        }

        else {

            variableName = rawBinding.replaceAll("[\\[\\]]", "");
            bin.setElementType("div");
        }


        bin.setName(variableName);
        bin.setString(rawValue);


        row.setName(variableName);
        row.setValue(rawValue);
        symboltabel.addRow(row);


        String htmlLine = CodeGeneration.HTMLGenerate.generateBindingHTML(bin,0);
        writeToFile(htmlLine);

        // استدعاء التوليد للـ JS
        String jsLine = CodeGeneration.JSGenerate.generateBindingJS(bin);
        jsBuffer.append(jsLine);

        return bin;
    }


    @Override
    public Object visitStyleAttribute(AngularParser.StyleAttributeContext ctx) {
        AngularDirective angs =new AngularDirective();

        Row row = new Row();
        row.setName(ctx.STYLE().getText());
        row.setType("Style");
        row.setValue(ctx.getText());
        row.setLine(ctx.start.getLine());
        symboltabel.addRow(row);
        angs.setString(ctx.STYLE().toString());
        angs.print(0);
        System.out.print("=");
        angs.setString(ctx.StringLiteral().toString());
        angs.print(0);

        return angs;
    }
    @Override
    public Object visitSrcAttribute(AngularParser.SrcAttributeContext ctx) {
        System.out.print(" src=\"" + ctx.Src().getText().replace("\"", "").replace("'", "") + "\"");
        return super.visitSrcAttribute(ctx);
    }

    @Override
    public Object visitAltAttribute(AngularParser.AltAttributeContext ctx) {
        System.out.print(" alt=\"" + ctx.Alt().getText().replace("\"", "").replace("'", "") + "\"");
        return super.visitAltAttribute(ctx);
    }




    @Override
    public Object visitVariableStatement(AngularParser.VariableStatementContext ctx) {

        String accessModifier = null;
        if (ctx.PUBLIC() != null) {
            accessModifier = "public";
        } else if (ctx.PRIVATE() != null) {
            accessModifier = "private";
        }

        boolean isConst = ctx.CONST() != null;
        boolean isLet = ctx.LET() != null;
        boolean isIntTyped = ctx.INT() != null;

        String variableName = ctx.Identifier().getText();
        String varType = "any";
        if (ctx.type() != null) {
            varType = ctx.type().getText();
        }

        ExpressionNode initialValueExpression = null;
        String varValueTextForSymbolTable = "";


        String varValueForStatementNode = "";
        boolean isInitialized = false;

        if (ctx.expression() != null) {
            Object result = visit(ctx.expression());
            if (result instanceof ExpressionNode) {
                initialValueExpression = (ExpressionNode) result;
                varValueForStatementNode = ctx.expression().getText();
                isInitialized = true;
            }
        }
        if (ctx.value() != null) {
            visitValue(ctx.value());
            varValueForStatementNode = ctx.value().getText();
            isInitialized = true;
        } else if (ctx.array() != null) {
            visitArray(ctx.array());
            varValueForStatementNode = ctx.array().getText();
            isInitialized = true;
        } else if (ctx.object() != null) {
            visitObject(ctx.object());
            varValueForStatementNode = ctx.object().getText();
            isInitialized = true;
        }


        StatementNode statementNode = new StatementNode(
                variableName,
                varType,
                isInitialized ? varValueForStatementNode : null,
                isConst,
                isLet,
                accessModifier
        );

        statementNode.print(0);


        String rowType;
        if (isConst) {
            rowType = "Constant";
        } else if (isLet) {
            rowType = "LetVariable";
        } else {
            rowType = "Variable";
        }
        if (isIntTyped) {
            rowType = "INT " + rowType;
        }

        String currentScope = symboltabel.getCurrentScope();

        if (!currentScope.equals("global") && !currentScope.startsWith("method:")) {
            rowType = (accessModifier != null ? accessModifier + " " : "") + "Class " + rowType;
        }

        Row variableRow = new Row();
        variableRow.setName(variableName);
        variableRow.setValue(varValueForStatementNode);
        variableRow.setType(rowType);
        variableRow.setLine(ctx.start.getLine());
        variableRow.setScope(currentScope);

        symboltabel.addRow(variableRow);

        // خطأ: const بدون تهيئة
        if (isConst && !isInitialized) {
            List<Row> errorContext = new ArrayList<>();
            errorContext.add(variableRow);
            errorReporter.reportError(
                    SemanticErrorType.MISSING_CONST_INITIALIZER,
                    "Constant '" + variableName + "' must be initialized.",
                    ctx.start.getLine(),
                    this.symboltabel,
                    errorContext
            );
        }


        boolean isClassScope = !currentScope.equals("global") && !currentScope.startsWith("method:");
        if (accessModifier != null && !isClassScope) {
            List<Row> snapshotForError = new ArrayList<>();
            snapshotForError.add(variableRow);

            errorReporter.reportError(
                    SemanticErrorType.ACCESS_MODIFIER_INVALID_SCOPE,
                    "Access modifier '" + accessModifier + "' is only allowed for class members.",
                    ctx.start.getLine(),
                    this.symboltabel,
                    snapshotForError
            );
        }

        String jsLine = CodeGeneration.JSGenerate.generateVariableJS(statementNode);
        jsBuffer.append(jsLine);


        return statementNode;
    }
    @Override
    public Object visitArray(AngularParser.ArrayContext ctx) {
        Array array =new Array();
        Row row = new Row();
        row.setLine(ctx.getStart().getLine());
        row.setName("array");
        row.setType("Array");
        row.setValue(ctx.getText());

        symboltabel.addRow(row);
        System.out.print("[");
        if (ctx.arrayElements() !=null) {
            this.visitArrayElements(ctx.arrayElements());
        }

        System.out.print("]");
        return array;
    }

    @Override
    public Object visitArrayElements(AngularParser.ArrayElementsContext ctx) {
        for (int i=0 ; i<ctx.arrayElement().size();i++){
            this.visitArrayElement(ctx.arrayElement(i));
        }

        return null;
    }

    @Override
    public Object visitArrayElement(AngularParser.ArrayElementContext ctx) {
        if (ctx.object()!=null) {
            this.visitObject(ctx.object());
        }
        if (ctx.value()!=null){
            this.visitValue(ctx.value());
        }

        return null;
    }

    @Override
    public Object visitObject(AngularParser.ObjectContext ctx) {
        System.out.print("{");
        if (ctx.property()!=null) {
            for (var propertyCtx : ctx.property()){
                System.out.print(",");
                this.visitProperty(propertyCtx);
            }
        }
        System.out.println("}");
        return null;
    }

    @Override
    public Object visitProperty(AngularParser.PropertyContext ctx) {
        Property prop = new Property();
        Row row = new Row();
        row.setLine(ctx.getStart().getLine());

        if (ctx.Identifier() != null) {
            prop.setKey(ctx.Identifier().getText());
            row.setName(ctx.Identifier().getText());


        } else if (ctx.StringLiteral() != null) {
            String raw = ctx.StringLiteral().getText();
            prop.setKey(raw.substring(1, raw.length() - 1));
            row.setName(ctx.StringLiteral().getText());

        }
        row.setType("Property");


        ASTNode valueNode = (ASTNode) visit(ctx.expression());
        prop.setValue(valueNode);
        row.setValue(ctx.expression().getText());


        prop.print(0);
        System.out.println();
        symboltabel.addRow(row);

        return prop;
    }

    @Override
    public Object visitValue(AngularParser.ValueContext ctx) {
        Array arry=new Array();
        if (ctx.StringLiteral()!=null){
            arry.setString(ctx.StringLiteral().toString());
            arry.print(0);

        }
        if (ctx.Identifier()!=null){
            arry.setString(ctx.Identifier().toString());
            arry.print(0);


        }
        if (ctx.object()!=null){
            this.visitObject(ctx.object());
        }
        if (ctx.array()!=null){
            this.visitArray(ctx.array());
        }

        return arry;
    }

    @Override
    public Object visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        String functionName = ctx.Identifier().getText();
        symboltabel.enterScope("method:" + functionName);

        Row row = new Row();
        row.setName(functionName);
        row.setType("Method");
        row.setValue("Function Declaration");
        row.setLine(ctx.start.getLine());
        symboltabel.addRow(row);

        System.out.print("  " + functionName);
        System.out.print("(");
        if (ctx.parameterList() != null) {
            visitParameterList(ctx.parameterList());
        } else {
            System.out.print(" ");
        }
        System.out.println(")");







        String params = ctx.parameterList() != null ? ctx.parameterList().getText() : "";



        StringBuilder functionBody = new StringBuilder();

        if (ctx.block() != null) {
            for (var statement : ctx.block().statement()) {
                if (statement.expression() != null) {

                    ExpressionNode exprNode = (ExpressionNode) this.visit(statement.expression());
                    String jsCode = CodeGeneration.JSGenerate.generateExpressionJS(exprNode);
                    functionBody.append("      ").append(jsCode).append(";\n");
                }
            }
        }

        String cleanParams = params.replaceAll(":[^,\\)]+", "");
        String jsFunction = CodeGeneration.JSGenerate.generateFunctionJS(functionName, cleanParams, functionBody.toString());
        jsBuffer.append(jsFunction);

        symboltabel.exitScope();

        return null;

    }

    @Override
    public Object visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        ClassDeclaration classes =new ClassDeclaration();
        if (ctx.CLASS()!=null) {
            classes.setClassname(ctx.CLASS().toString());
            classes.print();


        }
        if(ctx.Identifier()!= null) {
            symboltabel.enterScope("AppComponent");
            classes.setClassname(ctx.Identifier().toString());
            classes.print();
            Row row = new Row();
            row.setName("class");
            row.setType("Class");
            row.setValue(ctx.Identifier().getText());
            row.setLine(ctx.getStart().getLine());
            symboltabel.addRow(row);

            symboltabel.enterScope(ctx.Identifier().getText());

        }
        System.out.println("{");
        for (int i=0 ;i<ctx.classBody().size();i++){

            this.visitClassBody(ctx.classBody(i));
            symboltabel.exitScope();
        }
        System.out.print("}");
        symboltabel.exitScope();
symboltabel.exitScope();


        return classes;
    }

    @Override
    public Object visitClassBody(AngularParser.ClassBodyContext ctx) {
        if (ctx.variableStatement() != null) {

            this.visitVariableStatement(ctx.variableStatement());
        } else if (ctx.functionDeclaration() != null) {

            this.visitFunctionDeclaration(ctx.functionDeclaration());
        } else if (ctx.constructorDeclaration() != null) {

            this.visitConstructorDeclaration(ctx.constructorDeclaration());
        }

        return null;
    }

    @Override
    public Object visitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx) {
        ClassDeclaration con =new ClassDeclaration();
        con.setClassname(ctx.CONSTRUCTOR().toString());
        con.print();
        System.out.print("(");
        if (ctx.parameterList()!=null)
        {
            this.visitParameterList(ctx.parameterList());

        }
        System.out.println(")");
        if (ctx.block()!=null){
            this.visitBlock(ctx.block());
        }

        return con;
    }

    @Override
    public Object visitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx) {
        InterfaceDeclaration inter = new InterfaceDeclaration();
        inter.setString(ctx.INTERFACE().toString());
        inter.print();
        inter.setString(ctx.Identifier().toString());
        inter.print();
        System.out.print( " {");

        if (ctx.interfaceBody() != null) {
            for (var body : ctx.interfaceBody()) {
                this.visitInterfaceBody(body);
            }
        }

        System.out.println("}");
        return null;
    }

    @Override
    public Object visitInterfaceBody(AngularParser.InterfaceBodyContext ctx) {
        String propertyName = ctx.Identifier().getText();
        System.out.print("  " + propertyName + ": ");

        if (ctx.type() != null) {
            this.visitType(ctx.type());
        }

        System.out.println(";");
        return null;
    }

    @Override
    public Object visitExportStatement(AngularParser.ExportStatementContext ctx) {
        ExportStatement expot =new ExportStatement();
        expot.setExport(ctx.EXPORT().toString());
        expot.print();
        Row row = new Row();
        row.setLine(ctx.EXPORT().getSymbol().getLine());
        row.setType("Export Class");
        row.setName(ctx.EXPORT().getText());
        row.setValue(expot.getExport());
        symboltabel.getRows().add(row);

        if (ctx.variableStatement() != null) {

            this.visitVariableStatement(ctx.variableStatement());
        } else if (ctx.functionDeclaration() != null) {

            this.visitFunctionDeclaration(ctx.functionDeclaration());
        } else if (ctx.classDeclaration() != null) {

            this.visitClassDeclaration(ctx.classDeclaration());
        }

        return expot;
    }



    @Override
    public Object visitExpression(AngularParser.ExpressionContext ctx) {

        // Case: expression = expression
        if (ctx.EQUAL() != null && ctx.expression().size() == 2) {
            AssignmentExpressionNode node = new AssignmentExpressionNode();
            node.setLeft((ExpressionNode) visit(ctx.expression(0)));
            node.setRight((ExpressionNode) visit(ctx.expression(1)));

            node.print(0);
            return node;
        }

        if (ctx.DOT() != null && ctx.Identifier() != null && ctx.LPAREN() == null) {
            MemberAccessNode node = new MemberAccessNode();
            node.setObject((ExpressionNode) visit(ctx.expression(0)));
            node.setProperty(ctx.Identifier().getText());

            node.print(0);
            return node;
        }


        if (ctx.DOT() != null && ctx.Identifier() != null && ctx.LPAREN() != null) {
            MethodCallNode node = new MethodCallNode();
            node.setCaller((ExpressionNode) visit(ctx.expression(0)));
            node.setMethodName(ctx.Identifier().getText());

            if (ctx.expressionList() != null) {
                List<ExpressionNode> args = new ArrayList<>();
                for (var e : ctx.expressionList().expression()) {
                    args.add((ExpressionNode) visit(e));
                }
                node.setArguments(args);
            }


            return node;
        }


        if (ctx.Identifier() != null && ctx.LPAREN() != null) {
            MethodCallNode node = new MethodCallNode();
            node.setMethodName(ctx.Identifier().getText());

            if (ctx.expressionList() != null) {
                List<ExpressionNode> args = new ArrayList<>();
                for (var e : ctx.expressionList().expression()) {
                    args.add((ExpressionNode) visit(e));
                }
                node.setArguments(args);
            }

            node.print(0);
            return node;
        }


        if (ctx.literal() != null) {
            LiteralNode node = new LiteralNode();
            node.setValue(ctx.literal().getText());

            node.print(0);
            return node;
        }


        if (ctx.object() != null) {
            ASTNode objNode = (ASTNode) visit(ctx.object());

            return objNode;
        }


        if (ctx.Identifier() != null) {
            IdentifierNode node = new IdentifierNode();
            node.setName(ctx.Identifier().getText());

            node.print(0);
            return node;
        }


        if (ctx.LPAREN() != null && ctx.RPAREN() != null && ctx.expression().size() == 1) {
            ExpressionNode inner = (ExpressionNode) visit(ctx.expression(0));
            ParenthesizedExpressionNode node = new ParenthesizedExpressionNode(inner);

            node.print(0);
            return node;
        }


        if (ctx.THIS() != null) {
            ThisKeywordNode node = new ThisKeywordNode();
            node.setValue(ctx.THIS().getText());

            node.print(0);
            return node;
        }



        return null;
    }



    @Override
    public Object visitLiteral(AngularParser.LiteralContext ctx) {
        return super.visitLiteral(ctx);
    }

    @Override
    public Object visitPropertyBinding(AngularParser.PropertyBindingContext ctx) {
        Binding por =new Binding();
        por.setString(ctx.BINDING().toString());
        por.print(0);
        System.out.print("=");
        por.setString(ctx.StringLiteral().toString());
        por.print(0);
        return por;
    }

    @Override
    public Object visitTwoWayBinding(AngularParser.TwoWayBindingContext ctx) {
        Binding por =new Binding();
        por.setString(ctx.TWO_WAY_BINDING().toString());
        por.print(0);
        System.out.print("=");
        por.setString(ctx.StringLiteral().toString());
        por.print(0);
        return por;
    }

    @Override
    public Object visitNgDirective(AngularParser.NgDirectiveContext ctx) {
      AngularDirective ang =new AngularDirective();
        ang.setString(ctx.DIRECTIVE().toString());
        ang.print(0);
        System.out.print("=");
        ang.setString(ctx.StringLiteral().toString());
        ang.print(1);

        return ang;
    }

    @Override
    public Object visitParameterList(AngularParser.ParameterListContext ctx) {
        ParameterNode par =new ParameterNode();

        if (ctx == null) {
            System.out.print("  ");
            return null;
        }

        for (int i = 0; i < ctx.Identifier().size(); i++) {
            if (ctx.Identifier()!=null) {
                par.setName(ctx.Identifier(i).toString());
                par.setType(ctx.Identifier(i + 1) != null ? ctx.Identifier(i + 1).getText() : "unknown");
                par.print();
                Row row = new Row();
                row.setLine(ctx.Identifier(i).getSymbol().getLine());
                row.setType("ParameterList");
                row.setName(par.getName());
                row.setValue(par.getType());
                row.setScope(symboltabel.getCurrentScope());
                symboltabel.getRows().add(row);
            }
            i++;
        }
        return null;
    }

    @Override
    public Object visitType(AngularParser.TypeContext ctx) {

        System.out.print(ctx.Identifier(0).getText());

        if (ctx.Identifier() != null) {
            System.out.print("<");
            for (int i = 1; i < ctx.Identifier().size(); i++) {
                System.out.print(ctx.Identifier(i).getText());
                if (i < ctx.Identifier().size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print(">");
        }

        return null;
    }

    @Override
    public Object visitBlock(AngularParser.BlockContext ctx) {

        for (int i = 0; i < ctx.statement().size(); i++) {
            this.visitStatement(ctx.statement(i));
        }
        return null;
    }





    @Override
    public Object visitExpressionList(AngularParser.ExpressionListContext ctx) {
        List<ExpressionNode> expressions = new ArrayList<>();
        for (var exprCtx : ctx.expression()) {
            expressions.add((ExpressionNode) this.visit(exprCtx));
        }
        return expressions;
    }





    @Override
    public Object visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Object visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    protected Object defaultResult() {
        return super.defaultResult();
    }

    @Override
    protected Object aggregateResult(Object aggregate, Object nextResult) {
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Object currentResult) {
        return super.shouldVisitNextChild(node, currentResult);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }




}
