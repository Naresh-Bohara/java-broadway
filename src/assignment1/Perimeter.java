package assignment1;

import java.util.Scanner;

public class Perimeter {
public static void main(String[] args) {
	float a, b, c, length, breadth, radius;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first side length of triangle, a: ");
	a = sc.nextFloat();
	System.out.println("Enter second side length of triangle, b: ");
	b = sc.nextFloat();
	System.out.println("Enter third side length of triangl, c: ");
	c = sc.nextFloat();
	
	System.out.println("Enter length of rectangle, length: ");
	length = sc.nextFloat();
	System.out.println("Enter breadth of rectangle, breadth: ");
	breadth = sc.nextFloat();
	
	System.out.println("Enter radius of circle, radius: ");
	radius = sc.nextFloat();
	
	System.out.println("The perimeter of triangle is: "+ (a+b+c));
	System.out.println("The perimeter of circle is: "+(2*Math.PI*radius));
	System.out.println("The perimeter of rectangle is: "+(2*(length+breadth)));
			
}
}
