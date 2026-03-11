// day-02 - 05
package datatypes;

import java.util.Scanner;

public class VariableTest {
	/**
	 * -------------------------Variable ---------------------------
	 * 	# To store values .
	 * 	# Value stored for processing.
	 * 
	 * 	# syntax:
	 * 			data_type   var_name;
	 */
	
	public static void main(String[] args) {
//		int a = 109;
		int length, breadth;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		length = sc.nextInt();
		
		System.out.println("Enter breadth: ");
		breadth = sc.nextInt();
		
		int area = length*breadth;
		System.out.println("Area of rectnagle: "+ area);		
	}
}
