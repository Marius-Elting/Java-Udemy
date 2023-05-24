public class EncapsulationExerciseMain {
    public static void main(String[] args) {
        PrinterExercise printer = new PrinterExercise(50, true);
        System.out.println(printer.getPagesPrinted());
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", printer.printPages(5),
                printer.getPagesPrinted());

        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", printer.printPages(10),
                printer.getPagesPrinted());

        System.out.println(printer.addToner(150));
    }
}
