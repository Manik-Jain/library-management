package com.preeti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.preeti.models.IssueBooks;
import com.preeti.service.IssueService;

@Controller
public class IssueController {
	
	@Autowired
	IssueService issueService;
	
	@PostMapping("/issue")
	public String IssueBook(IssueBooks i)
	{
		String issue= issueService.newIssue(i);
		return "showbook";
	}
	
	@PostMapping("/return")
	public String returnBook(IssueBooks i) {
		String issue =issueService.returnBook(i);
		return "showbook";
	}

}
