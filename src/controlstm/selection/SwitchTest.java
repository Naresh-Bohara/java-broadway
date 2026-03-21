package controlstm.selection;

public class SwitchTest {
/*
 *  --------------- switch -----------------
 *  # syntax:
 *  		switch(variable){
 *  			case 1: 
 *  				//statements
 *  				break;
 *  			case 2: 
 *  				// statements
 *  				break;
 *  		}
 */
	
	public static void main(String[] args) {
		int day =  4;
		switch(day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4: 
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thrusdday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7: 
			System.out.println("Saturdday");
			break;
		default:
			System.out.println("Invalid day!");
		}
	}
}
