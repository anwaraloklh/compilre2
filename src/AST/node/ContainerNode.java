package AST.node;


import java.util.List;

public class ContainerNode extends ASTNode{

    String Alignment;
    String Color;
    String TextNode;
     String Content;

    public String getContent() {
        return Content;
    }

    public String getAlignment() {
        return Alignment;
    }

    public String getColor() {
        return Color;
    }

    public String getTextNode() {
        return TextNode;
    }




    @Override
    public void print(int indent) {
        print(indent);
        System.out.println("<div>");

            print(indent + 2);

        print(indent);
        System.out.println("</div>");
    }
}
