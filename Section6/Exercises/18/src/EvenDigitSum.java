
public class EvenDigitSum {
    public static void main(String[] args) {
        int result = getEvenDigitSum(252);
        System.out.print(result);
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int result = 0;
        do {
            int currentDigit = number % 10;
            if (currentDigit % 2 == 0) {
                result += currentDigit;
            }
            number = number / 10;
        } while (number > 0);

        return result;
    }

}
