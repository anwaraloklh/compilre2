package AST.node.Html;

import AST.node.ASTNode;

public class TextareaElement extends HtmlElementNode {
    String Textarea;
    public void print (){
        System.out.print("  "+Textarea);
    }
    @Override
    public String toString() {
        return "Textarea{" +
                "Textarea='" + Textarea + '\'' +
                '}';
    }

    public String getTextarea() {
        return Textarea;
    }

    public void setTextarea(String Textarea) {
        this.Textarea = Textarea;
    }
}
