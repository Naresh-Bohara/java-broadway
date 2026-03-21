package controlstm.looping;

public class ForEachTest {
/*
 * ---------------- forEach loop -----------------
 * 	# use to read data from collection (array, list, set, map, ..etc.)
 * 	# syntax: 
 * 		for(data_type var: collection){
 * 			// statements
 * 		}
 */
	
	public static void main(String[] args) {
		
		int values[] = {1, 2, 3,4,54,6,59,56,51,60,34,23,54,65,67,66};
		int sum = 0;
		for(int x: values) {
			System.out.println(x);
			sum+=x;
		}
		System.out.println("sum is: "+sum);
	}
}
