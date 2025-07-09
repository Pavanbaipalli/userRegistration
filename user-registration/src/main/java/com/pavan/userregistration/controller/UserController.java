package com.pavan.userregistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pavan.userregistration.model.User;
import com.pavan.userregistration.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/")
	public String showForm(Model model) {
		model.addAttribute("user", new User());
		return "register";// Tells Spring to render register.html from src/main/resources/templates
	}
	
	@PostMapping("/register")
	public String registerUser(@ModelAttribute("user") User user,Model model) {
		userRepository.save(user);
		model.addAttribute("message","You have registered successfully!") ;
		return "success";
	}

}
