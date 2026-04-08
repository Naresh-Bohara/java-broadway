package array;

import java.util.Arrays;
import java.util.Scanner;

public class MarksSheet {
	 static double[] marks = new double[5];
	    
	    static void inputMarks(Scanner sc) {
	        for (int i = 0; i < marks.length; i++) {
	            while (true) {
	                System.out.print("Enter marks " + (i + 1) + ": ");
	                double enteredMarks = sc.nextDouble();

	                if (enteredMarks >= 0 && enteredMarks <= 100) {
	                    marks[i] = enteredMarks;
	                    break;
	                } else {
	                    System.out.println("Please enter valid marks (0-100).");
	                }
	            }
	        }
	    }

	    static void printMarks() {
	        System.out.println("Your marks: " + Arrays.toString(marks));
	    }

	    static double calculateTotal() {
	        double sum = 0;
	        for (double mark : marks) {
	            sum += mark;
	        }
	        return sum;
	    }

	    static double calculatePercentage(double total) {
	        return (total / 500) * 100;
	    }

	    static boolean isPass() {
	        for (double mark : marks) {
	            if (mark < 40) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        inputMarks(sc);
	        printMarks();

	        double total = calculateTotal();
	        double percentage = calculatePercentage(total);
	        boolean result = isPass();

	        System.out.println("Total marks = " + total);
	        System.out.println("Percentage = " + percentage + "%");
	        System.out.println(result ? "You are Pass!" : "You are Fail!");

	        sc.close();
	    }

	}