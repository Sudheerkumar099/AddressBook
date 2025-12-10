import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
public ArrayList<Contact> contactlist=new ArrayList<Contact>();
    public static void main(String[] args) {
        AddressBook ab= new AddressBook();
        ab.addNewContact();
        System.out.println(ab.contactlist);
    }
    public void addNewContact(){
        Scanner sc = new Scanner(System.in);
        String firstName="";
        String lastName="";
        String address="";
        String city="";
        String state="";
        int zip=0;
        long phoneNumber=0;
        String email="";
        Contact c;
//      new Contact("sudheer","tatannagari","tirupati","tirupati","andhra",517501,456789,"tsudheerkumar09@gmail.com");
        System.out.println("Enter your First Name: ");
        firstName=sc.nextLine();
        System.out.println("Enter your  Last Name: ");
        lastName=sc.nextLine();
        System.out.println("Enter your  Address: ");
        address=sc.nextLine();
        System.out.println("Enter your City: ");
        city=sc.nextLine();
        System.out.println("Enter your State: ");
        state=sc.nextLine();
        System.out.println("Enter your Zip: ");
        zip=sc.nextInt();

        System.out.println("Enter your Phone Number: ");
        phoneNumber=sc.nextLong();
        sc.nextLine();
        System.out.println("Enter your Email:  ");
        email=sc.nextLine();
        Contact a= new Contact(firstName,lastName,address,city,state,zip,phoneNumber,email);
        contactlist.add(a);
        System.out.println( "added Successfully");
        sc.close();
    }
}
