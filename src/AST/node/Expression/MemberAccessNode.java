package AST.node.Expression;


public class MemberAccessNode extends ExpressionNode {
    private ExpressionNode object;
    private String property;

    public ExpressionNode getObject() { return object; }
    public void setObject(ExpressionNode object) { this.object = object; }

    public String getProperty() { return property; }
    public void setProperty(String property) { this.property = property; }

    @Override
    public void print(int indent) {
        printIndent(indent);

        if (object != null) object.print(indent + 1);
        printIndent(indent + 1);
        System.out.println(" " + property);
    }
}
