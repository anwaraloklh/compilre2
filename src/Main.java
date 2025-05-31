import AST.visitor.visiter;
import AST.node.ProgramNode;

import SymbolTablee.SymbolTabol;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import gen.AngularLexer;
import gen.AngularParser;
import semantic.SemanticErrorReporter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        SymbolTabol symbolTable = new SymbolTabol();


        String filePath = Paths.get("test", "test").toString();


        PrintWriter logWriter = null;
        SemanticErrorReporter errorReporter = null;

        try {
            logWriter = new PrintWriter(new FileWriter("semantic_errors.log", false));
            errorReporter = new SemanticErrorReporter(logWriter);
        } catch (IOException e) {
            System.err.println("Unable to create log file: " + e.getMessage());
            return;
        }

        try {
            CharStream cs = CharStreams.fromFileName(filePath);
            AngularLexer lexer = new AngularLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AngularParser parser = new AngularParser(tokens);
            AngularParser.ProgramContext c = parser.program();


            visiter baseVisitor = new visiter(symbolTable, errorReporter);
            ProgramNode sour = (ProgramNode) baseVisitor.visit(c);
            System.out.println(sour);




            System.out.println("\n\n********* Symbol Table ********\n");
            symbolTable.print();
            System.out.println("\n\n********* Semantic Errors ********\n");
            errorReporter.printAllErrors();;

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } finally {
            if (logWriter != null) {
                logWriter.close();
            }
        }
    }
}