import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println(":: WELCOME TO ADDRESS BOOK PROGRAM ::");
        PersonInfo person = new PersonInfo();
        person.addPerson();
        person.display();
    }
}
