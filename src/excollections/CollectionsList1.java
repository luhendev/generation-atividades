package excollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsList1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Escolha uma cor: ");
			String cor = scanner.nextLine();
			cores.add(cor);
		}

		System.out.println("\nListar todas as cores: ");

		for (String cor : cores) {
			System.out.println(cor);
		}

		Collections.sort(cores);

		System.out.println("\nOrdenar as cores: ");

		for (String cor : cores) {
			System.out.println(cor);
		}

		scanner.close();

	}

}
