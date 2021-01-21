package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Account Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Account Holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char initial = sc.next().charAt(0);

		Account ac;

		if (initial == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialBalance = sc.nextDouble();
			ac = new Account(number, holder, initialBalance);
		} else {
			ac = new Account(number, holder);
		}

		System.out.println("\nAccount data:");
		System.out.println(ac);

		System.out.print("\nEnter a deposit value: ");
		ac.deposit(sc.nextDouble());

		System.out.println("Updated account data:");
		System.out.println(ac);

		System.out.print("\nEnter a withdraw value: ");
		ac.withdraw(sc.nextDouble());

		System.out.println("Updated account data:");
		System.out.println(ac);

		sc.close();
	}

}
