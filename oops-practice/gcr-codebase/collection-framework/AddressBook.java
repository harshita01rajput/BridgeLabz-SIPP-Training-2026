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

    void display() {
        System.out.println("Name  : " + name);
        System.out.println("Phone : " + phone);
        System.out.println("Email : " + email);
        System.out.println("  ");
    }
}

public class AddressBook {

    ArrayList<Contact> contacts = new ArrayList<>();
    HashMap<String, Contact> map = new HashMap<>();
    HashSet<String> phoneSet = new HashSet<>();

    
    void addContact(String name, String phone, String email) {

        if (phoneSet.contains(phone)) {
            System.out.println("Phone number already exists!");
            return;
        }

        Contact c = new Contact(name, phone, email);

        contacts.add(c);
        map.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact Added Successfully.");
    }

    
    void searchContact(String name) {

        Contact c = map.get(name);

        if (c != null) {
            System.out.println("\nContact Found:");
            c.display();
        } else {
            System.out.println("Contact Not Found.");
        }
    }

     
    void deleteContact(String name) {

        Contact c = map.remove(name);

        if (c == null) {
            System.out.println("Contact Not Found.");
            return;
        }

        contacts.remove(c);
        phoneSet.remove(c.phone);

        System.out.println("Contact Deleted Successfully.");
    }

     
    void displayContacts() {

        Collections.sort(contacts, (a, b) -> a.name.compareTo(b.name));

        System.out.println("\nAll Contacts:");

        for (Contact c : contacts) {
            c.display();
        }
    }

    public static void main(String[] args) {

        AddressBook book = new AddressBook();

        book.addContact("Rahul", "9876543210", "rahul@gmail.com");
        book.addContact("Priya", "9876543211", "priya@gmail.com");
        book.addContact("Aman", "9876543212", "aman@gmail.com");
        book.addContact("Rohit", "9876543210", "rohit@gmail.com");
        
        book.searchContact("Priya");
        book.deleteContact("Rahul");
        book.displayContacts();
    }
}