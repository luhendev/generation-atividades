package exerciciosLacoRepeticao;

import java.util.Scanner;

public class lacoRepeticao2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero;
		int contadorPar = 0;
		int contadorImpar = 0;

		for (int cont = 1; cont <= 10; cont++) {
			System.out.printf("Digite o %dº número: ", cont);
			numero = scanner.nextInt();

			if (numero % 2 == 0) {
				contadorPar++;
			} else {
				contadorImpar++;
			}
		}

		System.out.printf("Total de números pares: %d%n", contadorPar);
		System.out.printf("Total de números ímpares: %d%n", contadorImpar);

		scanner.close();

	}

}
