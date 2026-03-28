package array;

import java.util.Scanner;

public class StudentMarkLedger {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get number of students and subjects
        System.out.print("Enter number of students: ");
        int studentCount = sc.nextInt();
        sc.nextLine(); // consume newline


        System.out.print("Enter number of subjects: ");
        int subjectCount = sc.nextInt();
        sc.nextLine();


        // Create arrays
        String[] students = new String[studentCount];
        String[] subjects = new String[subjectCount];
        int[][] marks = new int[studentCount][subjectCount];


        // Input student names
        System.out.println("\n--- Enter Student Names ---");
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Student " + (i + 1) + " name: ");
            students[i] = sc.nextLine();
        }


        // Input subject names
        System.out.println("\n--- Enter Subject Names ---");
        for (int i = 0; i < subjectCount; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects[i] = sc.nextLine();
        }


        // Input marks
        System.out.println("\n--- Enter Marks ---");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("\nMarks for " + students[i] + ":");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print(subjects[j] + " : ");
                marks[i][j] = sc.nextInt();
            }
        }


        // Display the ledger
        System.out.println("\n========== STUDENT MARK LEDGER ==========");


        // Header: student name, then each subject, then total, result
        System.out.print("Name\t");
        for (String sub : subjects) {
            System.out.print(sub + "\t");
        }
        System.out.println("Total\tResult");


        // Data rows
        for (int i = 0; i < studentCount; i++) {
            int total = 0;
            boolean pass = true;


            System.out.print(students[i] + "\t");


            for (int j = 0; j < subjectCount; j++) {
                System.out.print(marks[i][j] + "\t");
                total += marks[i][j];
                if (marks[i][j] < 40) {
                    pass = false;
                }
            }


            System.out.print(total + "\t");
            if (pass) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }
	}
}
