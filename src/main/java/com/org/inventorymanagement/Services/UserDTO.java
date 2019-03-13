package com.org.inventorymanagement.Services;

import com.org.inventorymanagement.Entities.User;

public class UserDTO {

    private User user;
    private String token;

    public UserDTO(User user, String token) {
        this.user = user;
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
