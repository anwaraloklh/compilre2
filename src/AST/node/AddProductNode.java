package AST.node;
// AST node definitions for product management UI


import java.util.List;



public class AddProductNode extends ASTNode {
    private List<TextFieldNode> fields;
    private ButtonNode submitButton;

    public AddProductNode(List<TextFieldNode> fields, ButtonNode submitButton) {
        this.fields = fields;
        this.submitButton = submitButton;
    }

    public List<TextFieldNode> getFields() {
        return fields;
    }

    public ButtonNode getSubmitButton() {
        return submitButton;
    }
}

