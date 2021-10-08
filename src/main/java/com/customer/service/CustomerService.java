package com.customer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.customer.jpa.model.Customer;
import com.customer.jpa.repository.CustomerRepository;


@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers()
	{
		List<Customer> customers = new ArrayList<Customer>();
		customers = customerRepository.findAll();		
		return customers;
	}
	
	public Customer getCustomerById(Integer id)
	{
		return customerRepository.findById(id).orElse(null);
	}
	
		
	public Integer updateCustomer(int id, Customer customer)
	{
		
		Customer customerFound = customerRepository.findById(id).orElse(null);
		if(customerFound==null)
		{
			System.out.println("Customer not found");
			return null;
		}
		else
		{
			System.out.println("Customet  found");
			customerFound.setName(customer.getName());
			customerFound.setAge(customer.getAge());
			customerFound.setAddress(customer.getAddress());
			customerFound.setAccountType(customer.getAccountType());
			customerRepository.save(customerFound);
			return new Integer(1);
		}
		
		
	}
	
	public void deleteCustomer(int id, Customer customer)
	{
			customerRepository.deleteById(id);
	}
	
	public Integer insertCustomer(Customer customer)
	{
		Integer id = customerRepository.maxAccountId()+1;
		customer.setAccountid(id);
		customerRepository.save(customer);
		return customer.getAccountid();
		
	}

}
