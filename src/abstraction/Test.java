package abstraction;

public class Test {
	public static void main(String[] args) {
//		CentralBank bank = new CentralBank(); // not allowed for abstract class
		
		CentralBank bank = new NabilBank(); 
		bank.getBankName();
		bank.getInterestRate();
		bank.getMoneyExRate();
	}
}
