package exlacos;

import java.util.Scanner;

public class lacosCondicionais2 {

	public static void main(String[] args) {

		int numero;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número: ");
		numero = scanner.nextInt();

		if (numero % 2 == 0) {
			if (numero >= 0) {
				System.out.println("\nO Número é par e positivo!");
			} else {
				System.out.println("\nO Número é par e negativo!");
			}
		} else {
			if (numero >= 0) {
				System.out.println("\nO Número é ímpar e positivo!");
			} else {
				System.out.println("\nO Número é ímpar e negativo!");
			}
		}

		scanner.close();
	}

}
