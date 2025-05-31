package AST.node;

public class Binding extends ASTNode {


    String string;
    public void print (){
        System.out.print("  "+string);
    }
    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
