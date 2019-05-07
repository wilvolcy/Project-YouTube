package edu.mum.youtube.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {

	@RequestMapping("/")
	public String hello() {
		return "Home page test";
	}
	
	@GetMapping("save-user")
	public String saveUser(@) {
		
		return "User saved";
	}
}
