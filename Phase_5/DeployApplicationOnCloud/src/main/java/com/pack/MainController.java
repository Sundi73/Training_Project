package com.pack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/hello")
	public String welcome() {
		return "Welcome to AWS first deployment";
		
	}
	
	@GetMapping("/greeting")
	public String greeting() {
		return "Welcome to greeting page";
	}
}
