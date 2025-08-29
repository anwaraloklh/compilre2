package AST.node;

public class HtmlIdentifierNode extends ASTNode {
    private String name;

    public HtmlIdentifierNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print(int indent) {
        System.out.print("  "  + name + " ");
    }
}
