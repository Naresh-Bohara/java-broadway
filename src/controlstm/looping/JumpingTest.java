package controlstm.looping;

public class JumpingTest {
/*
 * --------------- Jumping Statements -----------
 * 	a. break		: exit from loop 
 * 	b. continue	: skip values
 * 	c. return	: exit from method
 * 
 */
	
	public static void main(String[] args) {
		for(int i =1; i<=10; i++) {
			if(i == 7) {
				break;
			}
			
			if(i == 2 || i ==3) {
//				continue;
				return;
			}
			
			System.out.println(i);
		}
		System.out.println("---------- end for loop ------------");
	}
}
