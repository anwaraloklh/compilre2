package AST.node;

public class ImportSpecifier extends ASTNode{
    String Identifier ;

    public void print(){
        System.out.print(" "+Identifier+" }");
    }

    public String getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(String identifier) {
        Identifier = identifier;
    }

    @Override
    public String toString() {
        return "ImportSpecifier{" +
                "str='" + Identifier + '\'' +
                '}';
    }
}
