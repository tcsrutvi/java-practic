package com.tcs.entity;

public class User {

	private String name;
	private Long mobileNumber;
	private byte age;

	// Keeping private to ensure data encapsulation
	public void workout() {
		System.out.println(name + "is working out");

	}
	

	public User(String name, Long mobileNumber, byte age) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.age = age;
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
		return "User [name=" + name + "]";
	}

}
