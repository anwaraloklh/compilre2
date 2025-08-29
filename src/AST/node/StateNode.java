package AST.node;

import java.util.List;
import java.util.Map;

public class StateNode extends ASTNode {
    private Map<String, Object> state;

    public StateNode(Map<String, Object> state) {
        this.state = state;
    }

    public Map<String, Object> getState() { return state; }

    public String toJSONString() {
        StringBuilder sb = new StringBuilder("{\n");
        for (var entry : state.entrySet()) {
            sb.append("  ").append(entry.getKey())
                    .append(": ").append(entry.getValue().toString())
                    .append(",\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
