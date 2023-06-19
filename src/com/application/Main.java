package com.application;

import com.application.model.User;
import com.application.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    
    public static void main(String[] args) {
        User user = new User("John Doe", 25);
        UserService userService = new UserService();
        userService.addUser(user);
        
        logger.info("Application is running");
    }
}
