package com.customer.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.customer.jpa.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	@Query(value="select max(accountid) from Customer")
	public Integer maxAccountId();
	
}
