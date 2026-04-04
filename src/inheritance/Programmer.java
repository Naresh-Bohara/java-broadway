package inheritance;

public class Programmer extends Employee{
	String programmingLanguage;
	String projects;
	int bonus;
	
	void print() {
		super.print();
		System.out.println("programmingLanguage: "+ programmingLanguage);
		System.out.println("Projects: "+ projects);
		System.out.println("Bonus: "+bonus);
	}
}
