// semantic/SemanticErrorReporter.java
package semantic;

import SymbolTablee.Row;
import SymbolTablee.SymbolTabol;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class SemanticErrorReporter {
    private List<ErrorDetail> errors = new ArrayList<>();
    public static class ErrorDetail {
        public SemanticErrorType type;
        public String message;
        public int lineNumber;
        public SymbolTabol errorSymbolTableSnapshot;


        public ErrorDetail(SemanticErrorType type, String message, int lineNumber, SymbolTabol snapshot) {
            this.type = type;
            this.message = message;
            this.lineNumber = lineNumber;
            this.errorSymbolTableSnapshot = snapshot;
        }
    }



    private PrintWriter logWriter;

    public SemanticErrorReporter(PrintWriter writer) {
        this.logWriter = writer;
    }




    public void reportError(SemanticErrorType errorType, String message, int lineNumber, SymbolTabol fullSymbolTable, List<Row> problematicRows) {
        SymbolTabol snapshot = fullSymbolTable.getErrorSnapshot(problematicRows);
        errors.add(new ErrorDetail(errorType, message, lineNumber, snapshot));
    }


    public void printAllErrors() {
        if (errors.isEmpty()) {
            return;
        }


        for (ErrorDetail error : errors) {

                System.out.printf("%-15s %-10s %-20s %-15s %-20s%n", "Line", "Scope", "Name", "Type", "Value");
                System.out.println("-------------------------------------------------------------------------------------------");

            if (error.errorSymbolTableSnapshot != null && !error.errorSymbolTableSnapshot.getRows().isEmpty()) {
                error.errorSymbolTableSnapshot.print(false);
                System.out.println(" ------------------------------------------------------------------------\n");
            }

        }



        if (logWriter != null) {
            for (ErrorDetail error : errors) {
                logWriter.println("SEMANTIC ERROR: " + error.type + " at line " + error.lineNumber + ": " + error.message);
            }
            logWriter.flush();
        }
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }
}