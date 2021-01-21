package logica;

public class exercicio07 {

	public static void main(String[] args) {

		int n = 10;
		
		System.out.print("[");
		for (int i = 0; i < n; i++) {
			System.out.print(i < (n - 1) ? i + ", " : i+"]");
		}
	}

}
