package com.org.inventorymanagement.Controllers;


import com.org.inventorymanagement.Configurations.Response;
import com.org.inventorymanagement.Services.UserService;
import com.org.inventorymanagement.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PreLoginController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/registration")
    public ResponseEntity<Response> registration(@RequestBody User user){

        System.out.println("pre login controller called for registration ");

        User dbUser = userService.save(user);

        System.out.println(dbUser.toString());

        if(dbUser != null){
            return new ResponseEntity<Response>(new Response("User Is saved Successfully"), HttpStatus.OK);
        }

        System.out.println("User Saved Failed");

        return null;
    }
}
