package com.mj.librarymanagement.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HealthController {
	
	@RequestMapping("/health")
    @ResponseBody
	public String health() {
		return "App is up and running";
	}

}
