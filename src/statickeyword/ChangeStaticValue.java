package statickeyword;

public class ChangeStaticValue {
	int rollno;
	String name;
	static String clz_name = "KMC";
	
	static void change() {
		clz_name = "NAST";
	}
	
	public ChangeStaticValue(int r, String n) {
		rollno = r;
		name = n;
	}
	
	void display() {
		System.out.println(rollno+" "+ name+" "+ clz_name );
	}
	
	public static void main(String[] args) {
		ChangeStaticValue s1 = new ChangeStaticValue(11, "Naresh");
		s1.display();
		
		ChangeStaticValue.change(); // clz_name = NAST
		ChangeStaticValue s2 = new ChangeStaticValue(22, "Pawan");
		ChangeStaticValue s3 = new ChangeStaticValue(33, "Dammar");
		s1.display();
		s2.display();
		s3.display();
		
	}
}
