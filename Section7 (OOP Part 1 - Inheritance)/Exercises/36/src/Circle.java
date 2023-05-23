public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public Circle(double radius) {
        this.radius = radius < 0 ? 0 : radius;
    }

}
