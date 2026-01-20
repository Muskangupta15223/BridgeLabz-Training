package com.addressbooksystem;

import java.util.*;

class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();

    // Add Contact (Duplicate Check)
    public void addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(contact.getFullName())) {
                System.out.println("Duplicate contact not allowed.");
                return;
            }
        }
        contacts.add(contact);
        System.out.println(" Contact added successfully.");
    }

    // Edit Contact
    public void editContact(String name, String newPhone, String newEmail) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(name)) {
                c.setPhone(newPhone);
                c.setEmail(newEmail);
                System.out.println(" Contact updated.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Delete Contact
    public void deleteContact(String name) {
        Iterator<Contact> it = contacts.iterator();
        while (it.hasNext()) {
            if (it.next().getFullName().equalsIgnoreCase(name)) {
                it.remove();
                System.out.println(" Contact deleted.");
                return;
            }
        }
        System.out.println(" Contact not found.");
    }

    // Search by City or State
    public void searchByCityOrState(String value) {
        for (Contact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(value) ||
                c.getAddress().getState().equalsIgnoreCase(value)) {
                System.out.println(c);
            }
        }
    }

    // Display All Contacts Sorted Alphabetically
    public void displayContacts() {
        contacts.sort(Comparator.comparing(Contact::getFullName));
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
