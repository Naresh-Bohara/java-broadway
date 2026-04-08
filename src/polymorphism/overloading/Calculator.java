package polymorphism.overloading;

//Method Overloading

public class Calculator {

	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	double add(double a, double b) {
		return a + b;
	}

	void print(int a, String b) {
		System.out.println("int then String: " + a + ", " + b);
	}

	void print(String a, int b) {
		System.out.println("String then int: " + a + ", " + b);
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		System.out.println("Sum of 2 ints: " + calc.add(10, 20));
		System.out.println("Sum of 3 ints: " + calc.add(10, 20, 30));
		System.out.println("Sum of 2 doubles: " + calc.add(10.5, 20.5));

		calc.print(101, "Naresh");
		calc.print("Java", 14);
	}
}