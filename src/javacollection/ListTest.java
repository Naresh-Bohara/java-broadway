package javacollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();
		
//		List<Integer> ilist = Arrays.asList(1,2,3,4,5);
		List<Integer> ilist = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		list.add("Nepal");
		list.add("@123");
		list.add("ktm");
		list.add("Dhangadhi");
		
//		for(int i=0; i<list.size(); i++) {
//			String s = (String) list.get(i);
//			System.out.println(s);
//		}
		
		for(String s:list) {
			System.out.println(s);
		}
		
		list.remove(2);
		list.remove("Dhangadhi");
		System.out.println(list);
		System.out.println(list.contains("Nepal"));
		
		ilist.remove(4);
		ilist.remove(Integer.valueOf(4)); // removes value 4
		System.out.println(ilist);
		
		
		/*
		 * Q. create list of:
		 * 		1. Student 
		 * 		2. Book
		 * 		3, Dog
		 */
		
	}
}
