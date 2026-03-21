package controlstm.selection;

public class IfElseTest {
/*
 * --------------- if-else ----------------
 * 	# use to implement exactly 
 * 	# syntax:
 * 		If (condition){
	// statements
		}else{
	// statements
}

 */
	
	public static void main(String[] args) {
		int n = 2;
		if (n%2 == 0) {
			System.out.println(n + " is even number.");
		}else {
			System.out.println(n + " is odd number.");
		}
	}
}
