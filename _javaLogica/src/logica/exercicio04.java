package logica;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o n�mero da semana: ");
		int diaSemana = sc.nextInt();

		String nomeSemana;

		switch (diaSemana) {
		case 1:
			nomeSemana = "Domingo";
			break;
		case 2:
			nomeSemana = "Segunda-feira";
			break;
		case 3:
			nomeSemana = "Ter�a-feira";
			break;
		case 4:
			nomeSemana = "Quarta-feira";
			break;
		case 5:
			nomeSemana = "Quinta-feira";
			break;
		case 6:
			nomeSemana = "Sexta-feira";
			break;
		case 7:
			nomeSemana = "S�bado";
			break;
		default:
			nomeSemana = "Dia da semana n�o exite";
			break;
		}

		System.out.printf("%nSemana digitada: %s%n", nomeSemana);

		sc.close();
	}

}
