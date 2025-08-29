package AST.node.Expression;

public class ParenthesizedExpressionNode extends ExpressionNode {
    private ExpressionNode inner;

    public ExpressionNode getInner() { return inner; }
    public void setInner(ExpressionNode inner) { this.inner = inner; }

    @Override
    public void print(int indent) {
        printIndent(indent);

        if (inner != null) inner.print(indent + 2);
    }
}
