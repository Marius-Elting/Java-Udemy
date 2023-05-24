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
    private double avgKmPerCharge;
    private int battery;

    public ElectricCar(String description) {
        super(description);

    }

    public ElectricCar(String description, double avgKmPerCharge, int battery) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.battery = battery;
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average %.2f %n", avgKmPerCharge);
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kWh battery on, Ready!%n", battery);

    }

}

class HybridCar extends PolyCar {
    private double avgKmPerLitre;
    private int battery;
    private int cylinders;

    public HybridCar(String description) {
        super(description);

    }

    public HybridCar(String description, double avgKmPerLitre, int cylinders, int battery) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.battery = battery;
        this.cylinders = cylinders;
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f $n", avgKmPerLitre);
    }

    @Override
    public void startEngine() {
        System.out.printf("HEV -> %d cyinders are fired up.%n", cylinders);
        System.out.printf("HEV -> switch %d kWh battery on, Ready!%n", battery);

    }

}
