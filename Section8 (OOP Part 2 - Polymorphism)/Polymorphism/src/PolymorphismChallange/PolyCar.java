package PolymorphismChallange;

public class PolyCar {
    private String description;

    public PolyCar(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Enginge startet");
    }

    public void drive() {
        runEngine();
        System.out.println("Car drives " + getClass().getSimpleName());
    }

    protected void runEngine() {
        System.out.println("EngineRuns");
    }
}

class GasPoweredCar extends PolyCar {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);

    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f $n", avgKmPerLitre);
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> %d cylinders are fired up, Ready!%n", cylinders);

    }

}

class ElectricCar extends PolyCar {

    private double avgKmPerLitre;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerLitre, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }

}

class HybridCar extends PolyCar {
    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;

    public HybridCar(String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

}
