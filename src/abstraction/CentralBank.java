package abstraction;

public abstract class CentralBank {
	public abstract void getBankName();
	
	public abstract void getInterestRate();
	
	public void getMoneyExRate() {
		System.out.println("1$ = 149.30 NPR");
		System.out.println("1KWD = 481 NPR");
		System.out.println("1YEN = 0.94 NPR");
		System.out.println("1INR = 1.60 NPR");
	}
}
