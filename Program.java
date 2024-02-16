public class Program {
    // Main method for testinbg
    public static void main(String[] args) {
        // Create a ContactManagement object
        ContactManagement manager = new ContactManagement();

        // Add contacts
        manager.addContact(new Contact("Alaadin", "alaadin@trentu.ca", "123-456-7890"));
        manager.addContact(new Contact("Bob", "bob@example.com", "098-765-4321"));

        // List contacts
        manager.listContacts();

        // Remove a contact
        manager.removeContact("Alaadin");

        // List contacts again to see the change
        manager.listContacts();
    }
}
