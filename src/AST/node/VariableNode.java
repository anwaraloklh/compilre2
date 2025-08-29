package AST.node;

public class VariableNode extends ASTNode {
    private String name;
    private String value; // raw text from parser

    public void setName(String name) { this.name = name; }
    public void setValue(String value) { this.value = value; }

    public String getName() { return name; }
    public String getValue() { return value; }

    public String toJS() {
        if (value == null) return "let " + name + ";";
        return "let " + name + " = " + value + ";";
    }
}
