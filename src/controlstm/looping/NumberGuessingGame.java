package controlstm.looping;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("------------- Number Guessing Game (1-100) ---------------");
	Random r = new Random();
	
	int  secretNumber = r.nextInt(100)+1;
	
	int count = 0;
	boolean guess = false;
	
	
	while(!guess) {
		System.out.println("Please enter your guess from 1-100");
		int guessNumber = sc.nextInt();
		count++;
		
		if(guessNumber<0 || guessNumber>100) {
			System.out.println("Please enter your guess between 1-100");
			count--;
			continue;
		}
		if(guessNumber==secretNumber) {
			System.out.println("Congrats! your guess is right, "
					+ "and you guess it in "+ count+" attems!");
			guess = true;
		}else if(guessNumber>secretNumber) {
			System.out.println("Uff! your number is greater, Please choose small.");
		}else {
			System.out.println("Uff! your number is small, Please choose greater.");
		}
	}
}
}
