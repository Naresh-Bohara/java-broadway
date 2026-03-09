package assignment1;

import java.util.Scanner;

public class VolumeOfCylinder {
public static void main(String[] args) {
	 float radius, height, volume;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the radius of cyliinder, radius: ");
	 radius = sc.nextFloat();
	 System.out.println("Enter the height of cyliinder, height: ");
	 height = sc.nextFloat();
	 volume = (float)(Math.PI*radius*radius*height);
	 System.out.println("The volume of cylinder is: "+volume); 	                                             
}
}
