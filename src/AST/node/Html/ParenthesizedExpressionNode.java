package AST.node.Html;

import AST.node.Expression.ExpressionNode;

public class ParenthesizedExpressionNode extends ExpressionNode {
    private ExpressionNode innerExpression;

    public ParenthesizedExpressionNode(ExpressionNode innerExpression) {

        this.innerExpression = innerExpression;
    }

    public ExpressionNode getInnerExpression() {
        return innerExpression;
    }

    @Override
    public void print(int indent) {
        System.out.print("  ".repeat(indent) + "ParenthesizedExpression:\n");
        innerExpression.print(indent + 1);
    }
}