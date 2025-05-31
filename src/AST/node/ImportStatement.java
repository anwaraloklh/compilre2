package AST.node;

public class ImportStatement extends ASTNode{
    private String importedItems;
    private String source;
    private String import0;
    private String from;

    public void print(int i) {
        if (i == 0) {
            System.out.print(import0);
        }
        if (i == 1) {
            System.out.print(" " + importedItems + " " + from + " " + source);
        }
    }

    public String getImportedItems() {
        return importedItems;
    }

    public void setImportedItems(String importedItems) {
        this.importedItems = importedItems;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getImport0() {
        return import0;
    }

    public void setImport0(String import0) {
        this.import0 = import0;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
