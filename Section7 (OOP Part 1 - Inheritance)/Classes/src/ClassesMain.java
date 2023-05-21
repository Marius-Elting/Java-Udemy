public class ClassesMain {
    public static void main(String[] args) {
        Car car = new Car();

        car.setColor("red");
        car.setMake("Mercedes");
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(true);
        targa.setColor("red");

        targa.describeCar();

    }
}
