package com.org.inventorymanagement.Services;

import com.org.inventorymanagement.Models.User;

import java.util.List;

public interface UserService {

    public User save(User user);
    public List<User> findAll();
    public User getUserByEmail(String email);
}
