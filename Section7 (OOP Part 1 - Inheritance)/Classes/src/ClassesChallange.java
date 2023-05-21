public class ClassesChallange {
    public static void main(String[] args) {
        Bank myBank = new Bank();

        myBank.setAccountBalance(1000);
        myBank.setAccountNumber("DE12 1212 1212 1212 12");
        myBank.setCustomerName("Marius Elting");
        myBank.setEmail("contact@mariuselting.dev");
        myBank.deposit(1000);
        myBank.widthdraw(500);

    }
}
