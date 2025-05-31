package AST.node;
import java.util.List;
public class Decorator extends ASTNode {
    private String atComponent;
    private List<ComponentProperty> properties;




    public String getAtComponent() {
        return atComponent;
    }

    public void setAtComponent(String atComponent) {
        this.atComponent = atComponent;
    }

    public List<ComponentProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<ComponentProperty> properties) {
        this.properties = properties;
    }
    public void print(){
        System.out.print(atComponent);
    }
}
