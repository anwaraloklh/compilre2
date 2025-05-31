package AST.node;

public class InterpolationNode extends ASTNode{
    private String value;
    public void print(int i) { System.out.print(value); }
    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }
}
