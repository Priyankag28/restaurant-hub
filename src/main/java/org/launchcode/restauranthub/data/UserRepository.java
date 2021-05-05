package org.launchcode.restauranthub.data;

import org.launchcode.restauranthub.models.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User,Integer> {
    User findByUsername(String username);
}
