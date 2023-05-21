public class MethodOverloadChalange {
    public static void main(String[] args) {
        // System.out.print("5ft, 8in = " + convertToCentimeters(5, 8) + " cm")
        System.out.print(convertToCentimeters(5, 8));
    }

    public static double convertToCentimeters(int inches) {
        return inches * (int) 2.54;
    }

    public static double convertToCentimeters(int feetHeight, int inchHeight) {
        int inches = feetHeight * (int) 12 + inchHeight;

        return convertToCentimeters(inches);
    }

}