
package contact.book.main;

import java.util.Scanner;
import contact.book.model.ContactAdd;
import contact.book.model.ContactUpdate;
import contact.book.model.ContactView;
import contact.book.model.ContactDelete;

public class ContactBook {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean status = true;
        while(status){
            System.out.println("Enter Your Choice:\n  For Add Contact Enter 1 \n  For update Contact Enter 2 \n  For View Contact Enter 3 \n  For Delete Contact Enter 4 \n  For Exit Enter 5");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                ContactAdd ca = new ContactAdd();
                ca.add();
                break;
            case 2:
                ContactUpdate cu = new ContactUpdate();
                cu.update();
                break;
            case 3:
                ContactView cv = new ContactView();
                cv.view();
                break;
            case 4:
                 ContactDelete cd = new ContactDelete();
                 cd.delete();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Invalid Choice! Try Again...");
        }
        }
    }
}
