
public class LastDigitChecker {
    public static void main(String[] args) {
        // boolean result = hasSameLastDigit(9, 22, 71);
        boolean result = hasSameLastDigit(11, 22, 31);
        System.out.println(result);
    }

    public static boolean hasSameLastDigit(int param1, int param2, int param3) {
        if (!isValid(param1) || !isValid(param2) || !isValid(param3)) {
            return false;
        }
        boolean result = false;
        int param1Last = param1 % 10;
        int param2Last = param2 % 10;
        int param3Last = param3 % 10;
        if (param3Last == param1Last || param3Last == param2Last || param2Last == param1Last) {
            result = true;
        }

        return result;
    }

    public static boolean isValid(int param1) {
        if (param1 < 10 || param1 > 1000) {
            return false;
        } else {
            return true;
        }
    }

}
