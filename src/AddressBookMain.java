import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    public static final int addNewAddressBook = 1;
    public static final int addNewContact = 2, editContact = 3, deleteContact = 4;
    public static final int showHistory = 5, exits = 6;
    static Scanner scan = new Scanner(System.in);
    static AddressBookRepository addressBookRepository = new AddressBookRepository();

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        AddressBookMain addressBookMain = new AddressBookMain();
        while (true) {
            if (addressBookRepository.getAddressBooksObject().isEmpty()) {
                System.out.println("Address Book Empty");
                addressBookRepository.addList(addressBook.addAddressBook());
            } else {
                addressBook.showChoice();
                int choice = scan.nextInt();
                switch (choice) {
                    case addNewAddressBook:
                        addressBookRepository.addList(addressBook.addAddressBook());
                        break;
                    case addNewContact:
                        addressBookMain.addContact();
                        break;
                    case editContact:
                        break;
                    case deleteContact:
                        break;
                    case showHistory:
                        addressBookRepository.show();
                        break;
                    case exits:
                        System.out.println("Thank You ..!");
                        System.exit(0);
                }
            }
        }
    }

    private void addContact() {
        PersonInformation personObject = new PersonInformation();
        System.out.println("ENTER PERSON FIRST NAME AND LAST NAME");
        personObject.firstName = scan.next();
        personObject.lastName = scan.next();
        System.out.println("ENTER ADDRESS AND CITY NAME");
        personObject.address = scan.next();
        personObject.city = scan.next();
        System.out.println("ENTER STATE AND ZIP");
        personObject.state = scan.next();
        personObject.zip = scan.next();
        System.out.println("ENTER PERSON PHONE NUMBER");
        personObject.phoneNumber = scan.next();
        System.out.println("ENTER PERSON EMAIL ID");
        personObject.emailId = scan.next();
        addressBookRepository.showAddressBook();
        int index = scan.nextInt();
        addressBookRepository.addContactList(personObject ,index);
    }
}
