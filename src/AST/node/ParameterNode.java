package AST.node;

public class ParameterNode extends ASTNode {
    private String name;
    private String type;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void print(){
        System.out.print(" " + name + ",  " + type);
    }

    @Override
    public String toString() {
        return "ParameterNode{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}