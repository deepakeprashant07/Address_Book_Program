import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println(":: WELCOME TO ADDRESS BOOK PROGRAM ::");
        PersonInfo person = new PersonInfo();
        String name;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1] ADD PERSON INFORMATION");
            System.out.println("2] EDIT PERSON INFORMATION");
            System.out.println("3] HISTORY");
            System.out.println("4] Exit");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    person.addPerson();
                    break;
                case 2:
                    System.out.println("ENTER PERSON NAME");
                    name = scan.next();
                    person.editInformation(name);
                    break;
                case 3:
                    person.display();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
