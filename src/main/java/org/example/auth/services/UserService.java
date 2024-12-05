package org.example.auth.services;


import org.example.model.dto.AuthenticatedUserDto;
import org.example.model.dto.RegistrationRequest;
import org.example.model.dto.RegistrationResponse;
import org.example.model.model.User;

public interface UserService {

	User findByUsername(String username);

	RegistrationResponse registration(RegistrationRequest registrationRequest);

	AuthenticatedUserDto findAuthenticatedUserByUsername(String username);

}
