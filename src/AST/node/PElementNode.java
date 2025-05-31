package AST.node;

public class PElementNode extends HtmlElementNode{

    String p;
    public void print (){
        System.out.print("  "+p);
    }
    @Override
    public String toString() {
        return "Div{" +
                "div='" + p + '\'' +
                '}';
    }

    public String getDiv() {
        return p;
    }

    public void setDiv(String div) {
        this.p = div;
    }
}
