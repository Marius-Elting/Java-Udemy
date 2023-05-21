public class SwitchMain {
    public static void main(String[] args) {
        // same as in JavaScript

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value is one");
                break;
            case 2:
                System.out.println("Value is two");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value is Three or Four or Five");
                break;
            default:
                System.out.println("Value is not matching anything");
        }

        // another varient:
        switch (switchValue) {
            case 1 -> System.out.println("Value is one");
            case 2 -> System.out.println("Value is two");
            case 3, 4, 5 -> System.out.println("Value is Three or Four or Five");
            default -> System.out.println("Value is not matching anything");
        }
    }

}
