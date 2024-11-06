package exestruturadados;

import java.util.Scanner;
import java.util.Stack;

public class exPilha {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Stack<String> pilhaLivros = new Stack<>();
		
		int opcao;

		do {
			System.out.println("Menu:");
			System.out.println("1 - Adicionar Livro na Pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da Pilha");
			System.out.println("0 - Sair");
			System.out.print("\nDigite uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do livro: ");
				String nomeLivro = scanner.nextLine();
				pilhaLivros.push(nomeLivro);
				System.out.println("Livro adicionado!");
				break;

			case 2:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					System.out.println("Livros na pilha:");
					for (String livro : pilhaLivros) {
						System.out.println(livro);
					}
				}
				break;

			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					String livroRemovido = pilhaLivros.pop();
					System.out.println("Livro retirado: " + livroRemovido);
				}
				break;

			case 0:
				System.out.println("Programa finalizado!");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
			
			System.out.println();
			
		} while (opcao != 0);

		scanner.close();

	}

}
