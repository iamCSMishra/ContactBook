package contact.book.model;

import contact.book.dao.ContactBookDAO;
import java.util.Scanner;

public class ContactAdd {
    Scanner sc = new Scanner(System.in);

    public void add() {
        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        System.out.println("Enter Email ID: ");
        String email = sc.nextLine();

        System.out.println("Enter Address: ");
        String address = sc.nextLine();

        ContactInfo c = new ContactInfo(name, mobile, email, address);

        if (ContactBookDAO.add(c)!= -1) {
            System.out.println("Record Inserted...");
        } else {
            System.out.println("Oops!  something went wrong...");
        }
    }
}
