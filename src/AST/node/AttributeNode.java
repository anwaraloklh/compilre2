package AST.node;

public class AttributeNode extends ASTNode {

    private String name;
    private String value;
   @Override
    public void print(int i){
        System.out.print("  "+name );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
