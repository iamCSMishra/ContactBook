package contact.book.model;
import contact.book.dao.ContactBookDAO;
import java.util.ArrayList;
public class ContactView {
    public void view(){
        ArrayList<ContactInfo>al = ContactBookDAO.view();
        if(al.size()!=0){
            for(ContactInfo c :  al){
                System.out.println(c.getId()+"\t"+c.getName()+"\t"+c.getMobile()+"\t"+c.getEmail()+"\t"+c.getAddress());
            }
        }
    }
}
