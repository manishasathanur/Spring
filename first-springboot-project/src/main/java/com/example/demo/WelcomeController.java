package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//incoming requests are handled by controller.
@RestController
public class WelcomeController {
	//auto wiring
	@Autowired
	private WelcomeService service;
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to my spring learnings... " + service.retrieveWelcomeMessage();
		
	}

}
//Manage and create an instance 
@Component
 class WelcomeService{
	public String retrieveWelcomeMessage() {
		return "Happy learning. Have fun !!!";
	}
}
