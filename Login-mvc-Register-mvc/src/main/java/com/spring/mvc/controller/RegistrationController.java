package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mvc.entity.Registermvc;
import com.spring.mvc.repository.RegisterRep;

@RestController
public class RegistrationController {
	
	@Autowired
	private RegisterRep regrepo;
	
	@RequestMapping("/check")
	public String registerCheck() {
		
		return "check register";
	}
	
	@RequestMapping("/register-user/{username}/{password}/{email}")
	public String registerUser(@PathVariable("username") String username,
			@PathVariable("password") String password) {
		Registermvc r = new Registermvc();
		r.setId(1);
		r.setUsername(username);
		r.setPassword(password);
		regrepo.save(r);
		return "Successfully registered!!";
	}
	
}
