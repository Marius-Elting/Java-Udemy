
public class SharedDigit {
    public static void main(String[] args) {
        boolean result = hasSharedDigit(8, 89);

        System.out.println(result);
    }

    public static boolean hasSharedDigit(int param1, int param2) {
        if (param1 < 10 || param2 < 10 || param1 > 99 || param2 > 99) {
            return false;
        }
        boolean result = false;

        do {
            int currentDigit = param1 % 10;
            int param2Digits = param2;
            do {
                int currentSecondDigit = param2Digits % 10;
                if (currentDigit == currentSecondDigit) {
                    result = true;
                }
                ;
                param2Digits = param2Digits / 10;
            } while (param2Digits > 0);

            param1 = param1 / 10;

        } while (param1 > 0);
        return result;
    }

}
