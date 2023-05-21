import java.util.Scanner;

public class ReadingUserInputMinMaxChallange {
    public static void main(String[] args) {
        fiveValidNumbers();
    }

    public static void fiveValidNumbers() {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        int sum = 0;
        int max = 0;
        int min = 0;
        while (!exit) {
            try {
                System.out.println("Enter a number!");

                int number = Integer.parseInt(scanner.nextLine());

                if (number > max) {
                    max = number;
                }

                if (number < min || min == 0) {
                    min = number;
                }
                System.out.println("The max Value is: " + max);
                System.out.println("The min Value is: " + min);
            } catch (NumberFormatException badUserInput) {
                exit = true;
            }
        }
        System.out.println(sum);
    }

}
