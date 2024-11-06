package exswitch;

import java.util.Scanner;

public class lacoCondicionalSwitch2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		String cargo = "";
		int codigoCargo;
		float salario;
		float reajuste = 0;
		
		System.out.println("Nome do colaborador: ");
		nome = scanner.nextLine();
		
		System.out.println("Código do cargo: ");
		codigoCargo = scanner.nextInt();
		
		System.out.println("Salário atual: ");
		salario = scanner.nextFloat();
		
		switch (codigoCargo) {
		
		case 1:
			cargo = "Gerente";
			reajuste = 0.10f;
		break;
		
		case 2:
			cargo = "Vendedor";
			reajuste = 0.7f;
		break;
		
		case 3:
			cargo = "Supervisor";
			reajuste = 0.9f;
		break;
		
		case 4:
			cargo = "Motorista";
			reajuste = 0.6f;
		break;
		
		case 5:
			cargo = "Estoquista";
			reajuste = 0.5f;
		break;
		
		case 6:
			cargo = "Técnico de TI";
			reajuste = 0.8f;
		break;
			default:
				System.out.println("Opção inválida");
				break;
		
		}
		
		float novoSalario = salario + (reajuste * salario);
		
		System.out.println("\nNome do colaborador: "+ nome);
		System.out.println("Cargo: "+ cargo);
		System.out.printf("Salário atual: R$ %.2f\n", salario);
        System.out.printf("Novo salário com reajuste: R$ %.2f\n", novoSalario);
		
		scanner.close();

	}

}
