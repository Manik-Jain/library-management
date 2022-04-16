package com.group5.librarymanagement.controller;

import org.springframework.ui.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.group5.librarymanagement.model.IssueBooks;
import com.group5.librarymanagement.services.IssueService;

@RestController
public class IssueController {
	
	@Autowired
	IssueService issueService;
	
	@PostMapping("/issue")
	public String IssueBook(IssueBooks i, Model model){
		System.out.println(i);
		IssueBooks issueBooks = issueService.newIssue(i);
		model.addAttribute("issued", issueBooks);
		return "issued";
	}
	
	@PutMapping("/return/{id}")
	public String returnBook(@PathVariable Long id, Model model) {
		IssueBooks returnedBook =  issueService.returnBook(id);
		model.addAttribute("returned", returnedBook);
		return "returned";
	}
	
//	@PostMapping("/issue")
//	public IssueBooks IssueBook(@RequestBody IssueBooks i){
//		IssueBooks issueBooks = issueService.newIssue(i);
//		return issueBooks;
//	}
//	
//	@PutMapping("/return/{id}")
//	public IssueBooks returnBook(@PathVariable Long id, Model model) {
//		IssueBooks returnedBook =  issueService.returnBook(id);
//		return returnedBook;
//	}
}
