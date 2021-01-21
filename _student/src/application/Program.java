package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();

		System.out.print("Enter name student: ");
		s1.name = sc.nextLine();
		s1.gradePointA = sc.nextDouble();
		s1.gradePointB = sc.nextDouble();
		s1.gradePointC = sc.nextDouble();

		System.out.printf("FINAL GRADE = %.2f%n", s1.sum());

		if (s1.sum() < 60.00) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", s1.missing());
		} else {
			System.out.println("PASS");
		}

		sc.close();

	}

}
