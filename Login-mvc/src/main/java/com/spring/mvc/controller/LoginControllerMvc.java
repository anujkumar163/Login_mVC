package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.spring.mvc.entity.Registermvc;
import com.spring.mvc.repository.RegisterRep;

@Controller
public class LoginControllerMvc {
	
	@Autowired
	private RegisterRep regrepo;

	RestTemplate restTemplate= new RestTemplate();;
	
	
	@RequestMapping("/")
	public String CheckMVC() {
		return "loginpage";
	}
	
	@RequestMapping("/login")
	public String loginHomePage(@RequestParam("username") String username,
			@RequestParam("password") String password , ModelMap model) {
		Registermvc u = null;
		try {
			 u = regrepo.findByUsername(username);
		}catch(Exception e) {
			System.out.println("user not found ");
			
		}
		if(u!= null) {
		model.addAttribute("username", username);
		return "homepage";
	}
		model.addAttribute("error", "user not found");
		return "loginpage";
	}
	
	@RequestMapping("/register")
	public String goToRegister() {
		return "registerpage";
	}
	
	@RequestMapping("/set-user")
	public String goToReisterMicroservice(@RequestParam("username") String username,
			@RequestParam("password1") String password1,
			@RequestParam("password2") String password2, ModelMap model) {
		//code to go to register microserviceto register user
		if(password1.equals(password2)) {
			restTemplate.getForObject("http://localhost:8081/register-user/"+username+"/"+password1, String.class);
			model.addAttribute("success", "successFull register");
		}else {
			model.addAttribute("register", "password not same");
		}
		return "loginpage";
	}
	
	
	
	
	
	
	
	
}
