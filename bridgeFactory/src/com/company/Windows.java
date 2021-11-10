package com.company;

public class Windows extends OperationSystem{
    public Windows() {
        super("Windows");
    }

    @Override
    public void usePrinter() {
        System.out.println(core);
        this.printer.print();
    }
}
