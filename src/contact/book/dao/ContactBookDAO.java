package contact.book.dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import contact.book.service.DatabaseConnection;
import contact.book.model.ContactInfo;
import java.util.ArrayList;

public class ContactBookDAO {

    public static int add(ContactInfo c) {
        Connection con = null;
        int x = -1;
        try {
            con = DatabaseConnection.getConnection();
            String quary = "create table if not exists contacts(insert into contacts(contact_name,contact_mobile,contact_email,contact_address) values(?,?,?,?))";

            PreparedStatement ps = con.prepareStatement(quary);

            ps.setString(1, c.getName());
            ps.setString(2, c.getMobile());
            ps.setString(3, c.getEmail());
            ps.setString(4, c.getAddress());

            x = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return x;
    }

    public static int update(ContactInfo c) {
        Connection con = null;
        int x = -1;
        try {
            con = DatabaseConnection.getConnection();
            String quary = "update contacts set contact_name = ?,contact_mobile = ?,contact_email = ?,contact_address = ? where contact_id = ?";

            PreparedStatement ps = con.prepareStatement(quary);

            ps.setString(1, c.getName());
            ps.setString(2, c.getMobile());
            ps.setString(3, c.getEmail());
            ps.setString(4, c.getAddress());
            ps.setInt(5, c.getId());

            x = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return x;
    }

    public static ArrayList<ContactInfo> view() {
        Connection con = null;
        ArrayList<ContactInfo> al = new ArrayList();
        try {
            con = DatabaseConnection.getConnection();
            String quary = "select * from contacts";

            PreparedStatement ps = con.prepareStatement(quary,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
            int id =  rs.getInt("contact_id");          
            String name = rs.getString("contact_name");
            String mobile = rs.getString("contact_mobile");
            String email = rs.getString("contact_email");
            String address = rs.getString("contact_address");
            ContactInfo c = new ContactInfo(id, name, mobile, email, address);
            al.add(c);
         }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return al;
    }

    public static int delete(int id) {
        Connection con = null;
        int x = -1;
        try {
            con = DatabaseConnection.getConnection();
            String quary = "delete from contacts where contact_id = ?";

            PreparedStatement ps = con.prepareStatement(quary);

            ps.setInt(1, id);

            x = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return x;
    }

}
