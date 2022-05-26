import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println(":: WELCOME TO ADDRESS BOOK PROGRAM ::");
        PersonInfo person = new PersonInfo();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1] ADD PERSON INFORMATION");
            System.out.println("2] HISTORY");
            System.out.println("3] Exit");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    person.addPerson();
                    break;
                case 2:
                    person.display();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
