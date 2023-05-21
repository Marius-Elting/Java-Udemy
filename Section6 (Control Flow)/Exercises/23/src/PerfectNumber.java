
public class PerfectNumber {
    public static void main(String[] args) {
        // boolean result = hasSameLastDigit(9, 22, 71);
        boolean result = isPerfectNumber(6);
        System.out.print(result);
    }
    // A perfect number is a positive integer which is equal to the sum of its
    // proper positive divisors.

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }
        int result = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                result += i;
            }
        }

        if (result == number) {
            return true;
        } else {
            return false;
        }
    }

}
