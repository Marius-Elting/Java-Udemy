public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return height * getArea();
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height < 0 ? 0 : height;
    }

}
