package methodoverriding;

public class NICBank extends CentralBank{
	@Override
	void getBankName() {
		System.out.println("NICA Bank");
	}
	
	@Override
	void getInterestRate() {
		System.out.println("12 %");
	}
}
