package controlstm.looping;

public class WhileTest {
/*
 * --------------- while loop ----------------
 * 	# syntax:
 * 		while (condition){
 * 		// statements
 * 		// inc/dec
 * 		}
 */
	
	public static void main(String[] args) {
//		5! = 5*4*3*2*1 = 120
		int n = 5;
		int fact = 1;
		while(n>1) {
			fact *=n;
			n--;
		}
		System.out.println("result = "+fact);
		
	}
}
