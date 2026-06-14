package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReadTest {
	public static void main(String[] args) throws IOException {
//		FileReader file = new FileReader("./src/filehandling/student.txt");
		FileReader file = new FileReader("./src/filehandling/users.csv");
		
		BufferedReader br = new BufferedReader(file);
		
		String line;
		br.readLine(); // skip column
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
			String[] data = line.split(",");
			System.out.println(Arrays.toString(data));
			System.out.println(data[1]);
			
			
			/*
			 * # create user table
			 * # connect db
			 * # insert sql
			 * # set data to sql
			 * # execute sql
			 */
		}
	}
}
