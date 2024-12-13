package com.mycompany.trafficmanagementsystem;

public class Person {
    private String ID;
    private String name;
    private String contactInfo;
    private String password;
    
    public Person(){}
    public Person(String ID, String name, String contactInfo, String password) {
        this.ID = ID;
        this.name = name;
        this.contactInfo = contactInfo;
        this.password = password;
    }



    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    

}