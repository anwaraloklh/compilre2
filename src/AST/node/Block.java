package AST.node;
import java.util.List;
public class Block extends ASTNode {
    private List<StatementNode> statements;

    public void print(int i) {
        System.out.println("{");
        for (StatementNode stmt : statements) {
            stmt.print(i);
            System.out.println();
        }
        System.out.println("}");
    }

    public List<StatementNode> getStatements() { return statements; }
    public void setStatements(List<StatementNode> statements) { this.statements = statements; }
}
