package inheritancetypes.hybrid;

public class Main {
	public static void main(String[] args) {
		Intern i = new Intern();

        i.basicInfo(); // from Person
        i.study();     // from Student
        i.work();      // from Worker
	}
}
