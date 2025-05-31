package AST.node;
import java.util.List;
public class TemplateNode extends ASTNode{
    private List<ASTNode> content;
    public void print(int i) {

        for (ASTNode node : content) {
            node.print(i);
        }

    }
    public List<ASTNode> getContent() { return content; }
    public void setContent(List<ASTNode> content) { this.content = content; }
}
