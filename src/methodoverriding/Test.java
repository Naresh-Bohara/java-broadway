package methodoverriding;

public class Test {
	public static void main(String[] args) {
		// static or early binding of object
		EverestBank e = new EverestBank();
		e.getBankName();
		e.getInterestRate();
		
		/*
		 * // we cant do like below:
		NabilBank ex = new EverestBank();
		ex.getBankName();
		ex.getInterestRate();
		
		// but we can do like below:
		// up-casting
		CentralBank ey = new EverestBank();
		ey.getBankName();
		ey.getInterestRate();
		 */
		
		NabilBank n = new NabilBank();
		n.getBankName();
		n.getInterestRate();
		
		NICBank nic = new NICBank();
		nic.getBankName();
		nic.getInterestRate();
		nic.moneyExcRate();
		
		
	}
	
	// late or dynamic binding of object
	// run time polymorphism
	void printBank(CentralBank bank) {
		bank.getBankName();
		bank.getInterestRate();
	}
}
