package com.application.model;

public class ContactInfo {
    private String email;
    private String phoneNumber;

    // Constructors
    public ContactInfo() {
        // Default constructor
    }

    public ContactInfo(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "ContactInfo [email=" + email + ", phoneNumber=" + phoneNumber + "]";
    }
}
