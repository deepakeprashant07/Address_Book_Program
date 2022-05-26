import java.util.ArrayList;
import java.util.Scanner;

public class PersonInfo {
    public String firstName, lastName, address, city, state;
    public String zip, phoneNumber, emailId;
    ArrayList<PersonInfo> person = new ArrayList<PersonInfo>();

    public void addPerson() {
        PersonInfo p = new PersonInfo();
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER PERSON FIRST NAME AND LAST NAME");
        p.firstName = scan.next();
        p.lastName = scan.next();
        System.out.println("ENTER ADDRESS AND CITY NAME");
        p.address = scan.next();
        p.city = scan.next();
        System.out.println("ENTER STATE AND ZIP");
        p.state = scan.next();
        p.zip = scan.next();
        System.out.println("ENTER PERSON PHONE NUMBER");
        p.phoneNumber = scan.next();
        System.out.println("ENTER PERSON EMAIL ID");
        p.emailId = scan.next();
        person.add(p);
    }

    public void display() {
        for (int i = 0; i < person.size(); i++) {
            System.out.println("PERSON NAME = " + person.get(i).firstName + " " + person.get(i).lastName);
            System.out.println("PERSON ADDRESS = " + person.get(i).address + " " + person.get(i).city + " " + person.get(i).state + " " + person.get(i).zip);
            System.out.println("PERSON PHONE NUMBER = " + person.get(i).phoneNumber + "\nEMAIL ID = " + person.get(i).emailId);
            System.out.println("\n!--------------------------------------------------------------------!");
        }
    }
}
