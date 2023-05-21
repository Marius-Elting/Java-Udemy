public class DecimalComperator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
    }

    public static boolean areEqualByThreeDecimalPlaces(double param1, double param2) {
        if ((int) (param1 * 1000) == (int) (param2 * 1000)) {
            return true;
        } else {
            return false;
        }
    }
}
