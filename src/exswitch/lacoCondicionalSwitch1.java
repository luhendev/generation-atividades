package exswitch;

import java.util.Scanner;

public class lacoCondicionalSwitch1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int codigoProduto, qtd;
		String nomeProduto = "";
		double precoProduto = 0.0;

		System.out.println("Digite o código do produto: ");
		codigoProduto = scanner.nextInt();

		System.out.println("Digite a quantidade do produto: ");
		qtd = scanner.nextInt();

		switch (codigoProduto) {

		case 1:
			nomeProduto = "Cachorro Quente";
			precoProduto = 10;
			break;

		case 2:
			nomeProduto = "X-Salada";
			precoProduto = 15;
			break;

		case 3:
			nomeProduto = "X-Bacon";
			precoProduto = 18;
			break;

		case 4:
			nomeProduto = "Bauru";
			precoProduto = 12;
			break;

		case 5:
			nomeProduto = "Refrigerante";
			precoProduto = 8;
			break;

		case 6:
			nomeProduto = "Suco de laranja";
			precoProduto = 13;
			break;

		default:
			System.out.println("Produto inválido");
			break;
		}
		
		double valorTotal = qtd * precoProduto;
		
		System.out.printf("Produto: %s\n",qtd , nomeProduto);
		System.out.printf("Quantidade: %d\n", qtd);
		System.out.printf("Valor Total: R$ %.2f\n", valorTotal );

		scanner.close();

	}

}
