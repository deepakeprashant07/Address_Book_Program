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
            System.out.println("3] DELETE PERSON INFORMATION");
            System.out.println("4] HISTORY");
            System.out.println("5] Exit");
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
                    System.out.println("ENTER PERSON NAME");
                    name = scan.next();
                    person.deleteInformation(name);
                    break;
                case 4:
                    person.display();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
