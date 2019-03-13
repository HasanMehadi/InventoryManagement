package com.org.inventorymanagement.Configurations;

import com.org.inventorymanagement.Entities.JwtUser;
import com.org.inventorymanagement.Entities.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JwtUserFactory {

    public static JwtUser createUser(User user){

        System.out.println("Jwt user Create called");

        return new JwtUser(user.getId() ,user.getEmail(), user.getPassword(),user,maptoGrantedAuthorities(new ArrayList<String>(Arrays.asList("ROLE_"+user.getRole()))),user.isEnabled());
    }

    private static List<GrantedAuthority> maptoGrantedAuthorities(List<String> authorities){

        return authorities.stream().map(Authority-> new SimpleGrantedAuthority(Authority)).collect(Collectors.toList());
    }
}
