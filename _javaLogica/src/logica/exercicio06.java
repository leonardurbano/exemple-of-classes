package logica;


import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número de repetições: ");
		int index = sc.nextInt();
		int soma = 0;
		for (int i = 1; i <= index; i++) {
			System.out.printf("%dº número: ",i);
			int numero = sc.nextInt();
			soma += numero;
		}
		System.out.println("A soma de todos os números: " + soma);

		sc.close();
	}
}
