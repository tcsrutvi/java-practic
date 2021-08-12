package com.tcs.autoboxing;

public class AutoBoxingDemo {
	public static void main(String[] args) {
		int a = 1; //primitive
		Integer ref = a; //object
		int b = ref;
		System.out.println(a == ref);
		System.out.println(a == b);
	}
}