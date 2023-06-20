package com.application.model;

public class User {
    private String name;
    private int age;
    private Address address;
    private ContactInfo contactInfo;

    // Constructors
    public User() {
        // Default constructor
    }

    public User(String name, int age, Address address, ContactInfo contactInfo) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactInfo = contactInfo;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + ", address=" + address + ", contactInfo=" + contactInfo + "]";
    }
}
