import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    String firstName="";
    String lastName="";
    String address="";
    String city="";
    String state="";
    int zip=0;
    long phoneNumber=0;
    String email="";
public ArrayList<Contact> contactlist=new ArrayList<Contact>();
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        AddressBook ab= new AddressBook();
        int temp=1;
       while(temp!=0) {
           System.out.println("Choose one Option: ");
           System.out.println("Enter 1 to add add new Contact");
           System.out.println("Enter 2 to Edit the existing  Contact");
           int n=sc.nextInt();
           if (n == 1) {
               ab.addNewContact();
               System.out.println(ab.contactlist);
           } else if (n == 2) {
               ab.editInformation(ab.contactlist);
           }
           else{
               System.out.println("choose the correct Option");
           }

           System.out.println("to exit Enter zero in number format");
           sc.nextLine();
           temp++;
           temp=sc.nextInt();
       }
sc.close();

    }
    public void  addNewContact(){
        Scanner sc = new Scanner(System.in);
//        String firstName="";
//        String lastName="";
//        String address="";
//        String city="";
//        String state="";
//        int zip=0;
//        long phoneNumber=0;
//        String email="";
        Contact c;
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

    }
    public void editInformation(List<Contact> contactList){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Contact Name");
        String name= sc.nextLine();
        for(Contact contact: contactList){
            if(contact.getFirstName().equalsIgnoreCase(name)){
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
            }
            else if(!contact.getFirstName().equalsIgnoreCase(name)) {
                System.out.println("Please enter the correct Contact name ");
            }
        }
    }

}
