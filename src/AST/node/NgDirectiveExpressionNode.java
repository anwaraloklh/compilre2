package AST.node;

public class NgDirectiveExpressionNode extends ExpressionNode {
    private String directiveName; // مثلاً: ngIf
    private ExpressionNode conditionExpression; // التعبير للشرط

    public NgDirectiveExpressionNode(String directiveName, ExpressionNode conditionExpression, int lineNumber) {
        super(lineNumber);
        this.directiveName = directiveName;
        this.conditionExpression = conditionExpression;
    }

    public String getDirectiveName() {
        return directiveName;
    }

    public ExpressionNode getConditionExpression() {
        return conditionExpression;
    }

    @Override
    public void print(int indent) {
        System.out.print("  ".repeat(indent) + "NgDirective: *" + directiveName + "=\n");
        conditionExpression.print(indent + 1);
    }
}