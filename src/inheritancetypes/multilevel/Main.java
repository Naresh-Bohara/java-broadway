package inheritancetypes.multilevel;

public class Main {
	public static void main(String[] args) {
		Manager m = new Manager();
		
		 m.details();  // from Person
	     m.work();     // from Employee
	     m.manage();   // from Manager
	}
}
