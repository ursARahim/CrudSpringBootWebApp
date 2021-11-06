package com.abdurrahim.crudspringbootwebapp.repository;

import com.abdurrahim.crudspringbootwebapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
}
