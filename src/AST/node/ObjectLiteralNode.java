package AST.node;

import AST.node.Expression.ExpressionNode;

public class ObjectLiteralNode extends ExpressionNode {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void print(int indent) {
        System.out.print(value +"\n" +" ");
    }
}
