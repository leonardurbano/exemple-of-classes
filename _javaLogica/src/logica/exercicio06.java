package logica;


import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o n�mero de repeti��es: ");
		int index = sc.nextInt();
		int soma = 0;
		for (int i = 1; i <= index; i++) {
			System.out.printf("%d� n�mero: ",i);
			int numero = sc.nextInt();
			soma += numero;
		}
		System.out.println("A soma de todos os n�meros: " + soma);

		sc.close();
	}
}
