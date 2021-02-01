package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf1 = new SimpleDateFormat("(dd/MM/yyyy)");

	private Date moment;

	private OrderStatus status;
	private Client client;

	private List<OrderItem> items = new ArrayList<>();

	public Order() {

	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Double total() {
		double sum = 0.0;
		for (OrderItem o : items) {
			sum += o.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n##############################\n");
		sb.append("ORDER SUMMARY:");
		sb.append("\n##############################\n");
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status.name() + "\n");
		sb.append("Client: ");
		sb.append(client.getName() + " ");
		sb.append(sdf1.format(client.getBirthDate()) + " - ");
		sb.append(client.getEmail() + "\n");
		sb.append("Order items:\n");
		
		for (OrderItem o : items) {
			sb.append(o.getProduct().getName());
			sb.append(", $" + String.format("%.2f",o.getProduct().getPrice()));
			sb.append(", Quatity: " + o.getQuantity());
			sb.append(", Subtotal: $" + String.format("%.2f",o.subTotal()));
			sb.append("\n"); 
		}
		
		sb.append("Total price: $" + String.format("%.2f%n", total()));
		return sb.toString();
	}

}
