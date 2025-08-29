package AST.node.Html;

public class FormAttributeNode extends HtmlElementNode {
    private String name;   // اسم الـ attribute (type, placeholder, rows, required)
    private String value;  // قيمة الـ attribute (لو موجودة)

    public FormAttributeNode(String name, String value) {

        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void print(int indent) {
        if (value != null) {
            System.out.println("  ".repeat(indent) + "FormAttribute: " + name + " = \"" + value + "\"");
        } else {
            System.out.println("  ".repeat(indent) + "FormAttribute: " + name + " (boolean)");
        }
    }
}
