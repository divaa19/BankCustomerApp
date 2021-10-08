package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.jpa.model.Customer;
import com.customer.service.CustomerService;


@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/customers")
	private List<Customer> getAllCustomers()
	{
		return customerService.getAllCustomers();
	}
	
	@GetMapping("/customers/{id}")
	private Customer getCustomerById(@PathVariable(value="id") Integer id)
	{
		Customer customer = customerService.getCustomerById(id);
		return customer;
	}
	
		
	@PostMapping(value="/customers")
	private Customer addCustomer(@RequestBody Customer customer)
	{
		System.out.println("received new customer");
		customerService.insertCustomer(customer);
		System.out.println("inert successful");
		
	    return customer;
	}
	
	@PutMapping(value="/customers/{id}")
	private Customer updateCustomer(@PathVariable(value="id") Integer id, @RequestBody Customer customer)
	{
		System.out.println("received a customer for update");
		customerService.updateCustomer(id, customer);
		System.out.println("update successful");
		
	    return customer;
	}
	
	@DeleteMapping(value="/customers/{id}")
	private void deleteCustomer(@PathVariable(value="id") Integer id, @RequestBody Customer customer)
	{
		System.out.println("received a customer for update");
		customerService.deleteCustomer(id, customer);;
		System.out.println("update successful");
		
	}


}
