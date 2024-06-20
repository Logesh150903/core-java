package demo;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's marks: ");
        int marks = scanner.nextInt();
        String grade;
        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 75) {
            grade = "B";
        } else if (marks >= 50) {
            grade = "C";
        }  else {
            grade = "F";
        }
        System.out.println("The student's grade is: " + grade);
    }
}