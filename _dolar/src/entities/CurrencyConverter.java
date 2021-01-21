package entities;

public class CurrencyConverter {

	private static final double TAX = 1.06;

	public static double converteDolar(double valueDolar, double quantityDolar) {
		return valueDolar * quantityDolar * TAX;
	}
}
