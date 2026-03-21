package methods;

import java.util.Scanner;

public class MethodTest {
public static void main(String[] args) {
//	MethodTest mt = new MethodTest();
//	mt.sum();
	
//	or
//	sum();
//	area();
//	printTable(4);
	
	int s = getSumOf1To100();
	System.out.println(s);
	
	int small = getSmallestValue(233, 45);
	System.out.println("Small value: "+small);
}



	//1. no return type with no argument:
		static void sum() {
			int x = 10;
			int y = 20;
			
			int s = x+y;
			System.out.println("Sum is: "+s);
		}
		
	// WAP to calculate area of rectangle
		static void area() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter l: ");
			int l = sc.nextInt();
			System.out.println("Enter b: ");
			int b = sc.nextInt();
			int a = l*b;
			System.out.println("Area is: "+a);
		}
		
	//2. no return type with argument:
		static void printTable(int n) {
			for(int i = 1; i<=10; i++) {
				System.out.println(n+" X "+i +" = "+n*i);
			}
		}
		
	//3. return type with no argument:
		static int getSumOf1To100() {
			int s = 0;
			for(int i=1; i<=100; i++) {
				s+=i;
			}
			return s;
		}
		
	//4. return type with argument:
		static int getSmallestValue(int x, int y) {
			if(x<y) {
				return x;
			}else {
				return y;
			}
		}
}
