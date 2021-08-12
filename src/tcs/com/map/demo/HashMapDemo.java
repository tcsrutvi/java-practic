package tcs.com.map.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		createHashMap();
		
	}

	private static void createHashMap() {
	
		Map<String, Float> mathScores = new HashMap<String, Float> ();
		for (int i = 0; i < 20; i++) {
			mathScores.put("student" + i,new Float( 100 * Math.random()));
			
		}
		System.out.println(mathScores);
	}
}
