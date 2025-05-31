package AST.node;
import java.util.List;
public class DivElementNode extends HtmlElementNode{
    String div;
    public void print (){
        System.out.print("  "+div);
    }
    @Override
    public String toString() {
        return "Div{" +
                "div='" + div + '\'' +
                '}';
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }
}
