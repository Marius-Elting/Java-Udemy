public class ConstructorChallangeMain {
    public static void main(String[] args) {
        Customer myAccount = new Customer("Marius", 9999, "mairusemail");
        Customer myAccount2 = new Customer();
        Customer myAccount3 = new Customer("marius", "email");

        System.out.println(myAccount.getName());
        System.out.println(myAccount2.getName());
        System.out.println(myAccount3.getName());
    }
}
