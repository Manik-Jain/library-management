package com.group5.librarymanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.group5.librarymanagement.entity.User;
import com.group5.librarymanagement.input.RawBook;
import com.group5.librarymanagement.model.Book;
import com.group5.librarymanagement.repositories.BookRepository;
import com.group5.librarymanagement.repositories.UserRepository;
import com.group5.librarymanagement.services.BookService;



@Controller
public class AppController {

	@Autowired
	private UserRepository userRepo;
	
	
	
	@GetMapping("")
	public String displayMainPage() {
		return "index";
	}
	
	@GetMapping("/register")
	public String displayRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		return "registrationForm";
	}
	
	@PostMapping("/process_register")
	public String processRegister(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		
		userRepo.save(user);
		
		return "registerSuccess";
	}
	
	@GetMapping("/home")
	public String displayHomePage() {
		return "index";
	}
	
//	
//	@PostMapping("/register_user")
//	public String registerUser(User user) {
//		userRepo.save(user);
//		return "registerSuccess";
//	}
	
	
}
