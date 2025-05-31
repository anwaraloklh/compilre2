package AST.node;

public abstract  class ExpressionNode {

    protected int lineNumber;

    public ExpressionNode(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getLineNumber() {
        return lineNumber;
    }
    public void print(int i) {}
}
