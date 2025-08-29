package AST.node;




import org.antlr.v4.runtime.Token;

public class TextFieldNode extends ASTNode{
    public final Token placeholder;
 String Label;

    public String getLabel() {
        return Label;
    }

    public TextFieldNode(Token placeholder) {
        this.placeholder = placeholder;
    }

    @Override
    public void print(int indent) {
        print(indent);
        System.out.println("<input type=\"text\" placeholder=\"" + placeholder.getText() + "\" />");
    }
}

