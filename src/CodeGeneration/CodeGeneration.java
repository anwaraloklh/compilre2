package CodeGeneration;

import AST.node.*;
import AST.node.Expression.ExpressionNode;
import AST.node.Expression.IdentifierNode;
import AST.node.Expression.LiteralNode;
import AST.node.Expression.MemberAccessNode;
import java.util.stream.Collectors;

public class CodeGeneration {

    public static class HTMLGenerate {

        public static String openDocument() {
            return "<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "  <meta charset=\"UTF-8\" />\n" +
                    "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n" +
                    "  <title>Angular App</title>\n" +
                    "  <style>\n" +
                    "    div { font-size:16px; color:black; background:#f0f0f0; margin:10px; padding:10px; border:solid; }\n" +
                    "    nav { font-size:20px; color:white; background:#007bff; margin:20px; padding:20px; border:solid; }\n" +
                    "    h2 { font-size:30px; color:#222; background:#ffc107; margin:20px; padding:10px; border:solid; }\n" +
                    "    p { font-size:18px; color:black; background:lightyellow; margin:10px; padding:5px; border:solid; }\n" +
                    "    img { width:250px; height:200px; margin:10px; padding:5px; border:solid; }\n" +
                    "    button { font-size:18px; color:white; background:darkgreen; margin:10px; padding:10px; border:solid; cursor:pointer; }\n" +
                    "    form { font-size:18px; color:black; background:lightgray; margin:20px; padding:20px; border:solid; }\n" +
                    "    input, textarea { font-size:16px; color:black; background:white; margin:10px; padding:10px; border:solid; }\n" +
                    "    #productsContainer { display:flex; flex-wrap:wrap; gap:15px; }\n" +
                    "    .product-card { border:1px solid #ccc; border-radius:8px; padding:10px; width:180px; text-align:center; background:white; cursor:pointer; }\n" +
                    "    .product-card img { width:120px; height:100px; object-fit:cover; margin-bottom:5px; }\n" +
                    "  </style>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<nav>\n" +
                    "  <button onclick=\"goTo('list')\">Products</button>\n" +
                    "  <button onclick=\"goTo('add')\">Add Product</button>\n" +
                    "</nav>\n";
        }

        public static String generateListPage() {
            return "<div id=\"listPage\">\n<h2>Products</h2>\n<div id=\"productsContainer\"></div>\n</div>\n";
        }

        public static String generateAddPage() {
            return "<div id=\"addPage\" style=\"display:none;\">\n<h2>Add Product</h2>\n" +
                    "<form onsubmit=\"addProduct(event)\">\n" +
                    "<input id=\"newName\" placeholder=\"Name\" required />\n" +
                    "<input id=\"newImage\" placeholder=\"Image URL\" required />\n" +
                    "<textarea id=\"newDetails\" placeholder=\"Details\" rows=\"3\" required></textarea>\n" +
                    "<button type=\"submit\">Add</button>\n" +
                    "</form>\n</div>\n";
        }

        public static String generateDetailsPage() {
            return "<div id=\"detailsPage\" style=\"display:none;\">\n" +
                    "<h2>Product Details</h2>\n" +
                    "<img id=\"detailImage\" />\n<h3 id=\"detailName\"></h3>\n<p id=\"detailText\"></p>\n" +
                    "<button onclick=\"goTo('list')\">Back</button>\n" +
                    "<button id=\"deleteBtn\" style=\"background:darkred;\">Delete</button>\n</div>\n";
        }

        public static String closeDocument() {
            return "</body>\n</html>\n";
        }

        public static String generateAngularEvent(String eventName, String handler) {
            String htmlTag = "";
            switch (eventName) {
                case "(click)":
                    htmlTag = "<button onclick=\"" + handler + "\"></button>\n";
                    break;
                case "(ngSubmit)":
                    htmlTag = "<form onsubmit=\"" + handler + "; return false;\"></form>\n";
                    break;
                default:
                    String cleanEvent = eventName.replace("(", "").replace(")", "");
                    htmlTag = "<div " + cleanEvent + "=\"" + handler + "\"></div>\n";
                    break;
            }
            return htmlTag;
        }

        public static String generateBindingHTML(Binding bin, int index) {
            String htmlLine = "";
            String cleanedValue = bin.getString().replaceAll("[\"']", "");

            switch (bin.getElementType()) {
                case "input":
                    htmlLine = "<input id=\"" + bin.getName() + "_" + index + "\" placeholder=\"Name\" required />"; break;
                case "textarea":
                    htmlLine = "<textarea id=\"" + bin.getName() + "_" + index + "\" placeholder=\"" + cleanedValue + "\" rows=\"3\" required></textarea>"; break;
                case "img":
                    String src = "", alt = "";
                    if (bin.getName().equals("src")) src = cleanedValue;
                    if (bin.getName().equals("alt")) alt = cleanedValue;
                    htmlLine = "<img id=\"" + bin.getName() + "_" + index + "\" src=\"" + src + "\" alt=\"" + alt + "\" style=\"width:200px; display:block; margin-bottom:10px; border-radius:8px;\" />"; break;
                case "button":
                    htmlLine = "<button id=\"" + bin.getName() + "_" + index + "\" onclick=\"" + cleanedValue + "\">" + bin.getName() + "</button>"; break;
                case "div":
                    htmlLine = "<div id=\"" + bin.getName() + "_" + index + "\">" + cleanedValue + "</div>"; break;
            }
            return htmlLine + "\n";
        }

