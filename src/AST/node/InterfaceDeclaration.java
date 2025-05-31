package AST.node;

public class InterfaceDeclaration extends ASTNode{
  String string;

    @Override
    public String toString() {
        return "InterfaceDeclaration{" +
                "string='" + string + '\'' +
                '}';
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void print(){
        System.out.println(string);
    }
}
