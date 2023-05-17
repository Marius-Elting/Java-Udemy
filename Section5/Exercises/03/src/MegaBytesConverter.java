public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.print("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int kiloByteDiff = kiloBytes - (megaBytes * 1024);
            System.out.print(kiloBytes + " KB = " + megaBytes + " MB and " + kiloByteDiff + " KB");
        }
    }
}
