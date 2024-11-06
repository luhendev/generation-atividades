package exestruturadados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exFila {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		Queue<String> filaClientes = new LinkedList<>();

		int opcao;

		do {
			System.out.println("Menu:");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.print("\nEntre com a opção desejada: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("\nDigite o nome do cliente: ");
				String nomeCliente = scanner.nextLine();
				filaClientes.add(nomeCliente);
				System.out.println("Cliente adicionado!");
				break;

			case 2:
				if (filaClientes.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					System.out.println("Clientes na fila:");
					for (String cliente : filaClientes) {
						System.out.println(cliente);
					}
				}
				break;

			case 3:
				if (filaClientes.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					String clienteChamado = filaClientes.poll();
					System.out.println("\nCliente chamado: " + clienteChamado);
				}
				break;

			case 0:
				System.out.println("\nPrograma finalizado!");
				break;

			default:
				System.out.println("Opção inválida.");
				break;
			}

			System.out.println();

		} while (opcao != 0);

		scanner.close();

	}

}
