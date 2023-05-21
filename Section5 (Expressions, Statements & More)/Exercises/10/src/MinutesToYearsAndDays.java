public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.print("Invalid Value");

        } else {
            long hours = (long) Math.floor(minutes / 60);
            long days = (long) Math.floor(hours / 24);
            long years = (long) Math.floor(days / 365);
            long restDays = (long) days - years * 365;
            System.out.print(minutes + " min = " + years + " y and " + restDays + " d ");
        }
    }

}
