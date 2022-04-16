package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"com.example.demo", "com.mj.librarymanagement","com.preeti","com.preeti.model","com.preeti.repository","com.preeti,service", "com.preeti.controller"})
public class Group5ProjectLibraryManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(Group5ProjectLibraryManagementApplication.class, args);
	}

}
