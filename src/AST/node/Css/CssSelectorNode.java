package AST.node.Css;

import AST.node.ASTNode;

public class CssSelectorNode extends ASTNode {
    private String selectorText;

    public String getSelectorText() {
        return selectorText;
    }

    public void setSelectorText(String selectorText) {
        this.selectorText = selectorText;
    }

    @Override
    public void print(int i) {
        System.out.print("  ".repeat(i) + selectorText);
    }
}
