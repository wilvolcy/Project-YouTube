package edu.mum.youtube.RestController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.mum.youtube.model.UserAccount;
import edu.mum.youtube.services.UserService;


 

//import org.springframework.web.bind.annotation.RestController;

@Controller 
public class ControllerClass {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/home")
	public String Welcome(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
		return "home";
	}
	
	@RequestMapping("/register")
	public String registration(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_REGISTER");
		return "home";
	}
	
	@PostMapping("/save-user")
	public String registerUser(@ModelAttribute UserAccount user, BindingResult bindingResult, HttpServletRequest request) {
		userService.saveMyUser(user);
		request.setAttribute("mode", "MODE_HOME");
		return "home";
	}
	
}
