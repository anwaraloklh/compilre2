package AST.node.Expression;

import AST.node.ASTNode;

public abstract  class ExpressionNode extends ASTNode {

    protected void printIndent(int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print(" ");
        }
    }
    public void print(int indent) {}


}
