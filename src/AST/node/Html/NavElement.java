package AST.node.Html;

import AST.node.ASTNode;

public class NavElement extends HtmlElementNode {
    String  Nav;
    public void print (){
        System.out.print("  "+ Nav);
    }
    @Override
    public String toString() {
        return " Nav{" +
                " Nav='" +  Nav + '\'' +
                '}';
    }

    public String getNav() {
        return  Nav;
    }

    public void setNav(String Nav) {
        this. Nav = Nav;
    }
}
