package array;

import java.util.Arrays;

public class ArraySort {
public static void main(String[] args) {
	int values[] = {12,23,123,34,54,123,56,32,76,83,65,11,52,456};
	Arrays.sort(values);
	System.out.println(Arrays.toString(values));
	
	// another method of array:
	Arrays.fill(values, 900);
	System.out.println(Arrays.toString(values));
	
	Arrays.fill(values, 2, 5, 500);
	System.out.println(Arrays.toString(values));
	
	//copy
	int newArray[] = Arrays.copyOf(values, 4);
	System.out.println(Arrays.toString(newArray));
	
	int[] arr = Arrays.copyOfRange(newArray, 1, 3);
	System.out.println(Arrays.toString(arr));
}
}
