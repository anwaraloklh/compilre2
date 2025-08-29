package semantic;


public enum SemanticErrorType {

    MISSING_CONST_INITIALIZER("Uninitialized constant"),
    HTML_SEMANTIC_ERROR(""),

    ACCESS_MODIFIER_INVALID_SCOPE("s only allowed for class members"),
    DUPLICATE_CSS_PROPERTY("Duplicate CSS property in the same rule"),
    TYPO_IMPORT("Typo in import statement or unknown module"),

    MISSING_REQUIRED_DIRECTIVE_BINDING("Missing required binding for Angular directive"),

    MISSING_TEMPLATE_OR_STYLE("Component is missing both template and styles");

    private final String message;

    SemanticErrorType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
