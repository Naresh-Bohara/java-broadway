package javacollection.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		List<Student> stList = new LinkedList<>();
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Please enter no. of students: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			Student s = new Student();
			
			System.out.println("Please enter id for student "+(i+1));
			s.setId(sc.nextInt());
			
			System.out.println("Please enter Name for student "+(i+1));
			s.setName(sc.next());
			
			System.out.println("Please enter age for student "+(i+1));
			s.setAge(sc.nextInt());
			
			s.setClz("KMC");
			
			stList.add(s);
		}
		
		// print:
		for(Student s: stList) {
			System.out.println(s);
		}
		
	}
}
