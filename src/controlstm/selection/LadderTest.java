package controlstm.selection;

public class LadderTest {
/*
 * ------------- else if -----------------
 *  - more then two condition.
 *  
 *  # syntax:
 *  		if(condition-1){
 *  			//statements
 *  		}else if(condition-2){
 *  			//statements
 *  		}else if(condition-3){
 *  			//statements
 *  		}else{
 *  			//statements
 *  		}
 *  
 */
	
	public static void main(String[] args) {
		int marks = 19;
		
		if(marks >= 90) {
			System.out.println("Your Grade is A+");
		}else if(marks >= 80) {
			System.out.println("Your Grade is A");
		}else if(marks >=70) {
			System.out.println("Your Grade is B+");
		}else if(marks >= 60) {
			System.out.println("Your Grade is B");
		}else if(marks >= 50){
			System.out.println("Your Grade is C+");
		}else {
			System.out.println("You are failed!");
		}
	}
}
