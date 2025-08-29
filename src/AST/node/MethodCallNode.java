package AST.node;

import AST.node.Expression.ExpressionNode;

import java.util.List;
import java.util.ArrayList;
public class MethodCallNode extends ExpressionNode {
    private ExpressionNode caller;
    private String methodName;
    private List<ExpressionNode> arguments = new ArrayList<>();

    public ExpressionNode getCaller() {
        return caller;
    }

    public void setCaller(ExpressionNode caller) {
        this.caller = caller;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public List<ExpressionNode> getArguments() {
        return arguments;
    }

    public void setArguments(List<ExpressionNode> arguments) {
        this.arguments = arguments;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("MethodCall: " + methodName);
        if (caller != null) caller.print(indent + 2);
        if (arguments != null) {
            for (ExpressionNode arg : arguments) {
                arg.print(indent + 2);
            }
        }
    }
}
