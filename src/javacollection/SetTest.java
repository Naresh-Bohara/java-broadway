package javacollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
//		Set<String> set = new HashSet<>();
//		Set<String> set = new TreeSet<>();
		Set<String> set = new LinkedHashSet<>();
		set.add("Samsung");
		set.add("Iphone");
		set.add("redmi");
		set.add("redmi");
		set.add("Iphone");
		set.add("nokia");
		
		System.out.println(set);
		
		for(String s:set) {
			System.out.println(s);
		}
		
		/*
		 * Q. create set of:
		 * 		1. Customer
		 * 		2. Cow
		 * 		3. Mobile
		 */
	}
}
