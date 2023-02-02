package com.example.domes.repository;

import com.example.domes.beans.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    @Query("Select u from User u where u.loginUser = :loginUser and u.passwordUser = :passwordUser")
    public User loginVerif(@Param("loginUser") String login, @Param("passwordUser") String password);
}
