package AST.node;

import AST.node.Expression.ExpressionNode;

import java.util.List;

public class FunctionCallNode extends ExpressionNode {
    private String functionName;
    private List<ExpressionNode> arguments;

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public List<ExpressionNode> getArguments() {
        return arguments;
    }

    public void setArguments(List<ExpressionNode> arguments) {
        this.arguments = arguments;
    }

    @Override
    public void print(int indent) {
        System.out.print(functionName + "(");
        if (arguments != null) {
            for (int i = 0; i < arguments.size(); i++) {
                arguments.get(i).print(indent);
                if (i < arguments.size() - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.print(")");
    }
}
