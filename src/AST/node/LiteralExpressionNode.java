package AST.node;

public class LiteralExpressionNode extends ExpressionNode {
    private Object value; // يمكن أن يكون String, Double, Boolean

    public LiteralExpressionNode(Object value, int lineNumber) {
        super(lineNumber);
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public void print(int indent) {
        System.out.print("  ".repeat(indent) + "LiteralExpression: " + value + " (Type: " + value.getClass().getSimpleName() + ")\n");
    }
}