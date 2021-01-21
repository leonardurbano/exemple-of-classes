package application;

import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Client[] client = new Client[10];

		System.out.print("How many roows will be rented? ");
		int n = sc.nextInt();

		System.out.println();
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Roows: ");
			int room = sc.nextInt();
			client[room] = new Client(name, email);
		}

		System.out.println("\nBusy rooms:");
		
		for (int i = 0; i < client.length; i++) {
			if (client[i] != null) {
				System.out.println(i + ": " + client[i]);
			}
		}

		sc.close();
	}

}
