package com.tcs.set.examples;

import java.util.Comparator;

public class User implements Comparable<User>{

	private String name; 
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [age=" + age + "]";
	}
	
	@Override
	public int compareTo(User user) {
		return user.getAge() - this.getAge();
	}
	
}
