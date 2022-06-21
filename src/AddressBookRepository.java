import java.util.*;

public class AddressBookRepository {
    ArrayList<String> addressBook = new ArrayList<>();
    List<PersonInformation> personInformationList = new ArrayList<>();
    HashMap<List<String>, List<PersonInformation>> map = new HashMap<>();

    public ArrayList<String> getAddressBooksObject() {
        return addressBook;
    }

    public void addList(String name) {
        if (addressBook.contains(name)) {
            System.out.println("Address Book Name Already exits");
        } else {
            addressBook.add(name);
        }
    }

    public void addContactList(PersonInformation personObject, int index) {

        if (map.containsKey(Arrays.asList(addressBook.get(index-1)))){
            System.out.println("1fhfhg");
            personInformationList = map.get(Arrays.asList(addressBook.get(index-1)));
            personInformationList.add(personObject);
            map.put(Arrays.asList(addressBook.get(index-1)), personInformationList);
        }else {
            List<PersonInformation> personInformationList = new ArrayList<>();
            personInformationList.add(personObject);
            map.put(Arrays.asList(addressBook.get(index-1)), personInformationList);
        }
    }
    public void show(){
        for (Map.Entry<List<String>, List<PersonInformation>> entry : map.entrySet()) {
            System.out.println("Address Book = "+entry.getKey()+""+entry.getValue());
        }
    }
    public void showAddressBook() {
        int i = 0;
        for (String show: addressBook) {
            System.out.print(" "+(i+1)+"] "+show);
            i++;
        }
        System.out.println("\nSelect Number (Example : 1)");
    }
}