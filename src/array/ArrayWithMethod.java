package array;

import java.util.Arrays;

public class ArrayWithMethod {
	/*
	 * 
	 * ----------------- Array with method --------------------
	 * 
	 * a. array as arguments 
	 *  void sum(int a[]){
	 * 		// statements
	 * 	}
	 * 
	 * b. array as return type:
	 * 	int get20IntValues(){
	 * 		array = 21,23,34,4,5,45,66,65....20terms;
	 * 		return array;
	 * 	}
	 */
	public static void main(String[] args) {
	int array[] = {1,2,3,4,5,6,7};
	findSum(array);
	
	int arr[] = getOddNumbersFrom1to100();
	System.out.println(Arrays.toString(arr));
	}
	
	// array as arguments:
	static void findSum(int values[]) {
		int sum = 0;
		for (int i: values) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	// array as return type:
	static int[] getOddNumbersFrom1to100() {
		int[] oddNums = new int[50];
		int j = 0;
		for(int i=1; i<=100; i++) {
			if(i%2 != 0) {
				oddNums[j] = i;
				j++;
			}
		}
		
		return oddNums;
	}
}
