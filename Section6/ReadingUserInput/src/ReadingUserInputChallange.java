import java.util.Scanner;

public class ReadingUserInputChallange {
    public static void main(String[] args) {
        fiveValidNumbers();
    }

    public static void fiveValidNumbers() {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;
        while (counter <= 5) {
            System.out.println("Enter number #" + counter + ":");
            try {
                int number = Integer.parseInt(scanner.nextLine());
                counter++;
                sum += number;
            } catch (NumberFormatException badUserInput) {
                System.out.println("Please enter a valid number");
            }

        }
        System.out.println(sum);
    }

}
