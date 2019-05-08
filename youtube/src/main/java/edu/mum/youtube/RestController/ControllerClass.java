package edu.mum.youtube.RestController;

import org.springframework.stereotype.Controller;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

 

//import org.springframework.web.bind.annotation.RestController;

@Controller 
public class ControllerClass {
	
	@RequestMapping("/welcome")
	public String Hello() {
		return "home";
	}
}
