package ComputerFactory;

public class ComputerFactoryMain {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 * 1140");
        Motherboard theMonMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PersonalComputer theComputer = new PersonalComputer("2208", "Dell", theMonitor, theMonMotherboard, theCase);

        // this is composition:
        // theComputer.getMonitor().drawPixelAt(10, 10, "red");
        // theComputer.getMotherboard().loadProgramm("Windows");
        // theComputer.getComputerCase().pressPowerButton();

        theComputer.powerUp();
    }

}
