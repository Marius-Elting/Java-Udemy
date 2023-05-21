import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        double numberOfInput = 0;
        boolean exit = false;
        try {
            do {
                int input = Integer.parseInt(scanner.nextLine());
                numberOfInput++;
                sum += input;
                avg = sum / numberOfInput;

            } while (!exit);

        } catch (NumberFormatException badInput) {
            exit = true;
            System.out.println("SUM = " + sum + " AVG = " + ((long) Math.round(avg)));
        }
    }

}
