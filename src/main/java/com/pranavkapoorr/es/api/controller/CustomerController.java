package com.pranavkapoorr.es.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pranavkapoorr.es.api.model.Customer;
import com.pranavkapoorr.es.api.repository.CustomerRepository;

@RestController
public class CustomerController {
	@Autowired
	private CustomerRepository repository;
	
	@PostMapping("/customer")
	public int saveCustomer(@RequestBody List<Customer> customers) {
		repository.save(customers);
		return customers.size();
	}

	@GetMapping("/customers")
	public List<Customer> findAllCustomers() {
		List<Customer> list = new ArrayList<>();
		repository.findAll().forEach(list::add);
		return list;
	}

	@GetMapping("/customer/{firstName}")
	public List<Customer> findByFirstName(@PathVariable String firstName) {
		return repository.findByFirstname(firstName);
	}

}
