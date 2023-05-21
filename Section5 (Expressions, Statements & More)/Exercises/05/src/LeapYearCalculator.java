public class LeapYearCalculator {
    public static void main(String[] args) {
        System.out.print(isLeapYear(1700));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            if (year % 4 != 0) {
                return false;
            } else if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
    }
}
