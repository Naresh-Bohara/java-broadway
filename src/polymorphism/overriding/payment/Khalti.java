package polymorphism.overriding.payment;

public class Khalti extends Payment{
	@Override
	void pay(double amount) {
		System.out.println("Paying Rs. " + amount + " using Khalti");
	}
}
