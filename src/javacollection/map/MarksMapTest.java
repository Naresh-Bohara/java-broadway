package javacollection.map;

import java.util.*;

public class MarksMapTest {
	public static void main(String[] args) {

		Map<String, List<Integer>> map = new LinkedHashMap<>();

		// data
		map.put("Nepali", List.of(90, 89, 84));
		map.put("Science", List.of(80, 85, 87));
		map.put("Computer", List.of(98, 82, 96));

		// print header
		System.out.println("Subject\tFirst\tSecond\tThird\tTotal\tRemarks");

		for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {

			String subject = entry.getKey();
			List<Integer> marks = entry.getValue();

			int total = 0;
			for (int m : marks) {
				total += m;
			}

			double avg = total / 3.0;

			String remarks;
			if (avg >= 90) remarks = "Excellent";
			else if (avg >= 75) remarks = "Good";
			else if (avg >= 50) remarks = "Average";
			else remarks = "Poor";

			System.out.println(subject + " " 
				+ marks.get(0) + "\t" 
				+ marks.get(1) + "\t" 
				+ marks.get(2) + "\t" 
				+ total + "\t" 
				+ remarks);
		}
	}
}