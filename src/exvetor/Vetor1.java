package exvetor;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o número que você deseja encontrar: ");
		int numeroProcurado = scanner.nextInt();

		int[] vetor = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		int posicao = -1;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numeroProcurado) {
				posicao = i;
				break;
			}
		}

		if (posicao != -1) {
			System.out.println("\nO número " + numeroProcurado + " está localizado na posição: " + posicao);
		} else {
			System.out.println("\nNúmero não foi encontrado!");
		}

		scanner.close();
	}

}
