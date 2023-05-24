package EncapsulationChallange;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonderAmount) {
        this.tonerLevel += tonderAmount;

        if (tonerLevel < 0 || tonerLevel > 100) {
            return -1;
        } else {
            return tonerLevel;
        }
    }

    public int printPages(int pages) {
        int currentJobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        this.pagesPrinted += currentJobPages;
        return pagesPrinted;
    }
}
