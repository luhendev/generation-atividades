package exlacos;

import java.util.Scanner;

public class lacosCondicionais3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean doacao;
		
		System.out.println("Digite o nome do doador: ");
		nome = scanner.next();
		
		System.out.println("Digite a idade do doador: ");
		idade = scanner.nextInt();
		
		System.out.println("Primeiro doação de sangue: (true/false)");
		doacao = scanner.nextBoolean();
		
		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && doacao) {
				System.out.println(nome+"\n não está apto para doar sangue!");
			}else {
				System.out.println(nome+"\n está apto para doar sangue!");
			}
		}else {
			System.out.println("\n"+nome+ " não está apto para doar sangue!");
		}
		
		scanner.close();
	}

}
