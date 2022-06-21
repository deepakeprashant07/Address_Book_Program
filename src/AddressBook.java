import java.util.Scanner;

public class AddressBook {
    String addressBookName;
    Scanner scan = new Scanner(System.in);
    public String addAddressBook() {
        System.out.println("Enter Address Book Name");
        addressBookName = scan.next();
        return addressBookName;
    }
    public void showChoice() {
        System.out.println(" ENTER 1] ADD NEW ADDRESS BOOK \n ENTER 2] ADD CONTACT INFORMATION");
        System.out.println(" ENTER 3] EDIT CONTACT INFORMATION \n ENTER 4] DELETE CONTACT INFORMATION");
        System.out.println(" ENTER 5] HISTORY \n ENTER 6] EXIT");
    }
}