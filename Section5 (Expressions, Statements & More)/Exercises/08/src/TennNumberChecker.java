public class TennNumberChecker {
    public static void main(String[] args) {
        // hasEqualSum(-3.1756, -3.175);
    }

    public static boolean hasTeen(int param1, int param2, int param3) {
        if (isTeen(param1) ||
                isTeen(param2) ||
                isTeen(param3)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int param1) {
        if (param1 >= 13 && param1 <= 19) {
            return true;
        } else {
            return false;
        }
    }
}
