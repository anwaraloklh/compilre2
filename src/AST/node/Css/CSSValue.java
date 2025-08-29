package AST.node.Css;

import AST.node.ASTNode;

public class CSSValue extends ASTNode {
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void print (int i){
        System.out.println(value);
    }
}
