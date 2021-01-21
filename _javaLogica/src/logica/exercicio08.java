package logica;
import java.util.Locale;
import java.util.Scanner;

public class exercicio08 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("## CONVERTE CELSIUS PARA FAHRENHEIT ##");
		char pergunta;
		do {
			System.out.print("\nDigite a temperatura em Celsius: ");
			double celsius = sc.nextDouble();
			double formula = (9.00 * celsius) / 5.00 + 32.00;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n%n", formula);
			System.out.printf("Deseja repetir? (s-n): ");
			pergunta = sc.next().charAt(0);
		}while(pergunta != 'n');
		
		sc.close();
		System.out.println("Programa terminado...");
	}
}
