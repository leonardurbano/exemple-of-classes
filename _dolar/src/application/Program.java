package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double valueDolar = sc.nextDouble();

		System.out.print("How many dollars will be boutht? ");
		double quantityDolar = sc.nextDouble();

		System.out.println("Amount to be paid in reais = "
				+ String.format("%.2f", CurrencyConverter.converteDolar(valueDolar, quantityDolar)));

		sc.close();
	}

}
