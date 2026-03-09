package assignment1;

import java.util.Scanner;

public class SimpleInterest {
public static void main(String[] args) {
	float principle, rate, time, interest;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter principle: ");
	principle = sc.nextFloat();
	System.out.println("Please enter rate: ");
	rate = sc.nextFloat();
	System.out.println("Please enter time: ");
	time =  sc.nextFloat();
	
	interest = (principle*rate*time)/100;
	System.out.println("The interest is: "+interest);
}
}
