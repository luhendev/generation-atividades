package exvetor;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] vetor = new int[10];
		int soma = 0;
		double media;

		for (int i = 0; i < 10; i++) {
			System.out.printf("Vetor: ", +(i + 1) + ": ");
			vetor[i] = scanner.nextInt();
			soma += vetor[i];
		}

		System.out.print("\nElementos nos índices ímpares: ");
		for (int i = 1; i < 10; i += 2) {
			System.out.print(vetor[i] + " ");
		}

		System.out.print("\nElementos pares: ");
		for (int num : vetor) {
			if (num % 2 == 0) {
				System.out.print(num + " ");
			}
		}

		System.out.println("\nSoma: " + soma);

		media = soma / 10.0;
		System.out.printf("Média: %.2f%n", media);

		scanner.close();
	}

}
