package AST.node.Html;

import AST.node.ASTNode;

public class InterpolationNode extends HtmlElementNode {
    private String expression;

    public InterpolationNode(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public void print(int indent) {
        System.out.println("  "+ expression + "");
    }
}
