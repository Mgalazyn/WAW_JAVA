package com.application;

import com.application.model.User;
import com.application.model.Address;
import com.application.model.ContactInfo;
import com.application.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        // Create Address object
        Address address = new Address("123 Street", "City", "State", "12345");

        // Create ContactInfo object
        ContactInfo contactInfo = new ContactInfo("john.doe@example.com", "123-456-7890");

        // Create User object
        User user = new User("John Doe", 25, address, contactInfo);

        UserService userService = new UserService();
        userService.addUser(user);

        logger.info("Application is running");
    }
}
