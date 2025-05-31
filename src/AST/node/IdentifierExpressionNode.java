package AST.node;

public class IdentifierExpressionNode extends ExpressionNode {
    private String name;

    public IdentifierExpressionNode(String name, int lineNumber) {
        super(lineNumber);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print(int indent) {
        System.out.print("  ".repeat(indent) + "IdentifierExpression: " + name + "\n");
    }
}
