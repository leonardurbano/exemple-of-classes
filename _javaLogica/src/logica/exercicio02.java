package logica;
import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Exercicio para digitar o valor do raio de um circulo,\n"
				+ "e o resultado ter uma saida de quatro casas decimais.\n");
		
		System.out.print("Digite o valor do Raio: ");
		double raio = sc.nextDouble();
		
		double area = Math.PI * (Math.pow(raio, 2));
		
		System.out.printf("%nA Área do Circulo: %.4f%n", area);
		
		sc.close();
		
	}

}
