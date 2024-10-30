package exerciciosLacoRepeticao;

import java.util.Scanner;

public class lacoRepeticao1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1, num2;

		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = scanner.nextInt();

		System.out.println("Digite o último número do intervalo: ");
		num2 = scanner.nextInt();

		if (num1 > num2) {
			System.out.println("Intervalo inválido");
		} else {
			System.out.printf("No intervalo entre %d e %d:%n", num1, num2);

			for (int cont = num1; cont <= num2; cont++) {
				if (cont % 3 == 0 && cont % 5 == 0) {
					System.out.printf("%d é múltiplo de 3 e 5%n", cont);
				}
			}
		}

		scanner.close();

	}

}
