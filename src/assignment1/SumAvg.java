package assignment1;

import java.util.Scanner;

public class SumAvg {
public static void main(String[] args) {
	int a, b, sum;
	double avg;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter first number: ");
	a = sc.nextInt();
	System.out.println("Please enter second numbebr:");
	b = sc.nextInt();
	
	sum = a+b;
	avg = (a+b)/2.0;
	
	System.out.println("The sum is: "+sum);
	System.out.println("The average is: "+avg);
}
}
