package com.pack.Authentication.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pack.Authentication.entities.User;
import com.pack.Authentication.exceptions.UserNotFoundException;
import com.pack.Authentication.repositories.AuthenticationRepository;
@Service
public class AuthenticationService {
@Autowired
	AuthenticationRepository authRepo;
	public User GetUserByName(String name) {
		Optional<User> found = authRepo.findUserByName(name);
		if(found.isPresent()) return found.get();
		else throw new UserNotFoundException();
	}
public Boolean isValidPassword(String cmp, String actual) {
	return ((cmp.equals(actual)) ?  true :  false);	
}	}