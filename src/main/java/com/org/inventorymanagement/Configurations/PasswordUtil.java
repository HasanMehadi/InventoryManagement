package com.org.inventorymanagement.Configurations;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtil {

    static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static String passwordHash(String password){

        return encoder.encode(password);
    }
}
