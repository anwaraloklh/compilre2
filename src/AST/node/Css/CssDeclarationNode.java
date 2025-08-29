package AST.node.Css;

import AST.node.ASTNode;

public class CssDeclarationNode extends ASTNode {
    private String property;
    private String value;

    public CssDeclarationNode(String property, String value) {
        this.property = property;
        this.value = value;
    }

    public String getProperty() { return property; }
    public String getValue() { return value; }



    @Override
    public void print(int i) {
        System.out.println("  ".repeat(i) + property + ": " + value + ";");
    }
}
