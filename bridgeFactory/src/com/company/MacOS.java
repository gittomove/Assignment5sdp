package com.company;

public class MacOS extends OperationSystem{

    public MacOS() {
        super("Mac OS X");
    }

    @Override
    public void usePrinter() {
        System.out.println(core);
        this.printer.print();
    }
}
