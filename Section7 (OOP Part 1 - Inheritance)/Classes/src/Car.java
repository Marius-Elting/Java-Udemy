
public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 4;
    private boolean convertible = true;

    public void setMake(String make) {

        if (make == null)
            make = "Unkown";
        String lowercasemMake = make.toLowerCase();
        switch (lowercasemMake) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> this.make = "Unsupportet";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getMake() {
        return make;
    }

    public void describeCar() {
        System.out.println(
                doors + "-Door " + color + " " + make + " " + model + " " + (convertible ? "Convertible" : ""));

    }

}
