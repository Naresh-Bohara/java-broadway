package inheritance;

public class Test {
	public static void main(String[] args) {
		
		Programmer p = new Programmer();
		
		p.id = 123;
		p.name = "Naresh Bohara";
		p.company = "ITC";
		p.programmingLanguage = "Java";
		p.projects = "PlanConfig";
		p.bonus = 120000;
		
		p.print();
	}
}
