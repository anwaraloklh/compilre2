package AST.node.Expression;

public class LiteralNode extends ExpressionNode {
    private String value;

    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(" " + value);
    }
}
