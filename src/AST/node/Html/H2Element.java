package AST.node.Html;

public class H2Element extends HtmlElementNode {
    String h2;
    public void print (){
        System.out.print("  "+h2);
    }
    @Override
    public String toString() {
        return "h2{" +
                "h2='" + h2 + '\'' +
                '}';
    }

    public String getDiv() {
        return h2;
    }

    public void setDiv(String div) {
        this.h2 = div;
    }
}
