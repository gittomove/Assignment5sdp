package com.company;

public class Main {

    public static void main(String[] args) {
        OperationSystem os = new MacOS();
        Printer printer = new HP();
        os.setPrinter(printer);

        os.usePrinter();


    }

}
