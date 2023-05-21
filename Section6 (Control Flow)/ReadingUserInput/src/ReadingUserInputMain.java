import java.util.Scanner;

public class ReadingUserInputMain {
    public static void main(String[] args) {
        try {
            String age = getInputFromScanner(2023);
            System.out.print(age);
        } catch (Exception e) {

        }
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, Whats your Name? ");
        System.out.print("Hi " + name + ", Thanks for taking the course");

        String dateOfBirth = System.console().readLine("What is your Birth Year? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, Whats your Name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking the course!");
        System.out.println("When is your were born? ");

        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + currentYear);
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!!");
            }
        } while (!validDOB);

        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBString) {
        int dob = Integer.parseInt(dateOfBString);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);
    }
}
