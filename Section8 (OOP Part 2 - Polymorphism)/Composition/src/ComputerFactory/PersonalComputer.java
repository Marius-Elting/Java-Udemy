package ComputerFactory;

public class PersonalComputer extends Product {
    private Monitor monitor;
    private Motherboard motherboard;
    private ComputerCase computerCase;

    // public Monitor getMonitor() {
    // return monitor;
    // }

    // public Motherboard getMotherboard() {
    // return motherboard;
    // }

    // public ComputerCase getComputerCase() {
    // return computerCase;
    // }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "Yellow");
    }

    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }

    public PersonalComputer(String model, String manufacturer, Monitor monitor, Motherboard motherboard,
            ComputerCase computerCase) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computerCase = computerCase;
    }

    @Override
    public String toString() {
        return "PersonalComputer [monitor=" + monitor + ", motherboard=" + motherboard + ", computerCase="
                + computerCase + "]";
    }

}
