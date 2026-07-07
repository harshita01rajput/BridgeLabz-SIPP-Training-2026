import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}

public class AddressBook {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> contactMap = new HashMap<>();
    static HashSet<String> phoneNumbers = new HashSet<>();

    public static void addContact(Contact contact) {

        if (phoneNumbers.contains(contact.phone)) {
            System.out.println("Duplicate phone number not allowed.");
            return;
        }

        contacts.add(contact);
        contactMap.put(contact.name, contact);
        phoneNumbers.add(contact.phone);

        System.out.println("Contact added successfully.");
    }

    public static void searchContact(String name) {

        if (contactMap.containsKey(name)) {
            System.out.println(contactMap.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }

    public static void deleteContact(String name) {

        Contact contact = contactMap.get(name);

        if (contact != null) {
            contacts.remove(contact);
            phoneNumbers.remove(contact.phone);
            contactMap.remove(name);

            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public static void displayContacts() {

        Collections.sort(contacts, new Comparator<Contact>() {
            public int compare(Contact c1, Contact c2) {
                return c1.name.compareTo(c2.name);
            }
        });

        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public static void main(String[] args) {

        addContact(new Contact("Harshita", "9876543210", "harshita@gmail.com"));
        addContact(new Contact("Amit", "8765432109", "amit@gmail.com"));
        addContact(new Contact("Riya", "7654321098", "riya@gmail.com"));
        addContact(new Contact("Neha", "9876543210", "neha@gmail.com"));

        System.out.println("\nSearch Contact:");
        searchContact("Amit");

        System.out.println("\nDelete Contact:");
        deleteContact("Riya");

        System.out.println("\nAll Contacts Sorted by Name:");
        displayContacts();
    }
}