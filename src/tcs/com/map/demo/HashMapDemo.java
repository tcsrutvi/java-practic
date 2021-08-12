package tcs.com.map.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
//student - marks for Math, Biology, physics 
public class HashMapDemo {
	public static void main(String[] args) {
//		createHashMap();
		treeMap();
	}

	private static void treeMap() {
		Map<Integer, Float> mathScores = new TreeMap<Integer, Float>();
		for (int i = 0; i < 20; i++) {
			mathScores.put( i, new Float(100 * Math.random()));
		}
		System.out.println(mathScores);
	}

	private static void createHashMap() {
		Map<String, Float> mathScores = new HashMap<String, Float>();
		for (int i = 0; i < 20; i++) {
			mathScores.put("student" + i, new Float(100 * Math.random()));
		}
		boolean exists = mathScores.containsKey("student1");
		System.out.println(exists);
//		mathScores.containsValue(value)
		mathScores.put("student1", 34F);
		mathScores.remove("student1");
		System.out.println(mathScores);
	}
}