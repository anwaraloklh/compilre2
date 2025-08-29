package AST.node.Css;

import AST.node.ASTNode;

public class CssSelector extends ASTNode {
    public enum Type { IDENTIFIER, DOT, HASH, TAG }

    public Type type;
    public String name;

    public CssSelector(Type type, String name) {
        this.type = type;
        this.name = name;
    }


    public void print(int indent) {
        String prefix = "  ".repeat(indent);
        String formattedName = switch (type) {
            case DOT -> "." + name;
            case HASH -> "#" + name;
            default -> name;
        };
        System.out.print(prefix + formattedName);
    }
}

