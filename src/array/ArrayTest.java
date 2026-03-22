package array;

import java.util.Scanner;

public class ArrayTest {
public static void main(String[] args) {
	/*
	 * q. store and print age of 5 students.
	 * -> steps:
	 *  // create an array.
	 *  // write data in an array
	 *  // read data from array 
	 * 
	 */
	int age[] = new int[5];
	Scanner sc = new Scanner(System.in);
	for(int i = 0; i<age.length; i++) {
		System.out.println("Enter age: ");
		age[i] = sc.nextInt();
		
	}
	
	// now for read:
	for(int x:age) {
		System.out.println(x);
	}
}
}
