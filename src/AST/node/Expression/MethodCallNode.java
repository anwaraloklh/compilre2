package AST.node.Expression;

import java.util.List;


public class MethodCallNode extends ExpressionNode {
    private ExpressionNode caller;
    private String methodName;
    private List<ExpressionNode> arguments;

    public ExpressionNode getCaller() { return caller; }
    public void setCaller(ExpressionNode caller) { this.caller = caller; }

    public String getMethodName() { return methodName; }
    public void setMethodName(String methodName) { this.methodName = methodName; }

    public List<ExpressionNode> getArguments() { return arguments; }
    public void setArguments(List<ExpressionNode> arguments) { this.arguments = arguments; }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(" ");

        if (caller != null) {
            printIndent(indent + 2);
            System.out.println(" ");
            caller.print(indent + 4);
        }

        printIndent(indent + 2);
        System.out.println(" " + methodName);

        if (arguments != null && !arguments.isEmpty()) {
            printIndent(indent + 2);
            System.out.println("");
            for (ExpressionNode arg : arguments) {
                arg.print(indent + 4);
            }
        }
    }
}
