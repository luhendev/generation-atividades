package exvetor;

import java.util.Scanner;

public class Matriz1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int somaPrincipal = 0;
		int somaSecundaria = 0;

		System.out.println("Digite os elementos: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("Matriz: ");
				matriz[i][j] = scanner.nextInt();
			}
		}

		System.out.print("\nElementos da Diagonal Principal: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(matriz[i][i] + " ");
			somaPrincipal += matriz[i][i];
		}

		System.out.print("\nElementos da Diagonal Secundária: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(matriz[i][2 - i] + " ");
			somaSecundaria += matriz[i][2 - i];
		}

		System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaPrincipal);
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaSecundaria);

		scanner.close();
	}

}
