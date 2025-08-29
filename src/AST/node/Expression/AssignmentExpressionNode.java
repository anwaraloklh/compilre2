package AST.node.Expression;



public class AssignmentExpressionNode extends ExpressionNode {
    private ExpressionNode left;
    private ExpressionNode right;

    public ExpressionNode getLeft() { return left; }
    public void setLeft(ExpressionNode left) { this.left = left; }

    public ExpressionNode getRight() { return right; }
    public void setRight(ExpressionNode right) { this.right = right; }


    @Override
    public void print(int indent) {
        if (left != null) left.print(indent + 1);
        if (right != null) right.print(indent + 1);
    }
}
