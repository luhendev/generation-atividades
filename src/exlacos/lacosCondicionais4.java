package exlacos;

import java.util.Scanner;

public class lacosCondicionais4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String caracteristica1, caracteristica2, caracteristica3;

		System.out.println("Digite a primeira característica do animal: ");
		caracteristica1 = scanner.next();

		System.out.println("Digite a segunda característica do animal: ");
		caracteristica2 = scanner.next();

		System.out.println("Digite a terceira característica do animal: ");
		caracteristica3 = scanner.next();

		if (caracteristica1.equalsIgnoreCase("vertebrado")) {
			if (caracteristica2.equalsIgnoreCase("ave")) {
				if (caracteristica3.equalsIgnoreCase("carnivoro")) {
					System.out.println("Águia");
				} else if (caracteristica3.equalsIgnoreCase("onivoro")) {
					System.out.println("Pomba");
				}
			} else if (caracteristica2.equalsIgnoreCase("mamifero")) {
				if (caracteristica3.equalsIgnoreCase("onivoro")) {
					System.out.println("Homem");
				} else if (caracteristica3.equalsIgnoreCase("herbivoro")) {
					System.out.println("Vaca");
				}
			}
		} else if (caracteristica1.equalsIgnoreCase("invertebrado")) {
			if (caracteristica2.equalsIgnoreCase("inseto")) {
				if (caracteristica3.equalsIgnoreCase("hematofago")) {
					System.out.println("Pulga");
				} else if (caracteristica3.equalsIgnoreCase("herbivoro")) {
					System.out.println("Lagarta");
				}
			} else if (caracteristica2.equalsIgnoreCase("anelideo")) {
				if (caracteristica3.equalsIgnoreCase("hematofogo")) {
					System.out.println("Sanguessuga");
				} else if (caracteristica3.equalsIgnoreCase("onivoro")) {
					System.out.println("Minhoca");
				}

				scanner.close();
			}
		}
	}
}