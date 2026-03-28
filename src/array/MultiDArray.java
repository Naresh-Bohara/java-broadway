package array;

import java.util.Scanner;

public class MultiDArray {
public static void main(String[] args) {
	/*
	 * ------------ Multi Dimensional Array --------------
	 * # use to manage data in row and column format/table/matrix
	 * # syntax:
	 * 		data_type array_name[][] = new data_type[rows][cols];
	 */
	
	int mat[][] = new int[2][2];
	
	/*
	 *  ---- how it take memory ----
	 *     c0 c1
	 *  R0 [][]
	 *  R1 [][]
	 */
	
	// put data in array
	
/*
 * 	for(int i=0; i<2; i++) {
		
		for(int j=0; j<2; j++) {
			mat[i][j] = 400;
		}
	} 
 */
	
	/*
	 *  ---- how it take memory ----
	 *     c0 c1
	 *  R0 [400][400]
	 *  R1 [400][400]
	 */
	
	//get data from array:
	
	/*
	 for(int i=0; i<2; i++) {
	 
		for(int j=0; j<2; j++) {
			
			System.out.print(mat[i][j] + " ");
		}
		System.out.println();
	}
	
	*/
	
	// dynamic data taking 
	Scanner sc = new Scanner(System.in);
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.println("Enter a number: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
	
		 for(int i=0; i<2; i++) {
			 
				for(int j=0; j<2; j++) {
					
					System.out.print(mat[i][j] + " ");
				}
				System.out.println();
			}
	
}
}
