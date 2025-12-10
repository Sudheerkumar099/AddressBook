import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBook ab = new AddressBook();
        int temp = 1;
        while (temp != 0) {
            System.out.println("Choose one Option: ");
            System.out.println("Enter 1 to add new Contact");
            System.out.println("Enter 2 to Edit the existing  Contact");
            System.out.println("Enter 3 to Delete Contact");
            System.out.println("Enter 4 to Add Multiple Contacts");

            int n = sc.nextInt();
            if (n == 1) {
                ab.addNewContact();
                System.out.println(ab.contactlist);
            } else if (n == 2) {
                ab.editInformation(ab.contactlist);
            } else if (n == 3) {
                ab.deleteContact(ab.contactlist);
            }
            else if(n==4){
                ab.addMultipleContacts(ab.contactlist);
            }
            else {
                System.out.println("choose the correct Option");
            }

            System.out.println("to exit Enter zero in number format");
            sc.nextLine();
            temp++;
            temp = sc.nextInt();
        }
        sc.close();

    }
}
