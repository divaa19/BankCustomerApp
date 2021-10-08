package com.customer.jpa.model;

import javax.persistence.*;



@Entity
@Table(name="customer")
public class Customer {

	@Id
	private Integer accountid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="address")
	private String address;
	
	@Column(name="account_type")
	private String accountType;
	
	public Customer(){
		
		
	}
	/**
	 * @return the accountid
	 */
	public Integer getAccountid() {
		return accountid;
	}
	/**
	 * @param accountid the accountid to set
	 */
	public void setAccountid(Integer accountid) {
		this.accountid = accountid;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	
	
}
