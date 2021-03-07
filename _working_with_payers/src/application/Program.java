package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Payer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Payer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditure = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditure));
			} else {
				System.out.print("Number of employees: ");
				int numberEmployee = sc.nextInt();
				list.add(new Company(name, anualIncome, numberEmployee));
			}
		}

		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (Payer payer : list) {
			System.out.println(payer.getName() + ": $ " + String.format("%.2f", payer.tax()));
			sum += payer.tax();
		}

		System.out.println();
		System.out.print("TOTAL TAXES: " + String.format("%.2f", sum));

		sc.close();
	}
}
