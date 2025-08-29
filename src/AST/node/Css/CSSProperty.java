package AST.node.Css;

import AST.node.ASTNode;

public class CSSProperty extends ASTNode {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void print(int i){
        System.out.println(name);
    }
}
