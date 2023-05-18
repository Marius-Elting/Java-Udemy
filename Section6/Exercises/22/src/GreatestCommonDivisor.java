
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        // boolean result = hasSameLastDigit(9, 22, 71);
        int result = getGreatestCommonDivisor(81, 153);
        System.out.print(result);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int result = 0;

        for (int i = 1; i <= first; i++) {

            if (first % i == 0) {
                for (int c = 1; c <= second; c++) {

                    if (second % c == 0 && i == c) {
                        result = c;
                    }
                }
            }
        }
        return result;
    }

}
