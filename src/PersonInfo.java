import java.util.Scanner;

public class PersonInfo {
    public String firstName, lastName, address, city, state;
    public String zip, phoneNumber, emailId;

    public void addPerson() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER PERSON FIRST NAME AND LAST NAME");
        firstName = scan.next();
        lastName = scan.next();
        System.out.println("ENTER ADDRESS AND CITY NAME");
        address = scan.next();
        city = scan.next();
        System.out.println("ENTER STATE AND ZIP");
        state = scan.next();
        zip = scan.next();
        System.out.println("ENTER PERSON PHONE NUMBER");
        phoneNumber = scan.next();
        System.out.println("ENTER PERSON EMAIL ID");
        emailId = scan.next();
    }

    public void display() {
        System.out.println("PERSON NAME = " + firstName + " " + lastName);
        System.out.println("PERSON ADDRESS = " + address + " " + city + " " + state + " " + zip);
        System.out.println("PERSON PHONE NUMBER = " + phoneNumber + "\nEMAIL ID = " + emailId);
    }
}
