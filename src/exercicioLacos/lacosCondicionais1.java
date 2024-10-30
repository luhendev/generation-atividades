package exercicioLacos;

import java.util.Scanner;

public class lacosCondicionais1 {

	public static void main(String[] args) {

		int A, B, C;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o número A: ");
		A = scanner.nextInt();

		System.out.println("Digite o número B: ");
		B = scanner.nextInt();

		System.out.println("Digite o número C: ");
		C = scanner.nextInt();

		int soma = A + B;

		if (soma > C) {
			System.out.println("\nA Soma de A + B é Maior do que C");
		}

		else if (soma < C) {
			System.out.println("\nA Soma de A + B é Menor do que C");
		}

		else
			System.out.println("\nA Soma de A + B é Igual a C");

		scanner.close();

	}

}
