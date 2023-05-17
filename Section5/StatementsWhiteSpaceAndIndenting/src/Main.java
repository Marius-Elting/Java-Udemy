public class Main {
    public static void main(String[] args) {
        int myVariable = 50;
        // myVariable = 50 is the Expression
        // the intire Line is the Statement
        myVariable++; // the Semicolon makes it an Statement
        myVariable--;
        
        if(myVariable === 50){
            System.out.print(myVariable)
        }

        System.out.print("This is a test");

        // Statements dont have to be in one Line

        System.out.print("This " +
                "is" +
                "a" +
                "Test");

        // You can put multiple Statements in one line
        int abc = 1;
        System.out.print(abc);
        System.out.print("This is unnecessary");

    }
}
