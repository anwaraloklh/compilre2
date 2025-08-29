package AST.node;

public class AngularEventNode extends ASTNode {
    private String name;
    private String value;


    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void print(int indent) {
        System.out.println( "   "+ name + " = \"" + value + "\"");
    }
}
