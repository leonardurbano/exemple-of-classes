package logica;
import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de minutos na fatura: ");
		double fatura = 50.00;
		int minutos = sc.nextInt();
		if (minutos > 100) {
			fatura += (minutos - 100) * 2.00;
		}
		System.out.printf("%nValor a pagar: R$ %.2f", fatura);

		sc.close();
	}
}
