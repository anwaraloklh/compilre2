package AST.node.Css;

import AST.node.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class CssRuleNode extends ASTNode {
    private String selector;
    private List<CssDeclarationNode> declarations = new ArrayList<>();

    public CssRuleNode(String selector) { this.selector = selector; }
    public void addDeclaration(CssDeclarationNode decl) {
        declarations.add(decl);
    }

    public List<CssDeclarationNode> getDeclarations() {
        return declarations;
    }


    public String toCSS() {
        StringBuilder sb = new StringBuilder();
        sb.append(selector).append(" {\n");
        for (CssDeclarationNode d : declarations) {
            sb.append("  ").append(d.toString()).append("\n");
        }
        sb.append("}\n");
        return sb.toString();
    }
}
