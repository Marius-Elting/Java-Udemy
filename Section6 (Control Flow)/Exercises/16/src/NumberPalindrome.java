
public class NumberPalindrome {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }
        int reverse = 0;
        int palindrom_num = number;
        while (palindrom_num > 0) {
            int lastDigit = palindrom_num % 10;
            reverse = (reverse * 10) + lastDigit;
            palindrom_num = palindrom_num / 10;
        }
        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }

}
