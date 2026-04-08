package polymorphism.overriding.payment;

public class PaymentSystem {
	public static void main(String[] args) {
		Payment p;

		p = new Esewa();
		p.pay(1000);

		p = new Khalti();
		p.pay(500);
	}
}
