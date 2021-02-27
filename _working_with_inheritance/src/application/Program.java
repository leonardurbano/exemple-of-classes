package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new BusinessAccount(1100, "Bob", 1000.0, 500.00);
		SavingsAccount sacc = new SavingsAccount(1102, "Ray", 1000.0, 10.0);

		if (acc instanceof Account)
			System.out.println("Object acc is an Account");

		if (acc instanceof BusinessAccount)
			System.out.println("Object acc is a Business Account");

		if (sacc instanceof Account)
			System.out.println("Object sacc is an Account");

		if (sacc instanceof SavingsAccount)
			System.out.println("Object sacc is a Savings Account");

	}
}
