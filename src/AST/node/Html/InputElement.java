package AST.node.Html;

import AST.node.ASTNode;

public class InputElement extends HtmlElementNode {
    String Input;
    public void print (){
        System.out.print("  "+Input);
    }
    @Override
    public String toString() {
        return "Input{" +
                "Input='" + Input + '\'' +
                '}';
    }

    public String getInput() {
        return Input;
    }

    public void setInput(String Input) {
        this.Input = Input;
    }
}
