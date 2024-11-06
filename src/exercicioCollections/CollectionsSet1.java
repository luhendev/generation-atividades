package exercicioCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionsSet1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<>();

		System.out.println("-= Set =-");

		int valores = 0;

		while (valores < 10) {
			System.out.print("Digite um número: ");
			int num = scanner.nextInt();
			numeros.add(num);
			valores++;
		}

		System.out.println("\nListar dados do Set:");
		
		Iterator<Integer> iterator = numeros.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		scanner.close();

	}

}
