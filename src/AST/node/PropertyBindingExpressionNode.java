package AST.node;

public class PropertyBindingExpressionNode extends ExpressionNode {
    private String propertyName;
    private ExpressionNode valueExpression;

    public PropertyBindingExpressionNode(String propertyName, ExpressionNode valueExpression, int lineNumber) {
        super(lineNumber);
        this.propertyName = propertyName;
        this.valueExpression = valueExpression;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public ExpressionNode getValueExpression() {
        return valueExpression;
    }

    @Override
    public void print(int indent) {
        System.out.print("  ".repeat(indent) + "PropertyBinding: [" + propertyName + "]=\n");
        valueExpression.print(indent + 1);
    }
}
