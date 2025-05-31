package AST.node;

public class TwoWayBindingExpressionNode extends ExpressionNode {
    private String modelName;
    private ExpressionNode dataExpression;

    public TwoWayBindingExpressionNode(String modelName, ExpressionNode dataExpression, int lineNumber) {
        super(lineNumber);
        this.modelName = modelName;
        this.dataExpression = dataExpression;
    }

    public String getModelName() {
        return modelName;
    }

    public ExpressionNode getDataExpression() {
        return dataExpression;
    }

    @Override
    public void print(int indent) {
        System.out.print("  ".repeat(indent) + "TwoWayBinding: [(" + modelName + ")]=\n");
        dataExpression.print(indent + 1);
    }
}
