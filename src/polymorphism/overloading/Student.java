package polymorphism.overloading;

//Constructor Overloading

public class Student {
	int id;
	String name;

	Student() {
		id = 0;
		name = "Unknown";
	}

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	Student(String name) {
		this.id = 0;
		this.name = name;
	}

	void display() {
		System.out.println("Id: " + id + ", Name: " + name);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(1, "Naresh");
		Student s3 = new Student("Bohara");

		s1.display();
		s2.display();
		s3.display();
	}
}