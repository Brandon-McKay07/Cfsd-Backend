package com.instaverse.estore.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FrontendController {

	
	@GetMapping("/")
	public String indexMapping() {
		return "Hello, Spring Server is up and running";
	}
	
	@GetMapping("/greetings")
	public String greetingMapping(@RequestParam("status") String status) {
		return status +  " how are you?";
		

	}
	
	@GetMapping("/user")
	public Map<String, String> userMapping(@RequestParam(name="username", required = false , defaultValue = "Brandon")String username, @RequestParam(name="password", required = false, defaultValue = "DoBetterB") String password) {
		Map<String, String> userMap = new HashMap<String, String>();
		userMap.put("username", username);
		userMap.put("password", password);
		return userMap; 
	}
	
}
