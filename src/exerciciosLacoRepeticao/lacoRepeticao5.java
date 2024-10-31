package exerciciosLacoRepeticao;

import java.util.Scanner;

public class lacoRepeticao5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int somaPositivos = 0;
		int numero;

		do {
			System.out.println("Digite um número: ");
			numero = scanner.nextInt();

			if (numero > 0) {
				somaPositivos += numero;
			}

		} while (numero != 0);

		System.out.println("\nA soma dos números positivos é: " + somaPositivos);

		scanner.close();

	}

}
