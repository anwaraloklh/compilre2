package AST.node;

public class FunctionNode extends ASTNode {
    private String name;
    private String params;
    private String body;

    public void setName(String name) { this.name = name; }
    public void setParams(String params) { this.params = params; }
    public void setBody(String body) { this.body = body; }

    public String getName() { return name; }
    public String getParams() { return params; }
    public String getBody() { return body; }
}
