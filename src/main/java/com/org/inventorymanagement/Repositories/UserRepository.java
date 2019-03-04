package com.org.inventorymanagement.Repositories;

import com.org.inventorymanagement.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

    User findByEmailIgnoreCase(String username);
}
