package AST.node;
import java.util.List;

public class ProgramNode extends ASTNode {
    private List<StatementNode> statements;



    public List<StatementNode> getStatements() {
        return statements;
    }

    public void setStatements(List<StatementNode> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "ProgramNode{" +
                "statements=" + statements +
                '}';
    }
}
