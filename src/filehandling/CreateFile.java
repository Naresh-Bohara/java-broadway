package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {
	/*
	 * a. FileInputStream - read file
	 * b. FileOutputStream - write//create file
	 */
	
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("./src/filehandling/f1.txt");
		file.write("Good Morning".getBytes());
		file.close();
		System.out.println("---success---");
	}
}
