package AST.node;

public class ClassDeclaration extends ASTNode{


    String classname;

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
    @Override
    public String toString() {
        return "ClassDeclaration{" +
                "classname='" + classname + '\'' +
                '}';
    }
    public void print(){
        System.out.print("  " +classname);
    }
}
