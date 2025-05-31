package AST.node;

import java.util.List;

public class Array extends ASTNode {
    private List<ASTNode> elements;
    String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public List<ASTNode> getElements() {
        return elements;
    }

    public void setElements(List<ASTNode> elements) {
        this.elements = elements;
    }


@Override
    public void print(int i){
        System.out.print(string);
    }
}
