package AST.node;

public class StatementNode extends ASTNode {
    private String name;
    private String type;
    private String value;

    private boolean isConst;
    private boolean isLet;
    private String accessModifier;


    public StatementNode(String name, String type, String value, boolean isConst, boolean isLet, String accessModifier) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.isConst = isConst;
        this.isLet = isLet;
        this.accessModifier = accessModifier;
    }

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isConst() {
        return isConst;
    }

    public void setConst(boolean isConst) {
        this.isConst = isConst;
    }

    public boolean isLet() {
        return isLet;
    }

    public void setLet(boolean isLet) {
        this.isLet = isLet;
    }

    public String getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
    }



    public void print(int i) {

        StringBuilder sb = new StringBuilder();


        if (accessModifier != null && !accessModifier.isEmpty()) {
            sb.append(accessModifier).append(" ");
        }
        if (isConst) {
            sb.append("const ");
        } else if (isLet) {
            sb.append("let ");
        }
        sb.append(name);

        if (value != null && !value.isEmpty()) {
            sb.append(" = ").append(value);
        }
        sb.append(";");
        System.out.println(sb.toString());
    }
}