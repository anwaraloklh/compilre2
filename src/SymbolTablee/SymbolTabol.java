package SymbolTablee;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class SymbolTabol {



    public SymbolTabol() {
        this.rows = new ArrayList<>();
    }


    public SymbolTabol(List<Row> initialRows) {
        if (initialRows != null) {
            this.rows.addAll(initialRows);
        } else {
            this.rows = new ArrayList<>();
        }
    }

    private List<Row> rows = new ArrayList<>();
    private Stack<String> scopeStack = new Stack<>();
    private String currentScope = "global";

    public void enterScope(String scopeName) {
        scopeStack.push(scopeName);
        setCurrentScope(scopeName);
    }

    public void exitScope() {
        if (!scopeStack.isEmpty()) {
            scopeStack.pop();
        }
        currentScope = scopeStack.isEmpty() ? "global" : scopeStack.peek();
    }

    public void addRow(Row row) {

        if (!scopeStack.isEmpty()) {
            row.setScope(scopeStack.peek());
        } else {
            row.setScope("global");
        }
        rows.add(row);
    }

    public List<Row> getRows() {
        return rows;
    }


    public SymbolTabol getErrorSnapshot(Row problematicRow) {
        List<Row> snapshotRows = new ArrayList<>();
        if (problematicRow != null) {
            snapshotRows.add(problematicRow);
        }
        return new SymbolTabol(snapshotRows);
    }


    public SymbolTabol getErrorSnapshot(List<Row> problematicRows) {
        return new SymbolTabol(problematicRows);
    }

    public Row retrieveRowInCurrentScope(String name) {
        for (Row row : rows) {
            if (row.getScope().equals(currentScope) && row.getName().equals(name)) {
                return row;
            }
        }
        return null;
    }

    public Row findCurrentScopeEntry(String name) {
        for (Row row : rows) {
            if (row.getName().equals(name) && row.getScope().equals(getCurrentScope())) {
                return row;
            }
        }
        return null;
    }


    public boolean existsInCurrentScope(String name) {
        String currentScope = getCurrentScope();
        for (Row row : rows) {
            if (row.getScope().equals(currentScope) && row.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public String getCurrentScope() {
        return currentScope;
    }

    public void setCurrentScope(String scope) {
        this.currentScope = scope;
    }


    public void print(boolean printHeader) {
        if (printHeader) {
            System.out.printf("%-15s %-10s %-20s %-15s %-20s%n", "Line", "Scope", "Name", "Type", "Value");
            System.out.println("-------------------------------------------------------------------------------------------");
        }

        if (rows.isEmpty()) {

        } else {
            for (Row row : rows) {
                if (row != null) {
                    System.out.printf(
                            "%-15s %-10s %-20s %-15s %-20s%n",
                            row.getLine(),
                            row.getScope(),
                            row.getName(),
                            row.getType(),
                            row.getValue()
                    );
                }
            }
        }
    }


    public void print() {
        print(true);
    }
}