public class PrinterExercise {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public PrinterExercise(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        int checkToner = tonerAmount + tonerLevel;
        System.out.println("CHECK TONER" + checkToner);
        if (checkToner < 0 || checkToner > 100) {
            return -1;
        } else {
            this.tonerLevel += tonerAmount;
            return tonerLevel;
        }
    }

    public int printPages(int pages) {
        int currentJobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        this.pagesPrinted += currentJobPages;
        return currentJobPages;
    }
}
