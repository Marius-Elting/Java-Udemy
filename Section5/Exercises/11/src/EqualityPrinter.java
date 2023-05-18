public class EqualityPrinter {
    public static void main(String[] args) {

    }

    public static void printEqual(int param1, int param2, int param3) {
        if (param1 < 0 || param2 < 0 || param3 < 0) {
            System.out.print("Invalid Value");
        } else {
            if (param1 == param2 && param2 == param3) {
                System.out.print("All numbers are equal");
            } else if (param1 != param2 && param1 != param3 && param2 != param3) {
                System.out.print("All numbers are different");
            } else {
                System.out.print("Neither all are equal or different");
            }
        }
    }

}
