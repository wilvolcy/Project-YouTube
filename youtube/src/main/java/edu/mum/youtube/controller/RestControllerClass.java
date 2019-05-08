package edu.mum.youtube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.youtube.model.UserAccount;
import edu.mum.youtube.services.UserService;

@RestController
public class RestControllerClass {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String hello() {
		return "Home page test";
	}
	
	@GetMapping("save-user")
	public String saveUser( @RequestParam String username,@RequestParam String  password, @RequestParam String email) {
		UserAccount user = new UserAccount( username, password, email);
		userService.saveMyUser(user);
		return "User saved";
	}
	
	
}
