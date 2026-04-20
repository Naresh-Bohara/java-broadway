package javacollection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {

//		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map = new TreeMap<>();

		// adding data
		map.put("Math", 90);
		map.put("Science", 85);
		map.put("English", 88);

		// print map
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());

		// get value
		System.out.println("Marks in Math: " + map.get("Math"));
		
		for(String key: map.keySet()) {
			System.out.println(key+" = "+ map.get(key));
		}
		
		int total = 0;
		for(int m: map.values()) {
			total+=m;
		}
		System.out.println("Your Total Marks = "+ total);
		
		/*
		 * Q. solve following using map: 
		 * 		subject			firstterm			secondterm			thirdterm			total			remarks
		 * 		nepali			90					89					84					?					?
		 * 		science			80					85					87					?					?
		 * 		computer		98					82					96					?					?
		 */
	}
}