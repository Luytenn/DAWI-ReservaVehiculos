package org.alquilerautos.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import org.alquilerautos.model.User;
import org.alquilerautos.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
