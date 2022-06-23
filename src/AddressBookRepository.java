import java.util.*;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AddressBookRepository {
    List<PersonInformation> personInformationList = new ArrayList<>();
    Map<String, List<PersonInformation>> map = new TreeMap<>();
    Scanner scan = new Scanner(System.in);
    public Map<String, List<PersonInformation>> getAddressBooksObject() {
        return map;
    }

    public void addContactList(String name, PersonInformation personObject) {
        if (map.containsKey(name)) {
            personInformationList = map.get(name);
            long duplicate = personInformationList.stream()
                    .map(PersonInformation::getFirstName)
                    .filter(n -> n.equals(personObject.firstName))
                    .count();
            if (duplicate == 0) {
                personInformationList.add(personObject);
                map.put(name, personInformationList);
            } else {
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

    public void sortedName(){
        Map<String,List<PersonInformation>> sortedName = personInformationList
                                                                 .stream()
                                                                 .collect(Collectors
                                                                 .groupingBy(PersonInformation::getFirstName));
        System.out.println(sortedName);
    }

    public void searchCityOrState(String locationName) {
        personInformationList.stream()
                             .filter(n->n.city.contains(locationName)
                                     || n.state.contains(locationName))
                             .forEach(n-> System.out.println(" "+n.getFirstName()+" "+n.getLastName()
                                                                +"\t "+n.getPhoneNumber()
                                                                +"\t" +n.getCity()+" "+n.getState()
                                                                +"\n"));
        int count = (int) personInformationList.stream()
                                               .filter(n->n.city.contains(locationName)
                                                       || n.state.contains(locationName))
                                               .count();
        System.out.println("\n\t\t\tTotal = "+count);

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

    public void editContact(String name) {
    }

    public void handleDisplay() {
        Set<String> setKey = map.keySet();
        System.out.println(setKey);
        System.out.println("Choice Address Book");
        String name = scan.next();
        System.out.println(map.get(name));
    }
}