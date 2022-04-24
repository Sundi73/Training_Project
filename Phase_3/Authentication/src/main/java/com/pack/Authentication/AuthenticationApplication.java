package com.pack.Authentication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import com.pack.Authentication.controllers.AuthenticationController;
import com.pack.Authentication.entities.User;
import com.pack.Authentication.exceptions.UserNotFoundException;
import com.pack.Authentication.services.AuthenticationService;
@SpringBootApplication
@Import({
      AuthenticationController.class,
      UserNotFoundException.class,
      AuthenticationService.class,
      User.class
})
public class AuthenticationApplication {
   public static void main(String[] args) {
      SpringApplication.run(AuthenticationApplication.class, args);
   }
