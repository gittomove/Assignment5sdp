package com.company;

public abstract class OperationSystem {
    protected String core;
    protected Printer printer;

    public OperationSystem(String core) {
        this.core = core;
    }

    public abstract void usePrinter();

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
}
