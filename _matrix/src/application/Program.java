package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number line: ");
		int line = sc.nextInt();
		System.out.print("Enter number columns: ");
		int col = sc.nextInt();

		int[][] mat = new int[line][col];

		System.out.println();

		System.out.println("##### Matriz #####");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.print("Enter number: ");
		int number = sc.nextInt();

		System.out.println();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == number) {
					System.out.println();

					System.out.println("Position: " + i + "," + j);

					if (j - 1 >= 0) {
						int left = mat[i][j - 1];
						System.out.println("Left: " + left);
					}
					if (j + 1 < mat[i].length) {
						int right = mat[i][j + 1];
						System.out.println("Right: " + right);
					}

					if (i - 1 == 0) {
						int up = mat[i - 1][j];
						System.out.println("Up: " + up);
					}

					if (i + 1 < mat.length) {
						int down = mat[i + 1][j];
						System.out.println("Down: " + down);
					}

				}
			}
		}

		sc.close();
	}
}
