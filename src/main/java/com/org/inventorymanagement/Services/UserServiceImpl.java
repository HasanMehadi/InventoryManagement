package com.org.inventorymanagement.Services;

import com.org.inventorymanagement.Configurations.PasswordUtil;
import com.org.inventorymanagement.Models.User;
import com.org.inventorymanagement.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User save(User user) {

        System.out.println("user service impl called to save user to data base");

        System.out.println(user);
        System.out.println("<------------------------>");
        String password = PasswordUtil.passwordHash(user.getPassword());
        user.setPassword(password);
        user.setCreatedDate(new Date());
        System.out.println(user);
        System.out.println("<------------------------>");
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {

        System.out.println("all user list controller called");
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmailIgnoreCase(email);
    }
}
