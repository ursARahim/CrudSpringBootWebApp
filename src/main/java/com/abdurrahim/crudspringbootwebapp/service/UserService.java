package com.abdurrahim.crudspringbootwebapp.service;

import com.abdurrahim.crudspringbootwebapp.model.User;
import com.abdurrahim.crudspringbootwebapp.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
