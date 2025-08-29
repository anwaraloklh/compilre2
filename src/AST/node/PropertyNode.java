package AST.node;

import AST.node.Expression.ExpressionNode;

public class PropertyNode extends ExpressionNode {

    private String key;
    private ExpressionNode value;

    public void setKey(String k) { this.key = k; }
    public void setValue(ExpressionNode v) { this.value = v; }

    @Override
    public void print(int indent) {
        System.out.print(" ".repeat(indent) + key + ": ");
        if (value != null) value.print(0);
    }
}
