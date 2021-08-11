package com.tcs.entity;

public class User {
	private String name;
	private Long mobileNumber;
	//beginner, intermediate, export
	private ROLE role;
	private byte age; // data encapsulation
	//constructor
	
	public void workout() {
		System.out.println(name + " is working out..");
	}
//custom constructor
	public User(String name, Long mobileNumber, byte age) {
		this(name, mobileNumber);
		this.age = age;
	}
//overloaded construtor
	public User(String name, Long mobileNumber) {
		super();//call super class constructor
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[name=" + name + "]";
	}
}