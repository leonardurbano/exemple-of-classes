package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		//Passando OrderStatus por String
		OrderStatus os1 = OrderStatus.valueOf("SHIPPEDING");
		
		Order order = new Order(111, new Date(), os1);
		System.out.println(order);
	}

}
