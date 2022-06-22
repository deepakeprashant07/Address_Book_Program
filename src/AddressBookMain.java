import java.util.List;
import java.util.Map;
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
        Map<String, List<PersonInformation>> map = addressBookRepository.getAddressBooksObject();
        while (true) {
            if (map.isEmpty()) {
                System.out.println("Address Book Empty");
                addressBookMain.addContact(addressBook.addAddressBook());
            } else {
                addressBook.showChoice();
                int choice = scan.nextInt();
                String name;
                switch (choice) {
                    case addNewAddressBook:
                        String addressBookName = addressBook.checkAddressBook(map);
                        if (addressBookName == null){
                            System.out.println("Address Book Already Exits");
                        }else {
                            addressBookMain.addContact(addressBookName);
                            break;
                        }
                        break;
                    case addNewContact:
                        addressBookMain.addContact(addressBook.choiceAddressBook(map));
                        break;
                    case editContact:
                        System.out.println("ENTER PERSON NAME");
                        name = scan.next();
                        addressBookRepository.editContact(name);
                        break;
                    case deleteContact:
                        System.out.println("ENTER PERSON NAME");
                        name = scan.next();
                        addressBookRepository.removeContact(name);
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

    public void addContact(String name) {
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
        addressBookRepository.addContactList(name ,personObject);
    }
}
