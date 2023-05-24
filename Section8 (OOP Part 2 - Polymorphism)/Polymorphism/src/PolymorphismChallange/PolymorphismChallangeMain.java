package PolymorphismChallange;

public class PolymorphismChallangeMain {
    public static void main(String[] args) {
        PolyCar car = new PolyCar("2022 Blue Ferrari");
        runRace(car);

        PolyCar ferrari = new GasPoweredCar("2022 Ferrari", 15.4, 6);
        runRace(ferrari);

        PolyCar tesla = new ElectricCar("Tesla model 3", 568, 75);
        runRace(tesla);

        PolyCar toyota = new HybridCar("Toyota Prius", 4, 4, 30);
        runRace(toyota);
    }

    public static void runRace(PolyCar car) {
        car.startEngine();
        car.drive();
    }
}
