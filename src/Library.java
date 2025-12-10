import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Library {

    private Map<String, AddressBook> addressBookMap = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    public void addAddressBook() {
        System.out.println("Enter a Unique Address Book Name:");
        String name = sc.nextLine();
        if (addressBookMap.containsKey(name)) {
            System.out.println("Address Book already exists!");
            return;
        }
        addressBookMap.put(name, new AddressBook());
        System.out.println("Address Book Added");
    }




}
