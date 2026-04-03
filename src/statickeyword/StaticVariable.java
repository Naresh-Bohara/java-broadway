package statickeyword;

public class StaticVariable {
	int rollno;
	String name;
	static String clz_name = "KMC";
	
	StaticVariable(int r, String n){
		rollno = r;
		name = n;
	}
	
	void display() {
		System.out.println(rollno+" "+ name+" "+ clz_name );
	}
	
	public static void main(String[] args) {
		StaticVariable s1 = new StaticVariable(11, "Pawan");
		StaticVariable s2 = new StaticVariable(22, "Dammar");
		
		s1.display();
		s2.display();
	}
}
