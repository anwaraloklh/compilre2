package AST.node;

import AST.node.Css.CssDeclarationNode;
import AST.node.Css.CssSelectorNode;

import java.util.List;

public class StyleRuleNode extends ASTNode {
    private CssSelectorNode selector;
    private List<CssDeclarationNode> declarations;

    public CssSelectorNode getSelector() {
        return selector;
    }

    public void setSelector(CssSelectorNode selector) {
        this.selector = selector;
    }

    public List<CssDeclarationNode> getDeclarations() {
        return declarations;
    }

    public void setDeclarations(List<CssDeclarationNode> declarations) {
        this.declarations = declarations;
    }

    @Override
    public void print(int i) {
        System.out.print("  ");
        selector.print(i);
        System.out.println(" {");
        for (CssDeclarationNode declaration : declarations) {
            declaration.print(i + 1);
        }
        System.out.println("  }");
    }
}
