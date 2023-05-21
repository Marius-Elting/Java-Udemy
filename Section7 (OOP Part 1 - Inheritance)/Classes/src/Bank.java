public class Bank {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        this.accountBalance = accountBalance + amount;
        System.out.println("Your new Balance is:" + accountBalance);

    }

    public void widthdraw(double amount) {
        if (accountBalance - amount < 0) {
            System.out.println("You dont have enough Money");
        } else {
            this.accountBalance = accountBalance - amount;
            System.out.println("Your new Balance is:" + accountBalance);
        }
    }
}
