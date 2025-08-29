package AST.node;

public class AngularDirective extends ASTNode {
    String string;
    String id;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void print(int i) {
        // فقط طباعة بسيطة للـ directive بالشكل attr="value"
        if (id != null && string != null) {
            System.out.print(id + "=\"" + string + "\"");
        } else if (id != null) {
            System.out.print(id);
        } else if (string != null) {
            System.out.print(string);
        }
    }
}
