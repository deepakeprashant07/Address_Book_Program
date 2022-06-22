import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AddressBook {
    String addressBookName;
    Scanner scan = new Scanner(System.in);
    public String addAddressBook() {
        System.out.println("Enter Address Book Name");
        addressBookName = scan.next();
        return addressBookName;
    }
    public String checkAddressBook(Map<String, List<PersonInformation>> map) {
        System.out.println("Enter Address Book Name");
        addressBookName = scan.nextLine();
        if (map.containsKey(addressBookName)) {
            return null;
        }
        return addressBookName;
    }

    public void showChoice() {
        System.out.println(" ENTER 1] ADD NEW ADDRESS BOOK \n ENTER 2] ADD CONTACT INFORMATION");
        System.out.println(" ENTER 3] EDIT CONTACT INFORMATION \n ENTER 4] DELETE CONTACT INFORMATION");
        System.out.println(" ENTER 5] HISTORY \n ENTER 6] EXIT");
    }

    public String choiceAddressBook(Map<String, List<PersonInformation>> map) {
        Set<String> setKey = map.keySet();
        System.out.println(setKey);
        System.out.println("Choice Address Book");
        addressBookName = scan.nextLine();
        return addressBookName;
    }
}