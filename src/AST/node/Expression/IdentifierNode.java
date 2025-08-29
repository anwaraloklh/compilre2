package AST.node.Expression;


public class IdentifierNode extends ExpressionNode {
    private String name;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(" " + name);
    }
}
