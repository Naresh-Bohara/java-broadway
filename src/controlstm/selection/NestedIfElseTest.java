package controlstm.selection;

import java.util.Scanner;

public class NestedIfElseTest {
/*
 * ----------------- Nested if-else -----------------
 * 	# syntax: 
 * 		if(condition1){
 * 
 * 			if(condition2){
 * 
 * 				if(condition3){
 * 					............
 * 					............
 * 					............
 * 				}else{
 * 
 * 				}
 * 			}else{
 * 
 * 			}
 * 		}else{
 * 
 * 		}
 */
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your citizenship: ");
        String citizenship = sc.next();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Type yes if you have voting card: ");
        String card = sc.next();

        if (citizenship.equalsIgnoreCase("nepali")) {

            if (age >= 18) {

                if (card.equalsIgnoreCase("yes")) {
                    System.out.println("Yes, you are eligible to vote");
                    
                } else {
                    System.out.println("No voting card, can't vote!");
                }

            } else {
                System.out.println("Under age, can't vote!");
            }

        } else {
            System.out.println("invalid citizenship, can't vote!");
        }
    }
}
