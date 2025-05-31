package AST.visitor;

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
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class visiter extends AngularParserBaseVisitor {

    private SymbolTabol symboltabel;
    private SemanticErrorReporter errorReporter;


    private Set<String> importedModules = new HashSet<>();
    private Set<String> cssPropertiesInRule = new HashSet<>();

    private String currentImportSource = "";
    public visiter(SymbolTabol symbolTable, SemanticErrorReporter errorReporter) {
        this.symboltabel = symbolTable;
        this.errorReporter = errorReporter;
    }






    @Override
    public Object visitProgram(AngularParser.ProgramContext ctx) {

//        System.out.println(  "\n" +"                ********* Print AST  ********       "+"\n ");

        ProgramNode pro = new ProgramNode();
        if(ctx.statement() !=null){

            for(int i=0;i<ctx.statement().size();i++){
                this.visitStatement(ctx.statement(i));
            }
        }


        return null;
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

        return null;
    }

    @Override
    public Assignment visitAssignment(AngularParser.AssignmentContext ctx) {
        Assignment as =new Assignment();
        if (ctx.Identifier(0)!=null) {
            as.setLeft(ctx.Identifier(0).toString());
            as.print();
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
            as.print();
            Row row = new Row();
            row.setLine(ctx.Identifier(1).getSymbol().getLine());
            row.setType("Assignment");
            row.setName(ctx.Identifier(1).getText());
            row.setValue(as.getLeft());
            symboltabel.getRows().add(row);
        }



        System.out.print("=");
//        if(ctx.expression() !=null){
//            this.visitExpression(ctx.expression());
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
        System.out.println("  `");
        for (var property : ctx.styleRule()) {
            this.visitStyleRule(property);
            System.out.print(",");
        }
        System.out.println("  `");
        return null;
    }

    @Override
    public Object visitStyleRule(AngularParser.StyleRuleContext ctx) {
        String cssScopeName = "css" ;
        symboltabel.enterScope(cssScopeName);
        cssPropertiesInRule.clear();

        if(ctx.cssSelector()!=null){
            this.visitCssSelector(ctx.cssSelector());
        }
        if(ctx.cssDeclaration()!=null) {
            System.out.print(" {");
            for (var declaration : ctx.cssDeclaration()) {
                this.visitCssDeclaration(declaration);
            }
            System.out.println("  }");
        }

        symboltabel.exitScope();
        return null;
    }

    @Override
    public Object visitCssSelector(AngularParser.CssSelectorContext ctx) {
        CssSelector selector = null;
        // ... (الكود الحالي) ...
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
        return selector;
    }

    @Override
    public Object visitCssDeclaration(AngularParser.CssDeclarationContext ctx) {
        if (ctx.cssProperty() != null) {
            this.visitCssProperty(ctx.cssProperty());
        }

        String propertyName = null;
        if (ctx.cssProperty() != null) {
            AngularParser.CssPropertyContext propCtx = ctx.cssProperty();
            if (propCtx.COLOR() != null) propertyName = propCtx.COLOR().getText();
            else if (propCtx.BACKGROUND() != null) propertyName = propCtx.BACKGROUND().getText();
            else if (propCtx.FONT_SIZE() != null) propertyName = propCtx.FONT_SIZE().getText();
            else if (propCtx.WIDTH() != null) propertyName = propCtx.WIDTH().getText();
            else if (propCtx.HEIGHT() != null) propertyName = propCtx.HEIGHT().getText();
            else if (propCtx.DISPLAY() != null) propertyName = propCtx.DISPLAY().getText();
            else if (propCtx.POSITION() != null) propertyName = propCtx.POSITION().getText();
            else if (propCtx.MARGIN() != null) propertyName = propCtx.MARGIN().getText();
            else if (propCtx.PADDING() != null) propertyName = propCtx.PADDING().getText();
            else if (propCtx.BORDER() != null) propertyName = propCtx.BORDER().getText();
        }

        String propertyValue = "";
        for (var valueCtx : ctx.cssValue()) {
            String valueText = (String) this.visitCssValue(valueCtx);
            if (valueText != null && !valueText.isEmpty()) {
                propertyValue += valueText + " ";
            }
        }
        propertyValue = propertyValue.trim();

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
        return css;
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
        else if (ctx.CSS_VALUE_STRING() != null) {
            valText = ctx.CSS_VALUE_STRING().getText();
            value.setValue(valText);
            value.print(0);
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
        for (int i=0;i<ctx.htmlElement().size();i++) {
            if (ctx.htmlElement() != null) {
                this.visitHtmlElement(ctx.htmlElement(i));
            }
        }
        for (int i=0;i<ctx.interpolation().size();i++)
            if (ctx.interpolation()!=null) {
                this.visitInterpolation(ctx.interpolation(i));

            }

        return null;
    }

    @Override
    public Object visitInterpolation(AngularParser.InterpolationContext ctx) {

        Binding html = new Binding();



        html.setString(ctx.PROPERTY_BINDING().getText());
        html.print();


        return html;
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
        return null;
    }

    @Override
    public Object visitDivElement(AngularParser.DivElementContext ctx) {
        DivElementNode div =new DivElementNode();
        symboltabel.enterScope("div");

        // إضافة سطر للـ Symbol Table (لنفترض أن "div" هو المتغير الذي نراه)
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

        // إضافة سطر للـ Symbol Table
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

        // إضافة سطر للـ Symbol Table
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
    public Object visitAngularDirective(AngularParser.AngularDirectiveContext ctx) {
        AngularDirective angD = new AngularDirective();


        Row row = new Row();
        row.setName(ctx.getText());
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
            angD.setString(ctx.NG_IF().getText());
            angD.print(0);
            System.out.print("=");
            angD.setString(ctx.StringLiteral().getText());
            angD.print(0);
        }
        return angD;
    }

    @Override
    public Object visitAngularEvent(AngularParser.AngularEventContext ctx) {
        AngularDirective ang =new AngularDirective();
        Row row = new Row();
        row.setName(ctx.CLICK_EVENT().getText());
        row.setType("Event");
        row.setValue(ctx.getText());
        row.setLine(ctx.start.getLine());
        symboltabel.addRow(row);
        ang.setString(ctx.CLICK_EVENT().toString());
        ang.print(0);
        ang.setString(ctx.EQUAL().toString());
        ang.print(0);
        ang.setString(ctx.StringLiteral().toString());
        ang.print(0);
        return ang;
    }

    @Override
    public Object visitAngularBinding(AngularParser.AngularBindingContext ctx) {
        AngularDirective ang =new AngularDirective();
        Row row = new Row();
        row.setName(ctx.BINDING().getText());
        row.setType("Binding");
        row.setValue(ctx.getText());
        row.setLine(ctx.start.getLine());
        symboltabel.addRow(row);
        System.out.print(ctx.BINDING().getText() + " = ");
        if (ctx.assignment() != null) {

            this.visitAssignment(ctx.assignment());
        } else if (ctx.StringLiteral() != null) {
            ang.setString(ctx.StringLiteral().getText());
            ang.print(0);
        }
        return ang;
    }

    @Override
    public Object visitStyleAttribute(AngularParser.StyleAttributeContext ctx) {
        AngularDirective angs =new AngularDirective();
        Row row = new Row();
        row.setName(ctx.getText());
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

        // accessModifier داخل كلاس فقط
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
      //  row.setScope(symboltabel.toString());
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
     //   row.setScope(symbolTable.getCurrentScope());

        ASTNode valueNode = (ASTNode) visit(ctx.value());
        prop.setValue(valueNode);
        row.setValue(ctx.value().getText());

     //   visitValue(ctx.value()); // زيارة القيمة نفسها
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

        // يمكننا زيارة المعاملات إذا أردت
        symboltabel.exitScope();
        System.out.print("  " + functionName);
        System.out.print("(");
        if (ctx.parameterList() != null) {
            visitParameterList(ctx.parameterList());
        } else {
            System.out.print(" ");
        }
        System.out.println(")");
        visitBlock(ctx.block());
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
            row.setValue(ctx.Identifier().getText()); // مثل: AppComponent
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
    public ExpressionNode visitMultiplicationDivisionExpression(AngularParser.MultiplicationDivisionExpressionContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        String operator = ctx.MULT() != null ? ctx.MULT().getText() : ctx.DIV().getText();
        return new BinaryExpressionNode(left, operator, right, ctx.start.getLine());
    }

    @Override
    public ExpressionNode visitAdditionSubtractionExpression(AngularParser.AdditionSubtractionExpressionContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        String operator = ctx.ADD() != null ? ctx.ADD().getText() : ctx.SUB().getText();
        return new BinaryExpressionNode(left, operator, right, ctx.start.getLine());
    }

    @Override
    public ExpressionNode visitLiteralExpression(AngularParser.LiteralExpressionContext ctx) {
        Object value = null;
        if (ctx.literal().StringLiteral() != null) {
            String text = ctx.literal().StringLiteral().getText();
            value = text.substring(1, text.length() - 1);
        } else if (ctx.literal().NumberLiteral() != null) {
            value = Double.parseDouble(ctx.literal().NumberLiteral().getText());
        } else if (ctx.literal().BooleanLiteral() != null) {
            value = Boolean.parseBoolean(ctx.literal().BooleanLiteral().getText());
        }
        return new LiteralExpressionNode(value, ctx.start.getLine());
    }


    @Override
    public ExpressionNode visitParenthesizedExpression(AngularParser.ParenthesizedExpressionContext ctx) {
        ExpressionNode inner = (ExpressionNode) visit(ctx.expression());
        return new ParenthesizedExpressionNode(inner, ctx.start.getLine());
    }

    @Override
    public ExpressionNode visitPropertyBindingExpression(AngularParser.PropertyBindingExpressionContext ctx) {

        String propertyName = ctx.propertyBinding().BINDING().getText();
        propertyName = propertyName.substring(1, propertyName.length() - 1);

        String valueText = ctx.propertyBinding().StringLiteral().getText();
        ExpressionNode valueExpr = new LiteralExpressionNode(valueText.substring(1, valueText.length() - 1), ctx.propertyBinding().StringLiteral().getSymbol().getLine());

        return new PropertyBindingExpressionNode(propertyName, valueExpr, ctx.start.getLine());
    }

    @Override
    public ExpressionNode visitTwoWayBindingExpression(AngularParser.TwoWayBindingExpressionContext ctx) {

        String modelName = ctx.twoWayBinding().TWO_WAY_BINDING().getText();

        modelName = modelName.substring(2, modelName.length() - 2);


        String dataText = ctx.twoWayBinding().StringLiteral().getText();
        ExpressionNode dataExpr = new LiteralExpressionNode(dataText.substring(1, dataText.length() - 1), ctx.twoWayBinding().StringLiteral().getSymbol().getLine());

        return new TwoWayBindingExpressionNode(modelName, dataExpr, ctx.start.getLine());
    }

    @Override
    public ExpressionNode visitNgDirectiveExpression(AngularParser.NgDirectiveExpressionContext ctx) {

        String directiveName = ctx.ngDirective().DIRECTIVE().getText();
        directiveName = directiveName.substring(1);

        String conditionText = ctx.ngDirective().StringLiteral().getText();
        ExpressionNode conditionExpr = new LiteralExpressionNode(conditionText.substring(1, conditionText.length() - 1), ctx.ngDirective().StringLiteral().getSymbol().getLine());

        return new NgDirectiveExpressionNode(directiveName, conditionExpr, ctx.start.getLine());
    }
    @Override
    public Object visitLiteral(AngularParser.LiteralContext ctx) {
        return super.visitLiteral(ctx);
    }

    @Override
    public Object visitPropertyBinding(AngularParser.PropertyBindingContext ctx) {
        Binding por =new Binding();
        por.setString(ctx.BINDING().toString());
        por.print();
        System.out.print("=");
        por.setString(ctx.StringLiteral().toString());
        por.print();
        return por;
    }

    @Override
    public Object visitTwoWayBinding(AngularParser.TwoWayBindingContext ctx) {
        Binding por =new Binding();
        por.setString(ctx.TWO_WAY_BINDING().toString());
        por.print();
        System.out.print("=");
        por.setString(ctx.StringLiteral().toString());
        por.print();
        return null;
    }

    @Override
    public Object visitNgDirective(AngularParser.NgDirectiveContext ctx) {
        Binding por =new Binding();
        por.setString(ctx.DIRECTIVE().toString());
        por.print();
        System.out.print("=");
        por.setString(ctx.StringLiteral().toString());
        por.print();
        return null;
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
        System.out.println("{");
        for (int i=0;i<ctx.statement().size();i++){
            this.visitStatement(ctx.statement(i));
        }
        System.out.println("}");
        return null;
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
