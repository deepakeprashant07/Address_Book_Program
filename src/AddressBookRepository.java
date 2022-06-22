import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AddressBookRepository {
    List<PersonInformation> personInformationList = new ArrayList<>();
    Map<String, List<PersonInformation>> map = new HashMap<>();
    public Map<String, List<PersonInformation>> getAddressBooksObject() {
        return map;
    }

    public void addContactList(String name , PersonInformation personObject) {
        if (map.containsKey(name)) {
            personInformationList = map.get(name);
            long duplicate = personInformationList.stream()
                                                  .map(PersonInformation::getFirstName)
                                                  .filter(n->n.equals(personObject.firstName))
                                                  .count();
            if (duplicate == 0) {
                personInformationList.add(personObject);
                map.put(name, personInformationList);
            }else {
                System.out.println("Person name already exits");
            }
        } else {
            List<PersonInformation> personInformationList = new ArrayList<>();
            personInformationList.add(personObject);
            map.put(name, personInformationList);
        }
    }


    public void show() {
        for (Map.Entry<String, List<PersonInformation>> entry : map.entrySet()) {
            System.out.println("Address Book = " + entry.getKey() + "" + entry.getValue());
        }
    }

    public void editContact(String name) {
    }

    public void removeContact(String name) {
        for (int i = 0; i < personInformationList.size(); i++) {
            if (name.equals(personInformationList.get(i).firstName)) {
                System.out.println("DELETED ALL INFORMATION " + personInformationList.get(i).firstName
                        + " " + personInformationList.get(i).lastName);
                personInformationList.remove(i);
                break;
            }
        }
        System.out.println("Name Does Not Exist");
    }
}