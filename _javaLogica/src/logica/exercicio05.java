package logica;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int soma = 0, numero = -1;
		System.out.println("Digite os n�meros:");
		while (numero != 0) {
			soma += numero = sc.nextInt();
		}
		System.out.println("A soma dos n�meros: " + soma);
		sc.close();
	}

}
