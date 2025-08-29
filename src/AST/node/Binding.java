package AST.node;

public class Binding extends ASTNode {

    private String string;
    private String name;
    private boolean twoWay;
    private String elementType;

    public Binding() {
        this.twoWay = false;
        this.elementType = "div";
    }

    // getters / setters
    public String getString() { return string; }
    public void setString(String string) { this.string = string; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public boolean isTwoWay() { return twoWay; }
    public void setTwoWay(boolean twoWay) { this.twoWay = twoWay; }

    public String getElementType() { return elementType; }
    public void setElementType(String elementType) { this.elementType = elementType; }
}