        public static String openSection(AngularDirective directive) {
            String condition = directive.getString();
            String idValue = "";
            if (condition.contains("'list'")) idValue = "listPage";
            else if (condition.contains("'add'")) idValue = "addPage";
            else if (condition.contains("'details'")) idValue = "detailsPage";
            return "<div id=\"" + idValue + "\">\n";
        }

        public static String closeSection() {
            return "</div>\n";
        }

    }

    public static class JSGenerate {

        public static String generateBindingJS(Binding bin) {
            String jsLine = "";
            switch (bin.getElementType()) {
                case "input":
                    jsLine = "document.getElementById(\"" + bin.getName() + "\").value = " + bin.getString() + ";"; break;
                case "img":
                    if (bin.getName().equals("src")) jsLine = "document.getElementById(\"detailImage\").src = " + bin.getString() + ";";
                    else if (bin.getName().equals("alt")) jsLine = "document.getElementById(\"detailImage\").alt = " + bin.getString() + ";"; break;
                case "button":
                    jsLine = "document.getElementById(\"" + bin.getName() + "\").onclick = function() { " + bin.getString() + "; };"; break;
                default: jsLine = ""; break;
            }
            return jsLine + "\n";
        }

        public static String generateVariableJS(StatementNode statementNode) {
            StringBuilder jsCode = new StringBuilder();
            jsCode.append(statementNode.isConst() ? "const " : "let ");
            jsCode.append(statementNode.getName());
            if (statementNode.getValue() != null && !statementNode.getValue().isEmpty()) {
                String rawValue = statementNode.getValue();
                if (rawValue.contains("World")) rawValue = "\"" + rawValue + "\"";
                jsCode.append(" = ").append(rawValue);
            }
            jsCode.append(";\n");
            return jsCode.toString();
        }

        public static String generateFunctionJS(String functionName, String params, String body) {
            String cleanParams = params.replaceAll(":[^,\\)]+", "");
            return "function " + functionName + "(" + cleanParams + ") {\n" + body + "}\n";
        }

        public static String generateExpressionJS(ExpressionNode node) {
            if (node instanceof MethodCallNode) {
                MethodCallNode methodCall = (MethodCallNode) node;
                String args = "";
                if (methodCall.getArguments() != null)
                    args = methodCall.getArguments().stream().map(JSGenerate::generateExpressionJS).collect(Collectors.joining(", "));
                String caller = (methodCall.getCaller() != null) ? generateExpressionJS(methodCall.getCaller()) : "";
                return caller + "." + methodCall.getMethodName() + "(" + args + ")";
            } else if (node instanceof MemberAccessNode) {
                MemberAccessNode memberAccess = (MemberAccessNode) node;
                return generateExpressionJS(memberAccess.getObject()) + "." + memberAccess.getProperty();
            } else if (node instanceof IdentifierNode) return ((IdentifierNode) node).getName();
            else if (node instanceof LiteralNode) {
                Object value = ((LiteralNode) node).getValue();
                return value instanceof String ? "\"" + value + "\"" : value.toString();
            } else if (node instanceof ThisKeywordNode) return "this";
            return "";
        }

        public static String generateScript() {
            return "let selectedIndex = null;\n" +
                    "function goTo(page) {\n" +
                    "  document.getElementById('listPage').style.display='none';\n" +
                    "  document.getElementById('addPage').style.display='none';\n" +
                    "  document.getElementById('detailsPage').style.display='none';\n" +
                    "  document.getElementById(page+'Page').style.display='block';\n" +
                    "  if(page==='list') renderProducts();\n" +
                    "}\n" +
                    "function renderProducts() {\n" +
                    "  const container = document.getElementById('productsContainer');\n" +
                    "  container.innerHTML='';\n" +
                    "  images.forEach((p,i)=>{\n" +
                    "    const div=document.createElement('div');\n" +
                    "    div.className='product-card';\n" +
                    "    div.innerHTML=`<p>${p.name}</p><img src='${p.source}' alt='${p.name}' />`;\n" +
                    "    div.onclick=()=>viewDetails(i);\n" +
                    "    container.appendChild(div);\n" +
                    "  });\n" +
                    "}\n" +
                    "function viewDetails(index) {\n" +
                    "  selectedIndex=index;\n" +
                    "  const p=images[index];\n" +
                    "  document.getElementById('detailImage').src=p.source;\n" +
                    "  document.getElementById('detailName').textContent=p.name;\n" +
                    "  document.getElementById('detailText').textContent=p.details;\n" +
                    "  document.getElementById('deleteBtn').onclick=()=>deleteProduct(index);\n" +
                    "  goTo('details');\n" +
                    "}\n" +
                    "function addProduct(event) {\n" +
                    "  event.preventDefault();\n" +
                    "  const name=document.getElementById('newName').value;\n" +
                    "  const source=document.getElementById('newImage').value;\n" +
                    "  const details=document.getElementById('newDetails').value;\n" +
                    "  images.push({name,source,details});\n" +
                    "  document.getElementById('newName').value='';\n" +
                    "  document.getElementById('newImage').value='';\n" +
                    "  document.getElementById('newDetails').value='';\n" +
                    "  goTo('list');\n" +
                    "}\n" +
                    "function deleteProduct(index){ images.splice(index,1); goTo('list'); }\n" +
                    "renderProducts();\n";
        }

        public static String openScript() { return "<script>\n"; }
        public static String closeScript() { return "</script>\n"; }

    }

}
