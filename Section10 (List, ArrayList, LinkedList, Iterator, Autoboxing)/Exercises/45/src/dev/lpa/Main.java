package dev.lpa;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("01573123123");
        phone.printContacts();
        phone.addNewContact(new Contact("David", "0123123"));
        phone.addNewContact(new Contact("David3", "012312323"));
        phone.printContacts();
        phone.updateContact(new Contact("David", "0123123"), new Contact("David2", "09876723"));
        phone.printContacts();
        phone.removeContact(phone.queryContact("David3"));
        phone.printContacts();
    }
}