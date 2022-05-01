package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class MySpringWebApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(MySpringWebApp1Application.class, args);
	}

}
