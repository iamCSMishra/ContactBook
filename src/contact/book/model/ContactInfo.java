package contact.book.model;

import java.util.Scanner;

public class ContactInfo {
    Scanner sc = new Scanner(System.in);

    private int id;
    private String name, mobile, email, address;

    public ContactInfo() {
        //degault constructor
    }

    public ContactInfo(String name, String mobile, String email, String address) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }
    
    public ContactInfo(int id, String name, String mobile, String email, String address) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

}
