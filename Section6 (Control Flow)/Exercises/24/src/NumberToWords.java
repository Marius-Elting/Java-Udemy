
public class NumberToWords {
    public static void main(String[] args) {

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.print("Invalid Value");
            return;
        }
        int reversed = reverse(number);

        do {
            int lastDigit = reversed % 10;
            switch (lastDigit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
            reversed = reversed / 10;
        } while (reversed > 0);
        int reverse2 = reverse(number);
        if (getDigitCount(reverse2) != getDigitCount(number)) {
            int zeros = getDigitCount(number) - getDigitCount(reverse2);
            for (int i = 0; i < zeros; i++) {
                System.out.print("Zero ");
            }
        }
    }

    public static int reverse(int number) {
        String result = "";
        if (number < 0) {
            number = number * -1;
            do {
                result += number % 10;
                number = number / 10;
            } while (number > 0);
            return Integer.parseInt(result) * -1;

        } else {
            do {
                result += number % 10;
                number = number / 10;
            } while (number > 0);
            return Integer.parseInt(result);
        }

    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int result = 0;
        do {
            number = number / 10;
            result++;
        } while (number > 0);
        return result;
    }
}
