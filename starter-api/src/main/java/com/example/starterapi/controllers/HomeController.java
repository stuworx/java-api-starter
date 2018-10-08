package com.example.starterapi.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import models.Customer;
import services.users.UserService;

@RestController
public class HomeController {

	private static final Logger log = LoggerFactory.getLogger(HomeController.class);

	@GetMapping("/")
	public int[] getNumbers() {
		int[] i = { 1, 2, 3 };
		return i;
	}

	@GetMapping("/users")
	public List<Customer> getCustomers() {
		log.info("in getCustomer");
		return new UserService().GetCustomers();
	}
}
