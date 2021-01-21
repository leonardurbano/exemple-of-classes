package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("ENTER VECTOR SIZE: ");
		int n = sc.nextInt();

		Product[] vect = new Product[n];
		double sum = 0.0;

		System.out.println("ENTER DATA:");
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
			sum += vect[i].getPrice();
		}

		System.out.printf("AVERIGE PRICE: %.2f%n", sum / vect.length);

		sc.close();
	}

}
