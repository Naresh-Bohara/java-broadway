package arrayofobject;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		// store and print data of five students.
		
		// 1. create array:
		Student stds[] = new Student[5];
//		
//		// 2. write data in array:
//		Student s = new Student();
//		s.setId(112);
//		s.setFnanme("Naresh");
//		s.setLname("Bohara");
//		s.setCollege("KMC");
//		s.setAge(23);
//		
//		stds[0] = s;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<stds.length; i++) {
			Student s = new Student();
			
			System.out.println("Enter student Id: ");
			s.setId(sc.nextInt());
			
			System.out.println("Enter student First Name: ");
			s.setFnanme(sc.next());
			
			System.out.println("Enter student Last Name: ");
			s.setLname(sc.next());
			
			s.setCollege("KMC");
			
			System.out.println("Enter student Age: ");
			s.setAge(sc.nextInt());
			
			stds[i] = s;
		}
		
		// 3. read vallues from array:
		int count = 0;
		for(Student std: stds) {
			System.out.println(std);
			
			// to print no of students below age of 25
			if(std.getAge() < 25) {
				count +=1;
			}
			
		}
		System.out.println("The no.of students below age 25 are: "+count);
	}
}
