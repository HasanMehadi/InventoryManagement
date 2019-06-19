package com.org.inventorymanagement.Services.Users;

import com.org.inventorymanagement.Entities.User;

import java.util.List;

public interface UserService {

    public User save(User user);
    public List<User> findAll();
    public User getUserByEmail(String email);
}
