public class ComplexNumber {
    private double real;
    private double imaginary;

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(double a, double b) {
        this.imaginary = imaginary + b;
        this.real = real + a;
    }

    public void add(ComplexNumber a) {
        this.add(a.getReal(), a.getImaginary());
    }

    public void subtract(double a, double b) {
        this.imaginary = imaginary - b;
        this.real = real - a;
    }

    public void subtract(ComplexNumber a) {
        this.subtract(a.getReal(), a.getImaginary());
    }

}
