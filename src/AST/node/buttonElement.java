package AST.node;

public class buttonElement extends ASTNode{
    String button;
    public void print (){
        System.out.print("  "+button);
    }
    @Override
    public String toString() {
        return "button{" +
                "button='" + button + '\'' +
                '}';
    }

    public String getbutton() {
        return button;
    }

    public void setbutton(String button) {
        this.button = button;
    }
}
