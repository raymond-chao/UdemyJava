package EncapsulationChallenge;

public class Main {
    public Main(){
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count: " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(10);
        System.out.printf("Current job pages: %d, Printer Total: %d %n",
                pagesPrinted, printer.getPagesPrinted());
    }

    public static void main(String[] args) {
        new Main();
    }
}
