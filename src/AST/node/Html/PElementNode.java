package AST.node.Html;

import AST.node.ASTNode;

public class PElementNode extends HtmlElementNode {

    String p;
    public void print (){
        System.out.print("  "+p);
    }
    @Override
    public String toString() {
        return "p{" +
                "p='" + p + '\'' +
                '}';
    }

    public String getDiv() {
        return p;
    }

    public void setDiv(String div) {
        this.p = div;
    }
}
