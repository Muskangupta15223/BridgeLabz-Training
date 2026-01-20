package com.addressbooksystem;

public class Main {
    public static void main(String[] args) {

        AddressBook book = new AddressBook();

        Address a1 = new Address("Delhi", "Delhi", "110001");
        Address a2 = new Address("Mumbai", "Maharashtra", "400001");

        Contact c1 = new Contact("Amit", "Sharma", "9876543210",
                                 "amit@gmail.com", a1);
        Contact c2 = new Contact("Neha", "Verma", "9123456780",
                                 "neha@gmail.com", a2);

        book.addContact(c1);
        book.addContact(c2);

        System.out.println("\n All Contacts:");
        book.displayContacts();

        System.out.println("\n Search by City (Delhi):");
        book.searchByCityOrState("Delhi");

        System.out.println("\n Edit Contact:");
        book.editContact("Amit Sharma", "9999999999", "amit_new@gmail.com");

        System.out.println("\n Delete Contact:");
        book.deleteContact("Neha Verma");

        System.out.println("\n Final Contact List:");
        book.displayContacts();
    }
}

