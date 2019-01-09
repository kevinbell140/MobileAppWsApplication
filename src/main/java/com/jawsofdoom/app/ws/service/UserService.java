package com.jawsofdoom.app.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.jawsofdoom.app.ws.shared.dto.UserDTO;

public interface UserService extends UserDetailsService {
	UserDTO createUser(UserDTO user);
}
