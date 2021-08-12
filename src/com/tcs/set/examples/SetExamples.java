package com.tcs.set.examples;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {

	public static void main(String[] args) {
		demo1();
	}

	private static void demo1() {
		Set<User> users = createSet();
		System.out.println(users);
		
		User userwithSameAge =new User();
		userwithSameAge.setAge(10);
		users.add(userwithSameAge);
		System.out.println(users);
	}

	private static Set<User> createSet() {
		Set <User> users = new HashSet<User>();
		for (int i = 0; i < 20; i++) {
			User user = new User();
			user.setAge(10 + i);
			users.add(user);	
		}
		return users;
	}
	
}
