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

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String nameClient = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.nextLine();
		Client client = new Client(nameClient, email, sdf.parse(birthDate));

		System.out.println("Enter order data:");

		System.out.print("Status: ");
		String status = sc.nextLine();
		Order o = new Order(new Date(), OrderStatus.valueOf(status), client);

		System.out.print("How many items to this order? ");
		int numberOrderItem = sc.nextInt();
		
		
		for (int i = 1; i <= numberOrderItem; i++) {
			sc.nextLine();
			System.out.println("Enter #"+i+" item data:");
			System.out.print("Product name: ");
			String nameProduct = sc.nextLine();
			System.out.print("Product price: ");
			double priceProduct = sc.nextDouble();
			Product product = new Product(nameProduct, priceProduct);
			
			System.out.print("Quantity: ");			
			int quantity = sc.nextInt();
			OrderItem item = new OrderItem(quantity, priceProduct, product);
			
			o.addItem(item);
		}
		
		System.out.println(o);

		sc.close();
	}
}
