
public class AllFactors {
    public static void main(String[] args) {
        // boolean result = hasSameLastDigit(9, 22, 71);
        printFactors((int) 32);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.print("Invalid Value");
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

}
