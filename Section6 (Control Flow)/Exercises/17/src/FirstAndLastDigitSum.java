
public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        int result = sumFirstAndLastDigit(212306);
        System.out.print(result);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = 0;
        do {
            firstDigit = number % 10;
            number = number / 10;
        } while (number > 0);
        System.out.print(firstDigit + " " + lastDigit);
        return firstDigit + lastDigit;
    }

}
