package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTest {
	/*
	 * a. FileReader - read file
	 * b. FileWriter - write file
	 */
	
	
	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("./src/filehandling/student.txt", true);
		file.write("Student Name = Naresh Bohara\n");
		file.write("College Name = KMC\n");
		file.write("Faculty = BSc.CSIT\n");
		file.write("Phone = 9865431220\n");
		
		file.close();
		System.out.println("---success---");
		
	}
}
