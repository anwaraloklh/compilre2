package AST.node;

public class AngularDirective extends ASTNode {
    String string;
    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }



    @Override
    public void print (int i){
        System.out.print("  "+string);
    }

}
