package AST.node;

public class ExportStatement extends ASTNode {
    String export;

    @Override
    public String toString() {
        return "ExportStatement{" +
                "export='" + export + '\'' +
                '}';
    }

    public String getExport() {
        return export;
    }

    public void setExport(String export) {
        this.export = export;
    }
    public void print(){
        System.out.print(export);
    }
}
