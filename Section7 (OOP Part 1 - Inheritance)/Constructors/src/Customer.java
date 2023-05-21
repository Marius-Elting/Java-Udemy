public class Customer {
    private String name;
    private double cedritLimit;
    private String emailAdress;

    public Customer(String name, double cedritLimit, String emailAdress) {
        this.name = name;
        this.cedritLimit = cedritLimit;
        this.emailAdress = emailAdress;
    }

    public Customer() {
        this("Default Name", 9999, "Default Adress");
    }

    public Customer(String name, String email) {
        this(name, 9999, email);

    }

    public String getName() {
        return name;
    }

    public double getCedritLimit() {
        return cedritLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
