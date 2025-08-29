package AST.node;

public class AngularBindingNode extends ASTNode {
    private String kind;
    private String name;
    private String value;

    public AngularBindingNode(String kind, String name, String value) {

        this.kind = kind;
        this.name = name;
        this.value = value;
    }

    public String getKind() {
        return kind;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void print(int indent) {
        System.out.println("  ".repeat(indent) +
                "AngularBinding (" + kind + "): " +
                name + " = \"" + value + "\"");
    }
}
