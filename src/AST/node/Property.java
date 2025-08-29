package AST.node;

public class Property extends ASTNode {

  private String key;
    private ASTNode value;

    public void print(int i) {
        System.out.print(key + ": ");

    }

    public String getKey() { return key; }
    public void setKey(String key) { this.key = key; }
    public ASTNode getValue() { return value; }
    public void setValue(ASTNode value) { this.value = value; }
}
