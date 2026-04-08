package polymorphism.overriding.payment;

public class Esewa extends Payment {
	@Override
	void pay(double amount) {
		System.out.println("Paying Rs. " + amount + " using Esewa");
	}
}
