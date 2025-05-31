package AST.node;

public class BinaryExpressionNode extends ExpressionNode{
    private ExpressionNode left;
    private String operator;
    private ExpressionNode right;

    public BinaryExpressionNode(ExpressionNode left, String operator, ExpressionNode right, int lineNumber) {
        super(lineNumber);
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public ExpressionNode getLeft() {
        return left;
    }

    public String getOperator() {
        return operator;
    }

    public ExpressionNode getRight() {
        return right;
    }

    @Override
    public void print(int indent) {
        // Simple print for debugging
        System.out.print("  ".repeat(indent) + "BinaryExpression (" + operator + ")\n");
        left.print(indent + 1);
        right.print(indent + 1);
    }
}
