package com.tcs.listdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> numbers = createList();
		createList();
		System.out.println(numbers);
		numbers.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}

		});
		System.out.println("after sorting numbers:");
	}

	private static List<Integer> createList() {
		List<Integer> numbers = new ArrayList<Integer>();// Generics
		numbers.add(1);// autoboxing
		// number.add("Ram"); //string is not allowed
		System.out.println(numbers.get(0));
		for (int count = 0; count < 20; count++) {
			numbers.add(count);
		}
		return numbers;
	}
}
