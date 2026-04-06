package inheritancetypes.hybrid;

public class Intern extends Person implements Student, Worker {

	@Override
	public void work() {
		 System.out.println("Intern is working");
		
	}

	@Override
	public void study() {
		 System.out.println("Intern is studying");
		
	}
	
}
