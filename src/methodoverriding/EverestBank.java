package methodoverriding;

public class EverestBank extends CentralBank {
	@Override
	void getBankName() {
		System.out.println("Everest Bank");
	}
	
	@Override
	void getInterestRate() {
		System.out.println("5 %");
	}
}
