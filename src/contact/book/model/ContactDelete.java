package contact.book.model;

import contact.book.dao.ContactBookDAO;
import java.util.Scanner;

public class ContactDelete {

    Scanner sc = new Scanner(System.in);

    public void delete() {
        System.out.println("Enter ID: ");
        int id = sc.nextInt();

        ContactInfo c = new ContactInfo();
        c.setId(id);
        if (ContactBookDAO.delete(id) != -1) {
            System.out.println("Record Inserted...");
        } else {
            System.out.println("Oops!  something went wrong...");
        }
    }
}
