package controlstm.looping;

import java.util.Scanner;

public class DoWhileTest {
/*
 * ----------- do-while loop (post iteration) --------------
 * 	# syntax: 
 * 		do{
 * 		// statements
 *		// inc/ dec
 * 		}while(condition);
 */
	
	public static void main(String[] args) {
		/*
		 * multiplication tabe
		 * 7 X 1 = 7
		 * 7 X 2 = 14
		 * 7 X 3 = 21
		 * ..........
		 * ..........
		 * 7 X 10 = 70
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of which you want to print table");
		int n = sc.nextInt();
		int i = 1;
		
		do {
			System.out.println(n+" X " + i+ "= " + n*i);
			i++;
		}while(i<=10);
	}
}
