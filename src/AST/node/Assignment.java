package AST.node;

public class Assignment extends ASTNode {
    private String left;
    private String right;



    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }
    public void print(){
        System.out.print(left);

    }
}
