import AST.node.*;
import AST.node.Expression.ExpressionNode;
import AST.visitor.visiter;

import CodeGeneration.CodeGeneration;
import SymbolTablee.SymbolTabol;

import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import gen.AngularLexer;
import gen.AngularParser;
import org.antlr.v4.runtime.Token;
import semantic.SemanticErrorReporter;
import AST.node.ASTNode.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        SymbolTabol symbolTable = new SymbolTabol();

        PrintWriter logWriter = null;
        SemanticErrorReporter errorReporter = null;

        try {

            logWriter = new PrintWriter(new FileWriter("semantic_errors.log", false));
            errorReporter = new SemanticErrorReporter(logWriter);
        }
        catch (IOException e) {
            System.err.println("Unable to create log file: " + e.getMessage());
            return;
        }


        try {
            String fileName = "test/html.txt";
            String baseName = fileName.substring(fileName.lastIndexOf("/") + 1).replace(".txt", ".html");
            String filePath = "./" + baseName;

            CharStream cs = CharStreams.fromFileName(fileName);
            AngularLexer lexer = new AngularLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AngularParser parser = new AngularParser(tokens);
            AngularParser.ProgramContext c = parser.program();

            visiter baseVisitor = new visiter(symbolTable, errorReporter, filePath);
            ProgramNode sour = (ProgramNode) baseVisitor.visit(c);

            System.out.println("\n\n********* Symbol Table ********\n");
            symbolTable.print();
            System.out.println("\n\n********* Semantic Errors ********\n");
            errorReporter.printAllErrors();


        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        finally {
            if (logWriter != null)
            {
                logWriter.close();
            }
        }
    }
}
