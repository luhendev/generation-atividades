package exerciciosLacoRepeticao;

import java.util.Scanner;

public class lacoRepeticao3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int idadeMenor21 = 0;
		int idadeMaior50 = 0;

		while (true) {
			System.out.println("Digite a idade: ");
			int idade = scanner.nextInt();

			if (idade < 0) {
				break;
			}

			if (idade < 21) {
				idadeMenor21++;
			} else if (idade > 50) {
				idadeMaior50++;
			}
		}
		System.out.println("\nTotal de pessoas com menos de 21 anos: " + idadeMenor21);
		System.out.println("Total de pessoas com mais de 50 anos: " + idadeMaior50);

		scanner.close();
	}

}
