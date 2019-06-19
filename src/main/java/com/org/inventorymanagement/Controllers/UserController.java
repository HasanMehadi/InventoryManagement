package com.org.inventorymanagement.Controllers;

import com.org.inventorymanagement.Entities.User;
import com.org.inventorymanagement.Services.Users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<User>> getAllUser() {

        System.out.println("User controller called to see all users");

        List<User> users = userService.findAll();

        return new ResponseEntity<List<User>>(users, HttpStatus.OK);

    }

    @GetMapping("/getuser")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<User> getUser(Principal principal) {

        System.out.println("User controller called to see all users");

        User user = userService.getUserByEmail(principal.getName());

        return new ResponseEntity<User>(user, HttpStatus.OK);

    }
}
