package com.org.inventorymanagement.Controllers;


import com.org.inventorymanagement.Configurations.Response;
import com.org.inventorymanagement.Services.UserService;
import com.org.inventorymanagement.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class PreLoginController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "registration")
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

    @GetMapping(value = "checkEmail")
    public ResponseEntity<Response> checkEmail(@RequestParam("email") String email){

        User user = null;

        System.out.println("Email check controller called to check email");

       try{
           user = userService.getUserByEmail(email);
           if(user == null){
               return new ResponseEntity<Response>(new Response("false"), HttpStatus.OK);
           }else {
               return new ResponseEntity<Response>(new Response("true"), HttpStatus.OK);
           }

       }catch (Exception ex){
           System.out.println(ex.getCause().getMessage());
           return new ResponseEntity<Response>(new Response("false"), HttpStatus.BAD_REQUEST);
       }

    }
}
