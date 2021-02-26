package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String nameClient = sc.nextLine();
		System.out.print("Email: ");
		String emailClient = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY):");
		Date birthDate = sdf.parse(sc.next());

		sc.nextLine();
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine();

		Order order = new Order(new Date(), OrderStatus.valueOf(status), new Client(nameClient, emailClient, birthDate));

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String nameProduct = sc.nextLine();
			System.out.print("Product price: ");
			double priceProduct = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantityProduct = sc.nextInt();
			order.addItem(new OrderItem(quantityProduct, priceProduct, new Product(nameProduct, priceProduct)));
		}

		System.out.println();

		System.out.println(order);

		sc.close();
	}

}
