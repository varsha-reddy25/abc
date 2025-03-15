package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.entity.User;
import com.test.service.UserService;

import jakarta.validation.Valid;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	public void setService(UserService service) {
		this.service = service;
	}

	@GetMapping("/")
	public String homePage()
	{
		return "home";
	}
	
	@GetMapping("/userform")
	public String registerForm(Model model, User user)
	{
		model.addAttribute("user", user);
		
		return "register";
	}
	
	@PostMapping("/userregister")
	public String SubmitUserForm(
			@Valid 
			@ModelAttribute("user") User user, 
			BindingResult bindingResult, Model model)
	{
		if(bindingResult.hasErrors())
		{
			return "register";
		}
		
		boolean validateCity = service.validateCity(user);
		
		if(validateCity)
		{
			String msg = "Please check your From and To city";
			
			model.addAttribute("user", msg);
			
			return "error";
		}
		service.reservationRequest(user);
		return "success";
	}
}
