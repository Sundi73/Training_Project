package com.pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan("com.pack")

public class DeployApplicationOnCloudApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(DeployApplicationOnCloudApplication.class, args);
	}

}
