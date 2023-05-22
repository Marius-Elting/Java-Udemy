
public class Floor {
    private double width;
    private double length;

    public Floor(double width, double lenght) {
        this.width = width < 0 ? 0 : width;
        this.length = lenght < 0 ? 0 : lenght;
    }

    public double getArea() {
        return width * length;
    }

}