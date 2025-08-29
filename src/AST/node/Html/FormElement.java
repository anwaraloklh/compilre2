package AST.node.Html;

public class FormElement extends HtmlElementNode{
    String form;
    public void print (){
        System.out.print("  "+form);
    }
    @Override
    public String toString() {
        return "form{" +
                "form='" + form + '\'' +
                '}';
    }

    public String getform() {
        return form;
    }

    public void setform(String form) {
        this.form = form;
    }
}
