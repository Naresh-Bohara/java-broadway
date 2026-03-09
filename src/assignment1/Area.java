package assignment1;

import java.util.Scanner;

public class Area {
public static void main(String[] args) {
	float r, l, b, areaC, areaR, areaT;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter radius:");
	 r = sc.nextFloat();
	 System.out.println("Enter length: ");
	 l = sc.nextFloat();
	 System.out.println("Enter base: ");
	 b = sc.nextFloat();
	 
	 areaC = (float) (3.14*r*r);
	 areaT = (float) (0.5*l*b);
	 areaR = l*b;
	 System.out.println("Area of circle: "+ areaC);
	 System.out.println("Area of Triangle: "+areaT);
	 System.out.println("Area of Rectangle: "+ areaR);
	 
	                      
	 
	 
}
}
