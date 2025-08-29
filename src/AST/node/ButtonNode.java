package AST.node;


import org.antlr.v4.runtime.Token;

public class ButtonNode extends ASTNode {
    public final Token text;
    String Color;
    ContainerNode TextNode;

    public String getColor() {
        return Color;
    }

    public ContainerNode getTextNode() {
        return TextNode;
    }

    public ButtonNode(Token text) {
        this.text = text;
    }

    @Override
    public void print(int indent) {
        print(indent);
        System.out.println("<button>" + text.getText() + "</button>");
    }
}
