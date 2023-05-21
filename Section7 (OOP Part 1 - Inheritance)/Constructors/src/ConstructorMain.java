public class ConstructorMain {
    public static void main(String[] args) {
        Account myAccount = new Account("abcdefg", 2000, "marius", "contact@mariuselting.dev", "012345123");
        System.out.println(myAccount.getBalance());
    }
}
