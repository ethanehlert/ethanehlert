import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Define the Contact class
class Contact {
    // Properties of the Contact class
    private String name;
    private String email;
    private String phoneNumber;

    // Constructor to initialize a new Contact object
    public Contact(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Implement the toString method for Contact
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    // Getters and Setters (if necessary)
    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setter for phoneNumber
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

// Define the ContactManagement class
public class ContactManagement {
    // List to store Contact objects
    private List<Contact> contacts;

    // Constructor to initialize the ContactManagement
    public ContactManagement() {
        contacts = new ArrayList<>();
    }

    // Method to add a new Contact
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // Method to remove a Contact by name
    public void removeContact(String name) {
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getName().equals(name)) {
                iterator.remove();
                System.out.println("Contact removed: " + contact);
                break; // exit loop once contact is removed
            }
        }
    }

    // Method to list all Contacts
    public void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("List of contacts:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create a ContactManagement
        ContactManagement contactManager = new ContactManagement();

        // Add some contacts
        contactManager.addContact(new Contact("John Doe", "john@example.com", "1234567890"));
        contactManager.addContact(new Contact("Jane Smith", "jane@example.com", "9876543210"));

        // List all contacts
        contactManager.listContacts();

        // Remove a contact
        contactManager.removeContact("John Doe");

        // List all contacts after removal
        contactManager.listContacts();
    }
}
